package uebungsaufgabenFileWriteReader;

import java.io.*;
import java.io.IOException;

public class Aufgabe1BufferedReaderWriter {

	public static void main(String[] args) {
		//b instanzen der nKlasse person erzeugen
		
		Person p1 = new Person("Theresa Schmidt");
		Person p2 = new Person("Markus1 Müller");
		Person p3 = new Person("Markus2 Müller");
		Person p4 = new Person("Markus3 Müller");
		Person p5 = new Person("Markus4 Müller");
		
		Person[] personen = new Person[] {p1,p2,p3,p4,p5};
		
		//c)
		
		

		
		
		try(BufferedWriter b = new BufferedWriter(new FileWriter("personen.txt"))) {
			
			for(Person person : personen) {
				String name = person.getName();
				b.write(name);
				b.newLine();
				
			}
		} catch(IOException ioe)  {
			ioe.printStackTrace();
		}

		
		String line;
		Person[] personen2 = new Person[5];
		int i = 0;
		try(BufferedReader buf1 = new BufferedReader(new FileReader("personen.txt"))) {
			
			while( (line = buf1.readLine()) != null ) {
				// Neue Instanz vom Typ Person erzeugt und Name aus Datei (zeile)
				// festlegen.
			Person p = new Person(line);
				personen2[i] = new Person(line);
				i++;
				// System.out.println("line");
			}
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		System.out.println("=== Ausgabe des befüllten Arrays ===");
		for (Person person : personen2) {
			System.out.println(person.getName());		
				
			}
		}
	// Vergleich der Inhalte zweier Arrays: personen, personen2
	boolean sindArraysEqual = true;
	
	if (personen.length == personen2.length ) {
	for(int i=0; i < personen.length; i++ ) {
		
		if( !personen[i].name.equals(personen2[i].name)) {
			sindArraysEqual=false;
			break;
		}
	}				
	} else {
		sindArraysEqual=false;
	}
	
	
	
class Person {
	String name ;
	Person (String name) {
		this.name = name ;
				

	} 
	String getName() {
		return this.name;
		}
 }
}
}
