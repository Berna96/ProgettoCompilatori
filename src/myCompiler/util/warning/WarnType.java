package myCompiler.util.warning;

public enum WarnType {
	INCOMPLETE_INFO ("Informazione incompleta"),
	INCOMPLETE_STORY ("Storia incompleta"),
	UNATTAINABLE ("Irraggiungibilita' delle storie"),
	CYCLIC ("Ciclicita'  delle storie"),
	ERROR_INFO("Informazione errata");
	
	String text;
	WarnType(String text){
		this.text = text;
	}
	
	public String toString() {
		return text;
	}
}