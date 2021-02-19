package myCompiler.util;

import java.util.LinkedList;

import org.antlr.runtime.Token;


public class ParserEnvironment {
	public String translation;
	public LinkedList<String> errorList;
	public LinkedList<String> warningList;
	//qualcos'altro
	
	public ParserMetadata metadata;
	public LinkedList<String> chosenStories;
	
	public ParserEnvironment() {
		translation = "";
		errorList = new LinkedList<>();
		warningList = new LinkedList<>();
		metadata = new ParserMetadata();
		chosenStories = new LinkedList<>();
	}
}
