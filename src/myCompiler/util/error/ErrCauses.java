package myCompiler.util.error;

public enum ErrCauses {
	CHOOSE_NO_BRANCH ("Definito CHOOSE ma non specificato BRANCHES"),
	BRANCH_NO_CHOOSE ("Specificato BRANCHES ma non definito CHOOSE"),
	//START_NO_EXIST ("Non definita la storia iniziale"),
	DOUBLE_STORY ("Hai definito {0} piu' di una volta"),
	NEXT_STORY_CHOOSE("Hai fissato {0} come prossima storia insieme a CHOOSE"),
	UNDEF_STORY("Storia \"{0}\" non definita");
	
	String text;
	
	ErrCauses(String text){
		this.text = text;
	}
	
	public String toString() {
		return text;
	}
}
