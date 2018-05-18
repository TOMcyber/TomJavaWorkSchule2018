import java.util.Locale;
import java.text.NumberFormat;
import java.text.ParseException;

public class LocaleTest {

  public static void main(String[] args) {
    double d = 1.2345;
    Locale locde = new Locale("de", "DE");
    Locale locus = new Locale("en", "US");
    System.out.format(locde, "%.3f\n", d); // 1,235
    System.out.format(locus, "%.3f\n", d); // 1.235

    try {
      NumberFormat nf = NumberFormat.getInstance(locde);
      Number number = nf.parse("27,888");
      d = number.doubleValue();
      System.out.println(d);
    } catch(java.text.ParseException ex) {
      System.out.println("Ungültige Zahl");
    }    

    

  }

}
