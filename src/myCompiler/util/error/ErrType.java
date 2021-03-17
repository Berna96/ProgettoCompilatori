package myCompiler.util.error;

public enum ErrType {
	ERROR("SCONOSCIUTO"),
	SYNTAX_ERROR ("Errore Semantico o Sintattico"),
	IDENTIF_ERROR("Errore dell'identificativo"),
	UNDEF_STORY_ERROR("Errore storia non definita"),
	GEN_FILES_ERROR("Errore nella creazione dei files");
	//START_UNDEF_ERROR ("Storia iniziale non definita");
	
	String text;
	
	ErrType(String text){
		this.text = text;
	}

	public String toString() {
		return text;
	}
}
