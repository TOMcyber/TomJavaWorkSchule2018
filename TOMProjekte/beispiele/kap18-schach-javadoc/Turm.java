/**
 * Klasse für die Schachfigur Turm
 * @author kofler
 *
 */
public class Turm extends Schachfigur {
  /**
   * erzeugt einen Turm (Schachfigur) 
   * @param startpos Startposition in Schachnotation
   */
  public Turm(String startpos) {  
    super(startpos);
  }

  // kein Javadoc-Kommentar erforderlich, 
  // ist in Schachfigur.java dokumentierg
  public String ermittleZiele() {
    String zuege="";
    for(int i=-7; i<=7; i++) {
      if(i==0)     // die Ausgangsposition
        continue;  // überspringen
      zuege += position(spalte+i, reihe);  // mögliche Positionen in der aktuellen Zeile
      zuege += position(spalte, reihe+i);  // mögliche Positionen in der aktuellen Spalte
    }
    return(zuege.substring(0, zuege.length()-1));
  }
}
