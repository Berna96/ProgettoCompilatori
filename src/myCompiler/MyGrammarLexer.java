// $ANTLR 3.5.1 C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g 2021-03-21 12:51:37

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
		
		void scan_error () {
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
	@Override public String getGrammarFileName() { return "C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:166:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:169:2: ( ( '0' .. '9' ) )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:172:2: ( '$' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:172:4: '$'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:175:2: ( LETTER ( LETTER | DIGIT )* )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:175:4: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:175:11: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:180:2: ( '<' | '>' | ':' | '\"' | '/' | '\\\\' | '|' | '?' | '*' | '.' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:193:7: ( 'BOOK' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:193:9: 'BOOK'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:195:8: ( 'STORY' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:195:10: 'STORY'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:197:8: ( 'CHOOSE' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:197:10: 'CHOOSE'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:199:8: ( 'TITLE' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:199:10: 'TITLE'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:201:10: ( 'ENDSTORY' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:201:12: 'ENDSTORY'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:203:10: ( 'title' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:203:12: 'title'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:207:2: ( 'author' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:207:4: 'author'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:209:2: ( 'publisher' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:209:4: 'publisher'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:212:2: ( 'year' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:212:4: 'year'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:214:2: ( '\"' (~ '\"' )* '\"' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:214:4: '\"' (~ '\"' )* '\"'
			{
			match('\"'); 
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:214:8: (~ '\"' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:216:2: ( 'image' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:216:4: 'image'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:221:2: ( '{' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:221:4: '{'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:225:2: ( '}' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:225:4: '}'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:229:5: ( ';' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:229:7: ';'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:232:7: ( ':' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:232:9: ':'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:235:7: ( '->' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:235:9: '->'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:238:7: ( ',' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:238:10: ','
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:241:10: ( 'BRANCHES' )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:241:12: 'BRANCHES'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:245:14: ( STRING )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:245:16: STRING
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:249:2: ( NAME )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:249:4: NAME
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:252:14: ( DIGIT ( DIGIT )* )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:252:16: DIGIT ( DIGIT )*
			{
			mDIGIT(); 

			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:252:22: ( DIGIT )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:256:2: ( ( ( '\\\\' )+ ( LETTER | DIGIT | '_' ) )+ ( '.jpg' | '.png' ) )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:256:4: ( ( '\\\\' )+ ( LETTER | DIGIT | '_' ) )+ ( '.jpg' | '.png' )
			{
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:256:4: ( ( '\\\\' )+ ( LETTER | DIGIT | '_' ) )+
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
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:256:6: ( '\\\\' )+ ( LETTER | DIGIT | '_' )
					{
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:256:6: ( '\\\\' )+
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
							// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:256:7: '\\\\'
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

			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:256:40: ( '.jpg' | '.png' )
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
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:256:41: '.jpg'
					{
					match(".jpg"); 

					}
					break;
				case 2 :
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:256:50: '.png'
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:259:9: ( ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' ) )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:259:11: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			{
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:259:11: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:259:12: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:259:17: (~ ( '\\n' | '\\r' ) )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:
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

					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:259:34: ( '\\r' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='\r') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:259:34: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}
					break;
				case 2 :
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:260:3: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:260:8: ( options {greedy=false; } : . )*
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
							// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:260:36: .
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:265:7: ( DOLL (~ DOLL )* DOLL )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:267:3: DOLL (~ DOLL )* DOLL
			{
			mDOLL(); 

			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:267:8: (~ DOLL )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '\u0000' && LA11_0 <= '#')||(LA11_0 >= '%' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:278:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:278:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:285:5: ( . )
			// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:285:7: .
			{
			matchAny(); 
			 scan_error();
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
		// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:8: ( BOOK | STORY | CHOOSE | TITLE | ENDSTORY | TITLE_S | AUTHOR | PUBLISHER | YEAR | IMAGE | LB | RB | SC | COL | ARROW | COMMA | BRANCHES | STRING_VALUE | STORY_NAME | NUMBER_VALUE | IMAGE_PATH | COMMENT | TEXT | WS | SCAN_ERROR )
		int alt12=25;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:10: BOOK
				{
				mBOOK(); 

				}
				break;
			case 2 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:15: STORY
				{
				mSTORY(); 

				}
				break;
			case 3 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:21: CHOOSE
				{
				mCHOOSE(); 

				}
				break;
			case 4 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:28: TITLE
				{
				mTITLE(); 

				}
				break;
			case 5 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:34: ENDSTORY
				{
				mENDSTORY(); 

				}
				break;
			case 6 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:43: TITLE_S
				{
				mTITLE_S(); 

				}
				break;
			case 7 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:51: AUTHOR
				{
				mAUTHOR(); 

				}
				break;
			case 8 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:58: PUBLISHER
				{
				mPUBLISHER(); 

				}
				break;
			case 9 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:68: YEAR
				{
				mYEAR(); 

				}
				break;
			case 10 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:73: IMAGE
				{
				mIMAGE(); 

				}
				break;
			case 11 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:79: LB
				{
				mLB(); 

				}
				break;
			case 12 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:82: RB
				{
				mRB(); 

				}
				break;
			case 13 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:85: SC
				{
				mSC(); 

				}
				break;
			case 14 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:88: COL
				{
				mCOL(); 

				}
				break;
			case 15 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:92: ARROW
				{
				mARROW(); 

				}
				break;
			case 16 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:98: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 17 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:104: BRANCHES
				{
				mBRANCHES(); 

				}
				break;
			case 18 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:113: STRING_VALUE
				{
				mSTRING_VALUE(); 

				}
				break;
			case 19 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:126: STORY_NAME
				{
				mSTORY_NAME(); 

				}
				break;
			case 20 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:137: NUMBER_VALUE
				{
				mNUMBER_VALUE(); 

				}
				break;
			case 21 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:150: IMAGE_PATH
				{
				mIMAGE_PATH(); 

				}
				break;
			case 22 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:161: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 23 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:169: TEXT
				{
				mTEXT(); 

				}
				break;
			case 24 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:174: WS
				{
				mWS(); 

				}
				break;
			case 25 :
				// C:\\Users\\gianl\\Desktop\\Unibg\\Magistrale\\Linguaggi formali e compilatori\\Progetto\\eclipse-workspace\\ProgettoCompilatori\\src\\MyGrammar.g:1:177: SCAN_ERROR
				{
				mSCAN_ERROR(); 

				}
				break;

		}
	}


	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA12_eotS =
		"\1\uffff\12\33\4\uffff\1\30\1\uffff\1\30\2\uffff\3\30\2\uffff\2\33\1\uffff"+
		"\11\33\14\uffff\13\33\1\107\10\33\1\120\1\33\1\uffff\1\33\1\123\1\33\1"+
		"\125\1\33\1\127\2\33\1\uffff\1\132\1\33\1\uffff\1\134\1\uffff\1\33\1\uffff"+
		"\1\136\1\33\1\uffff\1\33\1\uffff\1\33\1\uffff\1\33\1\143\1\144\1\33\2"+
		"\uffff\1\146\1\uffff";
	static final String DFA12_eofS =
		"\147\uffff";
	static final String DFA12_minS =
		"\1\0\1\117\1\124\1\110\1\111\1\116\1\151\2\165\1\145\1\155\4\uffff\1\76"+
		"\1\uffff\1\0\2\uffff\1\60\1\52\1\0\2\uffff\1\117\1\101\1\uffff\2\117\1"+
		"\124\1\104\2\164\1\142\2\141\14\uffff\1\113\1\116\1\122\1\117\1\114\1"+
		"\123\1\154\1\150\1\154\1\162\1\147\1\60\1\103\1\131\1\123\1\105\1\124"+
		"\1\145\1\157\1\151\1\60\1\145\1\uffff\1\110\1\60\1\105\1\60\1\117\1\60"+
		"\1\162\1\163\1\uffff\1\60\1\105\1\uffff\1\60\1\uffff\1\122\1\uffff\1\60"+
		"\1\150\1\uffff\1\123\1\uffff\1\131\1\uffff\1\145\2\60\1\162\2\uffff\1"+
		"\60\1\uffff";
	static final String DFA12_maxS =
		"\1\uffff\1\122\1\124\1\110\1\111\1\116\1\151\2\165\1\145\1\155\4\uffff"+
		"\1\76\1\uffff\1\uffff\2\uffff\1\172\1\57\1\uffff\2\uffff\1\117\1\101\1"+
		"\uffff\2\117\1\124\1\104\2\164\1\142\2\141\14\uffff\1\113\1\116\1\122"+
		"\1\117\1\114\1\123\1\154\1\150\1\154\1\162\1\147\1\172\1\103\1\131\1\123"+
		"\1\105\1\124\1\145\1\157\1\151\1\172\1\145\1\uffff\1\110\1\172\1\105\1"+
		"\172\1\117\1\172\1\162\1\163\1\uffff\1\172\1\105\1\uffff\1\172\1\uffff"+
		"\1\122\1\uffff\1\172\1\150\1\uffff\1\123\1\uffff\1\131\1\uffff\1\145\2"+
		"\172\1\162\2\uffff\1\172\1\uffff";
	static final String DFA12_acceptS =
		"\13\uffff\1\13\1\14\1\15\1\16\1\uffff\1\20\1\uffff\1\23\1\24\3\uffff\1"+
		"\30\1\31\2\uffff\1\23\11\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\22\1\24"+
		"\1\25\1\26\1\27\1\30\26\uffff\1\1\10\uffff\1\11\2\uffff\1\2\1\uffff\1"+
		"\4\1\uffff\1\6\2\uffff\1\12\1\uffff\1\3\1\uffff\1\7\4\uffff\1\21\1\5\1"+
		"\uffff\1\10";
	static final String DFA12_specialS =
		"\1\2\20\uffff\1\1\4\uffff\1\0\120\uffff}>";
	static final String[] DFA12_transitionS = {
			"\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\21\1\30\1\26\7\30\1\20\1\17\1"+
			"\30\1\25\12\23\1\16\1\15\5\30\1\22\1\1\1\3\1\22\1\5\15\22\1\2\1\4\6\22"+
			"\1\30\1\24\4\30\1\7\7\22\1\12\6\22\1\10\3\22\1\6\4\22\1\11\1\22\1\13"+
			"\1\30\1\14\uff82\30",
			"\1\31\2\uffff\1\32",
			"\1\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"",
			"",
			"",
			"",
			"\1\51",
			"",
			"\0\53",
			"",
			"",
			"\12\55\7\uffff\32\55\1\uffff\1\55\2\uffff\1\55\1\uffff\32\55",
			"\1\56\4\uffff\1\56",
			"\0\57",
			"",
			"",
			"\1\61",
			"\1\62",
			"",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
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
			"",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\121",
			"",
			"\1\122",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\124",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\126",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\130",
			"\1\131",
			"",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\133",
			"",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"",
			"\1\135",
			"",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\137",
			"",
			"\1\140",
			"",
			"\1\141",
			"",
			"\1\142",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\145",
			"",
			"",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
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
						if ( ((LA12_22 >= '\u0000' && LA12_22 <= '\uFFFF')) ) {s = 47;}
						else s = 24;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA12_17 = input.LA(1);
						s = -1;
						if ( ((LA12_17 >= '\u0000' && LA12_17 <= '\uFFFF')) ) {s = 43;}
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
