import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class CollatorTest {

  public static void main(String[] args) {
    String[] tst = {"Auto", "Ärger", "aber"};
    
    // sortieren in der Default-Sortierordnung
    // des Betriebssystems
    Arrays.sort(tst, Collator.getInstance());
    for(String s: tst) {
      System.out.print(s + " ");
    }
    System.out.println();
    
    // sortieren nach deutscher Sortierordnung
    Arrays.sort(tst, Collator.getInstance(new Locale("de", "DE")));
    for(String s: tst) {
      System.out.print(s + " ");
    }
    System.out.println();
    
    // sortieren nach schwedischer Sortierordnung
    Arrays.sort(tst, Collator.getInstance(new Locale("sv", "SE")));
    for(String s: tst) {
      System.out.print(s + " ");
    }
    System.out.println();

  }
}