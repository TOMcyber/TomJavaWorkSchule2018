import java.awt.Point;
import java.util.*;
 

public class TreeSetTest {

  public static void main(String[] args) {
    // Vergleich von Koordinatenpunkten je nach Abstand zu (0,0) 
    Comparator<Point> comp = (p1, p2) ->  {
      double l1 = Math.sqrt(p1.x*p1.x + p1.y*p1.y);
      double l2 = Math.sqrt(p2.x*p2.x + p2.y*p2.y);
      if(l1<l2)
        return -1;
      else if(l1>l2)
        return 1;
      else
        return 0;
    };
    
    Set<Point> set = new TreeSet<>(comp);
    set.add(new Point(2,1));
    set.add(new Point(2,2));
    set.add(new Point(1,2));
    set.add(new Point(1,1));
     
    // Testausgabe, liefert 1 1; 2 1; 2 2
    for(Point p: set)
      System.out.println(p.x + " " +  p.y);

  }

}
