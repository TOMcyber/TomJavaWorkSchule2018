package schuleAufgaben;

public class WrapperAufgabe3 {

	public static void main(String[] args) {
		// ===
		// Wrapper-Klassen - Aufgaben
		// Aufgabe 3.)
		
		System.out.println(numberMethode(new Double("5")));
		System.out.println(numberMethode(new Long(45L)));
		System.out.println(numberMethode((double)4));
		
	}
	
	public static String numberMethode(Number n) {
		if (n instanceof Byte) return "Byte";
		else if (n instanceof Short) return "Short";
		else if (n instanceof Integer) return "Integer";
		else if (n instanceof Long) return "Long";
		else if (n instanceof Float) return "Float";
		else if (n instanceof Double) return "Double";
		else return"Sonstiges";
				

	}

}
