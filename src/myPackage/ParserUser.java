package myPackage;

import java.io.FileReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import myCompiler.MyGrammarLexer;
import myCompiler.MyGrammarParser;
//import myCompiler.util.*;


public class ParserUser {

	static MyGrammarParser parser;
	  
	public static void main(String[] args) {
	
		CommonTokenStream tokens;
  	String fileIn = ".\\resources\\input.file";
  	
  	try {
		System.out.println ("Simple con ANTLR");
		System.out.println ("-----------------------");
		MyGrammarLexer lexer = new MyGrammarLexer(new ANTLRReaderStream(new FileReader(fileIn))); 
		tokens = new CommonTokenStream(lexer);
	    parser = new MyGrammarParser(tokens);

	    parser.start();
	    
	    System.out.println("------------------------");
	    System.out.println("----- FINE PARSING -----");
	    System.out.println("------------------------\n\n");
	    
	    System.out.println(parser.getMetadata());
	    System.out.println(parser.getBook());
	    
	    System.out.println("Ciclico: " + parser.isCyclic());
	    System.out.println("Connesso: " + parser.isConnected());
	    
	    //Check for errors or warnings
	    //System.out.println(warningList);
	    //if (!errorList.isEmpty()) {System.out.prinln(errorList)}
	    //else{EpubHandler h = new  ; h.createEpub(); }
	    
	    
		} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}
  }
	
}
