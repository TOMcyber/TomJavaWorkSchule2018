import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Rechteck {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double breite = 
      zahlenEingabe(scan, "Geben Sie die Breite an: ");
    double laenge = 
      zahlenEingabe(scan, "Geben Sie die Länge an: ");
    scan.close();
      
    double umfang=(laenge+breite)*2;
    double flaeche=laenge*breite;
    System.out.format("Umfang: %.2f\n", umfang);
    System.out.format("Fläche: %.2f\n", flaeche);
  }

  public static double zahlenEingabe(Scanner sc, String msg) {
    String input;
    double ergebnis=0;
    boolean fertig=false;
    NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
    
    System.out.print(msg);
    do {
      input = sc.nextLine();  // Zeichenkette einlesen
      try {                   // in double umwandeln
        ergebnis= nf.parse(input).doubleValue();
        fertig=true;
      } catch (ParseException pex) {
        System.out.println("Das war keine gültige Zahl.");
        System.out.print("Versuchen Sie es nochmals: ");
      }
    } while(fertig==false);

    return ergebnis;
  }

}
