
public class TestFiguren {

  public static void main(String[] args) {
    String[] tst = {"e5", "a1", "h8"};
    
    System.out.println("Springer");
    for(String pos : tst) {
      Springer sp = new Springer(pos);
      System.out.println("Position: " + pos);
      System.out.println("Mögliche Ziele: " + sp.ermittleZiele());
      System.out.println();
    }

    System.out.println("Läufer");
    for(String pos : tst) {
      Laeufer lf = new Laeufer(pos);
      System.out.println("Position: " + pos);
      System.out.println("Mögliche Ziele: " + lf.ermittleZiele());
      System.out.println();
    }

    System.out.println("Turm");
    for(String pos : tst) {
      Turm trm = new Turm(pos);
      System.out.println("Position: " + pos);
      System.out.println("Mögliche Ziele: " + trm.ermittleZiele());
      System.out.println();
    }
    
  }

}
