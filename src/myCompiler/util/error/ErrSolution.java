package myCompiler.util.error;

public enum ErrSolution {

	CHOOSE_NO_BRANCH("\"-> BRANCHES\" necessario, altrimenti togliere CHOOSE"),
	BRANCH_NO_CHOOSE ("CHOOSE necessario, altrimenti togliere \"-> BRANCHES\""),
	START_NO_EXIST ("Identificare la prima storia e sostituire STORY con STARTSTORY"),
	DOUBLE_STORY ("Rinomina una delle due storie"),
	NEXT_STORY_CHOOSE("Sostituisci \"-> {next_story} con \"-> BRANCHES\", altrimenti togliere CHOOSE");
	
	
	String text;
	ErrSolution(String text){
		this.text = text;
	}
	
	public String toString() {
		return text;
	}
}
