// Rechteck-Klasse
public class Rechteck {
  // Instanzvariablen
  public double laenge, breite;
  
  // Konstruktor
  public Rechteck(double laenge, double breite) {
    if(laenge<=0 || breite<=0) {
      throw new IllegalArgumentException(
          "Länge und Breite müssen größer 0 sein!");
    }
    this.laenge=laenge;
    this.breite=breite;
  }
  
  // Default-Konstruktor ohne Parameter
  public Rechteck() {
    this(10, 5);
  }

  
  // Methoden
  public double berechneUmfang() {
    return (laenge+breite)*2;
  }
  
  public double berechneFlaeche() {
    return laenge*breite;
  }
}
