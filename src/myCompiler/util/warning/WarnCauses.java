package myCompiler.util.warning;

public enum WarnCauses {
	MISSING_META_FIELD ("Il campo {0} dei metadati � vuoto o non � stato definito"),
	MISSING_STORY_FIELD ("Il tag {0} all'interno del tag story non � stato definito"),
	BRANCH_ONE_STORY ("BRANCHES � stato definito ma il tag CHOOSE contiene solo una storia"),
	ANATTAINABLE ("Il percorso di scelta di alcune storie � interrotto, alcune storie sono irraggiungibili"),
	CYCLIC ("Il percoso della scelte delle storie � ciclico, questo permette di ritornare a una storia gi� passata"),
	NOT_EXIST_IMAGE_PATH ("Il percorso dell'immagine di copertina � errato o il file non esiste");
	String text;
	WarnCauses(String text){
		this.text = text;
	}
	
	public String toString() {
		return text;
	}
}
