package myCompiler.util.warning;

import myCompiler.Coordinates;

public class CompilationWarning {
	public WarnType type;
	public WarnCauses cause;
	public WarnSolution solution;
	public Coordinates coordinates;
	
	public CompilationWarning(WarnType type, WarnCauses cause, WarnSolution solution, Coordinates coordinates) {
		this.type = type;
		this.cause = cause;
		this.solution = solution;
		this.coordinates = coordinates;
	}

	@Override
	public String toString() {
		String output = "WARNING: " + type + " alle coordinate " + coordinates + ".\n";
		output += "Causa: " + cause + "\n";
		output += "Soluzione: " + solution + "\n\n";
		return output;
	}
}
