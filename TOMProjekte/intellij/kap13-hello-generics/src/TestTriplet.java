import java.awt.Point;

public class TestTriplet {

  public static void main(String[] args) {
    Triplet<String> t1 = new Triplet<>(
        "12", "abc", "...");
      String tst1 = t1.b;
       
      Triplet<Point> t2 = new Triplet<>(
        new Point(1, 1), 
        new Point(2, 2), 
        new Point(3, 3));
      Point tst2 = t2.c;

      Triplet<Double> t3 = new Triplet<>(1.0, 2.8, 83.2);
      Double tst3 = t3.a;

  }

}
