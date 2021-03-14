package myCompiler.util.error;

public enum ErrSolution {

	CHOOSE_NO_BRANCH("\"-> BRANCHES\" necessario, altrimenti togliere CHOOSE"),
	BRANCH_NO_CHOOSE ("CHOOSE necessario, altrimenti togliere \"-> BRANCHES\""),
	//START_NO_EXIST ("Identificare la prima storia e sostituire STORY con STARTSTORY"),
	DOUBLE_STORY ("Rinomina una delle due storie"),
	NEXT_STORY_CHOOSE("Sostituire \"-> {0}\" con \"-> BRANCHES\", altrimenti togliere CHOOSE"),
	UNDEF_STORY("Definire {0} in un nuovo blocco STORY oppure rimuoverla completamente");
	
	String text;
	
	ErrSolution(String text){
		this.text = text;
	}
	
	public String toString() {
		return text;
	}
}
