
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDoubleTriplet {

  public static void main(String[] args) {
    List<DoubleTriplet> lst = new ArrayList<DoubleTriplet>();
    lst.add(new DoubleTriplet(1, 1, 1.2));
    lst.add(new DoubleTriplet(1, 2, 3));
    lst.add(new DoubleTriplet(2, 2, 4));
    lst.forEach(DoubleTriplet::printout);
    lst.forEach(DoubleTriplet::printoutDetail);

    Double[] x = {1.23, 1.2, 1.29};
    Arrays.sort(x, Double::compare);

    List<Double> ld = new ArrayList<>();
    ld.add(1.0);
    ld.add(2.2);
    ld.add(0.3);
    ld.forEach(System.out::println);
    ld.forEach(d -> System.out.println(d));
    
    String[] abc = {"d", "A", "b", "C"};
    Arrays.sort(abc, String::compareToIgnoreCase);
    Arrays.sort(abc, (s1, s2) -> s1.compareToIgnoreCase(s2));
    for(String s:abc)
      System.out.println(s);
    
  }

}
