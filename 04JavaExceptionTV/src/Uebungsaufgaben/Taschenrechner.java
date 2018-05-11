package Uebungsaufgaben;

//Vollqualifizierter Klassenname: uebungsaufgaben6.Aufgabe2Taschenrechner
import java.util.Scanner;

public class Taschenrechner {

	public static void main(String[] args) {

		Scanner r = new Scanner(System.in);

		String[] operationen = new String[2];
		double[] zahl1 = new double[2];
		double[] zahl2 = new double[2];
		double[] ergebnisse = new double[2];
		// Endlosschleife

		int index = 0;

		while (true) {

			System.out.println("Welche Rechenoperationen möchten Sie durchführen."
					+ "\nGeben Sie das Operationszeichen ein (Abbruch: exit):");
			String operator = r.next();

			// Prüfen, ob Nutzer aussteigen möchte
			if (operator.equals("exit")) {

				// Es sollen alle bisherigen Rechnungen auf der Konsole dargestellt werden.
				for (int i = 0; i < operationen.length; i++) {
					System.out.println(zahl1[i] + " " + operationen[i] + " " + zahl2[i] + " = " + ergebnisse[i]);
				}
				break;
			}

			operationen[index] = operator;

			System.out.println("Bitte geben Sie jetzt die erste Zahl ein:");
			double d1 = r.nextDouble();     //  mögliche Fehlerquelle 1
			zahl1[index] = d1;

			System.out.println("Bitte geben Sie jetzt die zweite Zahl ein:");
			double d2 = r.nextDouble();    //  mögliche Fehlerquelle 2
			zahl2[index] = d2;

			double ergebnis = 0;
			switch (operator) {
			case "*":
				ergebnis = d1 * d2;
				break;
			case "+":
				ergebnis = d1 + d2;
				break;
			case "-":
				ergebnis = d1 - d2;
				break;
			case "/":
				if (d2 != 0) {
					ergebnis = d1 / d2;
				} else {
					System.out.println("Division durch 0 nicht möglich");
				}
				break;
			default:
				System.out.println("Ungültiger Operator");
			}

			System.out.println(d1 + " " + operator + " " + d2 + " = " + ergebnis);
			ergebnisse[index] = ergebnis;
			index++;
			if (index == operationen.length)
				index = 0;
		} // while Schleife Ende

		// Scanner schließen
		r.close();

	} // ende Main

}
