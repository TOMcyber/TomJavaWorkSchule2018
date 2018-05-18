import java.util.*;

public class TestHashSet {

  public static void main(String[] args) {
    Set<Rectangle> set = new HashSet<>();
    set.add(new Rectangle(2, 1));
    set.add(new Rectangle(2, 2));
    set.add(new Rectangle(2, 1));

    // Ausgabe: 2 2; 2 1; 2 1
    for(Rectangle r: set)
      System.out.println(r.w + " " + r.h);


  }

}
