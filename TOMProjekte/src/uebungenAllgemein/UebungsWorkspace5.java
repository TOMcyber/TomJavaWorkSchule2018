package uebungenAllgemein;

import java.util.Scanner;

public class UebungsWorkspace5 {
	public void welcome() {
		String firstName, lastName;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		firstName = scanner.next();
		
		System.out.println("Enter your last name:");
		lastName = scanner.next();
		
		System.out.println("Welcome, " + firstName + " " + lastName);
	}

}
