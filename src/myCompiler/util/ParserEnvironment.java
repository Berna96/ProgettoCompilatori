package myCompiler.util;

import java.util.LinkedList;


public class ParserEnvironment {
	public String translation;
	public LinkedList<String> errorList;
	public LinkedList<String> warningList;
	//qualcos'altro
	
	public LibroGame librogame;
	
	public Metadata metadata;
	public LinkedList<String> chosenStories;
	
	public ParserEnvironment() {
		translation = "";
		errorList = new LinkedList<>();
		warningList = new LinkedList<>();
		metadata = new Metadata();
		chosenStories = new LinkedList<>();
		
		librogame = new LibroGame();
	}
}
