package myCompiler.util;

public class NumberGenerator {
	
	private static NumberGenerator gen;
	
	public static NumberGenerator getInstance() {
		if (gen == null) {
			gen = new NumberGenerator();
		}
		return gen;
	}
	
	//private
	String str_num;
	int num;
	
	private NumberGenerator() {
		num = 0;
		str_num = "000";
	}
	
	public String getNextLabel() {
		if (num < 999) {
			num++;
		}
		if (num < 100) {
			if (num < 10) {
				//una cifra
				str_num = "00" + String.valueOf(num);
			}else {
				//due cifre
				str_num = "0" + String.valueOf(num);
			}
			
		}else { 
			// 3 cifre;
			str_num = String.valueOf(num);
		}
		
		return str_num;
	}
	
	
}
