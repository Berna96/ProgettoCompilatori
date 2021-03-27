package myPackage;

import java.io.File;
import java.io.FileReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import myCompiler.MyGrammarLexer;
import myCompiler.MyGrammarParser;
import myCompiler.util.EpubHandler;


public class ParserUser {

	static MyGrammarParser parser;
	  
	public static void main(String[] args) {
	
		CommonTokenStream tokens;
		String fileIn, fileOut;
				
		if (args.length > 0) {
			fileIn = args[0];
			File f = new File(args[0]);
			if (!f.exists()) {
				System.out.println("L'input file non esiste.");
				// BLOCCARE L'ESECUZIONE
				System.exit(1);
			}
			
			if (args.length > 1) {
				fileOut = args[1];
				System.out.println("Verra' creato " + fileOut);
			} else {
				System.out.println("Verra' creato librogame.epub in questa cartella");
				fileOut = "./librogame.epub";
			}
			
			try {
				MyGrammarLexer lexer = new MyGrammarLexer(new ANTLRReaderStream(new FileReader(fileIn))); 
				tokens = new CommonTokenStream(lexer);
				parser = new MyGrammarParser(tokens);

				parser.start();
		    
				for (int i=0; i < parser.getWarnings().size(); i++) {
					System.out.println(parser.getWarnings().get(i));
				}
		    
				System.out.println();
		    
				if (parser.getErrors().isEmpty()) {
					EpubHandler eh = new EpubHandler(parser.getMetadata());
					eh.createEpub(fileOut);
				} else {
					EpubHandler.abort();
					for (int i=0; i < parser.getErrors().size(); i++)
						System.out.println(parser.getErrors().get(i));
				}
			} catch (Exception e) {
				System.out.println ("Parsing con ANTLR abortito\n\n");
				e.printStackTrace();
			}
			
		} else {
			System.out.println("Non e' stato specificato l'input file.");
			// BLOCCARE L'ESECUZIONE
			System.exit(1);
		}
	}
}
