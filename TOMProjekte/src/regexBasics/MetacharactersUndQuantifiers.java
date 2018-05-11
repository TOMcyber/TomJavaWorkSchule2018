package regexBasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetacharactersUndQuantifiers {

	public static void main(String[] args) {
		
   	 // String regex = "\\d+";  // Regex: Metacharacter: findet digit
	 //	String regexW = "\\b[A-Z][a-z]+\\b"; // findet Wörter, die mit Großbuchstaben beginnen.
	 //	String input = "Hier steht eine Zahl 57, und hier auch 6, 687";
		
		String input2 = "Die Orangen kosten 54,45 Euro. Die Birnen kosten 30 Euro. 4 Euro";
		String regex2 = "\\d+,?\\d*";
		Pattern pat = Pattern.compile(regex2);
		Matcher mat = pat.matcher(input2);
	
		
		
		String gueltigeEmail = "torsten.schaefer@freenet.cc";
		String regexEmail = "[a-zA-Z]+.?[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z][a-zA-Z][a-zA-Z]?";
		
		
		while(mat.find()) {
			String gefunden = mat.group();
			System.out.println("gefunden: " + gefunden);
			System.out.println("start index " + mat.start());
			
		}

	}

}
