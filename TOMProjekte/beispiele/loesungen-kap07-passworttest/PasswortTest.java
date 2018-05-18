
public class PasswortTest {

  public static void main(String[] args) {
    String[] passwoerter = {"1234", "passwort", "asdASD3", "lksd34j2T&&"};
    
    // Schleife über alle Passwörter
    for(String pw : passwoerter) {
      int punkte=0, anzKlein=0, anzGross=0, anzZiffer=0, anzSonst=0;

      // Passwort analysieren, dazu Schleife über alle 
      // Zeichen des Passworts ausführen
      for(char c : pw.toCharArray()) {
        if(Character.isUpperCase(c)) {
          anzGross++;
        } else if(Character.isLowerCase(c)) {
          anzKlein++;
        } else if(Character.isDigit(c)) {
          anzZiffer++;
        } else {
          anzSonst++;
        }
      }
      
      // Punkte vergeben
      if(pw.length()>=8) {
        punkte++;
      }
      if(anzGross>0 && anzKlein>0) {
        punkte++;
      }
      if(anzZiffer>0) {
        punkte++;
      }
      if(anzSonst>0) {
        punkte++;
      }
      
      // Ergebnis anzeigen
      System.out.format("Passwort: %s  Punkte: %d\n",
          pw, punkte);
    }

  }

}
