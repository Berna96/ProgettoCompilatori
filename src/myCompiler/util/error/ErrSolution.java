package myCompiler.util.error;

public enum ErrSolution {
	NO_SOLUTION("?"),
	CHOOSE_NO_BRANCH("\"-> BRANCHES\" necessario, altrimenti togliere CHOOSE"),
	BRANCH_NO_CHOOSE ("CHOOSE necessario, altrimenti togliere \"-> BRANCHES\""),
	DOUBLE_STORY ("Rinomina una delle due storie"),
	NEXT_STORY_CHOOSE("Sostituire \"-> {0}\" con \"-> BRANCHES\", altrimenti togliere CHOOSE"),
	UNDEF_STORY("Definire {0} in un nuovo blocco STORY oppure rimuoverla completamente"),
	SYNTAX_ERROR("Correggere il documento rispettando le regole sintattiche"),
	TOKEN_UNRECOGNIZED("Correggere il documento rispettando le regole lessicali"),
	AUTO_RING("Cambia la storia {0} successiva in modo che sia diversa da quella corrente"),
	SAME_LABEL("Cambia nome all'etichetta");
	
	String text;
	
	ErrSolution(String text){
		this.text = text;
	}
	
	public String toString() {
		return text;
	}
}
