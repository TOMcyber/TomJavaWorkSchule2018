
public class TestSpringer {

  public static void main(String[] args) {
    String[] tst = {"e5", "a1", "h8"};
    for(String pos : tst) {
      Springer sp = new Springer(pos);
      System.out.println("Position: " + pos);
      System.out.println("Mögliche Ziele: " + sp.ermittleZiele());
      System.out.println();
    }
    
  }

}
