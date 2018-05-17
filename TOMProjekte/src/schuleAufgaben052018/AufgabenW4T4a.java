package schuleAufgaben052018;

public class AufgabenW4T4a {

	

	import java.util.List;
	import java.util.Scanner;

	
		
		// == Attribute
		HilfsklasseFileSchreibenLesen zugriffcsv;
		DurchsucheBuchliste suche;
		Scanner sc;
		List<Buch> buchliste;
		

		public static void main(String[] args) {
			// =====
			// === Vorarbeiten
			ControllerUserProcess cup = new ControllerUserProcess();
			cup.sc = new Scanner(System.in);
			cup.zugriffcsv = new HilfsklasseFileSchreibenLesen();
			cup.suche = new DurchsucheBuchliste();
			
			// Buchliste mit vorhandenen Büchern befüllen:
			cup.buchliste = cup.zugriffcsv.leseBuchbestandInArray("buchbestand.csv");
			
			cup.starteController();
		}
		
		public void starteController() {
			// ======================================
			// == Controllerprozess
			System.out.println("Möchten Sie ein Buch suchen (S) oder einen neuen Eintrag vornehmen (E)?");
			// User Eintrag abfangen.
			String eingabe = sc.next();
			
			switch(eingabe) {
			case "S": System.out.println("Möchten Sie ein Buch nach Titelstichwort (T) oder Autor (A) suchen?");
					String eingabeS2 = sc.next();
					
					// Verschachteltes Switch: Art der Suche abfragen
					switch(eingabeS2) {
					case "T":
						System.out.println("Bitte geben Sie ein Titelstichwort ein:");
						String titelstichwort = sc.next();
						// Benutzer möchte Buch nach Tielstichwort suchen.
						// --> Suchmethode aufrufen (Titel)
						Buch b = suche.durchsucheBuchlisteNachTitel(this.buchliste, titelstichwort);
						System.out.println("Suchergebnis ");
						System.out.println(b);
						break;
					case "A":
						// Autor abfragen
						System.out.println("Bitte geben Sie einen Autor ein:");
						String autor = sc.next();
						// --> Suchmethode aufrufen (Autor)
						break;					
					}
					break;
						
			case "D": System.out.println("XXXX");
			}
			
			
			
			
			
			
			// Scanner schließen
			sc.close();
		}

	}

	
	
