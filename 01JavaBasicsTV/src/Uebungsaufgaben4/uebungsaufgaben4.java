package Uebungsaufgaben4;

public class uebungsaufgaben4 {					// START class

	public static void main(String[] args) {  // START main
		// TODO Auto-generated method stub

/*		Statische Methoden - Aufgaben
 		Objektorientierte Programmierung mit Java
 		
 		
 		Aufgabe 1 (vgl Insel Buch Kapitel 2.7 - Methoden einer Klasse)
		
		   a) Welche Elemente sind notwendig um eine Java-Methode vollständig zu definieren?
		   -   So definiert man eine Methode:
  			   
  		   -)   Rückgabetyp, methodenName,(Typ1 parameter1, Typ2 parameter2, ...)
  				{
    			... Anweisungen ...
  				}
		   -)   static void diesIstMeineMethode() { }
		   
		   	    public static void methodA(int x) {
		   		   System.out.println(x);
		   		}
		       public static int methodB(int x) {
		   		   System.out.println(x);
		   		   return x;
		   		}
				
		   
		   b) Was versteht man unter der Signatur einer Methode?
		   -) Namen plus Anzahl der Parameter und deren Typen.
		   
		   c) Warum kompiliert diese Methode nicht?
*/		      
//		      public static int methodA(int x)  {
//		      return x;
		
//		   -) Weil Rückgabewert (return) fehlt..
			public static int methodeA(int x) {
				System.out.println("Mit Übergangsparameter (int), gibt int zurück");
				return x*x;
			}
																		int x = methodeA(10);
																		
			public 
		
		
		
		      }
		   
		      
		      
		      
		      
		      
/*		    d) Welche beiden Änderungen könnte man durchführen um methoA
   			   kompilierbar zu machen?
   			-) 
   			   
   			e) Wie könnte man die geänderte Methode von der static-Main in
   			   der gleichen Klasse aufrufen?
   			-)  int psi=methodA(5);  // methodA ist 
   			   
		
			f) Wie könnte man die geänderte Methode von einer anderen Klasse
			   aufrufen, wenn man davon ausgeht, das sich methodA in einer
			   public Klasse mit dem Namen "Methodenklasse" befindet.
			   
			-) Methodenklasse.methodA(27)
			   
		Aufgabe 2
		
		Definieren sie eine statische Methode "printFromTo" mit zwei int-Übergabeparameter
		"from" und "to". Die Methode gibt alle int-Werte von "from" bis "to" auf der
		Konsole in einer Zeile (getrennt mit einem Leerzeichen aus.
*/		Testen sie die Lösung!
		
		public static void printFromTo(int from, int to) {
	
			for (int i = from; i <= to; i++) {
				System.out.print( ((i==from) ? "" : " ") + i );
			}
}
		
/*		Aufgabe 3
		
		Definieren sie eine statische Methode "sum", die zwei int-Parameter erhält,
		die Summe berechnet und das Ergebniss zurück liefert. Testen Sie ihre Lösung.
		Wenn die Aufgabe gelöst ist überlegen Sie ob Ihre Methode immer die korrekten
		Ergebnisse liefert.
*/		
		System.out.println()

		int erg = sum(4, 9);
		System.out.println("\nErgebnis = " + erg);
		
/*		Aufgabe 4
		
		DEfinieren sie eine statische Methode "zeichneRechteck", die zwei int-Parameter
		"breite" und "hoehe" hat. Die Methode zeichnet ein Rechteck auf der Konsole.
		z.B. für den Aufruf 'zeichneRechteck(5,4)' wird folgende Ausgabe erwartet:
		
		*****
		*****
		*****
*/		
		zeichneRechteck(5,4);
		
		public static void zeichneRechteck(int breite, int hoehe) {
		
			for (int i = 1; i <= hoehe; i++) {
				for (int j = 1; j < breite; j++) {
					System.out.println("*");
				}
				System.out.println();
			}
		
		
		}
		
		
		
		
	
*/		
*/	
	}									   //  ENDE main-Methode
	

}										//  ENDE class
