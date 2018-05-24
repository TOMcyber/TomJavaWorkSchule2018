package regexBasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherBasics {

	public static void main(String[] args) {
		// Pattern und Matcher Klasse
		
		String regex = "Brot";
		String text = "Ich kaufe mein Brot am liebsten bei einem Bäcker, der auch wirklich"
				+ " Brot backen kann. Brot Schmeckt mir leider nicht.";
		
		Pattern pat = Pattern.compile(regex);
		Matcher mat = pat.matcher(text);
		
		// Immer zuerst die find Methode aufrufen, um fund zu laden
		boolean found = mat.find();
		System.out.println("regex found ? " + found);
		
		// Wenn gefunden (true): Methoden, um Informationen über Funde zu erhalten.
		int indexStartFund = mat.start();
		System.out.println("Start erster Fund an Indexstelle");

	}

}
