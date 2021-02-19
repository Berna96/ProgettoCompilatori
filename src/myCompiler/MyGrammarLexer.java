// $ANTLR 3.5.1 C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g 2020-12-29 17:26:04

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
	@Override public String getGrammarFileName() { return "C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:121:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:124:2: ( ( '0' .. '9' ) )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:127:2: ( '$' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:127:4: '$'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:130:2: ( LETTER ( LETTER | DIGIT )* )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:130:4: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:130:11: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:135:2: ( '<' | '>' | ':' | '\"' | '/' | '\\\\' | '|' | '?' | '*' | '.' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:148:7: ( 'BOOK' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:148:9: 'BOOK'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:151:8: ( 'STORY' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:151:10: 'STORY'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:153:8: ( 'CHOOSE' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:153:10: 'CHOOSE'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:155:8: ( 'TITLE' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:155:10: 'TITLE'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:157:10: ( 'ENDSTORY' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:157:12: 'ENDSTORY'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:159:10: ( 'title' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:159:12: 'title'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:163:2: ( 'author' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:163:4: 'author'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:165:2: ( 'publisher' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:165:4: 'publisher'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:168:2: ( 'year' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:168:4: 'year'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:170:2: ( '\"' (~ '\"' )* '\"' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:170:4: '\"' (~ '\"' )* '\"'
			{
			match('\"'); 
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:170:8: (~ '\"' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:172:2: ( 'image' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:172:4: 'image'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:177:2: ( '{' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:177:4: '{'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:181:2: ( '}' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:181:4: '}'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:185:5: ( ';' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:185:7: ';'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:188:7: ( ':' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:188:9: ':'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:191:7: ( '->' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:191:9: '->'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:194:7: ( ',' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:194:10: ','
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:197:10: ( 'BRANCHES' )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:197:12: 'BRANCHES'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:202:14: ( STRING )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:202:16: STRING
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:206:2: ( NAME )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:206:4: NAME
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:209:14: ( DIGIT ( DIGIT )* )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:209:16: DIGIT ( DIGIT )*
			{
			mDIGIT(); 

			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:209:22: ( DIGIT )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:213:2: ( ( ( '\\\\' )* NAME )+ ( '.jpg' | '.png' ) )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:213:4: ( ( '\\\\' )* NAME )+ ( '.jpg' | '.png' )
			{
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:213:4: ( ( '\\\\' )* NAME )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='\\'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:213:6: ( '\\\\' )* NAME
					{
					// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:213:6: ( '\\\\' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0=='\\') ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:213:7: '\\\\'
							{
							match('\\'); 
							}
							break;

						default :
							break loop4;
						}
					}

					mNAME(); 

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:213:22: ( '.jpg' | '.png' )
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
					// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:213:23: '.jpg'
					{
					match(".jpg"); 

					}
					break;
				case 2 :
					// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:213:32: '.png'
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:216:9: ( ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' ) )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:216:11: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			{
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:216:11: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
					// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:216:12: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:216:17: (~ ( '\\n' | '\\r' ) )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:
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

					// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:216:34: ( '\\r' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='\r') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:216:34: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}
					break;
				case 2 :
					// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:217:3: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:217:8: ( options {greedy=false; } : . )*
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
							// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:217:36: .
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:221:7: ( DOLL (~ DOLL )* DOLL )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:223:3: DOLL (~ DOLL )* DOLL
			{
			mDOLL(); 

			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:223:8: (~ DOLL )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '\u0000' && LA11_0 <= '#')||(LA11_0 >= '%' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '#')||(input.LA(1) >= '%' && input.LA(1) <= '\uFFFF') ) {
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

			mDOLL(); 

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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:233:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:233:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:240:5: ( . )
			// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:240:7: .
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
		// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:8: ( BOOK | STORY | CHOOSE | TITLE | ENDSTORY | TITLE_S | AUTHOR | PUBLISHER | YEAR | IMAGE | LB | RB | SC | COL | ARROW | COMMA | BRANCHES | STRING_VALUE | STORY_NAME | NUMBER_VALUE | IMAGE_PATH | COMMENT | TEXT | WS | SCAN_ERROR )
		int alt12=25;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:10: BOOK
				{
				mBOOK(); 

				}
				break;
			case 2 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:15: STORY
				{
				mSTORY(); 

				}
				break;
			case 3 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:21: CHOOSE
				{
				mCHOOSE(); 

				}
				break;
			case 4 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:28: TITLE
				{
				mTITLE(); 

				}
				break;
			case 5 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:34: ENDSTORY
				{
				mENDSTORY(); 

				}
				break;
			case 6 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:43: TITLE_S
				{
				mTITLE_S(); 

				}
				break;
			case 7 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:51: AUTHOR
				{
				mAUTHOR(); 

				}
				break;
			case 8 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:58: PUBLISHER
				{
				mPUBLISHER(); 

				}
				break;
			case 9 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:68: YEAR
				{
				mYEAR(); 

				}
				break;
			case 10 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:73: IMAGE
				{
				mIMAGE(); 

				}
				break;
			case 11 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:79: LB
				{
				mLB(); 

				}
				break;
			case 12 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:82: RB
				{
				mRB(); 

				}
				break;
			case 13 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:85: SC
				{
				mSC(); 

				}
				break;
			case 14 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:88: COL
				{
				mCOL(); 

				}
				break;
			case 15 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:92: ARROW
				{
				mARROW(); 

				}
				break;
			case 16 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:98: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 17 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:104: BRANCHES
				{
				mBRANCHES(); 

				}
				break;
			case 18 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:113: STRING_VALUE
				{
				mSTRING_VALUE(); 

				}
				break;
			case 19 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:126: STORY_NAME
				{
				mSTORY_NAME(); 

				}
				break;
			case 20 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:137: NUMBER_VALUE
				{
				mNUMBER_VALUE(); 

				}
				break;
			case 21 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:150: IMAGE_PATH
				{
				mIMAGE_PATH(); 

				}
				break;
			case 22 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:161: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 23 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:169: TEXT
				{
				mTEXT(); 

				}
				break;
			case 24 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:174: WS
				{
				mWS(); 

				}
				break;
			case 25 :
				// C:\\Users\\berna\\eclipse-workspace\\ANTLR Scanner\\src\\MyGrammar.g:1:177: SCAN_ERROR
				{
				mSCAN_ERROR(); 

				}
				break;

		}
	}


	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA12_eotS =
		"\1\uffff\12\33\4\uffff\1\30\1\uffff\1\30\1\33\1\uffff\3\30\2\uffff\2\33"+
		"\1\uffff\1\33\1\uffff\12\33\13\uffff\13\33\1\111\10\33\1\122\1\33\1\uffff"+
		"\1\33\1\125\1\33\1\127\1\33\1\131\2\33\1\uffff\1\134\1\33\1\uffff\1\136"+
		"\1\uffff\1\33\1\uffff\1\140\1\33\1\uffff\1\33\1\uffff\1\33\1\uffff\1\33"+
		"\1\145\1\146\1\33\2\uffff\1\150\1\uffff";
	static final String DFA12_eofS =
		"\151\uffff";
	static final String DFA12_minS =
		"\1\0\12\56\4\uffff\1\76\1\uffff\1\0\1\56\1\uffff\1\101\1\52\1\0\2\uffff"+
		"\2\56\1\uffff\1\56\1\uffff\12\56\13\uffff\26\56\1\uffff\10\56\1\uffff"+
		"\2\56\1\uffff\1\56\1\uffff\1\56\1\uffff\2\56\1\uffff\1\56\1\uffff\1\56"+
		"\1\uffff\4\56\2\uffff\1\56\1\uffff";
	static final String DFA12_maxS =
		"\1\uffff\12\172\4\uffff\1\76\1\uffff\1\uffff\1\172\1\uffff\1\172\1\57"+
		"\1\uffff\2\uffff\2\172\1\uffff\1\172\1\uffff\12\172\13\uffff\26\172\1"+
		"\uffff\10\172\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172"+
		"\1\uffff\1\172\1\uffff\1\172\1\uffff\4\172\2\uffff\1\172\1\uffff";
	static final String DFA12_acceptS =
		"\13\uffff\1\13\1\14\1\15\1\16\1\uffff\1\20\2\uffff\1\24\3\uffff\1\30\1"+
		"\31\2\uffff\1\23\1\uffff\1\25\12\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1"+
		"\22\1\24\1\26\1\27\1\30\26\uffff\1\1\10\uffff\1\11\2\uffff\1\2\1\uffff"+
		"\1\4\1\uffff\1\6\2\uffff\1\12\1\uffff\1\3\1\uffff\1\7\4\uffff\1\21\1\5"+
		"\1\uffff\1\10";
	static final String DFA12_specialS =
		"\1\2\20\uffff\1\1\4\uffff\1\0\122\uffff}>";
	static final String[] DFA12_transitionS = {
			"\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\21\1\30\1\26\7\30\1\20\1\17\1"+
			"\30\1\25\12\23\1\16\1\15\5\30\1\22\1\1\1\3\1\22\1\5\15\22\1\2\1\4\6\22"+
			"\1\30\1\24\4\30\1\7\7\22\1\12\6\22\1\10\3\22\1\6\4\22\1\11\1\22\1\13"+
			"\1\30\1\14\uff82\30",
			"\1\35\1\uffff\12\36\7\uffff\16\34\1\31\2\34\1\32\10\34\1\uffff\1\35"+
			"\4\uffff\32\34",
			"\1\35\1\uffff\12\36\7\uffff\23\34\1\37\6\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\7\34\1\40\22\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\10\34\1\41\21\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\15\34\1\42\14\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\10\34\1\43\21"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\24\34\1\44\5"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\24\34\1\45\5"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\4\34\1\46\25"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\14\34\1\47\15"+
			"\34",
			"",
			"",
			"",
			"",
			"\1\54",
			"",
			"\0\56",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\32\34",
			"",
			"\32\35\1\uffff\1\35\4\uffff\32\35",
			"\1\60\4\uffff\1\60",
			"\0\61",
			"",
			"",
			"\1\35\1\uffff\12\36\7\uffff\16\34\1\63\13\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\1\64\31\34\1\uffff\1\35\4\uffff\32\34",
			"",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\32\34",
			"",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\32\34",
			"\1\35\1\uffff\12\36\7\uffff\16\34\1\65\13\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\16\34\1\66\13\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\23\34\1\67\6\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\3\34\1\70\26\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\23\34\1\71\6"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\23\34\1\72\6"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\1\34\1\73\30"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\1\74\31\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\1\75\31\34",
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
			"\1\35\1\uffff\12\36\7\uffff\12\34\1\76\17\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\15\34\1\77\14\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\21\34\1\100\10\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\16\34\1\101\13\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\13\34\1\102\16\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\22\34\1\103\7\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\13\34\1\104\16"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\7\34\1\105\22"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\13\34\1\106\16"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\21\34\1\107\10"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\6\34\1\110\23"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\32\34",
			"\1\35\1\uffff\12\36\7\uffff\2\34\1\112\27\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\30\34\1\113\1\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\22\34\1\114\7\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\4\34\1\115\25\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\23\34\1\116\6\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\4\34\1\117\25"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\16\34\1\120\13"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\10\34\1\121\21"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\32\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\4\34\1\123\25"+
			"\34",
			"",
			"\1\35\1\uffff\12\36\7\uffff\7\34\1\124\22\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\32\34",
			"\1\35\1\uffff\12\36\7\uffff\4\34\1\126\25\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\32\34",
			"\1\35\1\uffff\12\36\7\uffff\16\34\1\130\13\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\32\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\21\34\1\132\10"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\22\34\1\133\7"+
			"\34",
			"",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\32\34",
			"\1\35\1\uffff\12\36\7\uffff\4\34\1\135\25\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\32\34",
			"",
			"\1\35\1\uffff\12\36\7\uffff\21\34\1\137\10\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\32\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\7\34\1\141\22"+
			"\34",
			"",
			"\1\35\1\uffff\12\36\7\uffff\22\34\1\142\7\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"",
			"\1\35\1\uffff\12\36\7\uffff\30\34\1\143\1\34\1\uffff\1\35\4\uffff\32"+
			"\34",
			"",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\4\34\1\144\25"+
			"\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\32\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\32\34",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\21\34\1\147\10"+
			"\34",
			"",
			"",
			"\1\35\1\uffff\12\36\7\uffff\32\34\1\uffff\1\35\4\uffff\32\34",
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
						int LA12_22 = input.LA(1);
						s = -1;
						if ( ((LA12_22 >= '\u0000' && LA12_22 <= '\uFFFF')) ) {s = 49;}
						else s = 24;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA12_17 = input.LA(1);
						s = -1;
						if ( ((LA12_17 >= '\u0000' && LA12_17 <= '\uFFFF')) ) {s = 46;}
						else s = 24;
						if ( s>=0 ) return s;
						break;

					case 2 : 
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
						else if ( (LA12_0=='$') ) {s = 22;}
						else if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 23;}
						else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\b')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '\u001F')||LA12_0=='!'||LA12_0=='#'||(LA12_0 >= '%' && LA12_0 <= '+')||LA12_0=='.'||(LA12_0 >= '<' && LA12_0 <= '@')||LA12_0=='['||(LA12_0 >= ']' && LA12_0 <= '`')||LA12_0=='|'||(LA12_0 >= '~' && LA12_0 <= '\uFFFF')) ) {s = 24;}
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
