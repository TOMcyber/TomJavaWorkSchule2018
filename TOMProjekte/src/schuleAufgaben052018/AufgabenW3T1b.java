package schuleAufgaben052018;      // Läuft, getestet!

import java.util.Arrays;

public class AufgabenW3T1b {

	public static void main(String[] args) {
		// ===
		Schiff1[] schiffe = new Schiff1[5];
		
		schiffe[0] = new Schiff1("rot", new Reeder2("Onassis"));
		schiffe[1] = new Schiff1("blau", new Reeder2("Onassis"));
		schiffe[2] = new Schiff1("grün", new Reeder2("YYY"));
		schiffe[3] = new Schiff1("violett", new Reeder2("AAA"));
		schiffe[4] = new Schiff1("gelb", new Reeder2("BBB"));
		
		System.out.println("== Unsortiertes Array vom Typ Schiff === ");
		for (Schiff1 schiff : schiffe) {
			System.out.print(schiff + ", ");
		}
		
		Comparable comp1 = new Schiff1("rot"); 
		Comparable comp2 = new String("rot"); // okay, weil String Klasse Comparable Interface implementiert
		
		// Arrays.sort
		Arrays.sort(schiffe);	
		System.out.println("\n== Sortiertes Array vom Typ Schiff === ");
		for (Schiff1 schiff : schiffe) {
			System.out.print(schiff + ", ");
		}

	}

}


class Schiff1 implements Comparable<Schiff1> {
	String farbe;
	Reeder2 reeder;
	
	Schiff1(String farbe) {
		this.farbe=farbe;
	}
	
	Schiff1(String farbe, Reeder2 reeder) {
		this.farbe=farbe;
		this.reeder=reeder;
	}
	
	// compareTo Methode implementieren
	@Override
	public int compareTo(Schiff1 s2) {
		int sortReeder = this.reeder.compareTo(s2.reeder);  // alphabetische Sortierung nach farbe
		if(sortReeder==0) {
			return this.farbe.compareTo(s2.farbe);  // Bedingte Sortierung nach Farbe
													// wenn Reeder gleich sind.
		}
		return sortReeder;
	}
	
	public String toString() {
		return "Schiff " + farbe + " Reeder " + reeder;
	}
}


class Reeder2 implements Comparable<Reeder2> {
	String name;
	
	Reeder2 (String name) {
		this.name=name;
	}
	
	public int compareTo(Reeder2 r2) {
		return this.name.compareTo(r2.name);
	}
	
	@Override
	public String toString() {
		return name;
	}
}