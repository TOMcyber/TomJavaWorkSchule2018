
/**
 * testet die Schachfiguren-Klassen
 * @author kofler
 *
 */
public class TestFiguren {

  /**
   * Startpunkt des Programms
   * @param args wird nicht ausgewertet
   */
  public static void main(String[] args) {
    Springer sp = new Springer("b3");
    System.out.println("Mögliche Ziele: " + sp.ermittleZiele());

    Schachfigur[] fig = new Schachfigur[4];
    fig[0] = new Turm("a1");
    fig[1] = new Springer("b1");
    fig[2] = new Laeufer("c1");
    fig[3] = new Turm("h1");
    
    for(Schachfigur sf : fig) {
      System.out.println("Klasse: " + sf.getClass().getName());
      System.out.println("Position: " +  
        Schachfigur.position(sf.spalte, sf.reihe).substring(0, 2));
      System.out.println("Mögliche Ziele: " + sf.ermittleZiele());
    }
  }

}
