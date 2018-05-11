package regexBasics;

public class RegexSimpleFormStrting {

	public static void main(String[] args) {
		// ==========================
		
		String zeile = "34,Peter,Schulz,Burggraben,45";
		
		// Split - Regex: Zerlegt einen String und speichert die
		// nach Regex getrennten Inhalte in String.
		
		String[] eintraege = zeile.split(",");
		
		for (String string : eintraege) {
			System.out.println(string);
		}

	}

}
