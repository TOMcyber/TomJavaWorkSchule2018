/**
 * Klasse für die Schachfigur 'Läufer'
 * @author kofler
 */
public class Laeufer extends Schachfigur {

  /**
   *
   * @param startpos
   */
  public Laeufer(String startpos) {  
    // Konstruktur der übergeordneten Klasse aufrufen
    super(startpos);
  }

  // kein Javadoc-Kommentar erforderlich, 
  // ist in Schachfigur.java dokumentierg
  public String ermittleZiele() {
    String zuege="";
    for(int i=-7; i<=7; i++) {
      if(i==0)   // überspringen, das ist die Ausgangsposition
        continue;
      zuege += position(spalte+i, reihe+i);  // die Felder auf den 
      zuege += position(spalte+i, reihe-i);  // Diagonalen ermitteln
    }
    return(zuege.substring(0, zuege.length()-1));
  }
}
