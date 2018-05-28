package uebungenAllgemein;

public class UebungsWorkspace3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String greeting = "Hallo";
		
		greeting = greeting + " Welt";
		greeting = greeting.concat("!");
		
		System.out.println(greeting.toUpperCase()); 		// gibt alles in Großbuchstaben aus.
		System.out.println(greeting.toLowerCase());			// gibt alles in Kleinbuchstaben aus.
		
		System.out.println(greeting.substring(6, 10));  	// gibt Zeichen 6-10 Achtung fängt bei 0 anzu zählen!
		
		System.out.println(greeting.charAt(10));
		
		System.out.println(greeting.length());				// gibt länge des Strings greeting aus
		
		//					casten
		
		/** implizites casten
		*(von klein nach groß. Z.B. int in double)
		* aus einem kleinen Wertebereich in einen großen
		**/
		int varZahl1 = 30;
		double varZahl2 = varZahl1;
		
		/** explizites casten
		*(von groß nach klein. Z.B. int in double)
		* von einem großen Wertebereich in einen kleineren
		**/
		double varZahl5 = 3.454367;
		int varZahl6 = (int)varZahl5;
		
		
		// Betrag berechnen:
		System.out.println(Math.abs(-10));
		
		// Aufrunden:
		System.out.println(Math.ceil(9.5));
		
		// Abrunden:
		System.out.println(Math.floor(9.5));
		
		// Minimum:
		System.out.println(Math.min(1, 6));
		
		// Maximum:
		System.out.println(Math.max(1, 6));
		
		// Logarithmus
		System.out.println(Math.log(6));
		
		// 2 hoch 10 berechnen
		System.out.println(Math.pow(2, 10));
		
		// Zufallszahl generieren
		System.out.println(Math.random());
		
		
		
		//     KURZSCHREIBWEISEN
		

		long a = 123;
		a = a + 123;     //  Normale Schreibweise
		a += 123;		//   kurze Schreibweise
		a -= 123;		//   kurze Schreibweise
		a *= 2;			//   kurze Schreibweise
		
		a--; // oder a++;
		
		
		
		
		
		System.out.println(a);
	}

}
