package myCompiler.util.error;

import myCompiler.Coordinates;

public class CompilationError {
	public ErrType type;
	public ErrCauses cause;
	public ErrSolution solution;
	public Coordinates coordinates;
	
	public CompilationError (ErrType type, ErrCauses cause, ErrSolution solution, Coordinates coordinates) {
		this.type = type;
		this.cause = cause;
		this.solution = solution;
		this.coordinates = coordinates;
	}

	@Override
	public String toString() {
		String output = "ERROR: " + type + " alle coordinate " + coordinates + ".\n";
		output += "Causa: " + cause + "\n";
		output += "Soluzione: " + solution + "\n\n";
		return output;
	}
}
