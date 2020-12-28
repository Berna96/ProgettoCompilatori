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
  import myPackage.Environment;
}

@members{
  
  Environment env;
  
  void init(){
  	env = new Environment();
  }
  
  public String getTranslation(){
  	return env.translation;
  }
}

/*
start
@init{	init();}
:
	(normal_tag | empty_tag)+
;
normal_tag 
	:	tag (TEXT | (normal_tag | empty_tag)*) end_tag
	;
empty_tag 
	:	tag
	;

//TODO: da togliere
tag 	:	LB tag_type RB
	;
end_tag :	LB end_tag_type RB
	;
	
tag_type 
	:	book_type |
		story_type |
		title_tag |
		choose_tag	
	;
end_tag_type
	:
		endstory_type	
	;	

story_type
	:	STORY STORY_NAME ARROW STORY_NAME;
book_type
	:	BOOK key_value_pairs
	;


endstory_type
	:	ENDSTORY ;

title_tag
	:	TITLE STRING_VALUE 
	;
choose_tag
	:	
		CHOOSE key_value_pairs
	;
	
key_value_pairs
	:	(key COL value)
		(COMMA key COL value)+
	;
	
key 	:	(TITLE_S | AUTHOR | PUBLISHER | YEAR | IMAGE) 
		| 
		STRING_VALUE
	;
value	:	STRING_VALUE 
		| 
		STORY_NAME
	;
*/

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
	:	TITLE_S COL STRING_VALUE
	;
author_kv
	:	AUTHOR COL STRING_VALUE
	;
	
pvy_kv	:
		( publisher_kv |
	   	  	image_kv |
	   	  	year_kv)
	;
publisher_kv
	:	PUBLISHER COL STRING_VALUE	
	;
	
image_kv:	IMAGE COL IMAGE_PATH
	;
year_kv	:	YEAR COL NUMBER_VALUE
	;


story	:
	LB STORY STORY_NAME (ARROW (STORY_NAME | BRANCHES))? RB
	title?
	TEXT
	choose?
	LB ENDSTORY RB		
	;

title	:
	LB TITLE STRING_VALUE RB
	;

choose	:
	LB CHOOSE 
		choose_key_value
	RB
	;
	
choose_key_value
	:
		STRING_VALUE COL STORY_NAME {}
		(COMMA STRING_VALUE COL STORY_NAME)*  {}		
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
/*
< (less than)
> (greater than)
: (colon)
" (double quote)
/ (forward slash)
\ (backslash)
| (vertical bar or pipe)
? (question mark)
* (asterisk)
*/

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

	
/*
BBLOCK 	:	
 	BOOK | STORY | CHOOSE | TITLE
 	;

EBLOCK 	:	
	ENDSTORY
	;
*/
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


WS  :   ( ' '           
        | '\t'
        | '\r'
        | '\n'
        ) {skip();  /* $channel=HIDDEN; */}
    ;
SCAN_ERROR   
    : . { printMsg();}
    ;
    
    
