package schuleAufgaben052018;

public class AufgabenW3T2 {

	public static void main(String[] args) {
		// Skript 10 Seite 18
		
		
		Fisch f1 = new Fisch("schwarz");
		Fisch f2 = new Fisch("weiß");
		Fisch f3 = f1;
		
		boolean b1 = f1-equals(f2);
		boolean b2 = f1==f2;
		boolean b3 = f1.equals(f3);
		boolean b4 = f1==f3;
		
		System.out.println(b1 + ", " + b2 + ", " + b3 + ", " + b4 );

	}

}
