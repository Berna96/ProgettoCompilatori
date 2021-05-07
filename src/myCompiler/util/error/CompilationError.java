package myCompiler.util.error;

import java.text.MessageFormat;

import myCompiler.Coordinates;
import myCompiler.util.CompilationMessage;

public class CompilationError extends CompilationMessage {
	public ErrType type;
	public ErrCauses cause;
	public ErrSolution solution;
	
	public String token_ref;
	
	public CompilationError (ErrType type, ErrCauses cause, ErrSolution solution, Coordinates coordinates, String token_ref) {
		this.type = type;
		this.cause = cause;
		this.solution = solution;
		this.coordinates = coordinates;
		this.token_ref = token_ref;
	}
	
	public CompilationError (ErrType type, ErrCauses cause, ErrSolution solution, Coordinates coordinates) {
		this.type = type;
		this.cause = cause;
		this.solution = solution;
		this.coordinates = coordinates;
	}

	@Override
	public String toString() {
		String output = "ERROR: " + type;
		if (coordinates != null)
			output += " alle coordinate " + coordinates + ".\n";
		else output += "\n";
		output += MessageFormat.format("Causa: " + cause + "\n", token_ref);
		output += MessageFormat.format("Soluzione: " + solution + "\n", token_ref);
		return output;
	}
}
