
public class AufgabeII {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Aufgabe:
		 * 
		 * 1. Auto kostet: 3500
		 * 2. Auto kostet: 2340,48
		 * 
		 * 1. Daten in Variablen abspeichern
		 * 2. Kommazahl umwandeln zu einer Ganzzahl
		 * 3. Beide Ganzzahlen zu einem Gesamtbetrag verrechnen
		 * 4. Gesamtbetrag ausgeben mit Hilfe von System.out.println("");
		 */
		
		int auto1 = 3500; 
		double auto2 = 2340.48;
		
		int auto2Ganzzahl = (int)auto2;
		
		int gesamtBetragAutos = auto1 + auto2Ganzzahl;
		
		System.out.println("Gesamtbetrag lautet: " + gesamtBetragAutos + "€");
		
		
		
	}

}
