// $ANTLR 3.5.1 C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g 2021-03-18 01:23:08

  package myCompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MyGrammarLexer extends Lexer {
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

		int nErrori = 0;
		
		void printMsg () {
			nErrori++;
			System.out.println("n. Errori Trovati: \t" + nErrori);
		}


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public MyGrammarLexer() {} 
	public MyGrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public MyGrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:188:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:191:2: ( ( '0' .. '9' ) )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "DOLL"
	public final void mDOLL() throws RecognitionException {
		try {
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:194:2: ( '$' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:194:4: '$'
			{
			match('$'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOLL"

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:197:2: ( LETTER ( LETTER | DIGIT )* )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:197:4: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:197:11: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NAME"

	// $ANTLR start "CHAR_NOT_ALLOWED"
	public final void mCHAR_NOT_ALLOWED() throws RecognitionException {
		try {
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:202:2: ( '<' | '>' | ':' | '\"' | '/' | '\\\\' | '|' | '?' | '*' | '.' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:
			{
			if ( input.LA(1)=='\"'||input.LA(1)=='*'||(input.LA(1) >= '.' && input.LA(1) <= '/')||input.LA(1)==':'||input.LA(1)=='<'||(input.LA(1) >= '>' && input.LA(1) <= '?')||input.LA(1)=='\\'||input.LA(1)=='|' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_NOT_ALLOWED"

	// $ANTLR start "BOOK"
	public final void mBOOK() throws RecognitionException {
		try {
			int _type = BOOK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:215:7: ( 'BOOK' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:215:9: 'BOOK'
			{
			match("BOOK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOK"

	// $ANTLR start "STORY"
	public final void mSTORY() throws RecognitionException {
		try {
			int _type = STORY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:217:8: ( 'STORY' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:217:10: 'STORY'
			{
			match("STORY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STORY"

	// $ANTLR start "CHOOSE"
	public final void mCHOOSE() throws RecognitionException {
		try {
			int _type = CHOOSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:219:8: ( 'CHOOSE' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:219:10: 'CHOOSE'
			{
			match("CHOOSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHOOSE"

	// $ANTLR start "TITLE"
	public final void mTITLE() throws RecognitionException {
		try {
			int _type = TITLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:221:8: ( 'TITLE' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:221:10: 'TITLE'
			{
			match("TITLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITLE"

	// $ANTLR start "ENDSTORY"
	public final void mENDSTORY() throws RecognitionException {
		try {
			int _type = ENDSTORY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:223:10: ( 'ENDSTORY' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:223:12: 'ENDSTORY'
			{
			match("ENDSTORY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDSTORY"

	// $ANTLR start "TITLE_S"
	public final void mTITLE_S() throws RecognitionException {
		try {
			int _type = TITLE_S;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:225:10: ( 'title' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:225:12: 'title'
			{
			match("title"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITLE_S"

	// $ANTLR start "AUTHOR"
	public final void mAUTHOR() throws RecognitionException {
		try {
			int _type = AUTHOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:229:2: ( 'author' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:229:4: 'author'
			{
			match("author"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTHOR"

	// $ANTLR start "PUBLISHER"
	public final void mPUBLISHER() throws RecognitionException {
		try {
			int _type = PUBLISHER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:231:2: ( 'publisher' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:231:4: 'publisher'
			{
			match("publisher"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUBLISHER"

	// $ANTLR start "YEAR"
	public final void mYEAR() throws RecognitionException {
		try {
			int _type = YEAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:234:2: ( 'year' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:234:4: 'year'
			{
			match("year"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "YEAR"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:236:2: ( '\"' (~ '\"' )* '\"' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:236:4: '\"' (~ '\"' )* '\"'
			{
			match('\"'); 
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:236:8: (~ '\"' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			match('\"'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "IMAGE"
	public final void mIMAGE() throws RecognitionException {
		try {
			int _type = IMAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:238:2: ( 'image' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:238:4: 'image'
			{
			match("image"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMAGE"

	// $ANTLR start "LB"
	public final void mLB() throws RecognitionException {
		try {
			int _type = LB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:243:2: ( '{' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:243:4: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LB"

	// $ANTLR start "RB"
	public final void mRB() throws RecognitionException {
		try {
			int _type = RB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:247:2: ( '}' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:247:4: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RB"

	// $ANTLR start "SC"
	public final void mSC() throws RecognitionException {
		try {
			int _type = SC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:251:5: ( ';' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:251:7: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SC"

	// $ANTLR start "COL"
	public final void mCOL() throws RecognitionException {
		try {
			int _type = COL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:254:7: ( ':' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:254:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COL"

	// $ANTLR start "ARROW"
	public final void mARROW() throws RecognitionException {
		try {
			int _type = ARROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:257:7: ( '->' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:257:9: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARROW"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:260:7: ( ',' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:260:10: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "BRANCHES"
	public final void mBRANCHES() throws RecognitionException {
		try {
			int _type = BRANCHES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:263:10: ( 'BRANCHES' )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:263:12: 'BRANCHES'
			{
			match("BRANCHES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BRANCHES"

	// $ANTLR start "STRING_VALUE"
	public final void mSTRING_VALUE() throws RecognitionException {
		try {
			int _type = STRING_VALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:268:14: ( STRING )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:268:16: STRING
			{
			mSTRING(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_VALUE"

	// $ANTLR start "STORY_NAME"
	public final void mSTORY_NAME() throws RecognitionException {
		try {
			int _type = STORY_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:272:2: ( NAME )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:272:4: NAME
			{
			mNAME(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STORY_NAME"

	// $ANTLR start "NUMBER_VALUE"
	public final void mNUMBER_VALUE() throws RecognitionException {
		try {
			int _type = NUMBER_VALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:275:14: ( DIGIT ( DIGIT )* )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:275:16: DIGIT ( DIGIT )*
			{
			mDIGIT(); 

			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:275:22: ( DIGIT )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER_VALUE"

	// $ANTLR start "IMAGE_PATH"
	public final void mIMAGE_PATH() throws RecognitionException {
		try {
			int _type = IMAGE_PATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:279:2: ( ( ( '\\\\' )+ ( LETTER | DIGIT | '_' ) )+ ( '.jpg' | '.png' ) )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:279:4: ( ( '\\\\' )+ ( LETTER | DIGIT | '_' ) )+ ( '.jpg' | '.png' )
			{
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:279:4: ( ( '\\\\' )+ ( LETTER | DIGIT | '_' ) )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\\') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:279:6: ( '\\\\' )+ ( LETTER | DIGIT | '_' )
					{
					// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:279:6: ( '\\\\' )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0=='\\') ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:279:7: '\\\\'
							{
							match('\\'); 
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:279:40: ( '.jpg' | '.png' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='.') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='j') ) {
					alt6=1;
				}
				else if ( (LA6_1=='p') ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:279:41: '.jpg'
					{
					match(".jpg"); 

					}
					break;
				case 2 :
					// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:279:50: '.png'
					{
					match(".png"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMAGE_PATH"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:282:9: ( ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' ) )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:282:11: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			{
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:282:11: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='/') ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1=='/') ) {
					alt10=1;
				}
				else if ( (LA10_1=='*') ) {
					alt10=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:282:12: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:282:17: (~ ( '\\n' | '\\r' ) )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop7;
						}
					}

					// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:282:34: ( '\\r' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='\r') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:282:34: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}
					break;
				case 2 :
					// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:283:3: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:283:8: ( options {greedy=false; } : . )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0=='*') ) {
							int LA9_1 = input.LA(2);
							if ( (LA9_1=='/') ) {
								alt9=2;
							}
							else if ( ((LA9_1 >= '\u0000' && LA9_1 <= '.')||(LA9_1 >= '0' && LA9_1 <= '\uFFFF')) ) {
								alt9=1;
							}

						}
						else if ( ((LA9_0 >= '\u0000' && LA9_0 <= ')')||(LA9_0 >= '+' && LA9_0 <= '\uFFFF')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:283:36: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop9;
						}
					}

					match("*/"); 

					}
					break;

			}

			 skip(); /*_channel=HIDDEN;*/ 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "TEXT"
	public final void mTEXT() throws RecognitionException {
		try {
			int _type = TEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:288:7: ( LETTER (~ ( LB | RB ) )* )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:288:13: LETTER (~ ( LB | RB ) )*
			{
			mLETTER(); 

			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:288:20: (~ ( LB | RB ) )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '\u0000' && LA11_0 <= 'z')||LA11_0=='|'||(LA11_0 >= '~' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= 'z')||input.LA(1)=='|'||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop11;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEXT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:301:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:301:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			skip();  /* _channel=HIDDEN; */
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "SCAN_ERROR"
	public final void mSCAN_ERROR() throws RecognitionException {
		try {
			int _type = SCAN_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:308:5: ( . )
			// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:308:7: .
			{
			matchAny(); 
			 printMsg();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCAN_ERROR"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:8: ( BOOK | STORY | CHOOSE | TITLE | ENDSTORY | TITLE_S | AUTHOR | PUBLISHER | YEAR | IMAGE | LB | RB | SC | COL | ARROW | COMMA | BRANCHES | STRING_VALUE | STORY_NAME | NUMBER_VALUE | IMAGE_PATH | COMMENT | TEXT | WS | SCAN_ERROR )
		int alt12=25;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:10: BOOK
				{
				mBOOK(); 

				}
				break;
			case 2 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:15: STORY
				{
				mSTORY(); 

				}
				break;
			case 3 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:21: CHOOSE
				{
				mCHOOSE(); 

				}
				break;
			case 4 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:28: TITLE
				{
				mTITLE(); 

				}
				break;
			case 5 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:34: ENDSTORY
				{
				mENDSTORY(); 

				}
				break;
			case 6 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:43: TITLE_S
				{
				mTITLE_S(); 

				}
				break;
			case 7 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:51: AUTHOR
				{
				mAUTHOR(); 

				}
				break;
			case 8 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:58: PUBLISHER
				{
				mPUBLISHER(); 

				}
				break;
			case 9 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:68: YEAR
				{
				mYEAR(); 

				}
				break;
			case 10 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:73: IMAGE
				{
				mIMAGE(); 

				}
				break;
			case 11 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:79: LB
				{
				mLB(); 

				}
				break;
			case 12 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:82: RB
				{
				mRB(); 

				}
				break;
			case 13 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:85: SC
				{
				mSC(); 

				}
				break;
			case 14 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:88: COL
				{
				mCOL(); 

				}
				break;
			case 15 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:92: ARROW
				{
				mARROW(); 

				}
				break;
			case 16 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:98: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 17 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:104: BRANCHES
				{
				mBRANCHES(); 

				}
				break;
			case 18 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:113: STRING_VALUE
				{
				mSTRING_VALUE(); 

				}
				break;
			case 19 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:126: STORY_NAME
				{
				mSTORY_NAME(); 

				}
				break;
			case 20 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:137: NUMBER_VALUE
				{
				mNUMBER_VALUE(); 

				}
				break;
			case 21 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:150: IMAGE_PATH
				{
				mIMAGE_PATH(); 

				}
				break;
			case 22 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:161: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 23 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:169: TEXT
				{
				mTEXT(); 

				}
				break;
			case 24 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:174: WS
				{
				mWS(); 

				}
				break;
			case 25 :
				// C:\\Users\\berna\\git\\ProgettoCompilatori\\src\\MyGrammar.g:1:177: SCAN_ERROR
				{
				mSCAN_ERROR(); 

				}
				break;

		}
	}


	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA12_eotS =
		"\1\uffff\12\32\4\uffff\1\27\1\uffff\1\27\1\32\1\uffff\2\27\2\uffff\2\32"+
		"\1\uffff\1\32\1\uffff\11\32\13\uffff\13\32\1\107\10\32\1\120\1\32\1\uffff"+
		"\1\32\1\123\1\32\1\125\1\32\1\127\2\32\1\uffff\1\132\1\32\1\uffff\1\134"+
		"\1\uffff\1\32\1\uffff\1\136\1\32\1\uffff\1\32\1\uffff\1\32\1\uffff\1\32"+
		"\1\143\1\144\1\32\2\uffff\1\146\1\uffff";
	static final String DFA12_eofS =
		"\147\uffff";
	static final String DFA12_minS =
		"\13\0\4\uffff\1\76\1\uffff\2\0\1\uffff\1\60\1\52\2\uffff\2\0\1\uffff\1"+
		"\0\1\uffff\11\0\13\uffff\26\0\1\uffff\10\0\1\uffff\2\0\1\uffff\1\0\1\uffff"+
		"\1\0\1\uffff\2\0\1\uffff\1\0\1\uffff\1\0\1\uffff\4\0\2\uffff\1\0\1\uffff";
	static final String DFA12_maxS =
		"\13\uffff\4\uffff\1\76\1\uffff\2\uffff\1\uffff\1\172\1\57\2\uffff\2\uffff"+
		"\1\uffff\1\uffff\1\uffff\11\uffff\13\uffff\26\uffff\1\uffff\10\uffff\1"+
		"\uffff\2\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff\2\uffff\1\uffff"+
		"\1\uffff\1\uffff\1\uffff\1\uffff\4\uffff\2\uffff\1\uffff\1\uffff";
	static final String DFA12_acceptS =
		"\13\uffff\1\13\1\14\1\15\1\16\1\uffff\1\20\2\uffff\1\24\2\uffff\1\30\1"+
		"\31\2\uffff\1\23\1\uffff\1\27\11\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1"+
		"\22\1\24\1\25\1\26\1\30\26\uffff\1\1\10\uffff\1\11\2\uffff\1\2\1\uffff"+
		"\1\4\1\uffff\1\6\2\uffff\1\12\1\uffff\1\3\1\uffff\1\7\4\uffff\1\21\1\5"+
		"\1\uffff\1\10";
	static final String DFA12_specialS =
		"\1\67\1\52\1\63\1\72\1\73\1\74\1\77\1\100\1\101\1\102\1\103\6\uffff\1"+
		"\64\1\15\5\uffff\1\2\1\60\1\uffff\1\76\1\uffff\1\5\1\10\1\16\1\21\1\30"+
		"\1\33\1\40\1\50\1\54\13\uffff\1\3\1\62\1\6\1\11\1\17\1\22\1\31\1\34\1"+
		"\41\1\51\1\55\1\0\1\65\1\7\1\12\1\20\1\23\1\32\1\35\1\42\1\61\1\56\1\uffff"+
		"\1\66\1\4\1\13\1\25\1\24\1\47\1\36\1\43\1\uffff\1\75\1\70\1\uffff\1\14"+
		"\1\uffff\1\26\1\uffff\1\53\1\44\1\uffff\1\71\1\uffff\1\27\1\uffff\1\45"+
		"\1\1\1\37\1\46\2\uffff\1\57\1\uffff}>";
	static final String[] DFA12_transitionS = {
			"\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\21\11\27\1\20\1\17\1\27\1\25"+
			"\12\23\1\16\1\15\5\27\1\22\1\1\1\3\1\22\1\5\15\22\1\2\1\4\6\22\1\27\1"+
			"\24\4\27\1\7\7\22\1\12\6\22\1\10\3\22\1\6\4\22\1\11\1\22\1\13\1\27\1"+
			"\14\uff82\27",
			"\60\34\12\33\7\34\16\33\1\30\2\33\1\31\10\33\6\34\32\33\1\uffff\1\34"+
			"\1\uffff\uff82\34",
			"\60\34\12\33\7\34\23\33\1\35\6\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\7\33\1\36\22\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\10\33\1\37\21\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\15\33\1\40\14\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\32\33\6\34\10\33\1\41\21\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\32\33\6\34\24\33\1\42\5\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\32\33\6\34\24\33\1\43\5\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\32\33\6\34\4\33\1\44\25\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\32\33\6\34\14\33\1\45\15\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"",
			"",
			"",
			"",
			"\1\52",
			"",
			"\0\54",
			"\60\34\12\33\7\34\32\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82\34",
			"",
			"\12\56\7\uffff\32\56\1\uffff\1\56\2\uffff\1\56\1\uffff\32\56",
			"\1\57\4\uffff\1\57",
			"",
			"",
			"\60\34\12\33\7\34\16\33\1\61\13\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\1\62\31\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82\34",
			"",
			"\60\34\12\33\7\34\32\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82\34",
			"",
			"\60\34\12\33\7\34\16\33\1\63\13\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\16\33\1\64\13\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\23\33\1\65\6\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\3\33\1\66\26\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\32\33\6\34\23\33\1\67\6\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\32\33\6\34\23\33\1\70\6\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\32\33\6\34\1\33\1\71\30\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\32\33\6\34\1\72\31\33\1\uffff\1\34\1\uffff\uff82\34",
			"\60\34\12\33\7\34\32\33\6\34\1\73\31\33\1\uffff\1\34\1\uffff\uff82\34",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\60\34\12\33\7\34\12\33\1\74\17\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\15\33\1\75\14\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\21\33\1\76\10\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\16\33\1\77\13\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\13\33\1\100\16\33\6\34\32\33\1\uffff\1\34\1\uffff"+
			"\uff82\34",
			"\60\34\12\33\7\34\22\33\1\101\7\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\32\33\6\34\13\33\1\102\16\33\1\uffff\1\34\1\uffff"+
			"\uff82\34",
			"\60\34\12\33\7\34\32\33\6\34\7\33\1\103\22\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\32\33\6\34\13\33\1\104\16\33\1\uffff\1\34\1\uffff"+
			"\uff82\34",
			"\60\34\12\33\7\34\32\33\6\34\21\33\1\105\10\33\1\uffff\1\34\1\uffff"+
			"\uff82\34",
			"\60\34\12\33\7\34\32\33\6\34\6\33\1\106\23\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\32\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82\34",
			"\60\34\12\33\7\34\2\33\1\110\27\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\30\33\1\111\1\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\22\33\1\112\7\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\4\33\1\113\25\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\23\33\1\114\6\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\32\33\6\34\4\33\1\115\25\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\32\33\6\34\16\33\1\116\13\33\1\uffff\1\34\1\uffff"+
			"\uff82\34",
			"\60\34\12\33\7\34\32\33\6\34\10\33\1\117\21\33\1\uffff\1\34\1\uffff"+
			"\uff82\34",
			"\60\34\12\33\7\34\32\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82\34",
			"\60\34\12\33\7\34\32\33\6\34\4\33\1\121\25\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"",
			"\60\34\12\33\7\34\7\33\1\122\22\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\32\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82\34",
			"\60\34\12\33\7\34\4\33\1\124\25\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\32\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82\34",
			"\60\34\12\33\7\34\16\33\1\126\13\33\6\34\32\33\1\uffff\1\34\1\uffff"+
			"\uff82\34",
			"\60\34\12\33\7\34\32\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82\34",
			"\60\34\12\33\7\34\32\33\6\34\21\33\1\130\10\33\1\uffff\1\34\1\uffff"+
			"\uff82\34",
			"\60\34\12\33\7\34\32\33\6\34\22\33\1\131\7\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"",
			"\60\34\12\33\7\34\32\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82\34",
			"\60\34\12\33\7\34\4\33\1\133\25\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"",
			"\60\34\12\33\7\34\32\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82\34",
			"",
			"\60\34\12\33\7\34\21\33\1\135\10\33\6\34\32\33\1\uffff\1\34\1\uffff"+
			"\uff82\34",
			"",
			"\60\34\12\33\7\34\32\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82\34",
			"\60\34\12\33\7\34\32\33\6\34\7\33\1\137\22\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"",
			"\60\34\12\33\7\34\22\33\1\140\7\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"",
			"\60\34\12\33\7\34\30\33\1\141\1\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"",
			"\60\34\12\33\7\34\32\33\6\34\4\33\1\142\25\33\1\uffff\1\34\1\uffff\uff82"+
			"\34",
			"\60\34\12\33\7\34\32\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82\34",
			"\60\34\12\33\7\34\32\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82\34",
			"\60\34\12\33\7\34\32\33\6\34\21\33\1\145\10\33\1\uffff\1\34\1\uffff"+
			"\uff82\34",
			"",
			"",
			"\60\34\12\33\7\34\32\33\6\34\32\33\1\uffff\1\34\1\uffff\uff82\34",
			""
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( BOOK | STORY | CHOOSE | TITLE | ENDSTORY | TITLE_S | AUTHOR | PUBLISHER | YEAR | IMAGE | LB | RB | SC | COL | ARROW | COMMA | BRANCHES | STRING_VALUE | STORY_NAME | NUMBER_VALUE | IMAGE_PATH | COMMENT | TEXT | WS | SCAN_ERROR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA12_60 = input.LA(1);
						s = -1;
						if ( ((LA12_60 >= '0' && LA12_60 <= '9')||(LA12_60 >= 'A' && LA12_60 <= 'Z')||(LA12_60 >= 'a' && LA12_60 <= 'z')) ) {s = 27;}
						else if ( ((LA12_60 >= '\u0000' && LA12_60 <= '/')||(LA12_60 >= ':' && LA12_60 <= '@')||(LA12_60 >= '[' && LA12_60 <= '`')||LA12_60=='|'||(LA12_60 >= '~' && LA12_60 <= '\uFFFF')) ) {s = 28;}
						else s = 71;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA12_96 = input.LA(1);
						s = -1;
						if ( ((LA12_96 >= '0' && LA12_96 <= '9')||(LA12_96 >= 'A' && LA12_96 <= 'Z')||(LA12_96 >= 'a' && LA12_96 <= 'z')) ) {s = 27;}
						else if ( ((LA12_96 >= '\u0000' && LA12_96 <= '/')||(LA12_96 >= ':' && LA12_96 <= '@')||(LA12_96 >= '[' && LA12_96 <= '`')||LA12_96=='|'||(LA12_96 >= '~' && LA12_96 <= '\uFFFF')) ) {s = 28;}
						else s = 99;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA12_24 = input.LA(1);
						s = -1;
						if ( (LA12_24=='O') ) {s = 49;}
						else if ( ((LA12_24 >= '0' && LA12_24 <= '9')||(LA12_24 >= 'A' && LA12_24 <= 'N')||(LA12_24 >= 'P' && LA12_24 <= 'Z')||(LA12_24 >= 'a' && LA12_24 <= 'z')) ) {s = 27;}
						else if ( ((LA12_24 >= '\u0000' && LA12_24 <= '/')||(LA12_24 >= ':' && LA12_24 <= '@')||(LA12_24 >= '[' && LA12_24 <= '`')||LA12_24=='|'||(LA12_24 >= '~' && LA12_24 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA12_49 = input.LA(1);
						s = -1;
						if ( (LA12_49=='K') ) {s = 60;}
						else if ( ((LA12_49 >= '0' && LA12_49 <= '9')||(LA12_49 >= 'A' && LA12_49 <= 'J')||(LA12_49 >= 'L' && LA12_49 <= 'Z')||(LA12_49 >= 'a' && LA12_49 <= 'z')) ) {s = 27;}
						else if ( ((LA12_49 >= '\u0000' && LA12_49 <= '/')||(LA12_49 >= ':' && LA12_49 <= '@')||(LA12_49 >= '[' && LA12_49 <= '`')||LA12_49=='|'||(LA12_49 >= '~' && LA12_49 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA12_73 = input.LA(1);
						s = -1;
						if ( ((LA12_73 >= '0' && LA12_73 <= '9')||(LA12_73 >= 'A' && LA12_73 <= 'Z')||(LA12_73 >= 'a' && LA12_73 <= 'z')) ) {s = 27;}
						else if ( ((LA12_73 >= '\u0000' && LA12_73 <= '/')||(LA12_73 >= ':' && LA12_73 <= '@')||(LA12_73 >= '[' && LA12_73 <= '`')||LA12_73=='|'||(LA12_73 >= '~' && LA12_73 <= '\uFFFF')) ) {s = 28;}
						else s = 83;
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA12_29 = input.LA(1);
						s = -1;
						if ( (LA12_29=='O') ) {s = 51;}
						else if ( ((LA12_29 >= '0' && LA12_29 <= '9')||(LA12_29 >= 'A' && LA12_29 <= 'N')||(LA12_29 >= 'P' && LA12_29 <= 'Z')||(LA12_29 >= 'a' && LA12_29 <= 'z')) ) {s = 27;}
						else if ( ((LA12_29 >= '\u0000' && LA12_29 <= '/')||(LA12_29 >= ':' && LA12_29 <= '@')||(LA12_29 >= '[' && LA12_29 <= '`')||LA12_29=='|'||(LA12_29 >= '~' && LA12_29 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA12_51 = input.LA(1);
						s = -1;
						if ( (LA12_51=='R') ) {s = 62;}
						else if ( ((LA12_51 >= '0' && LA12_51 <= '9')||(LA12_51 >= 'A' && LA12_51 <= 'Q')||(LA12_51 >= 'S' && LA12_51 <= 'Z')||(LA12_51 >= 'a' && LA12_51 <= 'z')) ) {s = 27;}
						else if ( ((LA12_51 >= '\u0000' && LA12_51 <= '/')||(LA12_51 >= ':' && LA12_51 <= '@')||(LA12_51 >= '[' && LA12_51 <= '`')||LA12_51=='|'||(LA12_51 >= '~' && LA12_51 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA12_62 = input.LA(1);
						s = -1;
						if ( (LA12_62=='Y') ) {s = 73;}
						else if ( ((LA12_62 >= '0' && LA12_62 <= '9')||(LA12_62 >= 'A' && LA12_62 <= 'X')||LA12_62=='Z'||(LA12_62 >= 'a' && LA12_62 <= 'z')) ) {s = 27;}
						else if ( ((LA12_62 >= '\u0000' && LA12_62 <= '/')||(LA12_62 >= ':' && LA12_62 <= '@')||(LA12_62 >= '[' && LA12_62 <= '`')||LA12_62=='|'||(LA12_62 >= '~' && LA12_62 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA12_30 = input.LA(1);
						s = -1;
						if ( (LA12_30=='O') ) {s = 52;}
						else if ( ((LA12_30 >= '0' && LA12_30 <= '9')||(LA12_30 >= 'A' && LA12_30 <= 'N')||(LA12_30 >= 'P' && LA12_30 <= 'Z')||(LA12_30 >= 'a' && LA12_30 <= 'z')) ) {s = 27;}
						else if ( ((LA12_30 >= '\u0000' && LA12_30 <= '/')||(LA12_30 >= ':' && LA12_30 <= '@')||(LA12_30 >= '[' && LA12_30 <= '`')||LA12_30=='|'||(LA12_30 >= '~' && LA12_30 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA12_52 = input.LA(1);
						s = -1;
						if ( (LA12_52=='O') ) {s = 63;}
						else if ( ((LA12_52 >= '0' && LA12_52 <= '9')||(LA12_52 >= 'A' && LA12_52 <= 'N')||(LA12_52 >= 'P' && LA12_52 <= 'Z')||(LA12_52 >= 'a' && LA12_52 <= 'z')) ) {s = 27;}
						else if ( ((LA12_52 >= '\u0000' && LA12_52 <= '/')||(LA12_52 >= ':' && LA12_52 <= '@')||(LA12_52 >= '[' && LA12_52 <= '`')||LA12_52=='|'||(LA12_52 >= '~' && LA12_52 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA12_63 = input.LA(1);
						s = -1;
						if ( (LA12_63=='S') ) {s = 74;}
						else if ( ((LA12_63 >= '0' && LA12_63 <= '9')||(LA12_63 >= 'A' && LA12_63 <= 'R')||(LA12_63 >= 'T' && LA12_63 <= 'Z')||(LA12_63 >= 'a' && LA12_63 <= 'z')) ) {s = 27;}
						else if ( ((LA12_63 >= '\u0000' && LA12_63 <= '/')||(LA12_63 >= ':' && LA12_63 <= '@')||(LA12_63 >= '[' && LA12_63 <= '`')||LA12_63=='|'||(LA12_63 >= '~' && LA12_63 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA12_74 = input.LA(1);
						s = -1;
						if ( (LA12_74=='E') ) {s = 84;}
						else if ( ((LA12_74 >= '0' && LA12_74 <= '9')||(LA12_74 >= 'A' && LA12_74 <= 'D')||(LA12_74 >= 'F' && LA12_74 <= 'Z')||(LA12_74 >= 'a' && LA12_74 <= 'z')) ) {s = 27;}
						else if ( ((LA12_74 >= '\u0000' && LA12_74 <= '/')||(LA12_74 >= ':' && LA12_74 <= '@')||(LA12_74 >= '[' && LA12_74 <= '`')||LA12_74=='|'||(LA12_74 >= '~' && LA12_74 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA12_84 = input.LA(1);
						s = -1;
						if ( ((LA12_84 >= '0' && LA12_84 <= '9')||(LA12_84 >= 'A' && LA12_84 <= 'Z')||(LA12_84 >= 'a' && LA12_84 <= 'z')) ) {s = 27;}
						else if ( ((LA12_84 >= '\u0000' && LA12_84 <= '/')||(LA12_84 >= ':' && LA12_84 <= '@')||(LA12_84 >= '[' && LA12_84 <= '`')||LA12_84=='|'||(LA12_84 >= '~' && LA12_84 <= '\uFFFF')) ) {s = 28;}
						else s = 92;
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA12_18 = input.LA(1);
						s = -1;
						if ( ((LA12_18 >= '0' && LA12_18 <= '9')||(LA12_18 >= 'A' && LA12_18 <= 'Z')||(LA12_18 >= 'a' && LA12_18 <= 'z')) ) {s = 27;}
						else if ( ((LA12_18 >= '\u0000' && LA12_18 <= '/')||(LA12_18 >= ':' && LA12_18 <= '@')||(LA12_18 >= '[' && LA12_18 <= '`')||LA12_18=='|'||(LA12_18 >= '~' && LA12_18 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA12_31 = input.LA(1);
						s = -1;
						if ( (LA12_31=='T') ) {s = 53;}
						else if ( ((LA12_31 >= '0' && LA12_31 <= '9')||(LA12_31 >= 'A' && LA12_31 <= 'S')||(LA12_31 >= 'U' && LA12_31 <= 'Z')||(LA12_31 >= 'a' && LA12_31 <= 'z')) ) {s = 27;}
						else if ( ((LA12_31 >= '\u0000' && LA12_31 <= '/')||(LA12_31 >= ':' && LA12_31 <= '@')||(LA12_31 >= '[' && LA12_31 <= '`')||LA12_31=='|'||(LA12_31 >= '~' && LA12_31 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA12_53 = input.LA(1);
						s = -1;
						if ( (LA12_53=='L') ) {s = 64;}
						else if ( ((LA12_53 >= '0' && LA12_53 <= '9')||(LA12_53 >= 'A' && LA12_53 <= 'K')||(LA12_53 >= 'M' && LA12_53 <= 'Z')||(LA12_53 >= 'a' && LA12_53 <= 'z')) ) {s = 27;}
						else if ( ((LA12_53 >= '\u0000' && LA12_53 <= '/')||(LA12_53 >= ':' && LA12_53 <= '@')||(LA12_53 >= '[' && LA12_53 <= '`')||LA12_53=='|'||(LA12_53 >= '~' && LA12_53 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA12_64 = input.LA(1);
						s = -1;
						if ( (LA12_64=='E') ) {s = 75;}
						else if ( ((LA12_64 >= '0' && LA12_64 <= '9')||(LA12_64 >= 'A' && LA12_64 <= 'D')||(LA12_64 >= 'F' && LA12_64 <= 'Z')||(LA12_64 >= 'a' && LA12_64 <= 'z')) ) {s = 27;}
						else if ( ((LA12_64 >= '\u0000' && LA12_64 <= '/')||(LA12_64 >= ':' && LA12_64 <= '@')||(LA12_64 >= '[' && LA12_64 <= '`')||LA12_64=='|'||(LA12_64 >= '~' && LA12_64 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA12_32 = input.LA(1);
						s = -1;
						if ( (LA12_32=='D') ) {s = 54;}
						else if ( ((LA12_32 >= '0' && LA12_32 <= '9')||(LA12_32 >= 'A' && LA12_32 <= 'C')||(LA12_32 >= 'E' && LA12_32 <= 'Z')||(LA12_32 >= 'a' && LA12_32 <= 'z')) ) {s = 27;}
						else if ( ((LA12_32 >= '\u0000' && LA12_32 <= '/')||(LA12_32 >= ':' && LA12_32 <= '@')||(LA12_32 >= '[' && LA12_32 <= '`')||LA12_32=='|'||(LA12_32 >= '~' && LA12_32 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA12_54 = input.LA(1);
						s = -1;
						if ( (LA12_54=='S') ) {s = 65;}
						else if ( ((LA12_54 >= '0' && LA12_54 <= '9')||(LA12_54 >= 'A' && LA12_54 <= 'R')||(LA12_54 >= 'T' && LA12_54 <= 'Z')||(LA12_54 >= 'a' && LA12_54 <= 'z')) ) {s = 27;}
						else if ( ((LA12_54 >= '\u0000' && LA12_54 <= '/')||(LA12_54 >= ':' && LA12_54 <= '@')||(LA12_54 >= '[' && LA12_54 <= '`')||LA12_54=='|'||(LA12_54 >= '~' && LA12_54 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA12_65 = input.LA(1);
						s = -1;
						if ( (LA12_65=='T') ) {s = 76;}
						else if ( ((LA12_65 >= '0' && LA12_65 <= '9')||(LA12_65 >= 'A' && LA12_65 <= 'S')||(LA12_65 >= 'U' && LA12_65 <= 'Z')||(LA12_65 >= 'a' && LA12_65 <= 'z')) ) {s = 27;}
						else if ( ((LA12_65 >= '\u0000' && LA12_65 <= '/')||(LA12_65 >= ':' && LA12_65 <= '@')||(LA12_65 >= '[' && LA12_65 <= '`')||LA12_65=='|'||(LA12_65 >= '~' && LA12_65 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA12_76 = input.LA(1);
						s = -1;
						if ( (LA12_76=='O') ) {s = 86;}
						else if ( ((LA12_76 >= '0' && LA12_76 <= '9')||(LA12_76 >= 'A' && LA12_76 <= 'N')||(LA12_76 >= 'P' && LA12_76 <= 'Z')||(LA12_76 >= 'a' && LA12_76 <= 'z')) ) {s = 27;}
						else if ( ((LA12_76 >= '\u0000' && LA12_76 <= '/')||(LA12_76 >= ':' && LA12_76 <= '@')||(LA12_76 >= '[' && LA12_76 <= '`')||LA12_76=='|'||(LA12_76 >= '~' && LA12_76 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA12_75 = input.LA(1);
						s = -1;
						if ( ((LA12_75 >= '0' && LA12_75 <= '9')||(LA12_75 >= 'A' && LA12_75 <= 'Z')||(LA12_75 >= 'a' && LA12_75 <= 'z')) ) {s = 27;}
						else if ( ((LA12_75 >= '\u0000' && LA12_75 <= '/')||(LA12_75 >= ':' && LA12_75 <= '@')||(LA12_75 >= '[' && LA12_75 <= '`')||LA12_75=='|'||(LA12_75 >= '~' && LA12_75 <= '\uFFFF')) ) {s = 28;}
						else s = 85;
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA12_86 = input.LA(1);
						s = -1;
						if ( (LA12_86=='R') ) {s = 93;}
						else if ( ((LA12_86 >= '0' && LA12_86 <= '9')||(LA12_86 >= 'A' && LA12_86 <= 'Q')||(LA12_86 >= 'S' && LA12_86 <= 'Z')||(LA12_86 >= 'a' && LA12_86 <= 'z')) ) {s = 27;}
						else if ( ((LA12_86 >= '\u0000' && LA12_86 <= '/')||(LA12_86 >= ':' && LA12_86 <= '@')||(LA12_86 >= '[' && LA12_86 <= '`')||LA12_86=='|'||(LA12_86 >= '~' && LA12_86 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA12_93 = input.LA(1);
						s = -1;
						if ( (LA12_93=='Y') ) {s = 97;}
						else if ( ((LA12_93 >= '0' && LA12_93 <= '9')||(LA12_93 >= 'A' && LA12_93 <= 'X')||LA12_93=='Z'||(LA12_93 >= 'a' && LA12_93 <= 'z')) ) {s = 27;}
						else if ( ((LA12_93 >= '\u0000' && LA12_93 <= '/')||(LA12_93 >= ':' && LA12_93 <= '@')||(LA12_93 >= '[' && LA12_93 <= '`')||LA12_93=='|'||(LA12_93 >= '~' && LA12_93 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA12_33 = input.LA(1);
						s = -1;
						if ( (LA12_33=='t') ) {s = 55;}
						else if ( ((LA12_33 >= '0' && LA12_33 <= '9')||(LA12_33 >= 'A' && LA12_33 <= 'Z')||(LA12_33 >= 'a' && LA12_33 <= 's')||(LA12_33 >= 'u' && LA12_33 <= 'z')) ) {s = 27;}
						else if ( ((LA12_33 >= '\u0000' && LA12_33 <= '/')||(LA12_33 >= ':' && LA12_33 <= '@')||(LA12_33 >= '[' && LA12_33 <= '`')||LA12_33=='|'||(LA12_33 >= '~' && LA12_33 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA12_55 = input.LA(1);
						s = -1;
						if ( (LA12_55=='l') ) {s = 66;}
						else if ( ((LA12_55 >= '0' && LA12_55 <= '9')||(LA12_55 >= 'A' && LA12_55 <= 'Z')||(LA12_55 >= 'a' && LA12_55 <= 'k')||(LA12_55 >= 'm' && LA12_55 <= 'z')) ) {s = 27;}
						else if ( ((LA12_55 >= '\u0000' && LA12_55 <= '/')||(LA12_55 >= ':' && LA12_55 <= '@')||(LA12_55 >= '[' && LA12_55 <= '`')||LA12_55=='|'||(LA12_55 >= '~' && LA12_55 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA12_66 = input.LA(1);
						s = -1;
						if ( (LA12_66=='e') ) {s = 77;}
						else if ( ((LA12_66 >= '0' && LA12_66 <= '9')||(LA12_66 >= 'A' && LA12_66 <= 'Z')||(LA12_66 >= 'a' && LA12_66 <= 'd')||(LA12_66 >= 'f' && LA12_66 <= 'z')) ) {s = 27;}
						else if ( ((LA12_66 >= '\u0000' && LA12_66 <= '/')||(LA12_66 >= ':' && LA12_66 <= '@')||(LA12_66 >= '[' && LA12_66 <= '`')||LA12_66=='|'||(LA12_66 >= '~' && LA12_66 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA12_34 = input.LA(1);
						s = -1;
						if ( (LA12_34=='t') ) {s = 56;}
						else if ( ((LA12_34 >= '0' && LA12_34 <= '9')||(LA12_34 >= 'A' && LA12_34 <= 'Z')||(LA12_34 >= 'a' && LA12_34 <= 's')||(LA12_34 >= 'u' && LA12_34 <= 'z')) ) {s = 27;}
						else if ( ((LA12_34 >= '\u0000' && LA12_34 <= '/')||(LA12_34 >= ':' && LA12_34 <= '@')||(LA12_34 >= '[' && LA12_34 <= '`')||LA12_34=='|'||(LA12_34 >= '~' && LA12_34 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA12_56 = input.LA(1);
						s = -1;
						if ( (LA12_56=='h') ) {s = 67;}
						else if ( ((LA12_56 >= '0' && LA12_56 <= '9')||(LA12_56 >= 'A' && LA12_56 <= 'Z')||(LA12_56 >= 'a' && LA12_56 <= 'g')||(LA12_56 >= 'i' && LA12_56 <= 'z')) ) {s = 27;}
						else if ( ((LA12_56 >= '\u0000' && LA12_56 <= '/')||(LA12_56 >= ':' && LA12_56 <= '@')||(LA12_56 >= '[' && LA12_56 <= '`')||LA12_56=='|'||(LA12_56 >= '~' && LA12_56 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA12_67 = input.LA(1);
						s = -1;
						if ( (LA12_67=='o') ) {s = 78;}
						else if ( ((LA12_67 >= '0' && LA12_67 <= '9')||(LA12_67 >= 'A' && LA12_67 <= 'Z')||(LA12_67 >= 'a' && LA12_67 <= 'n')||(LA12_67 >= 'p' && LA12_67 <= 'z')) ) {s = 27;}
						else if ( ((LA12_67 >= '\u0000' && LA12_67 <= '/')||(LA12_67 >= ':' && LA12_67 <= '@')||(LA12_67 >= '[' && LA12_67 <= '`')||LA12_67=='|'||(LA12_67 >= '~' && LA12_67 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA12_78 = input.LA(1);
						s = -1;
						if ( (LA12_78=='r') ) {s = 88;}
						else if ( ((LA12_78 >= '0' && LA12_78 <= '9')||(LA12_78 >= 'A' && LA12_78 <= 'Z')||(LA12_78 >= 'a' && LA12_78 <= 'q')||(LA12_78 >= 's' && LA12_78 <= 'z')) ) {s = 27;}
						else if ( ((LA12_78 >= '\u0000' && LA12_78 <= '/')||(LA12_78 >= ':' && LA12_78 <= '@')||(LA12_78 >= '[' && LA12_78 <= '`')||LA12_78=='|'||(LA12_78 >= '~' && LA12_78 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA12_97 = input.LA(1);
						s = -1;
						if ( ((LA12_97 >= '0' && LA12_97 <= '9')||(LA12_97 >= 'A' && LA12_97 <= 'Z')||(LA12_97 >= 'a' && LA12_97 <= 'z')) ) {s = 27;}
						else if ( ((LA12_97 >= '\u0000' && LA12_97 <= '/')||(LA12_97 >= ':' && LA12_97 <= '@')||(LA12_97 >= '[' && LA12_97 <= '`')||LA12_97=='|'||(LA12_97 >= '~' && LA12_97 <= '\uFFFF')) ) {s = 28;}
						else s = 100;
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA12_35 = input.LA(1);
						s = -1;
						if ( (LA12_35=='b') ) {s = 57;}
						else if ( ((LA12_35 >= '0' && LA12_35 <= '9')||(LA12_35 >= 'A' && LA12_35 <= 'Z')||LA12_35=='a'||(LA12_35 >= 'c' && LA12_35 <= 'z')) ) {s = 27;}
						else if ( ((LA12_35 >= '\u0000' && LA12_35 <= '/')||(LA12_35 >= ':' && LA12_35 <= '@')||(LA12_35 >= '[' && LA12_35 <= '`')||LA12_35=='|'||(LA12_35 >= '~' && LA12_35 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA12_57 = input.LA(1);
						s = -1;
						if ( (LA12_57=='l') ) {s = 68;}
						else if ( ((LA12_57 >= '0' && LA12_57 <= '9')||(LA12_57 >= 'A' && LA12_57 <= 'Z')||(LA12_57 >= 'a' && LA12_57 <= 'k')||(LA12_57 >= 'm' && LA12_57 <= 'z')) ) {s = 27;}
						else if ( ((LA12_57 >= '\u0000' && LA12_57 <= '/')||(LA12_57 >= ':' && LA12_57 <= '@')||(LA12_57 >= '[' && LA12_57 <= '`')||LA12_57=='|'||(LA12_57 >= '~' && LA12_57 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA12_68 = input.LA(1);
						s = -1;
						if ( (LA12_68=='i') ) {s = 79;}
						else if ( ((LA12_68 >= '0' && LA12_68 <= '9')||(LA12_68 >= 'A' && LA12_68 <= 'Z')||(LA12_68 >= 'a' && LA12_68 <= 'h')||(LA12_68 >= 'j' && LA12_68 <= 'z')) ) {s = 27;}
						else if ( ((LA12_68 >= '\u0000' && LA12_68 <= '/')||(LA12_68 >= ':' && LA12_68 <= '@')||(LA12_68 >= '[' && LA12_68 <= '`')||LA12_68=='|'||(LA12_68 >= '~' && LA12_68 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA12_79 = input.LA(1);
						s = -1;
						if ( (LA12_79=='s') ) {s = 89;}
						else if ( ((LA12_79 >= '0' && LA12_79 <= '9')||(LA12_79 >= 'A' && LA12_79 <= 'Z')||(LA12_79 >= 'a' && LA12_79 <= 'r')||(LA12_79 >= 't' && LA12_79 <= 'z')) ) {s = 27;}
						else if ( ((LA12_79 >= '\u0000' && LA12_79 <= '/')||(LA12_79 >= ':' && LA12_79 <= '@')||(LA12_79 >= '[' && LA12_79 <= '`')||LA12_79=='|'||(LA12_79 >= '~' && LA12_79 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA12_89 = input.LA(1);
						s = -1;
						if ( (LA12_89=='h') ) {s = 95;}
						else if ( ((LA12_89 >= '0' && LA12_89 <= '9')||(LA12_89 >= 'A' && LA12_89 <= 'Z')||(LA12_89 >= 'a' && LA12_89 <= 'g')||(LA12_89 >= 'i' && LA12_89 <= 'z')) ) {s = 27;}
						else if ( ((LA12_89 >= '\u0000' && LA12_89 <= '/')||(LA12_89 >= ':' && LA12_89 <= '@')||(LA12_89 >= '[' && LA12_89 <= '`')||LA12_89=='|'||(LA12_89 >= '~' && LA12_89 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA12_95 = input.LA(1);
						s = -1;
						if ( (LA12_95=='e') ) {s = 98;}
						else if ( ((LA12_95 >= '0' && LA12_95 <= '9')||(LA12_95 >= 'A' && LA12_95 <= 'Z')||(LA12_95 >= 'a' && LA12_95 <= 'd')||(LA12_95 >= 'f' && LA12_95 <= 'z')) ) {s = 27;}
						else if ( ((LA12_95 >= '\u0000' && LA12_95 <= '/')||(LA12_95 >= ':' && LA12_95 <= '@')||(LA12_95 >= '[' && LA12_95 <= '`')||LA12_95=='|'||(LA12_95 >= '~' && LA12_95 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA12_98 = input.LA(1);
						s = -1;
						if ( (LA12_98=='r') ) {s = 101;}
						else if ( ((LA12_98 >= '0' && LA12_98 <= '9')||(LA12_98 >= 'A' && LA12_98 <= 'Z')||(LA12_98 >= 'a' && LA12_98 <= 'q')||(LA12_98 >= 's' && LA12_98 <= 'z')) ) {s = 27;}
						else if ( ((LA12_98 >= '\u0000' && LA12_98 <= '/')||(LA12_98 >= ':' && LA12_98 <= '@')||(LA12_98 >= '[' && LA12_98 <= '`')||LA12_98=='|'||(LA12_98 >= '~' && LA12_98 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA12_77 = input.LA(1);
						s = -1;
						if ( ((LA12_77 >= '0' && LA12_77 <= '9')||(LA12_77 >= 'A' && LA12_77 <= 'Z')||(LA12_77 >= 'a' && LA12_77 <= 'z')) ) {s = 27;}
						else if ( ((LA12_77 >= '\u0000' && LA12_77 <= '/')||(LA12_77 >= ':' && LA12_77 <= '@')||(LA12_77 >= '[' && LA12_77 <= '`')||LA12_77=='|'||(LA12_77 >= '~' && LA12_77 <= '\uFFFF')) ) {s = 28;}
						else s = 87;
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA12_36 = input.LA(1);
						s = -1;
						if ( (LA12_36=='a') ) {s = 58;}
						else if ( ((LA12_36 >= '0' && LA12_36 <= '9')||(LA12_36 >= 'A' && LA12_36 <= 'Z')||(LA12_36 >= 'b' && LA12_36 <= 'z')) ) {s = 27;}
						else if ( ((LA12_36 >= '\u0000' && LA12_36 <= '/')||(LA12_36 >= ':' && LA12_36 <= '@')||(LA12_36 >= '[' && LA12_36 <= '`')||LA12_36=='|'||(LA12_36 >= '~' && LA12_36 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA12_58 = input.LA(1);
						s = -1;
						if ( (LA12_58=='r') ) {s = 69;}
						else if ( ((LA12_58 >= '0' && LA12_58 <= '9')||(LA12_58 >= 'A' && LA12_58 <= 'Z')||(LA12_58 >= 'a' && LA12_58 <= 'q')||(LA12_58 >= 's' && LA12_58 <= 'z')) ) {s = 27;}
						else if ( ((LA12_58 >= '\u0000' && LA12_58 <= '/')||(LA12_58 >= ':' && LA12_58 <= '@')||(LA12_58 >= '[' && LA12_58 <= '`')||LA12_58=='|'||(LA12_58 >= '~' && LA12_58 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA12_1 = input.LA(1);
						s = -1;
						if ( (LA12_1=='O') ) {s = 24;}
						else if ( (LA12_1=='R') ) {s = 25;}
						else if ( ((LA12_1 >= '0' && LA12_1 <= '9')||(LA12_1 >= 'A' && LA12_1 <= 'N')||(LA12_1 >= 'P' && LA12_1 <= 'Q')||(LA12_1 >= 'S' && LA12_1 <= 'Z')||(LA12_1 >= 'a' && LA12_1 <= 'z')) ) {s = 27;}
						else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '/')||(LA12_1 >= ':' && LA12_1 <= '@')||(LA12_1 >= '[' && LA12_1 <= '`')||LA12_1=='|'||(LA12_1 >= '~' && LA12_1 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA12_88 = input.LA(1);
						s = -1;
						if ( ((LA12_88 >= '0' && LA12_88 <= '9')||(LA12_88 >= 'A' && LA12_88 <= 'Z')||(LA12_88 >= 'a' && LA12_88 <= 'z')) ) {s = 27;}
						else if ( ((LA12_88 >= '\u0000' && LA12_88 <= '/')||(LA12_88 >= ':' && LA12_88 <= '@')||(LA12_88 >= '[' && LA12_88 <= '`')||LA12_88=='|'||(LA12_88 >= '~' && LA12_88 <= '\uFFFF')) ) {s = 28;}
						else s = 94;
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA12_37 = input.LA(1);
						s = -1;
						if ( (LA12_37=='a') ) {s = 59;}
						else if ( ((LA12_37 >= '0' && LA12_37 <= '9')||(LA12_37 >= 'A' && LA12_37 <= 'Z')||(LA12_37 >= 'b' && LA12_37 <= 'z')) ) {s = 27;}
						else if ( ((LA12_37 >= '\u0000' && LA12_37 <= '/')||(LA12_37 >= ':' && LA12_37 <= '@')||(LA12_37 >= '[' && LA12_37 <= '`')||LA12_37=='|'||(LA12_37 >= '~' && LA12_37 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA12_59 = input.LA(1);
						s = -1;
						if ( (LA12_59=='g') ) {s = 70;}
						else if ( ((LA12_59 >= '0' && LA12_59 <= '9')||(LA12_59 >= 'A' && LA12_59 <= 'Z')||(LA12_59 >= 'a' && LA12_59 <= 'f')||(LA12_59 >= 'h' && LA12_59 <= 'z')) ) {s = 27;}
						else if ( ((LA12_59 >= '\u0000' && LA12_59 <= '/')||(LA12_59 >= ':' && LA12_59 <= '@')||(LA12_59 >= '[' && LA12_59 <= '`')||LA12_59=='|'||(LA12_59 >= '~' && LA12_59 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA12_70 = input.LA(1);
						s = -1;
						if ( (LA12_70=='e') ) {s = 81;}
						else if ( ((LA12_70 >= '0' && LA12_70 <= '9')||(LA12_70 >= 'A' && LA12_70 <= 'Z')||(LA12_70 >= 'a' && LA12_70 <= 'd')||(LA12_70 >= 'f' && LA12_70 <= 'z')) ) {s = 27;}
						else if ( ((LA12_70 >= '\u0000' && LA12_70 <= '/')||(LA12_70 >= ':' && LA12_70 <= '@')||(LA12_70 >= '[' && LA12_70 <= '`')||LA12_70=='|'||(LA12_70 >= '~' && LA12_70 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA12_101 = input.LA(1);
						s = -1;
						if ( ((LA12_101 >= '0' && LA12_101 <= '9')||(LA12_101 >= 'A' && LA12_101 <= 'Z')||(LA12_101 >= 'a' && LA12_101 <= 'z')) ) {s = 27;}
						else if ( ((LA12_101 >= '\u0000' && LA12_101 <= '/')||(LA12_101 >= ':' && LA12_101 <= '@')||(LA12_101 >= '[' && LA12_101 <= '`')||LA12_101=='|'||(LA12_101 >= '~' && LA12_101 <= '\uFFFF')) ) {s = 28;}
						else s = 102;
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA12_25 = input.LA(1);
						s = -1;
						if ( (LA12_25=='A') ) {s = 50;}
						else if ( ((LA12_25 >= '0' && LA12_25 <= '9')||(LA12_25 >= 'B' && LA12_25 <= 'Z')||(LA12_25 >= 'a' && LA12_25 <= 'z')) ) {s = 27;}
						else if ( ((LA12_25 >= '\u0000' && LA12_25 <= '/')||(LA12_25 >= ':' && LA12_25 <= '@')||(LA12_25 >= '[' && LA12_25 <= '`')||LA12_25=='|'||(LA12_25 >= '~' && LA12_25 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA12_69 = input.LA(1);
						s = -1;
						if ( ((LA12_69 >= '0' && LA12_69 <= '9')||(LA12_69 >= 'A' && LA12_69 <= 'Z')||(LA12_69 >= 'a' && LA12_69 <= 'z')) ) {s = 27;}
						else if ( ((LA12_69 >= '\u0000' && LA12_69 <= '/')||(LA12_69 >= ':' && LA12_69 <= '@')||(LA12_69 >= '[' && LA12_69 <= '`')||LA12_69=='|'||(LA12_69 >= '~' && LA12_69 <= '\uFFFF')) ) {s = 28;}
						else s = 80;
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA12_50 = input.LA(1);
						s = -1;
						if ( (LA12_50=='N') ) {s = 61;}
						else if ( ((LA12_50 >= '0' && LA12_50 <= '9')||(LA12_50 >= 'A' && LA12_50 <= 'M')||(LA12_50 >= 'O' && LA12_50 <= 'Z')||(LA12_50 >= 'a' && LA12_50 <= 'z')) ) {s = 27;}
						else if ( ((LA12_50 >= '\u0000' && LA12_50 <= '/')||(LA12_50 >= ':' && LA12_50 <= '@')||(LA12_50 >= '[' && LA12_50 <= '`')||LA12_50=='|'||(LA12_50 >= '~' && LA12_50 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA12_2 = input.LA(1);
						s = -1;
						if ( (LA12_2=='T') ) {s = 29;}
						else if ( ((LA12_2 >= '0' && LA12_2 <= '9')||(LA12_2 >= 'A' && LA12_2 <= 'S')||(LA12_2 >= 'U' && LA12_2 <= 'Z')||(LA12_2 >= 'a' && LA12_2 <= 'z')) ) {s = 27;}
						else if ( ((LA12_2 >= '\u0000' && LA12_2 <= '/')||(LA12_2 >= ':' && LA12_2 <= '@')||(LA12_2 >= '[' && LA12_2 <= '`')||LA12_2=='|'||(LA12_2 >= '~' && LA12_2 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA12_17 = input.LA(1);
						s = -1;
						if ( ((LA12_17 >= '\u0000' && LA12_17 <= '\uFFFF')) ) {s = 44;}
						else s = 23;
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA12_61 = input.LA(1);
						s = -1;
						if ( (LA12_61=='C') ) {s = 72;}
						else if ( ((LA12_61 >= '0' && LA12_61 <= '9')||(LA12_61 >= 'A' && LA12_61 <= 'B')||(LA12_61 >= 'D' && LA12_61 <= 'Z')||(LA12_61 >= 'a' && LA12_61 <= 'z')) ) {s = 27;}
						else if ( ((LA12_61 >= '\u0000' && LA12_61 <= '/')||(LA12_61 >= ':' && LA12_61 <= '@')||(LA12_61 >= '[' && LA12_61 <= '`')||LA12_61=='|'||(LA12_61 >= '~' && LA12_61 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA12_72 = input.LA(1);
						s = -1;
						if ( (LA12_72=='H') ) {s = 82;}
						else if ( ((LA12_72 >= '0' && LA12_72 <= '9')||(LA12_72 >= 'A' && LA12_72 <= 'G')||(LA12_72 >= 'I' && LA12_72 <= 'Z')||(LA12_72 >= 'a' && LA12_72 <= 'z')) ) {s = 27;}
						else if ( ((LA12_72 >= '\u0000' && LA12_72 <= '/')||(LA12_72 >= ':' && LA12_72 <= '@')||(LA12_72 >= '[' && LA12_72 <= '`')||LA12_72=='|'||(LA12_72 >= '~' && LA12_72 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA12_0 = input.LA(1);
						s = -1;
						if ( (LA12_0=='B') ) {s = 1;}
						else if ( (LA12_0=='S') ) {s = 2;}
						else if ( (LA12_0=='C') ) {s = 3;}
						else if ( (LA12_0=='T') ) {s = 4;}
						else if ( (LA12_0=='E') ) {s = 5;}
						else if ( (LA12_0=='t') ) {s = 6;}
						else if ( (LA12_0=='a') ) {s = 7;}
						else if ( (LA12_0=='p') ) {s = 8;}
						else if ( (LA12_0=='y') ) {s = 9;}
						else if ( (LA12_0=='i') ) {s = 10;}
						else if ( (LA12_0=='{') ) {s = 11;}
						else if ( (LA12_0=='}') ) {s = 12;}
						else if ( (LA12_0==';') ) {s = 13;}
						else if ( (LA12_0==':') ) {s = 14;}
						else if ( (LA12_0=='-') ) {s = 15;}
						else if ( (LA12_0==',') ) {s = 16;}
						else if ( (LA12_0=='\"') ) {s = 17;}
						else if ( (LA12_0=='A'||LA12_0=='D'||(LA12_0 >= 'F' && LA12_0 <= 'R')||(LA12_0 >= 'U' && LA12_0 <= 'Z')||(LA12_0 >= 'b' && LA12_0 <= 'h')||(LA12_0 >= 'j' && LA12_0 <= 'o')||(LA12_0 >= 'q' && LA12_0 <= 's')||(LA12_0 >= 'u' && LA12_0 <= 'x')||LA12_0=='z') ) {s = 18;}
						else if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {s = 19;}
						else if ( (LA12_0=='\\') ) {s = 20;}
						else if ( (LA12_0=='/') ) {s = 21;}
						else if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 22;}
						else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\b')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '\u001F')||LA12_0=='!'||(LA12_0 >= '#' && LA12_0 <= '+')||LA12_0=='.'||(LA12_0 >= '<' && LA12_0 <= '@')||LA12_0=='['||(LA12_0 >= ']' && LA12_0 <= '`')||LA12_0=='|'||(LA12_0 >= '~' && LA12_0 <= '\uFFFF')) ) {s = 23;}
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA12_82 = input.LA(1);
						s = -1;
						if ( (LA12_82=='E') ) {s = 91;}
						else if ( ((LA12_82 >= '0' && LA12_82 <= '9')||(LA12_82 >= 'A' && LA12_82 <= 'D')||(LA12_82 >= 'F' && LA12_82 <= 'Z')||(LA12_82 >= 'a' && LA12_82 <= 'z')) ) {s = 27;}
						else if ( ((LA12_82 >= '\u0000' && LA12_82 <= '/')||(LA12_82 >= ':' && LA12_82 <= '@')||(LA12_82 >= '[' && LA12_82 <= '`')||LA12_82=='|'||(LA12_82 >= '~' && LA12_82 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA12_91 = input.LA(1);
						s = -1;
						if ( (LA12_91=='S') ) {s = 96;}
						else if ( ((LA12_91 >= '0' && LA12_91 <= '9')||(LA12_91 >= 'A' && LA12_91 <= 'R')||(LA12_91 >= 'T' && LA12_91 <= 'Z')||(LA12_91 >= 'a' && LA12_91 <= 'z')) ) {s = 27;}
						else if ( ((LA12_91 >= '\u0000' && LA12_91 <= '/')||(LA12_91 >= ':' && LA12_91 <= '@')||(LA12_91 >= '[' && LA12_91 <= '`')||LA12_91=='|'||(LA12_91 >= '~' && LA12_91 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA12_3 = input.LA(1);
						s = -1;
						if ( (LA12_3=='H') ) {s = 30;}
						else if ( ((LA12_3 >= '0' && LA12_3 <= '9')||(LA12_3 >= 'A' && LA12_3 <= 'G')||(LA12_3 >= 'I' && LA12_3 <= 'Z')||(LA12_3 >= 'a' && LA12_3 <= 'z')) ) {s = 27;}
						else if ( ((LA12_3 >= '\u0000' && LA12_3 <= '/')||(LA12_3 >= ':' && LA12_3 <= '@')||(LA12_3 >= '[' && LA12_3 <= '`')||LA12_3=='|'||(LA12_3 >= '~' && LA12_3 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA12_4 = input.LA(1);
						s = -1;
						if ( (LA12_4=='I') ) {s = 31;}
						else if ( ((LA12_4 >= '0' && LA12_4 <= '9')||(LA12_4 >= 'A' && LA12_4 <= 'H')||(LA12_4 >= 'J' && LA12_4 <= 'Z')||(LA12_4 >= 'a' && LA12_4 <= 'z')) ) {s = 27;}
						else if ( ((LA12_4 >= '\u0000' && LA12_4 <= '/')||(LA12_4 >= ':' && LA12_4 <= '@')||(LA12_4 >= '[' && LA12_4 <= '`')||LA12_4=='|'||(LA12_4 >= '~' && LA12_4 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA12_5 = input.LA(1);
						s = -1;
						if ( (LA12_5=='N') ) {s = 32;}
						else if ( ((LA12_5 >= '0' && LA12_5 <= '9')||(LA12_5 >= 'A' && LA12_5 <= 'M')||(LA12_5 >= 'O' && LA12_5 <= 'Z')||(LA12_5 >= 'a' && LA12_5 <= 'z')) ) {s = 27;}
						else if ( ((LA12_5 >= '\u0000' && LA12_5 <= '/')||(LA12_5 >= ':' && LA12_5 <= '@')||(LA12_5 >= '[' && LA12_5 <= '`')||LA12_5=='|'||(LA12_5 >= '~' && LA12_5 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA12_81 = input.LA(1);
						s = -1;
						if ( ((LA12_81 >= '0' && LA12_81 <= '9')||(LA12_81 >= 'A' && LA12_81 <= 'Z')||(LA12_81 >= 'a' && LA12_81 <= 'z')) ) {s = 27;}
						else if ( ((LA12_81 >= '\u0000' && LA12_81 <= '/')||(LA12_81 >= ':' && LA12_81 <= '@')||(LA12_81 >= '[' && LA12_81 <= '`')||LA12_81=='|'||(LA12_81 >= '~' && LA12_81 <= '\uFFFF')) ) {s = 28;}
						else s = 90;
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA12_27 = input.LA(1);
						s = -1;
						if ( ((LA12_27 >= '0' && LA12_27 <= '9')||(LA12_27 >= 'A' && LA12_27 <= 'Z')||(LA12_27 >= 'a' && LA12_27 <= 'z')) ) {s = 27;}
						else if ( ((LA12_27 >= '\u0000' && LA12_27 <= '/')||(LA12_27 >= ':' && LA12_27 <= '@')||(LA12_27 >= '[' && LA12_27 <= '`')||LA12_27=='|'||(LA12_27 >= '~' && LA12_27 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA12_6 = input.LA(1);
						s = -1;
						if ( (LA12_6=='i') ) {s = 33;}
						else if ( ((LA12_6 >= '0' && LA12_6 <= '9')||(LA12_6 >= 'A' && LA12_6 <= 'Z')||(LA12_6 >= 'a' && LA12_6 <= 'h')||(LA12_6 >= 'j' && LA12_6 <= 'z')) ) {s = 27;}
						else if ( ((LA12_6 >= '\u0000' && LA12_6 <= '/')||(LA12_6 >= ':' && LA12_6 <= '@')||(LA12_6 >= '[' && LA12_6 <= '`')||LA12_6=='|'||(LA12_6 >= '~' && LA12_6 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA12_7 = input.LA(1);
						s = -1;
						if ( (LA12_7=='u') ) {s = 34;}
						else if ( ((LA12_7 >= '0' && LA12_7 <= '9')||(LA12_7 >= 'A' && LA12_7 <= 'Z')||(LA12_7 >= 'a' && LA12_7 <= 't')||(LA12_7 >= 'v' && LA12_7 <= 'z')) ) {s = 27;}
						else if ( ((LA12_7 >= '\u0000' && LA12_7 <= '/')||(LA12_7 >= ':' && LA12_7 <= '@')||(LA12_7 >= '[' && LA12_7 <= '`')||LA12_7=='|'||(LA12_7 >= '~' && LA12_7 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA12_8 = input.LA(1);
						s = -1;
						if ( (LA12_8=='u') ) {s = 35;}
						else if ( ((LA12_8 >= '0' && LA12_8 <= '9')||(LA12_8 >= 'A' && LA12_8 <= 'Z')||(LA12_8 >= 'a' && LA12_8 <= 't')||(LA12_8 >= 'v' && LA12_8 <= 'z')) ) {s = 27;}
						else if ( ((LA12_8 >= '\u0000' && LA12_8 <= '/')||(LA12_8 >= ':' && LA12_8 <= '@')||(LA12_8 >= '[' && LA12_8 <= '`')||LA12_8=='|'||(LA12_8 >= '~' && LA12_8 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA12_9 = input.LA(1);
						s = -1;
						if ( (LA12_9=='e') ) {s = 36;}
						else if ( ((LA12_9 >= '0' && LA12_9 <= '9')||(LA12_9 >= 'A' && LA12_9 <= 'Z')||(LA12_9 >= 'a' && LA12_9 <= 'd')||(LA12_9 >= 'f' && LA12_9 <= 'z')) ) {s = 27;}
						else if ( ((LA12_9 >= '\u0000' && LA12_9 <= '/')||(LA12_9 >= ':' && LA12_9 <= '@')||(LA12_9 >= '[' && LA12_9 <= '`')||LA12_9=='|'||(LA12_9 >= '~' && LA12_9 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA12_10 = input.LA(1);
						s = -1;
						if ( (LA12_10=='m') ) {s = 37;}
						else if ( ((LA12_10 >= '0' && LA12_10 <= '9')||(LA12_10 >= 'A' && LA12_10 <= 'Z')||(LA12_10 >= 'a' && LA12_10 <= 'l')||(LA12_10 >= 'n' && LA12_10 <= 'z')) ) {s = 27;}
						else if ( ((LA12_10 >= '\u0000' && LA12_10 <= '/')||(LA12_10 >= ':' && LA12_10 <= '@')||(LA12_10 >= '[' && LA12_10 <= '`')||LA12_10=='|'||(LA12_10 >= '~' && LA12_10 <= '\uFFFF')) ) {s = 28;}
						else s = 26;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 12, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
