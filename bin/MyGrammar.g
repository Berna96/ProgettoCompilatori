grammar MyGrammar;


options { 
  k = 2;
  language = Java;
}


@lexer::header{
  package myCompiler;
}

@lexer::members{
	int nErrori = 0;
	
	void printMsg () {
		nErrori++;
		System.out.println("n. Errori Trovati: \t" + nErrori);
	}
}

@header{
  package myCompiler;
  
  import myCompiler.util.*;
  
  import java.util.LinkedList;
}

@members{
  
  ParserEnvironment env;
  ParserSemantic sem;
  
  void init(){
  	env = new ParserEnvironment();
  	sem = new ParserSemantic(env);
  }
  
  public String getTranslation(){
  	return env.translation;
  }
  
  public ParserMetadata getMetadata(){
  	return env.metadata;
  }
  
}

start
@init{	init();}
:
	metadata story+
;



metadata 
	: LB BOOK
	  book_key_value *
	  RB
	;

book_key_value 
	:  	 
		 title_kv 
	 	(COMMA author_kv)+
	 	(COMMA pvy_kv)*		
	;
title_kv 
	:	TITLE_S COL title_book=STRING_VALUE { sem.setTitleBook($title_book); }
	;
author_kv
	:	AUTHOR COL author=STRING_VALUE { sem.addAuthor($author); }
	;
	
pvy_kv	:
		( publisher_kv |
	   	  	image_kv |
	   	  	year_kv)
	;
publisher_kv
	:	PUBLISHER COL publisher=STRING_VALUE { sem.setPublisher($publisher); }	
	;
	
image_kv:	IMAGE COL image_path=IMAGE_PATH { sem.setCover($image_path); }	
	;
year_kv	:	YEAR COL year=NUMBER_VALUE { sem.setYear($year); }
	;


story	:
	LB STORY story_name1=STORY_NAME 		
	(ARROW 
	(story_name2=STORY_NAME 		
	| 
	BRANCHES))? 
	RB
	title_story = title?
	text = TEXT		
	chosen_stories = choose?
	LB ENDSTORY RB
	{sem.createStory($story_name1, $text);}
	;
//ADD TEXT PRODUCION
/*
text	:	(STORY_NAME | NUMBER_VALUE | NOT_BRACKETS)*
	;
*/

title	returns [String title]:
	LB TITLE title_story=STRING_VALUE RB  {title = sem.setTitleStory($title_story);}
	;

choose	returns [LinkedList<String> stories] :
	LB CHOOSE 
		list_stories = choose_key_value
	RB
	{ stories = list_stories;}
	;
	
choose_key_value returns [LinkedList<String> stories]
	:
		STRING_VALUE COL story1 = STORY_NAME 		{sem.insertChosenStories($story1);}
		(
		COMMA STRING_VALUE COL storyn=STORY_NAME	{sem.insertChosenStories($storyn);}
		)*
		{ stories = env.getChosenStories(); }  			
	;

// LEXER TOKENS

	

fragment LETTER 
	:	('a'..'z' | 'A'..'Z') ;

fragment DIGIT
	:	('0'..'9');

fragment DOLL
	:	'$';

fragment NAME
	:	LETTER (LETTER | DIGIT)*
	;

//INUTILE
fragment CHAR_NOT_ALLOWED
	: '<'	|
	  '>' 	|
	  ':'	|
	  '"'	|
	  '/'	|
	  '\\'  |
	  '|'	|
	  '?'	|
	  '*'	|
	  '.'
	;
	

BOOK 	: 'BOOK'
	;

STORY 	: 'STORY'
	;
CHOOSE : 'CHOOSE'
	;
TITLE 	: 'TITLE'
	;
ENDSTORY : 'ENDSTORY'
	;
TITLE_S 	: 'title'
	;

AUTHOR 
	:	'author' ;
PUBLISHER 
	:	'publisher' ;
	
YEAR 
	:	'year' ;
fragment STRING 
	:	'"' ( ~'"' )* '"';
IMAGE 	
	:	'image'
	;

	
LB    //left bracket
	: '{'
	;

RB    //right bracket
	: '}'
	;

SC    // Semi Colon
    : ';'
    ;

COL  	:	':'
	;
	
ARROW	:	'->'
	;

COMMA	: 	','
	;

BRANCHES : 'BRANCHES'
	;

//BOOK_KEY 	:   TITLE_S | AUTHOR | PUBLISHER | IMAGE | YEAR ;

STRING_VALUE	: STRING ;


STORY_NAME 
	:	NAME	
	;	

NUMBER_VALUE	: DIGIT (DIGIT)*;


IMAGE_PATH 
	:	( ('\\')* NAME )+ ('.jpg' | '.png')
	;

COMMENT :	('//' ~ ('\n' | '\r')* '\r'? '\n' |
		'/*' ( options {greedy=false;} : . )* '*/' )
		{ skip(); /*$channel=HIDDEN;*/ }
	;

TEXT 	:     //LETTER ( options {greedù3 = false;} : ~( LB | RB ))*
		//~( DOLL | DIGIT) ~(LB | RB)*
		DOLL ~DOLL* DOLL
		//'\'' ~( '\'' )* '\''
	;

/*
NOT_BRACKETS
	:	(options {greedy=false;} : ~(LB | RB))
	;
*/

WS  :   ( ' '           
        | '\t'
        | '\r'
        | '\n'
        ) {skip();  /* $channel=HIDDEN; */}
    ;
SCAN_ERROR   
    : . { printMsg();}
    ;
