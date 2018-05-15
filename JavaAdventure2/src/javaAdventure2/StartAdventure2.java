package javaAdventure2;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.Scanner;

public class StartAdventure2 {

	public static void main(String[] args) {
		// =====

	}
}

class WowAdventure {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Hallo");

		System.out.println("Gebe dein Namen ein:");

		String name = sc.nextLine();

		System.out.println("Willkommen in der Welt von WOW" + name);

		System.out.println(
				"Verwende die Tasten 'N','O','S', und 'W', um dich zu bewegen, und 'I', un einen Blick in dein Inventar zu werfen.");

		System.out.println("Mit 'Q' kannst du das Spiel verlassen");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String Befehl;

		Befehl = br.readLine();

		while (Befehl != null) {

			switch (Befehl.toLowerCase()) {

			case "n":
				System.out.println("Du gehst nach Norden");
				break;

			case "o":
				System.out.println("Du gehst nach Osten");
				break;

			case "s":
				System.out.println("Du gehst nach Süden");
				break;

			case "w":
				System.out.println("Du gehst nach Westen");
				break;

			case "i":
				System.out.println("Dein Rucksack ist im Moment noch leer");
				break;

			case "q":
				System.out.println("Möchtest du das Spiel wirklich verlassen?Y/N");

				String bestätigung = br.readLine();

				switch (bestätigung.toLowerCase()) {

				case "y":
					System.out.println("Hau rein");

					System.exit(0);
					break;

				case "n":
					System.out.println("Du willst doch nicht gehen, das freut mich!");
					break;

				}
				break;

			case "":
				System.out.println("Du wilslt gar nichts machen? Das glaube ich nicht");
				break;

			default:
				System.err.println("Das verstehe ich nicht");
				break;

			}
		}
	}

}
