
/**
 * Abstrakte Klasse für Schachfiguren
 * @author kofler
 * @version 1.0
 */
public abstract class Schachfigur {
  /** Wertbereich 0 bis 7 für die Spalten/Linien a bis h */
  protected int spalte; 
  /** Wertbereich 0 bis 7 für die Reihen 1 bis 8 */
  protected int reihe;   
  
  /** alle zulässigen Buchstaben für Spalten */
  final static private String SPALTEN = "abcdefgh";
  /** alle zulässigen Ziffern für Zeilen */
  final static private String REIHEN  = "12345678";
  
  /**
   * initialisiert die Instanzvariablen spalte und zeile
   * @param startpos Position der Schachfigur in der 
   *         Notation "a1" oder "e5"
   * @throws IllegalArgumentException wenn die Startposition 
   *        ungültig ist
   */
  public Schachfigur(String startpos) {  
    // die Startposition muss eine Zeichenkette mit zwei Zeichen sein
    if(startpos.length()!=2)
      throw new IllegalArgumentException("ungültige Startposition");

    spalte = SPALTEN.indexOf(Character.toLowerCase(startpos.charAt(0)));
    reihe  = REIHEN.indexOf(startpos.charAt(1));
    
    if(spalte==-1 || reihe==-1)
      throw new IllegalArgumentException("ungültige Startposition");
  }
  
  /**
   * liefert alle möglichen Schachfelder, die die Figur
   * im nächsten Zug erreichen kann
   * @return durch Strichpunkt getrennte Positionen, z.B. "a1;b2;c3"
   */
  abstract public String ermittleZiele();
  
  /**
   * liefert eine Schachposition in der Notation a1 bis h8
   * @param spalte Spalte/Linie auf dem Schachbrett (0 bis 7)
   * @param reihe  Zeile auf dem Schachbrett (0 bis 7)
   * @return       Position in Schachnotation plus einen Strichpunkt, z.B. "e5;"
   */
  final static protected String position(int spalte, int reihe) {
    if(spalte<0 || spalte>7 || reihe<0 || reihe>7)
      return("");
    return(""+ SPALTEN.charAt(spalte) + REIHEN.charAt(reihe) + ";");
  }
  
  
}
