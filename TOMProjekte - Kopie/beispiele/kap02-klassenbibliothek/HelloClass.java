import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class HelloClass {

  public static void main(String[] args) {
    LocalDate jetzt = LocalDate.now();
    DateTimeFormatter myformatter =        // Format 31. Dez 2014
        DateTimeFormatter.ofPattern( "EEEE, d. MMMM yyyy" );
    System.out.println("Heute ist " + myformatter.format(jetzt) + ".");
  }

}
