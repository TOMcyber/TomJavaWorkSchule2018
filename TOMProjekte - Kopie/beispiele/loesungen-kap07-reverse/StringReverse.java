
public class StringReverse {

  public static void main(String[] args) {
    String satz="Dieser Satz soll auf den Kopf gestellt werden.";
    String ergebnis="";
    
    // Variante 1
    for(int i=satz.length()-1; i>=0; i--)
      ergebnis+=satz.charAt(i);
    System.out.println(ergebnis);
   
    // Variante 2 mit StringBuilder
    StringBuilder sb = new StringBuilder();
    for(int i=satz.length()-1; i>=0; i--)
      sb.append(satz.charAt(i));
    ergebnis = sb.toString();
    System.out.println(ergebnis);
   
    // Variante 3: reverse-Methode von StringBuilder verwenden
    StringBuilder sb2 = new StringBuilder(satz);
    ergebnis = sb2.reverse().toString();
    System.out.println(ergebnis);
    
  }

}
