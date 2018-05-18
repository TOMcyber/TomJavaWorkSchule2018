
/**
 * Schnittstelle mit Methoden zur Berechnung
 * des Umfangs und des Flächeninhalts geometrischer
 * Objekte
 * @author kofler
 */
public interface Geometrie extends Comparable<Geometrie>{
  /**
   * berechnet den Umfang eines geometrischen Objekts
   * @return Umfang
   */
  double berechneUmfang();
  /**
   * berechnet den Flächeninhalt eines geometrischen Objekts
   * @return Flächeninhalt
   */
  double berechneFlaeche();
}
