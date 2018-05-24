
public abstract class Schachfigur {
  protected int spalte;   // Wertbereich 0 bis 7 für die Spalten a bis h
  protected int reihe;    // Wertbereich 0 bis 7 für die Reihen 1 bis 8
  
  final static private String SPALTEN = "abcdefgh";
  final static private String REIHEN  = "12345678";
  
  public Schachfigur(String startpos) {  
    // die Startposition muss eine Zeichenkette mit zwei Zeichen sein
    if(startpos.length()!=2)
      throw new IllegalArgumentException("ungültige Startposition");

    spalte = SPALTEN.indexOf(Character.toLowerCase(startpos.charAt(0)));
    reihe  = REIHEN.indexOf(startpos.charAt(1));
    
    if(spalte==-1 || reihe==-1)
      throw new IllegalArgumentException("ungültige Startposition");
  }
  
  // diese Methode muss jede abgeleitete Klasse selbst implementieren
  abstract public String ermittleZiele();
  
  // liefert eine Schachposition in der Notation a1 bis h8
  final static protected String position(int spalte, int reihe) {
    if(spalte<0 || spalte>7 || reihe<0 || reihe>7)
      return "";
    return ""+ SPALTEN.charAt(spalte) + REIHEN.charAt(reihe) + ";";
  }
  
  
}
