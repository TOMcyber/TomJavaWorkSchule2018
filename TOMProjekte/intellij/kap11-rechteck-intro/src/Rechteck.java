// Rechteck-Klasse
public class Rechteck {
  public double laenge, breite;
  
  public double berechneUmfang() {
    return (laenge+breite)*2;
  }
  
  public double berechneFlaeche() {
    return laenge*breite;
  }
}
