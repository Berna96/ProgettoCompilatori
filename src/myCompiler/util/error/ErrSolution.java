package myCompiler.util.error;

public enum ErrSolution {
	CHOOSE_NO_BRANCH(" metti -> BRANCHES o togli CHOOSE"),
	BRANCH_NO_CHOOSE ("o togli BRANCHES o definisci il tag CHOOSE"),
	START_NO_EXIST ("Definisci una storia iniziale (??)"),
	DOUBLE_STORY ("Rinimina {0} con un altro nome"),
	NEXT_STORY_CHOOSE("Sostituisci -> {stor} con BRANCHES oppure elimina il tag CHOOSE");
	
	
	String text;
	ErrSolution(String text){
		this.text = text;
	}
	
	public String getString() {
		return text;
	}
}
