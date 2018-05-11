package Uebungsaufgaben;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	double x = 0;
	while(true) {
		try {
			System.out.println("Bitte geben sie eine Zahl ein");
			x = sc.nextDouble();
			break;
		} catch (Exception ex) {
			System.out.println("Fehler");
			sc.next();		 
		}
	}
	System.out.println(x)	;
	}

}
