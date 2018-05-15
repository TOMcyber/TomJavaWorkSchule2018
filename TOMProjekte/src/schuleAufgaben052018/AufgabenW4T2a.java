package schuleAufgaben052018;

import java.util.Scanner;

public class AufgabenW4T2a {

	public static void main(String[] args) {
		// ===== int uint WrapperKlasse umgewandelt
		int myint = 5;
		// myInteger --> Wrapper Klasse vom Typ Integer (umwickelt prim. Datentyp int)
		Integer myInteger.valueOf(myint);
		System.out.println(myInteger);
		
		// Wrapper in primitiven Datentyp umwandeln
		int myint2 = myInteger.intValue();
		
		// Statische Methoden der Wrapper Klasse benutzen,
		// um Strings in primitive Datentypen zu verwandeln.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben sie eine Zahl ein:");
		// Eingabe
		String zahl = sc.next();
		
		double zahlD=0;
		try {
			zahlD = Double.parseDouble(zahl);
			zahlD = Integer.parseInt(zahl);
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		System.out.println(x);
		}
		
		

	}

}
