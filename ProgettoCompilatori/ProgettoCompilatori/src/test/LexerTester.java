package test;

import java.io.FileReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.Token;

import myCompiler.MyGrammarLexer;

public class LexerTester {

	public static void main(String[] args) {
		String fileIn = ".\\resources\\input.file";

	  	Token tk;
	  	int i;

			try {
				System.out.println ("Test ANTLR lexer\n");
				// istanzio lo scanner passandogli un stream di ingresso
				MyGrammarLexer lexer = new MyGrammarLexer (new ANTLRReaderStream(new FileReader(fileIn))); 
				
				i = 1;
				// attivo un ciclo che scandisce lo stream dall'inizio alla fine
				// richiedendo ogni volta allo scanner di fornire il token successivo (metodo nextToken)
				// fino ad incontrare l' End Of File EOF
				while ((tk = lexer.nextToken()).getType() != MyGrammarLexer.EOF) {
					// stampo a video le informazioni relative ai token rilevati
					if (tk.getChannel()!= MyGrammarLexer.HIDDEN)
						System.out.println("Token " + i++ + ": (" + 
															tk.getLine() + "," + 
															tk.getCharPositionInLine() + ")\t" + 
															"TokenType:" + tk.getType() + 
															":\t" + tk.getText());
				} 

			} catch (Exception e) {
				System.out.println ("Test ANTLR abortito");
				e.printStackTrace();
			}	
	}

}
