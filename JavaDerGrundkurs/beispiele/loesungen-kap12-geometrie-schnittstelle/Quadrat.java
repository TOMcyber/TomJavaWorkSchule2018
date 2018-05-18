
public class Quadrat implements Geometrie {
  // Instanzvariable
  private double laenge;
  
  // Konstruktor
  public Quadrat(double laenge) {
    setLaenge(laenge);
  }
  

  // getter und setter für Lönge
  public double getLaenge() {
    return laenge;
  }
  public void setLaenge(double laenge) {
    if(laenge<=0)
      throw new IllegalArgumentException(
          "Die Länge muss größer 0 sein!");
    this.laenge = laenge;
  }


  // Methoden der Schnittstelle Geometrie
  @Override
  public double berechneUmfang() {
    return laenge*4;
  }
  @Override
  public double berechneFlaeche() {
    return laenge*laenge;
  }
}
