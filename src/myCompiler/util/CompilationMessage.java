package myCompiler.util;

import myCompiler.Coordinates;

public class CompilationMessage implements Comparable<CompilationMessage> {
	public Coordinates coordinates;
	
	@Override
	public int compareTo(CompilationMessage c_mess) {
		return this.coordinates.compareTo(c_mess.coordinates);
	}
}
