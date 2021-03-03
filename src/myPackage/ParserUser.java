package myPackage;

import java.io.FileReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import myCompiler.MyGrammarLexer;
import myCompiler.MyGrammarParser;

//import myCompiler.util.*;
//import myCompiler.util.error.*;
//import myCompiler.util.warning.*;

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
	    
	    for (int i=0; i < parser.getErrors().size(); i++) {
	    	System.out.println(parser.getErrors().get(i));
	    }
	    
	    for (int i=0; i < parser.getWarnings().size(); i++) {
	    	System.out.println(parser.getWarnings().get(i));
	    }
	    
	    System.out.println("Ciclico: " + parser.isCyclic());
	    System.out.println("Connesso: " + parser.isConnected());
	    
	    
	    //libreria epub
	    
/*
	    System.out.println("\n"+ parser.getTraslation()+"\n\n\n");
	    
	    System.out.println("ERRORI:" + parser.getEnv().errorList.size());
	    
	    for (int i=0;i<parser.getEnv().errorList.size();i++) {
	    	System.out.println((i+1) + ".\t" + parser.getEnv().errorList.get(i));
	    }
*/
		} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}
  }
	
}
