// $ANTLR 3.5.1 C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g 2021-02-19 15:55:49

  package myCompiler;
  
  import myCompiler.util.*;
  
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
	@Override public String getGrammarFileName() { return "C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g"; }


	  
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
	  



	// $ANTLR start "start"
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:51:1: start : metadata ( story )+ ;
	public final void start() throws RecognitionException {
			init();
		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:53:2: ( metadata ( story )+ )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:54:2: metadata ( story )+
			{
			pushFollow(FOLLOW_metadata_in_start67);
			metadata();
			state._fsp--;

			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:54:11: ( story )+
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
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:54:11: story
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
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:59:1: metadata : LB BOOK ( book_key_value )* RB ;
	public final void metadata() throws RecognitionException {
		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:60:2: ( LB BOOK ( book_key_value )* RB )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:60:4: LB BOOK ( book_key_value )* RB
			{
			match(input,LB,FOLLOW_LB_in_metadata83); 
			match(input,BOOK,FOLLOW_BOOK_in_metadata85); 
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:61:4: ( book_key_value )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==TITLE_S) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:61:4: book_key_value
					{
					pushFollow(FOLLOW_book_key_value_in_metadata90);
					book_key_value();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input,RB,FOLLOW_RB_in_metadata97); 
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
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:65:1: book_key_value : title_kv ( COMMA author_kv )+ ( COMMA pvy_kv )* ;
	public final void book_key_value() throws RecognitionException {
		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:66:2: ( title_kv ( COMMA author_kv )+ ( COMMA pvy_kv )* )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:67:4: title_kv ( COMMA author_kv )+ ( COMMA pvy_kv )*
			{
			pushFollow(FOLLOW_title_kv_in_book_key_value116);
			title_kv();
			state._fsp--;

			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:68:4: ( COMMA author_kv )+
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
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:68:5: COMMA author_kv
					{
					match(input,COMMA,FOLLOW_COMMA_in_book_key_value123); 
					pushFollow(FOLLOW_author_kv_in_book_key_value125);
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

			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:69:4: ( COMMA pvy_kv )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMMA) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:69:5: COMMA pvy_kv
					{
					match(input,COMMA,FOLLOW_COMMA_in_book_key_value133); 
					pushFollow(FOLLOW_pvy_kv_in_book_key_value135);
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
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:71:1: title_kv : TITLE_S COL title_book= STRING_VALUE ;
	public final void title_kv() throws RecognitionException {
		Token title_book=null;

		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:72:2: ( TITLE_S COL title_book= STRING_VALUE )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:72:4: TITLE_S COL title_book= STRING_VALUE
			{
			match(input,TITLE_S,FOLLOW_TITLE_S_in_title_kv150); 
			match(input,COL,FOLLOW_COL_in_title_kv152); 
			title_book=(Token)match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_title_kv156); 
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
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:74:1: author_kv : AUTHOR COL author= STRING_VALUE ;
	public final void author_kv() throws RecognitionException {
		Token author=null;

		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:75:2: ( AUTHOR COL author= STRING_VALUE )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:75:4: AUTHOR COL author= STRING_VALUE
			{
			match(input,AUTHOR,FOLLOW_AUTHOR_in_author_kv168); 
			match(input,COL,FOLLOW_COL_in_author_kv170); 
			author=(Token)match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_author_kv174); 
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
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:78:1: pvy_kv : ( publisher_kv | image_kv | year_kv ) ;
	public final void pvy_kv() throws RecognitionException {
		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:78:8: ( ( publisher_kv | image_kv | year_kv ) )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:79:3: ( publisher_kv | image_kv | year_kv )
			{
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:79:3: ( publisher_kv | image_kv | year_kv )
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
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:79:5: publisher_kv
					{
					pushFollow(FOLLOW_publisher_kv_in_pvy_kv191);
					publisher_kv();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:80:9: image_kv
					{
					pushFollow(FOLLOW_image_kv_in_pvy_kv203);
					image_kv();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:81:9: year_kv
					{
					pushFollow(FOLLOW_year_kv_in_pvy_kv215);
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
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:83:1: publisher_kv : PUBLISHER COL publisher= STRING_VALUE ;
	public final void publisher_kv() throws RecognitionException {
		Token publisher=null;

		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:84:2: ( PUBLISHER COL publisher= STRING_VALUE )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:84:4: PUBLISHER COL publisher= STRING_VALUE
			{
			match(input,PUBLISHER,FOLLOW_PUBLISHER_in_publisher_kv226); 
			match(input,COL,FOLLOW_COL_in_publisher_kv228); 
			publisher=(Token)match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_publisher_kv232); 
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
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:87:1: image_kv : IMAGE COL image_path= IMAGE_PATH ;
	public final void image_kv() throws RecognitionException {
		Token image_path=null;

		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:87:9: ( IMAGE COL image_path= IMAGE_PATH )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:87:11: IMAGE COL image_path= IMAGE_PATH
			{
			match(input,IMAGE,FOLLOW_IMAGE_in_image_kv245); 
			match(input,COL,FOLLOW_COL_in_image_kv247); 
			image_path=(Token)match(input,IMAGE_PATH,FOLLOW_IMAGE_PATH_in_image_kv251); 
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
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:89:1: year_kv : YEAR COL year= NUMBER_VALUE ;
	public final void year_kv() throws RecognitionException {
		Token year=null;

		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:89:9: ( YEAR COL year= NUMBER_VALUE )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:89:11: YEAR COL year= NUMBER_VALUE
			{
			match(input,YEAR,FOLLOW_YEAR_in_year_kv263); 
			match(input,COL,FOLLOW_COL_in_year_kv265); 
			year=(Token)match(input,NUMBER_VALUE,FOLLOW_NUMBER_VALUE_in_year_kv269); 
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


	public static class story_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "story"
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:93:1: story : LB STORY story_name1= STORY_NAME ( ARROW (story_name2= STORY_NAME | BRANCHES ) )? RB (title_story= title )? text= TEXT (chosen_stories= choose )? LB ENDSTORY RB ;
	public final MyGrammarParser.story_return story() throws RecognitionException {
		MyGrammarParser.story_return retval = new MyGrammarParser.story_return();
		retval.start = input.LT(1);

		Token story_name1=null;
		Token story_name2=null;
		Token text=null;
		String title_story =null;
		LinkedList<String> chosen_stories =null;

		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:93:7: ( LB STORY story_name1= STORY_NAME ( ARROW (story_name2= STORY_NAME | BRANCHES ) )? RB (title_story= title )? text= TEXT (chosen_stories= choose )? LB ENDSTORY RB )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:94:2: LB STORY story_name1= STORY_NAME ( ARROW (story_name2= STORY_NAME | BRANCHES ) )? RB (title_story= title )? text= TEXT (chosen_stories= choose )? LB ENDSTORY RB
			{
			match(input,LB,FOLLOW_LB_in_story283); 
			match(input,STORY,FOLLOW_STORY_in_story285); 
			story_name1=(Token)match(input,STORY_NAME,FOLLOW_STORY_NAME_in_story289); 
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:95:2: ( ARROW (story_name2= STORY_NAME | BRANCHES ) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ARROW) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:95:3: ARROW (story_name2= STORY_NAME | BRANCHES )
					{
					match(input,ARROW,FOLLOW_ARROW_in_story296); 
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:96:2: (story_name2= STORY_NAME | BRANCHES )
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
							// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:96:3: story_name2= STORY_NAME
							{
							story_name2=(Token)match(input,STORY_NAME,FOLLOW_STORY_NAME_in_story303); 
							}
							break;
						case 2 :
							// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:98:2: BRANCHES
							{
							match(input,BRANCHES,FOLLOW_BRANCHES_in_story313); 
							}
							break;

					}

					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_story320); 
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:100:14: (title_story= title )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==LB) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:100:14: title_story= title
					{
					pushFollow(FOLLOW_title_in_story327);
					title_story=title();
					state._fsp--;

					}
					break;

			}

			text=(Token)match(input,TEXT,FOLLOW_TEXT_in_story335); 
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:102:17: (chosen_stories= choose )?
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
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:102:17: chosen_stories= choose
					{
					pushFollow(FOLLOW_choose_in_story344);
					chosen_stories=choose();
					state._fsp--;

					}
					break;

			}

			match(input,LB,FOLLOW_LB_in_story348); 
			match(input,ENDSTORY,FOLLOW_ENDSTORY_in_story350); 
			match(input,RB,FOLLOW_RB_in_story352); 
			sem.createStory(story_name1, text);
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
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:112:1: title returns [String title] : LB TITLE title_story= STRING_VALUE RB ;
	public final String title() throws RecognitionException {
		String title = null;


		Token title_story=null;

		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:112:29: ( LB TITLE title_story= STRING_VALUE RB )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:113:2: LB TITLE title_story= STRING_VALUE RB
			{
			match(input,LB,FOLLOW_LB_in_title372); 
			match(input,TITLE,FOLLOW_TITLE_in_title374); 
			title_story=(Token)match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_title378); 
			match(input,RB,FOLLOW_RB_in_title380); 
			title = sem.setTitleStory(title_story);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return title;
	}
	// $ANTLR end "title"



	// $ANTLR start "choose"
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:116:1: choose returns [LinkedList<String> stories] : LB CHOOSE list_stories= choose_key_value RB ;
	public final LinkedList<String> choose() throws RecognitionException {
		LinkedList<String> stories = null;


		LinkedList<String> list_stories =null;

		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:116:45: ( LB CHOOSE list_stories= choose_key_value RB )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:117:2: LB CHOOSE list_stories= choose_key_value RB
			{
			match(input,LB,FOLLOW_LB_in_choose398); 
			match(input,CHOOSE,FOLLOW_CHOOSE_in_choose400); 
			pushFollow(FOLLOW_choose_key_value_in_choose409);
			list_stories=choose_key_value();
			state._fsp--;

			match(input,RB,FOLLOW_RB_in_choose412); 
			 stories = list_stories;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stories;
	}
	// $ANTLR end "choose"



	// $ANTLR start "choose_key_value"
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:123:1: choose_key_value returns [LinkedList<String> stories] : STRING_VALUE COL story1= STORY_NAME ( COMMA STRING_VALUE COL storyn= STORY_NAME )* ;
	public final LinkedList<String> choose_key_value() throws RecognitionException {
		LinkedList<String> stories = null;


		Token story1=null;
		Token storyn=null;

		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:124:2: ( STRING_VALUE COL story1= STORY_NAME ( COMMA STRING_VALUE COL storyn= STORY_NAME )* )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:125:3: STRING_VALUE COL story1= STORY_NAME ( COMMA STRING_VALUE COL storyn= STORY_NAME )*
			{
			match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_choose_key_value433); 
			match(input,COL,FOLLOW_COL_in_choose_key_value435); 
			story1=(Token)match(input,STORY_NAME,FOLLOW_STORY_NAME_in_choose_key_value441); 
			sem.insertChosenStories(story1);
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:126:3: ( COMMA STRING_VALUE COL storyn= STORY_NAME )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==COMMA) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:127:3: COMMA STRING_VALUE COL storyn= STORY_NAME
					{
					match(input,COMMA,FOLLOW_COMMA_in_choose_key_value453); 
					match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_choose_key_value455); 
					match(input,COL,FOLLOW_COL_in_choose_key_value457); 
					storyn=(Token)match(input,STORY_NAME,FOLLOW_STORY_NAME_in_choose_key_value461); 
					sem.insertChosenStories(storyn);
					}
					break;

				default :
					break loop10;
				}
			}

			 stories = env.getChosenStories(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stories;
	}
	// $ANTLR end "choose_key_value"

	// Delegated rules



	public static final BitSet FOLLOW_metadata_in_start67 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_story_in_start69 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_LB_in_metadata83 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BOOK_in_metadata85 = new BitSet(new long[]{0x0000000100800000L});
	public static final BitSet FOLLOW_book_key_value_in_metadata90 = new BitSet(new long[]{0x0000000100800000L});
	public static final BitSet FOLLOW_RB_in_metadata97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_title_kv_in_book_key_value116 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_book_key_value123 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_author_kv_in_book_key_value125 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_COMMA_in_book_key_value133 = new BitSet(new long[]{0x0000000400410000L});
	public static final BitSet FOLLOW_pvy_kv_in_book_key_value135 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_TITLE_S_in_title_kv150 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_title_kv152 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_VALUE_in_title_kv156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTHOR_in_author_kv168 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_author_kv170 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_VALUE_in_author_kv174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_publisher_kv_in_pvy_kv191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_image_kv_in_pvy_kv203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_year_kv_in_pvy_kv215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUBLISHER_in_publisher_kv226 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_publisher_kv228 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_VALUE_in_publisher_kv232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMAGE_in_image_kv245 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_image_kv247 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IMAGE_PATH_in_image_kv251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_YEAR_in_year_kv263 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_year_kv265 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NUMBER_VALUE_in_year_kv269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_story283 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_STORY_in_story285 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_STORY_NAME_in_story289 = new BitSet(new long[]{0x0000000000800010L});
	public static final BitSet FOLLOW_ARROW_in_story296 = new BitSet(new long[]{0x0000000008000080L});
	public static final BitSet FOLLOW_STORY_NAME_in_story303 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_BRANCHES_in_story313 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_RB_in_story320 = new BitSet(new long[]{0x0000000040040000L});
	public static final BitSet FOLLOW_title_in_story327 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_TEXT_in_story335 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_choose_in_story344 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LB_in_story348 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ENDSTORY_in_story350 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_RB_in_story352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_title372 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_TITLE_in_title374 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_VALUE_in_title378 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_RB_in_title380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_choose398 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CHOOSE_in_choose400 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_choose_key_value_in_choose409 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_RB_in_choose412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_VALUE_in_choose_key_value433 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_choose_key_value435 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_STORY_NAME_in_choose_key_value441 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_COMMA_in_choose_key_value453 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_VALUE_in_choose_key_value455 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_choose_key_value457 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_STORY_NAME_in_choose_key_value461 = new BitSet(new long[]{0x0000000000000802L});
}
