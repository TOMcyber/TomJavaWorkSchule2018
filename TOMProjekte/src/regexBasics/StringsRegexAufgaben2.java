package regexBasics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringsRegexAufgaben2 {

	public static void main(String[] args) {
		// Aufgabe 2:

		
		
		
		
		String[] roemischeZahlen = new String[25];
		String[] titel = new String[25];
		
		try(BufferedReader br1 = new BufferedReader (new FileReader("c:\\temp\\faustinhalt.txt"))) {
			

		
			String line;
			int i=0;
			while( ( line = br1.readLine()) != null ) {
				String[] arrTemp = line.split("#");
				roemischeZahlen[i] = arrTemp[0].trim();
				titel[i] = arrTemp[1].trim();
				i++;
			}
		
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		for(int i=0; i < titel.length; i++) {
		titel[i] = titel[i].toLowerCase();
		System.out.println(roemischeZahlen[i] + " " + titel[i]);
		}
		
		
	}

}
