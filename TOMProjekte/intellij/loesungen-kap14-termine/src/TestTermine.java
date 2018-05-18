import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.function.Predicate;


public class TestTermine {

  public static void main(String[] args) {

    Termin[] termine = new Termin[3];
    termine[0] = new Termin(
        "Zahnarzt", 
        "Hauptstraße 3", 
        LocalDateTime.of(2018,  10, 17, 9, 30));
    termine[1] = new Termin(
        "Kino", 
        "Annenhofkino", 
        LocalDateTime.of(2018,  10, 15, 20, 15));
    termine[2] = new Termin(
        "Test", "Test", LocalDateTime.now());
    
    Arrays.sort(termine, (t1, t2) -> t1.zeit.compareTo(t2.zeit));

    DateTimeFormatter dtf =        
        DateTimeFormatter.ofPattern("d.M.YYYY H:m");
    for(Termin t : termine)
      System.out.format("Was: %s\nWo: %s\nWann: %s\n\n",
          t.beschreibung, t.ort, dtf.format(t.zeit));
    
    printTermine(termine, t -> t.zeit.toLocalDate().equals(LocalDate.now()));
  }


  public static void printTermine(Termin[] alle, Predicate<Termin> kriterium) {
    DateTimeFormatter dtf =        
        DateTimeFormatter.ofPattern("d.M.YYYY H:m");
    for(Termin t : alle)
      if(kriterium.test(t))
        System.out.format("Was: %s\nWo: %s\nWann: %s\n\n",
            t.beschreibung, t.ort, dtf.format(t.zeit));


  }

}
