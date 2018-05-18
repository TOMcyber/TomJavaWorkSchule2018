import java.util.*;     // in allen Beispielen erforderlich!
import static java.util.Map.entry;
import java.awt.Point;


public class HelloCollection {

  public static void main(String[] args) {
    java9();
  }

  static void java9() {
    // Polygon mit List
    List<Point> polygon = List.of(new Point(1, 1),
                                  new Point(1, 2),
                                  new Point(2, 2),
                                  new Point(2, 1));
    polygon.forEach(p -> System.out.format("(%d , %d)\n", p.x, p.y));

    // Lottozahlen erzeugen
    Random rnd = new Random();
    Set<Integer> lotto = new HashSet<>();
    do {
      lotto.add(1 + rnd.nextInt(49));
    }  while(lotto.size() < 6);

    System.out.println(
        Arrays.toString(lotto.toArray()));

    // Wörterbuch mit Map
    // of akzeptiert maximal 10 Key-Value-Paare
    Map<String, String> dict =
      Map.of("one",   "eins",
             "two",   "zwei",
             "three", "drei",
             "four",  "vier");
    System.out.println(dict.get("three"));  // --> drei

    // // noch eine Variante für beliebig viele Key-Value-Paare,
    // // erfordert den Import von entry
    // Map<String, String> dict2 =
    //   Map.ofEntries(entry("one",   "eins"),
    //                 entry("two",   "zwei"),
    //                 entry("three", "drei"),
    //                 entry("four",  "vier"));
  }
  
  // der gleiche Code in Java-8-Syntax
  static void java8() {
    // Polygon mit List
    List<Point> polygon = new ArrayList<>();
    polygon.add(new Point(1, 1));
    polygon.add(new Point(1, 2));
    polygon.add(new Point(2, 2));
    polygon.add(new Point(2, 1));
    polygon.forEach(p -> System.out.format("(%d , %d)\n", p.x, p.y));

    // Lottozahlen erzeugen
    Random rnd = new Random();
    Set<Integer> lotto = new HashSet<>();
    do {
      lotto.add(1 + rnd.nextInt(49));
    }  while(lotto.size() < 6);

    System.out.println(
        Arrays.toString(lotto.toArray()));

    // Wörterbuch mit Map
    Map<String, String> dict = new HashMap<>();
      dict.put("one",   "eins");
      dict.put("two",   "zwei");
      dict.put("three", "drei");
      dict.put("four",  "vier");
      System.out.println(dict.get("three"));  // --> drei
  }

  
}
