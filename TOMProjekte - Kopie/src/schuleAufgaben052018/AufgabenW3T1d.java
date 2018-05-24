package schuleAufgaben052018;

public class AufgabenW3T1d {

	public static void main(String[] args) {
		// ======  W4T1 - Equals,Comparable, Comparatorn - Aufgaben =====
/*	Aufgabe 1
	
	a) Erklären Sie die Unterschiede zwischen der equals()-Methode und dem "=="-Operator. 
	   In welchen Fällen wird == true und in welchen equals.
	b) Wie könnte eine sinnvolle equals-Methode für folgende Klasse in etwa aussehen.
	   Schreiben Sie den Code auf!
*/     
	class Hantel { 
		int gewicht; 
		
		public Hantel(int gewicht) { 
			this.gewicht=gewicht; 
  } 
		public int compareTo(Hantel o) {
			
				
			Name
			String s1 = new String("text");
			
			
			Hantel[] hanteln = { new Hantel(19), new Hantel(11), new SpecialHantel() };
			
			Object[] objekte = { new Hantel(11), new Hantel(11), new Hantel(10) };
		}
				
	}	
	
	interface Firma {
		public float bereite();
		
	}
	
	class Tisch implements Firma, Comparable {
		public float bereite() {
			return 0.1f;
		}
		
		@Override
		public int compareTo(Object o) {
			if(o instanceof Tisch) {
				Tisch t1 = (Tisch)o;
				if (this.bereite() > this.bereite()) {
					return -1;
				}
			}
			return 0;
				}
			}
	
	class Schaf {
		
	}
	
		// Comparable und Comparator
	
	// Sortierklasse mit Comparator:
	class SortClass implements Comparable<Hantel> {

			@Override
			public int compare(Hantel h1, h2) {
				if(h2.gewicht > h1.gewicht) {
					
					
					
				}
				// TODO Auto-generated method stub
				return 0;
			}
			int gewicht;
		}
		}
			public Hantel(int gewicht) {
				this.gewicht = gewicht;
			}
		// Methode aus Comparable
			public int compareTo(Object o) {
				int ergebniss = o.gewicht-this.gewicht;
				
			}
		}
	class SpezialHantel extends Hantel {
		
	
	
	}


