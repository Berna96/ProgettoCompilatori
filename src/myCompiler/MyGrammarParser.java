// $ANTLR 3.5.1 C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g 2021-03-21 12:51:37

  package myCompiler;
  
  import myCompiler.util.*;
  import myCompiler.util.error.*;
  import myCompiler.util.warning.*;
  
  import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MyGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AUTHOR", "BOOK", "BRANCHES", 
		"CHAR_NOT_ALLOWED", "CHOOSE", "COL", "COMMA", "COMMENT", "DIGIT", "DOLL", 
		"ENDSTORY", "IMAGE", "IMAGE_PATH", "LB", "LETTER", "NAME", "NUMBER_VALUE", 
		"PUBLISHER", "RB", "SC", "SCAN_ERROR", "STORY", "STORY_NAME", "STRING", 
		"STRING_VALUE", "TEXT", "TITLE", "TITLE_S", "WS", "YEAR"
	};
	public static final int EOF=-1;
	public static final int ARROW=4;
	public static final int AUTHOR=5;
	public static final int BOOK=6;
	public static final int BRANCHES=7;
	public static final int CHAR_NOT_ALLOWED=8;
	public static final int CHOOSE=9;
	public static final int COL=10;
	public static final int COMMA=11;
	public static final int COMMENT=12;
	public static final int DIGIT=13;
	public static final int DOLL=14;
	public static final int ENDSTORY=15;
	public static final int IMAGE=16;
	public static final int IMAGE_PATH=17;
	public static final int LB=18;
	public static final int LETTER=19;
	public static final int NAME=20;
	public static final int NUMBER_VALUE=21;
	public static final int PUBLISHER=22;
	public static final int RB=23;
	public static final int SC=24;
	public static final int SCAN_ERROR=25;
	public static final int STORY=26;
	public static final int STORY_NAME=27;
	public static final int STRING=28;
	public static final int STRING_VALUE=29;
	public static final int TEXT=30;
	public static final int TITLE=31;
	public static final int TITLE_S=32;
	public static final int WS=33;
	public static final int YEAR=34;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public MyGrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public MyGrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return MyGrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g"; }


	  
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



	// $ANTLR start "start"
	// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:63:1: start : metadata ( story )+ ;
	public final void start() throws RecognitionException {
			init(); 
		try {
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:65:2: ( metadata ( story )+ )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:66:2: metadata ( story )+
			{
			pushFollow(FOLLOW_metadata_in_start67);
			metadata();
			state._fsp--;

			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:66:11: ( story )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==LB) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:66:11: story
					{
					pushFollow(FOLLOW_story_in_start69);
					story();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			sem.checkGraph(); sem.checkStories(); sem.createFilesFromStories();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "start"



	// $ANTLR start "metadata"
	// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:71:1: metadata : LB BOOK ( book_key_value )* RB ;
	public final void metadata() throws RecognitionException {
		try {
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:72:2: ( LB BOOK ( book_key_value )* RB )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:72:4: LB BOOK ( book_key_value )* RB
			{
			match(input,LB,FOLLOW_LB_in_metadata85); 
			match(input,BOOK,FOLLOW_BOOK_in_metadata87); 
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:73:4: ( book_key_value )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==TITLE_S) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:73:4: book_key_value
					{
					pushFollow(FOLLOW_book_key_value_in_metadata92);
					book_key_value();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input,RB,FOLLOW_RB_in_metadata99); 
			 sem.createCover(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "metadata"



	// $ANTLR start "book_key_value"
	// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:77:1: book_key_value : title_kv ( COMMA author_kv )+ ( COMMA pvy_kv )* ;
	public final void book_key_value() throws RecognitionException {
		try {
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:78:2: ( title_kv ( COMMA author_kv )+ ( COMMA pvy_kv )* )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:79:4: title_kv ( COMMA author_kv )+ ( COMMA pvy_kv )*
			{
			pushFollow(FOLLOW_title_kv_in_book_key_value120);
			title_kv();
			state._fsp--;

			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:80:4: ( COMMA author_kv )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==COMMA) ) {
					int LA3_1 = input.LA(2);
					if ( (LA3_1==AUTHOR) ) {
						alt3=1;
					}

				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:80:5: COMMA author_kv
					{
					match(input,COMMA,FOLLOW_COMMA_in_book_key_value127); 
					pushFollow(FOLLOW_author_kv_in_book_key_value129);
					author_kv();
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:81:4: ( COMMA pvy_kv )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMMA) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:81:5: COMMA pvy_kv
					{
					match(input,COMMA,FOLLOW_COMMA_in_book_key_value137); 
					pushFollow(FOLLOW_pvy_kv_in_book_key_value139);
					pvy_kv();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "book_key_value"



	// $ANTLR start "title_kv"
	// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:83:1: title_kv : TITLE_S COL title_book= STRING_VALUE ;
	public final void title_kv() throws RecognitionException {
		Token title_book=null;

		try {
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:84:2: ( TITLE_S COL title_book= STRING_VALUE )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:84:4: TITLE_S COL title_book= STRING_VALUE
			{
			match(input,TITLE_S,FOLLOW_TITLE_S_in_title_kv154); 
			match(input,COL,FOLLOW_COL_in_title_kv156); 
			title_book=(Token)match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_title_kv160); 
			 sem.setTitleBook(title_book); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "title_kv"



	// $ANTLR start "author_kv"
	// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:86:1: author_kv : AUTHOR COL author= STRING_VALUE ;
	public final void author_kv() throws RecognitionException {
		Token author=null;

		try {
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:87:2: ( AUTHOR COL author= STRING_VALUE )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:87:4: AUTHOR COL author= STRING_VALUE
			{
			match(input,AUTHOR,FOLLOW_AUTHOR_in_author_kv172); 
			match(input,COL,FOLLOW_COL_in_author_kv174); 
			author=(Token)match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_author_kv178); 
			 sem.addAuthor(author); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "author_kv"



	// $ANTLR start "pvy_kv"
	// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:90:1: pvy_kv : ( publisher_kv | image_kv | year_kv ) ;
	public final void pvy_kv() throws RecognitionException {
		try {
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:90:8: ( ( publisher_kv | image_kv | year_kv ) )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:91:3: ( publisher_kv | image_kv | year_kv )
			{
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:91:3: ( publisher_kv | image_kv | year_kv )
			int alt5=3;
			switch ( input.LA(1) ) {
			case PUBLISHER:
				{
				alt5=1;
				}
				break;
			case IMAGE:
				{
				alt5=2;
				}
				break;
			case YEAR:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:91:5: publisher_kv
					{
					pushFollow(FOLLOW_publisher_kv_in_pvy_kv195);
					publisher_kv();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:92:9: image_kv
					{
					pushFollow(FOLLOW_image_kv_in_pvy_kv207);
					image_kv();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:93:9: year_kv
					{
					pushFollow(FOLLOW_year_kv_in_pvy_kv219);
					year_kv();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "pvy_kv"



	// $ANTLR start "publisher_kv"
	// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:95:1: publisher_kv : PUBLISHER COL publisher= STRING_VALUE ;
	public final void publisher_kv() throws RecognitionException {
		Token publisher=null;

		try {
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:96:2: ( PUBLISHER COL publisher= STRING_VALUE )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:96:4: PUBLISHER COL publisher= STRING_VALUE
			{
			match(input,PUBLISHER,FOLLOW_PUBLISHER_in_publisher_kv230); 
			match(input,COL,FOLLOW_COL_in_publisher_kv232); 
			publisher=(Token)match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_publisher_kv236); 
			 sem.setPublisher(publisher); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "publisher_kv"



	// $ANTLR start "image_kv"
	// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:99:1: image_kv : IMAGE COL image_path= STRING_VALUE ;
	public final void image_kv() throws RecognitionException {
		Token image_path=null;

		try {
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:99:9: ( IMAGE COL image_path= STRING_VALUE )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:99:11: IMAGE COL image_path= STRING_VALUE
			{
			match(input,IMAGE,FOLLOW_IMAGE_in_image_kv249); 
			match(input,COL,FOLLOW_COL_in_image_kv251); 
			image_path=(Token)match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_image_kv255); 
			 sem.setCover(image_path); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "image_kv"



	// $ANTLR start "year_kv"
	// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:101:1: year_kv : YEAR COL year= NUMBER_VALUE ;
	public final void year_kv() throws RecognitionException {
		Token year=null;

		try {
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:101:9: ( YEAR COL year= NUMBER_VALUE )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:101:11: YEAR COL year= NUMBER_VALUE
			{
			match(input,YEAR,FOLLOW_YEAR_in_year_kv267); 
			match(input,COL,FOLLOW_COL_in_year_kv269); 
			year=(Token)match(input,NUMBER_VALUE,FOLLOW_NUMBER_VALUE_in_year_kv273); 
			 sem.setYear(year); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "year_kv"


	public static class start_story_return extends ParserRuleReturnScope {
		public Token this_story;
		public Token next_story;
		public boolean hasBranches;
	};


	// $ANTLR start "start_story"
	// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:104:1: start_story returns [Token this_story, Token next_story, boolean hasBranches] : LB STORY this_st= STORY_NAME ( ARROW (next_st= STORY_NAME | BRANCHES ) )? RB ;
	public final MyGrammarParser.start_story_return start_story() throws RecognitionException {
		MyGrammarParser.start_story_return retval = new MyGrammarParser.start_story_return();
		retval.start = input.LT(1);

		Token this_st=null;
		Token next_st=null;

		try {
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:105:2: ( LB STORY this_st= STORY_NAME ( ARROW (next_st= STORY_NAME | BRANCHES ) )? RB )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:105:4: LB STORY this_st= STORY_NAME ( ARROW (next_st= STORY_NAME | BRANCHES ) )? RB
			{
			retval.hasBranches = false;
			match(input,LB,FOLLOW_LB_in_start_story295); 
			match(input,STORY,FOLLOW_STORY_in_start_story297); 
			this_st=(Token)match(input,STORY_NAME,FOLLOW_STORY_NAME_in_start_story301); 
			retval.this_story =this_st;
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:107:3: ( ARROW (next_st= STORY_NAME | BRANCHES ) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ARROW) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:107:4: ARROW (next_st= STORY_NAME | BRANCHES )
					{
					match(input,ARROW,FOLLOW_ARROW_in_start_story309); 
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:108:3: (next_st= STORY_NAME | BRANCHES )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==STORY_NAME) ) {
						alt6=1;
					}
					else if ( (LA6_0==BRANCHES) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:108:4: next_st= STORY_NAME
							{
							next_st=(Token)match(input,STORY_NAME,FOLLOW_STORY_NAME_in_start_story317); 
							retval.next_story =next_st;
							}
							break;
						case 2 :
							// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:110:3: BRANCHES
							{
							match(input,BRANCHES,FOLLOW_BRANCHES_in_start_story329); 
							retval.hasBranches = true;
							}
							break;

					}

					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_start_story339); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "start_story"



	// $ANTLR start "end_story"
	// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:115:1: fragment end_story : LB ENDSTORY RB ;
	public final void end_story() throws RecognitionException {
		try {
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:116:2: ( LB ENDSTORY RB )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:116:4: LB ENDSTORY RB
			{
			match(input,LB,FOLLOW_LB_in_end_story352); 
			match(input,ENDSTORY,FOLLOW_ENDSTORY_in_end_story354); 
			match(input,RB,FOLLOW_RB_in_end_story356); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "end_story"


	public static class story_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "story"
	// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:119:1: story : story_name= start_story (title_story= title )? text= TEXT (chosen_stories= choose )? end_story ;
	public final MyGrammarParser.story_return story() throws RecognitionException {
		MyGrammarParser.story_return retval = new MyGrammarParser.story_return();
		retval.start = input.LT(1);

		Token text=null;
		ParserRuleReturnScope story_name =null;
		Token title_story =null;
		ParserRuleReturnScope chosen_stories =null;

		try {
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:119:7: (story_name= start_story (title_story= title )? text= TEXT (chosen_stories= choose )? end_story )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:120:2: story_name= start_story (title_story= title )? text= TEXT (chosen_stories= choose )? end_story
			{
			pushFollow(FOLLOW_start_story_in_story369);
			story_name=start_story();
			state._fsp--;

			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:121:14: (title_story= title )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==LB) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:121:14: title_story= title
					{
					pushFollow(FOLLOW_title_in_story376);
					title_story=title();
					state._fsp--;

					}
					break;

			}

			text=(Token)match(input,TEXT,FOLLOW_TEXT_in_story382); 
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:123:17: (chosen_stories= choose )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==LB) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==CHOOSE) ) {
					alt9=1;
				}
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:123:17: chosen_stories= choose
					{
					pushFollow(FOLLOW_choose_in_story389);
					chosen_stories=choose();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_end_story_in_story393);
			end_story();
			state._fsp--;

			sem.manageStoryBlock((story_name!=null?((MyGrammarParser.start_story_return)story_name).this_story:null),
						 	   (story_name!=null?((MyGrammarParser.start_story_return)story_name).next_story:null),
						 	   (story_name!=null?((MyGrammarParser.start_story_return)story_name).hasBranches:false),
						 	   title_story,
						 	   text,
						 	   (chosen_stories!=null?((MyGrammarParser.choose_return)chosen_stories).stories:null),
						 	   (chosen_stories!=null?((MyGrammarParser.choose_return)chosen_stories).answers:null));
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "story"



	// $ANTLR start "title"
	// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:141:1: title returns [Token title_story] : LB TITLE title_st= STRING_VALUE RB ;
	public final Token title() throws RecognitionException {
		Token title_story = null;


		Token title_st=null;

		try {
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:142:2: ( LB TITLE title_st= STRING_VALUE RB )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:144:2: LB TITLE title_st= STRING_VALUE RB
			{
			match(input,LB,FOLLOW_LB_in_title417); 
			match(input,TITLE,FOLLOW_TITLE_in_title419); 
			title_st=(Token)match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_title423); 
			match(input,RB,FOLLOW_RB_in_title425); 
			title_story = title_st;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return title_story;
	}
	// $ANTLR end "title"


	public static class choose_return extends ParserRuleReturnScope {
		public LinkedList<Token> stories;
		public LinkedList<String> answers;
	};


	// $ANTLR start "choose"
	// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:147:1: choose returns [LinkedList<Token> stories, LinkedList<String> answers] : LB CHOOSE list_stories= choose_key_value RB ;
	public final MyGrammarParser.choose_return choose() throws RecognitionException {
		MyGrammarParser.choose_return retval = new MyGrammarParser.choose_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope list_stories =null;

		try {
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:148:2: ( LB CHOOSE list_stories= choose_key_value RB )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:149:2: LB CHOOSE list_stories= choose_key_value RB
			{
			match(input,LB,FOLLOW_LB_in_choose445); 
			match(input,CHOOSE,FOLLOW_CHOOSE_in_choose447); 
			pushFollow(FOLLOW_choose_key_value_in_choose456);
			list_stories=choose_key_value();
			state._fsp--;

			match(input,RB,FOLLOW_RB_in_choose459); 
			 retval.stories = (list_stories!=null?((MyGrammarParser.choose_key_value_return)list_stories).stories:null); retval.answers = (list_stories!=null?((MyGrammarParser.choose_key_value_return)list_stories).answers:null); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "choose"


	public static class choose_key_value_return extends ParserRuleReturnScope {
		public LinkedList<Token> stories;
		public LinkedList<String> answers;
	};


	// $ANTLR start "choose_key_value"
	// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:155:1: choose_key_value returns [LinkedList<Token> stories, LinkedList<String> answers] : ans_1= STRING_VALUE COL story_name_1= STORY_NAME ( COMMA ans_2= STRING_VALUE COL story_name_n= STORY_NAME )* ;
	public final MyGrammarParser.choose_key_value_return choose_key_value() throws RecognitionException {
		MyGrammarParser.choose_key_value_return retval = new MyGrammarParser.choose_key_value_return();
		retval.start = input.LT(1);

		Token ans_1=null;
		Token story_name_1=null;
		Token ans_2=null;
		Token story_name_n=null;

		try {
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:156:2: (ans_1= STRING_VALUE COL story_name_1= STORY_NAME ( COMMA ans_2= STRING_VALUE COL story_name_n= STORY_NAME )* )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:157:3: ans_1= STRING_VALUE COL story_name_1= STORY_NAME ( COMMA ans_2= STRING_VALUE COL story_name_n= STORY_NAME )*
			{
			ans_1=(Token)match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_choose_key_value483); 
			match(input,COL,FOLLOW_COL_in_choose_key_value485); 
			story_name_1=(Token)match(input,STORY_NAME,FOLLOW_STORY_NAME_in_choose_key_value491); 
			sem.insertChosenStory(story_name_1); sem.insertAnswers(ans_1);
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:158:3: ( COMMA ans_2= STRING_VALUE COL story_name_n= STORY_NAME )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==COMMA) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:159:3: COMMA ans_2= STRING_VALUE COL story_name_n= STORY_NAME
					{
					match(input,COMMA,FOLLOW_COMMA_in_choose_key_value501); 
					ans_2=(Token)match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_choose_key_value507); 
					match(input,COL,FOLLOW_COL_in_choose_key_value509); 
					story_name_n=(Token)match(input,STORY_NAME,FOLLOW_STORY_NAME_in_choose_key_value513); 
					sem.insertChosenStory(story_name_n); sem.insertAnswers(ans_2);
					}
					break;

				default :
					break loop10;
				}
			}

			 retval.stories = sem.getChosenStories(); retval.answers = sem.getAnswers(); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "choose_key_value"

	// Delegated rules



	public static final BitSet FOLLOW_metadata_in_start67 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_story_in_start69 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_LB_in_metadata85 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BOOK_in_metadata87 = new BitSet(new long[]{0x0000000100800000L});
	public static final BitSet FOLLOW_book_key_value_in_metadata92 = new BitSet(new long[]{0x0000000100800000L});
	public static final BitSet FOLLOW_RB_in_metadata99 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_title_kv_in_book_key_value120 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_book_key_value127 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_author_kv_in_book_key_value129 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_COMMA_in_book_key_value137 = new BitSet(new long[]{0x0000000400410000L});
	public static final BitSet FOLLOW_pvy_kv_in_book_key_value139 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_TITLE_S_in_title_kv154 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_title_kv156 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_VALUE_in_title_kv160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTHOR_in_author_kv172 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_author_kv174 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_VALUE_in_author_kv178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_publisher_kv_in_pvy_kv195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_image_kv_in_pvy_kv207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_year_kv_in_pvy_kv219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUBLISHER_in_publisher_kv230 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_publisher_kv232 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_VALUE_in_publisher_kv236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMAGE_in_image_kv249 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_image_kv251 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_VALUE_in_image_kv255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_YEAR_in_year_kv267 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_year_kv269 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NUMBER_VALUE_in_year_kv273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_start_story295 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_STORY_in_start_story297 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_STORY_NAME_in_start_story301 = new BitSet(new long[]{0x0000000000800010L});
	public static final BitSet FOLLOW_ARROW_in_start_story309 = new BitSet(new long[]{0x0000000008000080L});
	public static final BitSet FOLLOW_STORY_NAME_in_start_story317 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_BRANCHES_in_start_story329 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_RB_in_start_story339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_end_story352 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ENDSTORY_in_end_story354 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_RB_in_end_story356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_start_story_in_story369 = new BitSet(new long[]{0x0000000040040000L});
	public static final BitSet FOLLOW_title_in_story376 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_TEXT_in_story382 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_choose_in_story389 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_end_story_in_story393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_title417 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_TITLE_in_title419 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_VALUE_in_title423 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_RB_in_title425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_choose445 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CHOOSE_in_choose447 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_choose_key_value_in_choose456 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_RB_in_choose459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_VALUE_in_choose_key_value483 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_choose_key_value485 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_STORY_NAME_in_choose_key_value491 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_COMMA_in_choose_key_value501 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_VALUE_in_choose_key_value507 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_choose_key_value509 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_STORY_NAME_in_choose_key_value513 = new BitSet(new long[]{0x0000000000000802L});
}
