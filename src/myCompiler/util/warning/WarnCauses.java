package myCompiler.util.warning;

public enum WarnCauses {
	MISSING_META_FIELD ("Il campo {0} dei metadati e' vuoto o non e' stato definito"),
	MISSING_STORY_BLOCK ("Il blocco all'interno della storia non e' stato definito"),
	EMPTY_STORY_BLOCK("Il blocco {0} all'interno della storia e' stato definito ma e' vuoto"),
	BRANCH_ONE_STORY ("BRANCHES e' stato definito ma il tag CHOOSE contiene solo una storia"),
	UNATTAINABLE ("Il percorso di scelta di alcune storie e' interrotto, alcune storie sono irraggiungibili"),
	CYCLIC ("Il percoso della scelte delle storie e' ciclico, questo permette di ritornare a una storia gia'  passata"),
	NOT_EXIST_IMAGE_PATH ("Il percorso dell'immagine di copertina e' errato o il file non esiste"),
	TITLE_EMPTY ("Blocco TITLE della storia {0} definito ma vuoto"),
	TEXT_EMPTY ("Blocco TEXT della storia {0} definito ma vuoto");
	
	String text;
	
	WarnCauses(String text){
		this.text = text;
	}

	public String toString() {
		return text;
	}
}
