public class Springer extends Schachfigur {
 
  public Springer(String startpos) {  
    super(startpos);
  }

  // liefert eine Zeichenkette mit allen Positionen
  @Override
  public String ermittleZiele() {
    StringBuilder zuege = new StringBuilder();  
    zuege.append(position(spalte+2, reihe+1));
    zuege.append(position(spalte+1, reihe+2));
    zuege.append(position(spalte+2, reihe-1));
    zuege.append(position(spalte+1, reihe-2));
    zuege.append(position(spalte-2, reihe+1));
    zuege.append(position(spalte-1, reihe+2));
    zuege.append(position(spalte-2, reihe-1));
    zuege.append(position(spalte-1, reihe-2));
    return zuege.substring(0, zuege.length()-1);
  }
}
