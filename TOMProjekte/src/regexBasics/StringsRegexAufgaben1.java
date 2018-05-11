package regexBasics;

public class StringsRegexAufgaben1 {

	public static void main(String[] args) {
		// Aufgabe 1
		
/*  a)
		String x = "Text";
		x = x.replace("t","x");
		System.out.println(x);        	 // Texx
		
//	b)
		String x = "Text";       		 
		x = x.concat("t");
		System.out.println(x);			// Textt 
*/
/*  c)	
		String x = "Text";				
		x = x.substring(2,4);
		System.out.println(x);			// xt    bei Zeichen 2 mit der Ausgabe beginnen, und bei 4 aufhören
		
Optional)
		String s="SachinTendulkar";  
		   System.out.println(s.substring(6));//Tendulkar  		// Ausgabe beim 6. Zeichen beginnen  (IMMER bei 0 anfangen zu zählen!!!)
		   System.out.println(s.substring(0,6));//Sachin       //  Bei 0 anfangen und 6 Zeichen ausgeben
	
	d) 
		String x = "Text";           	
		x = x.substring(2, 3).concat("Text").toLowerCase();
		System.out.println(x);			// xtext
		
//	e) 
		//String x = "Text";           	
		String x2 ="text";
		System.out.println(x.equalsIgnoreCase(x2));			// false
		
	f) 
		String x = "Text";           	
		String x2 ="text";
		System.out.println(x.equals(x2));			// false
	
	g)	
		String x = "Text"; 
		System.out.println(x.length());				// 4
		x.trim();									// .trim macht hier nichts, da keine Leerzeichen enthalten sind. Sonst Ausgabe ohne Leerstellen.
		System.out.println(x.length());				//4
		
	h)  
		String text2 = "Reismilch";
		System.out.println(text2.endsWith("milch"));
		System.out.println(text2.startsWith("reis"));
		*/

String x = "Text";
String x2 = "text";

System.out.println(x.equalsIgnoreCase(x2));

	}

}
