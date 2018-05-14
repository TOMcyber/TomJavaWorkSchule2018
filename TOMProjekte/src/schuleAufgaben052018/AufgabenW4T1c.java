package schuleAufgaben052018;

import java.util.Arrays;

public class AufgabenW4T1c {
	
	public static void main(String[] args) {
		// ===
		Schiff[] schiffe = new Schiff[5];
		
		schiffe[0] = new Schiff("rot", new Reeder("Onassis"));
		schiffe[1] = new Schiff("blau", new Reeder("Onassis"));
		schiffe[2] = new Schiff("grün", new Reeder("YYY"));
		schiffe[3] = new Schiff("violett", new Reeder("AAA"));
		schiffe[4] = new Schiff("gelb", new Reeder("BBB"));
		
		System.out.println("== Unsortiertes Array vom Typ Schiff === ");
		for (Schiff schiff : schiffe) {
			System.out.print(schiff + ", ");
		}
		
		Comparable comp1 = new Schiff("rot"); 
		Comparable comp2 = new String("rot"); // okay, weil String Klasse Comparable Interface implementiert
		
		// Arrays.sort
		Arrays.sort(schiffe);	
		System.out.println("\n== Sortiertes Array vom Typ Schiff === ");
		for (Schiff schiff : schiffe) {
			System.out.print(schiff + ", ");
		}

	}

}


class Schiff implements Comparable<Schiff> {
	String farbe;
	Reeder reeder;
	
	Schiff(String farbe) {
		this.farbe=farbe;
	}
	
	Schiff(String farbe, Reeder reeder) {
		this.farbe=farbe;
		this.reeder=reeder;
	}
	
	// compareTo Methode implementieren
	@Override
	public int compareTo(Schiff s2) {
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


class Reeder implements Comparable<Reeder> {
	String name;
	
	Reeder (String name) {
		this.name=name;
	}
	
	public int compareTo(Reeder r2) {
		return this.name.compareTo(r2.name);
	}
	
	@Override
	public String toString() {
		return name;
	}
}