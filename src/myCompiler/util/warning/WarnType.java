package myCompiler.util.warning;

public enum WarnType {
	INCOMPLETE_INFO ("Informazione Incompleta"),
	UNATTAINABLE ("Irraggiungibilit� delle storie"),
	CYCLIC ("Ciclicit� delle storie"),
	ERROR_INFO("Informazione errata");
	
	String text;
	WarnType(String text){
		this.text = text;
	}
	
	public String getString() {
		return text;
	}
}