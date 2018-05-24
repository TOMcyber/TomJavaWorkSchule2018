import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class JavaTimeSamples {

  public static void main(String[] args) {

    // Zeit messen
    Instant instant1 = Instant.now();
    for(int i=0; i<1_000_000; i++) {
      double x = Math.sin((double)i);
    }
    Instant instant2 = Instant.now();
    Duration d = Duration.between(instant1, instant2);
    System.out.println(d.toString());  
    System.out.println(d.toNanos());   
    
    // aktuelles Datum anzeigen
    LocalDate date1 = LocalDate.now();
    System.out.println(date1.toString());  // Format 2014-12-31
    System.out.format("%d.%d.%d\n",        // Format 31.12.2014
        date1.getDayOfMonth(), 
        date1.getMonthValue(), 
        date1.getYear());
    DateTimeFormatter myformatter =        // Format 31. Dez 2014
        DateTimeFormatter.ofPattern( "d. MMM yyyy" );
        // DateTimeFormatter.ofLocalizedDate( FormatStyle.MEDIUM );
    System.out.println(myformatter.format(date1));
    
    DateTimeFormatter dtf =        // Format Montag 31.12.
        DateTimeFormatter.ofPattern( "EEEE, d.M." );
    System.out.println(dtf.format(date1));
    
    // französische Monatsnamen
    Locale frloc = new Locale("fr", "FR");
    DateTimeFormatter frformatter =        
        DateTimeFormatter.ofPattern("MMMM").withLocale(frloc);
    for(int m=1; m<=12; m++) {
      Month mn = Month.of(m);
      System.out.println(frformatter.format(mn));
    }

    // Schaltjahrtest
    if(date1.isLeapYear())
      System.out.println(date1.getYear() + " ist ein Schaltjahr.");
    
    // Anzahl der Tage pro Monat
    for(int m=1; m<=12; m++) {
      LocalDate mydate = date1.withMonth(m);
      System.out.println("Monat " + 
        mydate.getMonth() + " mit " + 
        mydate.lengthOfMonth() + " Tagen.");
    }
    
    // aktuelle Uhrzeit anzeigen
    LocalTime time1 = LocalTime.now();
    System.out.println(time1.toString());
    DateTimeFormatter timeformatter =        
        DateTimeFormatter.ofPattern("H:m");
    System.out.println(timeformatter.format(time1));

    // parse
    String s = "31.12.2014 23:55";
    DateTimeFormatter informatter = 
        DateTimeFormatter.ofPattern("d.M.yyyy H:m");
    LocalDateTime dt1 = LocalDateTime.parse(s, informatter);
    System.out.println(dt1);
    
    
    // Rechnen mit Datum und Uhrzeit: Arbeitszeit in Stunden
    LocalDateTime arbeitsbeginn =  // 1.12.2014 8:00
        LocalDateTime.of(2014,  12, 1, 8, 00); 
    LocalDateTime arbeitsende =  // 1.12.2014 16:15
        LocalDateTime.of(2014,  12, 1, 16, 15); 
    Duration arbeitszeit = Duration.between(arbeitsbeginn, arbeitsende);
    System.out.format("Arbeitszeit in Stunden: %.2f\n", 
      arbeitszeit.toMinutes() / 60.0);
    
    // Präsidentschaft von Thomas Jefferson in Tagen
    LocalDate jeffStart = LocalDate.of(1801, 3, 4);
    LocalDate jeffEnde = LocalDate.of(1809, 3, 4);
    long tage = ChronoUnit.DAYS.between(jeffStart, jeffEnde);
    System.out.format("Thomas Jefferson war %d Tage US-Präsident.", tage);
    
    // Zeiten addieren und subtrahieren
    LocalTime jetzt = LocalTime.now();
    LocalTime demnaechst = jetzt.plusHours(1); 
    LocalTime vorher = jetzt.minusMinutes(30);
    System.out.println("Jetzt: " + jetzt);
    System.out.println("In einer Stunde: " + demnaechst);
    System.out.println("Vor einer halben Stunden: " + vorher);
    
    LocalDate heute = LocalDate.now();
    LocalDate inEinerWoche = heute.plusDays(7);
    LocalDate inEinemJahr = heute.plusYears(1);
    
    // Umwandlung von java.util.Date zu zu java.time.LocalDate
    Date dt = new Date();
    System.out.println(dt);
    
    LocalDate ld = dt.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    System.out.println(ld);
    
    LocalDateTime ldt = dt.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    System.out.println(ldt);
    
  }

}
