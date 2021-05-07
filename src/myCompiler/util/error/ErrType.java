package myCompiler.util.error;

public enum ErrType {
	ERROR("SCONOSCIUTO"),
	TOKEN_UNRECOGNIZED("Token non riconosciuto"),
	SYNTAX_ERROR ("Errore sintattico"),
	IDENTIF_ERROR("Errore dell'identificativo"),
	UNDEF_STORY_ERROR("Errore storia non definita"),
	GEN_FILES_ERROR("Errore nella creazione dei files"),
	AUTO_RING("Errore di autoanello"),
	SAME_LABEL("Errore ripetizione delle etichette");
	
	String text;
	
	ErrType(String text){
		this.text = text;
	}

	public String toString() {
		return text;
	}
}
