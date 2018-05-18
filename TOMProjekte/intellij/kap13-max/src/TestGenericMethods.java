
public class TestGenericMethods {

  public static void main(String[] args) {
    String s = max("abc", "efg");
    Integer n = max(123, 456);
    System.out.println(s);  // liefert efg
    System.out.println(n);  // liefert 456

    // exakte Syntax (selten erforderlich)
    String s2 = TestGenericMethods.<String>max("abc", "efg");

  }

  public static <T extends Comparable<T>> T max(T a, T b) {
    if(a.compareTo(b)>0)
      return a;
    else
      return b;
  }
  
}
