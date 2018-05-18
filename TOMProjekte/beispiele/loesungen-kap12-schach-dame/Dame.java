
public class Dame extends Schachfigur {

  // Konstruktur der übergeordneten Klasse aufrufen
  public Dame(String startpos) {  
    super(startpos);
  }

  @Override
  public String ermittleZiele() {
    StringBuilder zuege= new StringBuilder();
    for(int i=-7; i<=7; i++) {
      if(i==0)   // überspringen, das ist die Ausgangsposition
        continue;
      zuege.append(position(spalte, reihe+i));    // vertikal 
      zuege.append(position(spalte+i, reihe));    // horizontal
      zuege.append(position(spalte+i, reihe+i));  // die Felder auf den 
      zuege.append(position(spalte+i, reihe-i));  // Diagonalen ermitteln
    }
    return(zuege.substring(0, zuege.length()-1));
  }
  
  
}
