package myCompiler.util.error;

public enum ErrCauses {
	UNKNOWN("?"),
	CHOOSE_NO_BRANCH ("Definito CHOOSE ma non specificato BRANCHES"),
	BRANCH_NO_CHOOSE ("Specificato BRANCHES ma non definito CHOOSE"),
	DOUBLE_STORY ("Hai definito {0} piu' di una volta"),
	NEXT_STORY_CHOOSE("Hai fissato {0} come prossima storia insieme a CHOOSE"),
	UNDEF_STORY("Storia {0} non definita"),
	SYNTAX_ERROR("{0} non rispetta la sintassi del linguaggio"),
	TOKEN_UNRECOGNIZED("Token {0} non riconosciuto"),
	AUTO_RING("la storia {0} viene ripetuta nella stessa storia"),
	SAME_LABEL("Hai ripetuto più volte la stessa etichetta {0}");
	
	String text;
	
	ErrCauses(String text){
		this.text = text;
	}
	
	public String toString() {
		return text;
	}
}
