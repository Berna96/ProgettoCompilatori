package myCompiler.util.warning;

public enum WarnCauses {
	MISSING_META_FIELD ("Il campo {0} dei metadati è vuoto o non è stato definito"),
	MISSING_STORY_FIELD ("Il tag {0} all'interno del tag story non è stato definito"),
	BRANCH_ONE_STORY ("BRANCHES è stato definito ma il tag CHOOSE contiene solo una storia"),
	ANATTAINABLE ("Il percorso di scelta di alcune storie è interrotto, alcune storie sono irraggiungibili"),
	CYCLIC ("Il percoso della scelte delle storie è ciclico, questo permette di ritornare a una storia già passata"),
	NOT_EXIST_IMAGE_PATH ("Il percorso dell'immagine di copertina è errato o il file non esiste");
	String text;
	WarnCauses(String text){
		this.text = text;
	}

	public String toString() {
		return text;
	}
}
