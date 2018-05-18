import java.time.*;
import java.time.temporal.*;

public class Geburtstag {

  public static void main(String[] args) {
    
    LocalDate geb   = LocalDate.of(1984,  3,  17);
    LocalDate heute = LocalDate.now();
    int jahre = Period.between(geb,  heute).getYears();
    System.out.format("Peter ist %d Jahre alt.\n", jahre);
    
    // zum Geburtstag n+1 Jahre hinzufügen --> 
    // ergibt das Datum des nächsten Geburtstags
    LocalDate naechstergeb = 
        geb.plusYears(jahre+1);
    System.out.println("Sein nächster Geburtstag ist am: " + 
        naechstergeb);
    
    // wie viele Tage sind es noch bis zum nächsten Geburtstag
    long tage = ChronoUnit.DAYS.between(heute, naechstergeb);
    System.out.format("Das ist in %d Tagen.\n", tage);
    
    
  }

}
