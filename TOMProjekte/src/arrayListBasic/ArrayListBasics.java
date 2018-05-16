package arrayListBasic;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasics {

	public static void main(String[] args) {
		
		// === ArrayList //
		ArrayList<String> alist = new ArrayList<>();
		
		String myString = "Alpha";
		
		// Hinzufügen von Elementen zu einer Liste
		// ==(); --> fügt das übergebene Element an die letzte Position
		alist.add(myString);
		alist.add(myString);
		alist.add("Beta");
		alist.add("Gamma");
		
		// == überladene add-Methode: Zugriff auf Index
		alist.add(1,  "Alpha2");
		
		// == Element an einer Position einfügen und enthaltenes Element löschen
		// set-Methode
		String herausgeloesteElement = alist.set(2,  "Delta");
		System.out.println("Gelöschtesd Element = " + herausgeloesteElement);
		
		//Element aus Liste löschen:
		// == remove
		String removeElement = alist.remove(4);
		System.out.println("remove Element");
		
		// Inhalte einer Liste betrachten:
		// for each Schleife
		for (String s : alist) {
			System.out.println(s);
		}
		
		// for Schleife (Zugriff auf Indexpositionen
		// Länge der Liste über .size() Methode (entspricht length bei Arrays)
		for (int i=0; i < alist.size(); i++ )
			System.out.println(i + "" +alist.get(i) );
	}
		
	//	System.out.println("=== Ausgabe der Inhalte mit ")

	// === Element in einer List suchen

	List<Integer> mylist = new ArrayList<>();
	mylist.add(5);
	mylist.add(45);
	mylist.add(3);
	mylist.add(4);
	
	
	List<Person> personen = new ArrayList<>();
	boolean gefunden = mylist.contains(Integer.valueOf(44));
	System.out.println("person gefunden? " + personen.contains(new);

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Person && this.alter==((Person)obj.alter) {
			
		}
	}
	
	
}
