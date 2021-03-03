package myCompiler.util.error;

public enum ErrCauses {
	CHOOSE_NO_BRANCH ("Definito CHOOSE ma non specificato BRANCHES"),
	BRANCH_NO_CHOOSE ("Specificato BRANCHES ma non definito CHOOSE"),
	START_NO_EXIST ("Non definita la storia iniziale"),
	DOUBLE_STORY ("Hai definito {0} più di una volta"),
	NEXT_STORY_CHOOSE("Hai definito -> {story} e il tag CHOOSE");
	
	
	String text;
	ErrCauses(String text){
		this.text = text;
	}
	
	public String toString() {
		return text;
	}
}
