package schuleAufgaben052018;

public class AufgabenW4T1 {

	public static void main(String[] args) {
		// =========
		// Aufgabe 1
		
/*		a) Erklären Sie die Unterschiede zwischen der equals()-Methode und dem "=="-Operator. 
		In welchen Fällen wird == true und in welchen equals verwendet?
		b) Wie können eine sinnvolle equals-Methode für folgende Klasse in etwa aussehen.
		   Schreiben Sie den Code auf!

		a) kurz und bündig.  mit .equals() werden Objekte verglichen,
							 mit == Referenzen und simple Typen wie int und boolean
							 
		b) 
*/	
		Hantel h1 = new Hantel(10, "rot");
		Hantel h2 = new Hantel(10, "rot");
		Hantel h3 = new Hantel(10, "blau");
		Hantel h4 = new Hantel(20, "rot");
		
		System.out.println("h1 vs. h2 " + h1.equals(h2));
		System.out.println("h1 vs. h3 " + h1.equals(h3));
		System.out.println("h1 vs. h4 " + h1.equals(h4));
		System.out.println("h3 vs. h4 " + h1.equals(h4));
	}
}
		
		
			class Hantel {
				int gewicht;
				String farbe;
				
				public Hantel(int gewicht, String farbe) {
					this.gewicht=gewicht;
					this.farbe =farbe;
				}
			
				// == equals Methode == //
				public boolean equals(Object o2) {
					if(o2 instanceof Hantel) {
						Hantel h2 = (Hantel)o2;
						if(this.gewicht == h2.gewicht && this.farbe.equals(h2.farbe)) {
							return true;
						}
					}
					return false;
				}
			
				
			

	

}
