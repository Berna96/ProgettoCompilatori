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
  import myCompiler.util.error.*;
  import myCompiler.util.warning.*;
  
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
  
  public Metadata getMetadata(){
  	return env.metadata;
  }
  
  public LibroGame getBook(){
  	return env.librogame;
  }
  
  public LinkedList<CompilationWarning> getWarnings() {
  	return env.warningList;
  }
  public LinkedList<CompilationError> getErrors() {
  	return env.errorList;
  }
  
  public boolean isCyclic() {
  	return env.cyclic;
  }
  public boolean isConnected() {
  	return env.connected;
  }
  
}

start
@init{	init(); }
:
	metadata story+ {sem.createFilesFromStories();}
;



metadata 
	: LB BOOK
	  book_key_value *
	  RB { sem.createCover(); }
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

start_story	returns [Token this_story, Token next_story, boolean hasBranches] //[String this_story, String next_story]
	:	{$hasBranches = false;}
		LB STORY this_st=STORY_NAME {$this_story=$this_st;} //{$this_story=$this_st.getText();}		
		(ARROW 
		(next_st=STORY_NAME {$next_story=$next_st;} //{$next_story=$next_st.getText();}	
		| 
		BRANCHES {$hasBranches = true;}))? 
		RB
	;

fragment
end_story
	:	LB ENDSTORY RB
	;

story	:
	story_name=start_story
	title_story = title?
	text=TEXT
	chosen_stories = choose?
	end_story {sem.manageStoryBlock($story_name.this_story,
			 	   $story_name.next_story,
			 	   $story_name.hasBranches,
			 	   $title_story.title_story,
			 	   $text,
			 	   $chosen_stories.stories,
			 	   $chosen_stories.answers);
		   sem.updateGraphInfo();}
	;

	/*
	{sem.createStory($story_names,
			 	   $title_story, 
			 	   $text,
				   $chosen_stories);
		   sem.updateGraphInfo();}
	*/

title	returns [Token title_story] //[String title_story]
	:
// eredita nome_storia, allora { $title = sem.setTitleStory($name_story, $title_story); }
	LB TITLE title_st=STRING_VALUE RB {$title_story = $title_st;} //{$title_story = $title_st.getText();}
	;

choose	returns [LinkedList<Token> stories, LinkedList<String> answers] //[LinkedList<String> stories]
	:
	LB CHOOSE 
		list_stories = choose_key_value
	RB
	{ $stories = $list_stories.stories; LinkedList<String> answers = $list_stories.answers; }
	;

choose_key_value returns [LinkedList<Token> stories, LinkedList<String> answers]
	:
		ans_1 = STRING_VALUE COL story_name_1 = STORY_NAME {sem.insertChosenStory($story_name_1); sem.insertAnswers($ans_1);}
		(
		COMMA ans_2 = STRING_VALUE COL story_name_n=STORY_NAME	{sem.insertChosenStory($story_name_n); sem.insertAnswers($ans_2);}
		)*
		{ $stories = sem.getChosenStories(); LinkedList<String> answers = sem.getAnswers(); }  			
	;

/*
choose_key_value returns [LinkedList<String> stories]
	:
		STRING_VALUE COL story_name_1 = STORY_NAME {sem.insertChosenStory($story_name_1);}
		(
		COMMA STRING_VALUE COL story_name_n=STORY_NAME	{sem.insertChosenStory($story_name_n);}
		)*
		{ $stories = sem.getChosenStories(); }  			
	;
*/

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
