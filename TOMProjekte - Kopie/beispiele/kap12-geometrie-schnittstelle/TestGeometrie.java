
public class TestGeometrie {

  public static void main(String[] args) {
    
    Geometrie[] geos = new Geometrie[4];
    
    geos[0] = new Rechteck(2, 3);
    geos[1] = new Rechteck(2.5, 3.2);
    geos[2] = new Kreis(3.0);
    geos[3] = new Kreis(4.0);
     
    for(Geometrie g : geos) {
      if(g instanceof Rechteck) {
        System.out.format("Rechteck: %.2f x %.2f\n", 
            ((Rechteck) g).getLaenge(),
            ((Rechteck) g).getBreite());
      } else if(g instanceof Kreis) {
        System.out.format("Kreis: Radius %.2f\n", 
            ((Kreis) g).getRadius());
      }
      System.out.format("  Fläche %.2f\n", g.berechneFlaeche());
      System.out.format("  Umfang %.2f\n", g.berechneUmfang());
    }
    
  }

}
