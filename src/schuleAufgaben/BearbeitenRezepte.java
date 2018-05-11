package schuleAufgaben;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BearbeitenRezepte {

	public static void main(String[] args) {
		// ===
		
		try(BufferedReader buf1 = new BufferedReader(new FileReader("C:\\temp\\Rezepte.txt"))) {
			/// im try block
			// (1) Rezepte einlesen: Zeilen ausgeben
			String zeile;
			while ( (zeile = buf1.readLine()) != null)  {
				System.out.println(zeile);
				Rezept r1 = new Rezept();
				
				String regex = "[,;:\\?]?[\\.#\\*]*\\s+";
				String[] elemente = zeile.split(regex);
				System.out.println(Arrays.toString(elemente));
				
				// Neue Instanz von Rezept erzeugen und Attribute belegen
//				Rezept r1 = new Rezept();
				
				// Name belegen
				r1.setName(elemente[0]);
				System.out.println("Rezept, Name " + r1.getName());
				
				// Zutaten belegen (Schleife in while Schleife)
				String[] zutaten = new String[elemente.length-1];
				for (int i = 0; i < zutaten.length; i++) {
					zutaten[i] = elemente[i+1];
				}
				System.out.println("Zutaten: " + Arrays.toString(zutaten));
				r1.setZutaten(zutaten);
				System.out.println("Rezept, Zutaten " + Arrays.toString(r1.getZutaten()));
				
				System.out.println("=====");
				System.out.println(r1);
				System.out.println("=====");
			}	
			} catch  (IOException ioe) {
				
			}
		}
	}


