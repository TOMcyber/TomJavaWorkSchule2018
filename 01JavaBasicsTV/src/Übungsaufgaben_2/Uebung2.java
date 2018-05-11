package Übungsaufgaben_2;

public class Uebung2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Aufgabe 1
//				
		
		
		
		
		
		String farbe = "Rot";
		
		switch(farbe) {
		
		case "Rot": 
			System.out.println("Rot, bitte warten");
			break;
		case "Gelb":
			System.out.println("Gelb, gleich gehts los");
			break;
		case "Grün":
			System.out.println("Grün, weg frei");
			break;
		default:
			System.out.println("Fehler, diese Farbe gibt es nicht");
			
//		Aufgabe 2
/*
			double d = Math.random();
			System.out.println(d);
			
			if (d < 0.3) {
				system.out.println("Geringe Chance");
			} else if(0.3 <= d && d < 0.7) {
				System.out.println("Fifty/Fifty");
*/				
/*		Aufgabe 4
			
		String s1 = "richtig";
		
		boolean s2 = (s1.equals("richtig")) ? true : false;
		
		if (s2)  {
			System.out.println("Das Ergebniss ist falsch ");		
				
		}	*/		
//		Aufgabe 5
		
		char ch = 'a'
		String text ="das ist ein Vokal";
		switch (ch) {
		
		case ('a'):
		case ('o'):
		case ('u'):
		case ('e'):
		case ('i'):
			System.out.println(text);
			break;
		defaul:
			System.out.println("das ist ein Konsonant");
		}
		
//      		deshalb		
		
		}
		
	
		
		
		
		}
		
		
		
	}

}
