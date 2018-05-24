
public class Palindrom {

  public static void main(String[] args) {
    String[] tst = {"Otto", "Lagerregal", "blabla", 
                    "Trug Tim eine so helle Hose nie mit Gurt?"};

    // Schleife über alle Testkandidaten
    for(String s: tst) {
      System.out.println(s);
      if(istPalindrom(s)) {
        System.out.println("Ist ein Palindrom.");
      } else {
        System.out.println("Ist kein Palindrom.");
      }
      System.out.println();
    }
  }

  public static boolean istPalindrom(String s) {
    // Schritt 1: alle Zeichen außer Buchstaben eliminieren
    //   gleichzeitig Großbuchstaben in Kleinbuchstaben umwandeln
    String nurBuchstaben="";
    for(char c : s.toCharArray()) {
      if(Character.isLetter(c))
        nurBuchstaben += Character.toLowerCase(c);
    }
    
    // Schritt 2: Reihenfolge umdrehen
    String verkehrt = 
      new StringBuilder(nurBuchstaben).reverse().toString();
    
    // Schritt 3: vergleichen
    if(nurBuchstaben.equals(verkehrt))
      return true;
    else
      return false;
  }
  
  
}
