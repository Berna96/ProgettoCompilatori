package myCompiler.util.warning;

public enum WarnCauses {
	MISSING_META_FIELD ("Il campo {0} dei metadati e' vuoto o non e' stato definito"),
	MISSING_STORY_FIELD ("Il tag {0} all'interno del tag story non e' stato definito"),
	BRANCH_ONE_STORY ("BRANCHES e' stato definito ma il tag CHOOSE contiene solo una storia"),
	ANATTAINABLE ("Il percorso di scelta di alcune storie e' interrotto, alcune storie sono irraggiungibili"),
	CYCLIC ("Il percoso della scelte delle storie e' ciclico, questo permette di ritornare a una storia gia'  passata"),
	NOT_EXIST_IMAGE_PATH ("Il percorso dell'immagine di copertina e' errato o il file non esiste");
	String text;
	WarnCauses(String text){
		this.text = text;
	}

	public String toString() {
		return text;
	}
}
