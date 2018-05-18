public class Laeufer {
  private int spalte;   // Wertbereich 0 bis 7 für die Spalten a bis h
  private int reihe;    // Wertbereich 0 bis 7 für die Reihen 1 bis 8
  
  final static private String SPALTEN = "abcdefgh";
  final static private String REIHEN  = "12345678";
 
  public Laeufer(String startpos) {  
    // die Startposition muss eine Zeichenkette mit zwei Zeichen sein
    if(startpos.length()!=2)
      throw new IllegalArgumentException("ungültige Startposition");

    spalte = SPALTEN.indexOf(Character.toLowerCase(startpos.charAt(0)));
    reihe  = REIHEN.indexOf(startpos.charAt(1));
    
    if(spalte==-1 || reihe==-1)
      throw new IllegalArgumentException("ungültige Startposition");
  }

  // liefert eine Zeichenkette mit allen Positionen
  public String ermittleZiele() {
    StringBuilder zuege= new StringBuilder();
    for(int i=-7; i<=7; i++) {
      if(i==0)   // überspringen, das ist die Ausgangsposition
        continue;
      zuege.append(position(spalte+i, reihe+i));  // die Felder auf den 
      zuege.append(position(spalte+i, reihe-i));  // Diagonalen ermitteln
    }
    return zuege.substring(0, zuege.length()-1);
  }

  // liefert eine Schachposition in der Notation a1 bis h8
  private String position(int spalte, int reihe) {
    if(spalte<0 || spalte>7 || reihe<0 || reihe>7)
      return "";
    return ""+ SPALTEN.charAt(spalte) + REIHEN.charAt(reihe) + ";";
  }
}
