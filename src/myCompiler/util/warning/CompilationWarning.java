package myCompiler.util.warning;

import java.text.MessageFormat;

import myCompiler.Coordinates;
import myCompiler.util.CompilationMessage;

public class CompilationWarning extends CompilationMessage {
	public WarnType type;
	public WarnCauses cause;
	public WarnSolution solution;
	
	public String token_ref;
	
	public CompilationWarning(WarnType type, WarnCauses cause, WarnSolution solution, Coordinates coordinates, String token_ref) {
		this.type = type;
		this.cause = cause;
		this.solution = solution;
		this.coordinates = coordinates;
		this.token_ref = token_ref;
	}

	public CompilationWarning(WarnType type, WarnCauses cause, WarnSolution solution, Coordinates coordinates) {
		this.type = type;
		this.cause = cause;
		this.solution = solution;
		this.coordinates = coordinates;
	}

	@Override
	public String toString() {
		String output = "WARNING: " + type;
		if (coordinates != null)
			output += " alle coordinate " + coordinates + ".\n";
		else output += "\n";
		output += MessageFormat.format("Causa: " + cause + "\n", token_ref);
		output += MessageFormat.format("Soluzione: " + solution + "\n", token_ref);
		return output;
	}
}
