package myCompiler.util.warning;

public enum WarnSolution {
	SPEC_FIELD("specificare il campo {0}"),
	SPEC_TAG("specificare il tag {0}"),
	DEF_MORE_STORIES("definire piu' di una storia oppure cambiare la sintassi e sostiruire -> BRANCHES con -> {0}"),
	REDEF_PATH_STORIES("Ricontrollare il percorso delle storie ed eventualmente ridefinirlo"),
	SPEC_CORR_PATH ("specificare il percorso corretto"),
	TITLE_EMPTY ("Riempire TITLE oppure toglierlo"),
	TEXT_EMPTY ("Riempire TEXT oppure toglierlo");
	
	String text;
	WarnSolution(String text){
		this.text = text;
	}
	
	public String toString() {
		return text;
	}
}
