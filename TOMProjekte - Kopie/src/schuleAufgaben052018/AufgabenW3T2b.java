package schuleAufgaben052018;

public class AufgabenW3T2b {

	public static void main(String[] args) {
		// === Autoboxing;
		
		Integer myInt = 45;  // Compiler schreibt: Integer.valueOf(45);
		
		// === Autounboxing;
		int mypdint = myInt; // Compiler schreibt: myInt.intValue();
		
		// == Kombination von Autoboxing und Autounboxing
		Integer i = Integer.valueOf(0);
		Integer j = i;
		System.out.println("i==j ? " + (i==j));
		
		System.out.println("i = " + i);
		i++;  // inkrementieren
				// Compiler:
					// Autounboxingt: int iau = i.intValue();
					// Inkrementiert: iau=iau+1; // iau++;
					// Autoboxing: Integer.valueOf(iau);
		// ähnlich: i+=9;
		System.out.println("i = " + i);
		System.out.println("i==j ? " + (i==j));
		
		
	}

}
