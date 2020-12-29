// $ANTLR 3.5.1 C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g 2020-12-29 16:48:35

  package myCompiler;
  import myPackage.Environment;
  import myPackage.Metadata;


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


	  
	  Environment env;
	  
	  void init(){
	  	env = new Environment();
	  }
	  
	  public String getTranslation(){
	  	return env.translation;
	  }
	  
	  public Metadata getMetadata(){
	  	return env.metadata;
	  }
	  



	// $ANTLR start "start"
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:47:1: start : metadata ( story )+ ;
	public final void start() throws RecognitionException {
			init();
		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:49:2: ( metadata ( story )+ )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:50:2: metadata ( story )+
			{
			pushFollow(FOLLOW_metadata_in_start67);
			metadata();
			state._fsp--;

			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:50:11: ( story )+
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
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:50:11: story
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
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:55:1: metadata : LB BOOK ( book_key_value )* RB ;
	public final void metadata() throws RecognitionException {
		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:56:2: ( LB BOOK ( book_key_value )* RB )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:56:4: LB BOOK ( book_key_value )* RB
			{
			match(input,LB,FOLLOW_LB_in_metadata83); 
			match(input,BOOK,FOLLOW_BOOK_in_metadata85); 
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:57:4: ( book_key_value )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==TITLE_S) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:57:4: book_key_value
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
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:61:1: book_key_value : title_kv ( COMMA author_kv )+ ( COMMA pvy_kv )* ;
	public final void book_key_value() throws RecognitionException {
		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:62:2: ( title_kv ( COMMA author_kv )+ ( COMMA pvy_kv )* )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:63:4: title_kv ( COMMA author_kv )+ ( COMMA pvy_kv )*
			{
			pushFollow(FOLLOW_title_kv_in_book_key_value116);
			title_kv();
			state._fsp--;

			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:64:4: ( COMMA author_kv )+
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
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:64:5: COMMA author_kv
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

			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:65:4: ( COMMA pvy_kv )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMMA) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:65:5: COMMA pvy_kv
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
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:67:1: title_kv : TITLE_S COL title_book= STRING_VALUE ;
	public final void title_kv() throws RecognitionException {
		Token title_book=null;

		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:68:2: ( TITLE_S COL title_book= STRING_VALUE )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:68:4: TITLE_S COL title_book= STRING_VALUE
			{
			match(input,TITLE_S,FOLLOW_TITLE_S_in_title_kv150); 
			match(input,COL,FOLLOW_COL_in_title_kv152); 
			title_book=(Token)match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_title_kv156); 
			 env.setTitleBook(title_book); 
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
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:70:1: author_kv : AUTHOR COL STRING_VALUE ;
	public final void author_kv() throws RecognitionException {
		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:71:2: ( AUTHOR COL STRING_VALUE )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:71:4: AUTHOR COL STRING_VALUE
			{
			match(input,AUTHOR,FOLLOW_AUTHOR_in_author_kv168); 
			match(input,COL,FOLLOW_COL_in_author_kv170); 
			match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_author_kv172); 
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
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:74:1: pvy_kv : ( publisher_kv | image_kv | year_kv ) ;
	public final void pvy_kv() throws RecognitionException {
		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:74:8: ( ( publisher_kv | image_kv | year_kv ) )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:75:3: ( publisher_kv | image_kv | year_kv )
			{
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:75:3: ( publisher_kv | image_kv | year_kv )
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
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:75:5: publisher_kv
					{
					pushFollow(FOLLOW_publisher_kv_in_pvy_kv187);
					publisher_kv();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:76:9: image_kv
					{
					pushFollow(FOLLOW_image_kv_in_pvy_kv199);
					image_kv();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:77:9: year_kv
					{
					pushFollow(FOLLOW_year_kv_in_pvy_kv211);
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
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:79:1: publisher_kv : PUBLISHER COL publisher= STRING_VALUE ;
	public final void publisher_kv() throws RecognitionException {
		Token publisher=null;

		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:80:2: ( PUBLISHER COL publisher= STRING_VALUE )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:80:4: PUBLISHER COL publisher= STRING_VALUE
			{
			match(input,PUBLISHER,FOLLOW_PUBLISHER_in_publisher_kv222); 
			match(input,COL,FOLLOW_COL_in_publisher_kv224); 
			publisher=(Token)match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_publisher_kv228); 
			 env.setPublisher(publisher); 
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
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:83:1: image_kv : IMAGE COL image_path= IMAGE_PATH ;
	public final void image_kv() throws RecognitionException {
		Token image_path=null;

		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:83:9: ( IMAGE COL image_path= IMAGE_PATH )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:83:11: IMAGE COL image_path= IMAGE_PATH
			{
			match(input,IMAGE,FOLLOW_IMAGE_in_image_kv241); 
			match(input,COL,FOLLOW_COL_in_image_kv243); 
			image_path=(Token)match(input,IMAGE_PATH,FOLLOW_IMAGE_PATH_in_image_kv247); 
			 env.setCover(image_path); 
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
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:85:1: year_kv : YEAR COL year= NUMBER_VALUE ;
	public final void year_kv() throws RecognitionException {
		Token year=null;

		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:85:9: ( YEAR COL year= NUMBER_VALUE )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:85:11: YEAR COL year= NUMBER_VALUE
			{
			match(input,YEAR,FOLLOW_YEAR_in_year_kv259); 
			match(input,COL,FOLLOW_COL_in_year_kv261); 
			year=(Token)match(input,NUMBER_VALUE,FOLLOW_NUMBER_VALUE_in_year_kv265); 
			 env.setYear(year); 
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



	// $ANTLR start "story"
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:89:1: story : LB STORY STORY_NAME ( ARROW ( STORY_NAME | BRANCHES ) )? RB ( title )? TEXT ( choose )? LB ENDSTORY RB ;
	public final void story() throws RecognitionException {
		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:89:7: ( LB STORY STORY_NAME ( ARROW ( STORY_NAME | BRANCHES ) )? RB ( title )? TEXT ( choose )? LB ENDSTORY RB )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:90:2: LB STORY STORY_NAME ( ARROW ( STORY_NAME | BRANCHES ) )? RB ( title )? TEXT ( choose )? LB ENDSTORY RB
			{
			match(input,LB,FOLLOW_LB_in_story279); 
			match(input,STORY,FOLLOW_STORY_in_story281); 
			match(input,STORY_NAME,FOLLOW_STORY_NAME_in_story283); 
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:90:22: ( ARROW ( STORY_NAME | BRANCHES ) )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ARROW) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:90:23: ARROW ( STORY_NAME | BRANCHES )
					{
					match(input,ARROW,FOLLOW_ARROW_in_story286); 
					if ( input.LA(1)==BRANCHES||input.LA(1)==STORY_NAME ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_story298); 
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:91:2: ( title )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==LB) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:91:2: title
					{
					pushFollow(FOLLOW_title_in_story301);
					title();
					state._fsp--;

					}
					break;

			}

			match(input,TEXT,FOLLOW_TEXT_in_story305); 
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:93:2: ( choose )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==LB) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==CHOOSE) ) {
					alt8=1;
				}
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:93:2: choose
					{
					pushFollow(FOLLOW_choose_in_story308);
					choose();
					state._fsp--;

					}
					break;

			}

			match(input,LB,FOLLOW_LB_in_story312); 
			match(input,ENDSTORY,FOLLOW_ENDSTORY_in_story314); 
			match(input,RB,FOLLOW_RB_in_story316); 
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
	// $ANTLR end "story"



	// $ANTLR start "title"
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:102:1: title : LB TITLE STRING_VALUE RB ;
	public final void title() throws RecognitionException {
		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:102:7: ( LB TITLE STRING_VALUE RB )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:103:2: LB TITLE STRING_VALUE RB
			{
			match(input,LB,FOLLOW_LB_in_title332); 
			match(input,TITLE,FOLLOW_TITLE_in_title334); 
			match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_title336); 
			match(input,RB,FOLLOW_RB_in_title338); 
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
	// $ANTLR end "title"



	// $ANTLR start "choose"
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:106:1: choose : LB CHOOSE choose_key_value RB ;
	public final void choose() throws RecognitionException {
		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:106:8: ( LB CHOOSE choose_key_value RB )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:107:2: LB CHOOSE choose_key_value RB
			{
			match(input,LB,FOLLOW_LB_in_choose349); 
			match(input,CHOOSE,FOLLOW_CHOOSE_in_choose351); 
			pushFollow(FOLLOW_choose_key_value_in_choose356);
			choose_key_value();
			state._fsp--;

			match(input,RB,FOLLOW_RB_in_choose359); 
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
	// $ANTLR end "choose"



	// $ANTLR start "choose_key_value"
	// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:112:1: choose_key_value : STRING_VALUE COL STORY_NAME ( COMMA STRING_VALUE COL STORY_NAME )* ;
	public final void choose_key_value() throws RecognitionException {
		try {
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:113:2: ( STRING_VALUE COL STORY_NAME ( COMMA STRING_VALUE COL STORY_NAME )* )
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:114:3: STRING_VALUE COL STORY_NAME ( COMMA STRING_VALUE COL STORY_NAME )*
			{
			match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_choose_key_value373); 
			match(input,COL,FOLLOW_COL_in_choose_key_value375); 
			match(input,STORY_NAME,FOLLOW_STORY_NAME_in_choose_key_value377); 
			// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:115:3: ( COMMA STRING_VALUE COL STORY_NAME )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==COMMA) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\gianl\\OneDrive\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:115:4: COMMA STRING_VALUE COL STORY_NAME
					{
					match(input,COMMA,FOLLOW_COMMA_in_choose_key_value384); 
					match(input,STRING_VALUE,FOLLOW_STRING_VALUE_in_choose_key_value386); 
					match(input,COL,FOLLOW_COL_in_choose_key_value388); 
					match(input,STORY_NAME,FOLLOW_STORY_NAME_in_choose_key_value390); 
					}
					break;

				default :
					break loop9;
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
	public static final BitSet FOLLOW_STRING_VALUE_in_author_kv172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_publisher_kv_in_pvy_kv187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_image_kv_in_pvy_kv199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_year_kv_in_pvy_kv211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUBLISHER_in_publisher_kv222 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_publisher_kv224 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_VALUE_in_publisher_kv228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMAGE_in_image_kv241 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_image_kv243 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IMAGE_PATH_in_image_kv247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_YEAR_in_year_kv259 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_year_kv261 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NUMBER_VALUE_in_year_kv265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_story279 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_STORY_in_story281 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_STORY_NAME_in_story283 = new BitSet(new long[]{0x0000000000800010L});
	public static final BitSet FOLLOW_ARROW_in_story286 = new BitSet(new long[]{0x0000000008000080L});
	public static final BitSet FOLLOW_set_in_story288 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_RB_in_story298 = new BitSet(new long[]{0x0000000040040000L});
	public static final BitSet FOLLOW_title_in_story301 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_TEXT_in_story305 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_choose_in_story308 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LB_in_story312 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ENDSTORY_in_story314 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_RB_in_story316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_title332 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_TITLE_in_title334 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_VALUE_in_title336 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_RB_in_title338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_choose349 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CHOOSE_in_choose351 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_choose_key_value_in_choose356 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_RB_in_choose359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_VALUE_in_choose_key_value373 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_choose_key_value375 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_STORY_NAME_in_choose_key_value377 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_COMMA_in_choose_key_value384 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_VALUE_in_choose_key_value386 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COL_in_choose_key_value388 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_STORY_NAME_in_choose_key_value390 = new BitSet(new long[]{0x0000000000000802L});
}
