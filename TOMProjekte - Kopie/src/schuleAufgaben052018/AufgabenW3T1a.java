package schuleAufgaben052018;

import java.util.Arrays;

public class AufgabenW3T1a {

	public static void main(String[] args) {
		// ====
		
		Person p1 = new Person(21);
		Person p2 = new Person(39);
		Person p3 = new Person(16);
		Person p4 = new Person(54);
		
		// Array vom Datentyp Person
		Person[] personen = {p1,p2,p3,p4};
		
		for (Person person : personen) {
			System.out.print(person + ", ");
			}
Arrays.sort(personen);
		
		System.out.println("\n== Sortiertes Personen Array==");
		for (Person person : personen) {
		System.out.print(person + ", ");
		}
	}

}

class Person implements Comparable<Person> {
	
	int alter;
	
	Person(int alter) {
		this.alter = alter;
	}
	// Überschreiben der compareTo Methode aus dem Interface Comparable
	@Override
	public int compareTo(Person p2) {
		// Sortierung: aufsteigend nach Alter
		// int ergebnis = this.alter - p2.alter;
		
		// Sortierung: absteigend nach Alter
		int ergebnis = p2.alter - this.alter;
		// return Werte  > 0 --> this vs. p2: sortieren this Objekt nach hinten/p2 nach vorne
		// return Werte == 0 --> this vs. p2: keine Veränderung der Ordnung
		// return Werte  < 0 --> this vs. p2: this Objekt nach vorne, p2 naqch hinten sortiert
		
		return ergebnis;
	}
	@Override
	public String toString() {
		return "Person " + this.alter + " Jahre";
	}
}