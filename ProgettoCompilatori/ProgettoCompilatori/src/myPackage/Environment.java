package myPackage;

import java.util.LinkedList;

public class Environment {
	public String translation;
	public LinkedList<String> errorList;
	public LinkedList<String> warningList;
	//qualcos'altro
	
	public Environment() {
		translation = "";
		errorList = new LinkedList<>();
		warningList = new LinkedList<>();
	}
}
