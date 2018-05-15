package javaAdventure2a;

public class JavaAdventure2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String Befehl;
		  while (true) {
		   Befehl = br.readLine();
		 
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
		   }
		 
		if (Befehl.equals("q")) { // Abruch
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
		   
		default: System.err.println("Das verstehe ich nicht");break;
		     
		    }
		   }
		  }
		
		
		
	}

}
