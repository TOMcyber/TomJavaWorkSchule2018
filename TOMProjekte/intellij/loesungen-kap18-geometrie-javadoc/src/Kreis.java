
/**
 * Klasse zur Speicherung von Kreisen
 * @author kofler
 */
public class Kreis implements Geometrie {
  private double radius;

  /**
   * erzeugt ein Kreis-Objekt
   * @param radius Radius
   * @throws IllegalArgumentException wenn der Radius kleiner/gleich 0 ist
   */
  public Kreis(Double radius) {
    setRadius(radius);
  }
  
  // getter/setter für radius
  /**
   * Radius auslesen
   * @return Radius
   */
  public double getRadius() {
    return radius;
  }
  /**
   * Radius einstellen/verändern
   * @param radius Radius
   * @throws IllegalArgumentException wenn der Radius kleiner/gleich 0 ist
   */
  public void setRadius(double radius) {
    if(radius<=0)
      throw new IllegalArgumentException(
          "Der Radius muss größer 0 sein!");
    this.radius = radius;
  }

  @Override
  public double berechneUmfang() {
    return 2 * radius * Math.PI;
  }

  @Override
  public double berechneFlaeche() {
    return radius * radius * Math.PI ;
  }

  @Override
  public int compareTo(Geometrie o) {
    double flaeche_this = this.berechneFlaeche();
    double flaeche_other = o.berechneFlaeche();
    if(flaeche_this==flaeche_other)
      return 0;
    else if(flaeche_this>flaeche_other)
      return 1;
    else
      return -1;
  }
}
