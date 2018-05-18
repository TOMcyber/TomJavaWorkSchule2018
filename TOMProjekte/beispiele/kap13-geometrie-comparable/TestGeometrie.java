import java.util.Arrays;


public class TestGeometrie {

  public static void main(String[] args) {
    
    Geometrie[] geos = new Geometrie[4];
    
    geos[0] = new Rechteck(2, 3);
    geos[1] = new Rechteck(1.5, 1.2);
    geos[2] = new Kreis(3.0);
    geos[3] = new Kreis(0.4);
 
    // nach Fläche sortieren mit Comparable
    Arrays.sort(geos);
    for(Geometrie g : geos) {
      System.out.format("Fläche %.2f\n", g.berechneFlaeche());
    }
    
    // nach Umfang sortieren mit Comparator
    Arrays.sort(geos, (g1, g2) -> Double.compare(g1.berechneUmfang(), 
                                                 g2.berechneUmfang()));
    for(Geometrie g : geos) {
      System.out.format("Umfang %.2f\n", g.berechneUmfang());
    }
    
    
  }

}
