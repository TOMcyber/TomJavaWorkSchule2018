/**
 * Klasse für die Schachfigur Springer/Pferd
 * @author kofler
 */
public class Springer extends Schachfigur {
 
  /**
   * erzeugt einen Springer (Schachfigur) 
   * @param startpos Startposition in Schachnotation
   */
  public Springer(String startpos) {  
    super(startpos);
  }

  // kein Javadoc-Kommentar erforderlich, 
  // ist in Schachfigur.java dokumentierg
  public String ermittleZiele() {
    String zuege="";
    zuege += position(spalte+2, reihe+1);
    zuege += position(spalte+1, reihe+2);
    zuege += position(spalte+2, reihe-1);
    zuege += position(spalte+1, reihe-2);
    zuege += position(spalte-2, reihe+1);
    zuege += position(spalte-1, reihe+2);
    zuege += position(spalte-2, reihe-1);
    zuege += position(spalte-1, reihe-2);
    return(zuege.substring(0, zuege.length()-1));
  }

}
