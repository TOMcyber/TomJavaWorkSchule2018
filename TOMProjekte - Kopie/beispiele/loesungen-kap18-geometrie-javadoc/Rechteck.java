/**
 * Klasse zur Speicherung von Rechtecken
 * @author kofler
 *
 */
public class Rechteck implements Geometrie {
  /**
   * Ausmaße des Rechtecks
   */
  private double laenge, breite;
  
  /**
   * erzeugt ein Rechteck-Objekt
   * @param laenge Länge
   * @param breite Breite
   * @throws IllegalArgumentException wenn Länge oder
   *         Breite kleiner/gleich 0 sind
   */
  public Rechteck(double laenge, double breite) {
    setLaenge(laenge);
    setBreite(breite);
  }
  
  /**
   * erzeugt ein Rechteck der Größe 10x5
   */
  public Rechteck() {
    this(10, 5);
  }

  /**
   * liest die Länge des Rechtecks
   * @return Länge
   */
  public double getLaenge() {
    return laenge;
  }
  /**
   * stellt die Länge ein bzw. verändert sie
   * @throws IllegalArgumentException wenn die Länge kleiner/gleich 0 ist
   * @param laenge Länge
   */
  public void setLaenge(double laenge) {
    if(laenge<=0)
      throw new IllegalArgumentException(
          "Die Länge muss größer 0 sein!");
    this.laenge = laenge;
  }

  // getter und setter für Breite
  /**
   * liest die Breite des Rechtecks
   * @return Breite
   */
  public double getBreite() {
    return breite;
  }

  /**
   * stellt die Breite ein bzw. verändert sie
   * @throws IllegalArgumentException wenn die Breite kleiner/gleich 0 ist
   * @param breite Breite
   */
  public void setBreite(double breite) {
    if(breite<=0)
      throw new IllegalArgumentException(
          "Die Breite muss größer 0 sein!");
    this.breite = breite;
  }

  // Methoden der Schnittstelle Geometrie
  @Override
  public double berechneUmfang() {
    return (laenge+breite)*2;
  }
  @Override
  public double berechneFlaeche() {
    return laenge*breite;
  }

  @Override
  public int compareTo(Geometrie o) {
    return Double.compare(this.berechneFlaeche(), o.berechneFlaeche());
  }
}
