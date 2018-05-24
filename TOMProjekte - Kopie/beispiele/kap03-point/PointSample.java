import java.awt.Point;

public class PointSample {
  public static void main(String[] args) {
    Point p1 = new Point(3, 3);
    Point p2 = p1;
    p2.x = 4;
    System.out.println(p1.x + " " + p2.x); 
    
    Point p3 = new Point(3, 3);
    Point p4 = (Point)p1.clone();
    p4.x = 4;
    System.out.println(p3.x + " " + p4.x);
  }
}
