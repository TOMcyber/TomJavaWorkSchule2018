package regexBasics;

import java.util.regex.Matcher;

public class StringRegexAufgaben3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "12 Mal die Woche, 1,7 Mal pro Tag, aber mindestens" +
				" 1 Mal am Morgen";
		
		System.out.println(text);
		
		// 12, 1,7, 1
		String regex1 = "\\d+,?\\d*";   //  \\d+ --> entweder eine oder mehrere Digits
										// ,? --> Komma tritt einmal oder nicht auf
										// \\d* --> Digit tritt entweder nicht,
										//			einmal oder mehrmals auf
//		String regex2 = [^\\d+,?\\d*][a-zA-Z]+;
		
//   c)
//		Identifizierung aller Wörter, die mit 2 Großbuchstaben
//		beginnen in diesem String:
//   	"DEr letzte GRosse GEHEimniskrämer dieseR NAtion";
		String text2 = "DEr letzte GRosse GEHEimniskrämer dieseR NAtion";
		String regexC = ""; // --> Wortgrenze, 2 Großbuchstaben,
							// beliebige Anzahl Kleinbuchstaben
							// aber mindestens ein Kleinbuchstabe
		
		java.util.regex.Pattern pat1 = java.util.regex.Pattern.compile(regex1);
		Matcher mat1 = pat1.matcher(text);
		
		System.out.println("============================");
		while(mat1.find() ) {
			System.out.println("Index Start = " + mat1.start());
			System.out.print(", Index End = " + mat1.end());
			System.out.println(", gefunden = " + mat1.group());
			
		}
		
		// System.out.println("Matcher find nach Schleife = " + mat1.find());
		// System.out.println(mat1.start());
		// System.out.println(mat1.end());
		// System.out.println(mat1.group());
		
	}

}
