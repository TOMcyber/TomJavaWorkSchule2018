import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import static java.lang.System.out;

public class DateCalendar {

  public static void main(String[] args) {
    Date d1 = new Date();  // aktueller Zeitpunkt
    Date d2 = new Date(Long.MIN_VALUE);
    Date d3 = new Date(Long.MAX_VALUE);
    System.out.println(d1.getTime());
    System.out.printf(d1 + "\n" + d2 + "\n" + d3 + "\n");

    Date start = new Date();
    for(Double x=0.0; x<1e6; x++);
    Date end = new Date();
    long interval = end.getTime() - start.getTime();
    System.out.println(interval + " Millisekunden");

    // Formatierung mit format/printf
    Date d = new Date();
    System.out.format("%td.%tm.%tY\n", d, d, d);
    System.out.format("Monat %tB\n", d);
    Locale eng = new Locale("us", "EN");
    System.out.format(eng, "Month %tB\n", d); 

    // Formatierung mit SimpleDateFormat
    // df ist ein SimpleDateFormat-Objekt
    DateFormat df = DateFormat.getInstance(); 
    System.out.println(df.format(d));

    DateFormat df1 = DateFormat.getDateTimeInstance(
        DateFormat.LONG, DateFormat.LONG, new Locale("us", "en"));
    System.out.println(df1.format(d));

    Locale ital = new Locale("it", "IT");
    DateFormat df2a = new SimpleDateFormat("M", ital);
    DateFormat df2b = new SimpleDateFormat("MMM", ital);
    DateFormat df2c = new SimpleDateFormat("MMMM", ital);
    System.out.println(df2a.format(d));  
    System.out.println(df2b.format(d));  
    System.out.println(df2c.format(d));

    // Calendar-Klasse
    Calendar c = Calendar.getInstance();
    System.out.println(c);

    c.setTime(d);
    out.println(c.get(Calendar.WEEK_OF_YEAR)); // Kalenderwoche
    out.println(c.get(Calendar.MONTH));        // Monat (0-11)
    out.println(c.get(Calendar.DAY_OF_MONTH)); // Tag (1-31)
    out.println(c.get(Calendar.HOUR));         // Stunde (0-23)
    out.println(c.get(Calendar.MINUTE));       // Minute (0-59)

    out.println(c.getDisplayName(
        Calendar.MONTH, Calendar.SHORT, Locale.GERMAN));  
    out.println(c.getDisplayName(
        Calendar.MONTH, Calendar.LONG,  Locale.ENGLISH));  
    out.println(c.getDisplayName(
        Calendar.MONTH, Calendar.LONG,  new Locale("sv", "SV")));  

    Map<String, Integer> weekdays = 
        c.getDisplayNames(Calendar.DAY_OF_WEEK, Calendar.LONG, 
            Locale.FRENCH);
    for(String s: weekdays.keySet())
      System.out.printf("Wochentag: %s Nummer: %d\n", 
          s, weekdays.get(s));

  }

}
