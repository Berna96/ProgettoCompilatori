package myCompiler.util.error;

public enum ErrCauses {
	CHOOSE_NO_BRANCH ("Hai definito il tag CHOOSE ma non BRANCHES"),
	BRANCH_NO_CHOOSE ("Hai definito il BRANCHES ma non il tag CHOOSE"),
	START_NO_EXIST ("Non esiste una storia iniziale che permette di iniziare il percoso di scelta delle storie"),
	DOUBLE_STORY ("Hai definito {0} più di una volta, ignorato"),
	NEXT_STORY_CHOOSE("Hai definito -> {story} e il tag CHOOSE");
	
	
	String text;
	ErrCauses(String text){
		this.text = text;
	}
	
	public String getString() {
		return text;
	}
}
