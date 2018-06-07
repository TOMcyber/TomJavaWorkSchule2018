package main;

import gui.GuiFriendsAdministration;

/**
 * ABSCHLUSSPROJEKT - TomAbschlussprojektFriendsAndBirthdays1
 *     
 * Einstiegspunkt in<br>
 * die App FriendsAndBirthdays<br>
 * @author Thomas Vollmer<br>
 *
 **/



public class Main {									//  Anfang Klasse Main

	public static void main(String[] args) {			// Methode Main1 Anfang
		// Main Start						
		System.out.println("Hello World");
		System.out.println("Klasse Main Methode main()");
		
		GuiFriendsAdministration guiFriendsAdministartion = new GuiFriendsAdministration();
		
		guiFriendsAdministartion.openGuiFriendsAdministration();
		
	}													// Methode Main1 Ende
		
}														// Ende Klasse Main														



