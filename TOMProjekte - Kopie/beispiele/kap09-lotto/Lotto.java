import java.util.Arrays;
import java.util.Random;

public class Lotto {

  public static void main(String[] args) {
    int[] tipp = {1, 4, 8, 22, 23, 48};
    int[] ziehung;
    long n=0;
    
    // Schleife, so oft Lotto spielen, bis die sechs Zahlen übereinstimmen
    do {
      n++;
      ziehung = gewinnzahlen();
      // System.out.println(java.util.Arrays.toString(ziehung));
    } while( Arrays.equals(tipp, ziehung)==false );
   
    System.out.format("Sechs richtige Zahlen nach nur %d Jahren!\n", n/100);
  }

  public static int[] gewinnzahlen() {
    int[] ziehung = new int[6];
    int zahl;
    Random r = new Random();
    int n=0;

    // Schleife für alle sechs Zahlen
    do_label:
    do {
      zahl = 1 + r.nextInt(49);
      // testen, ob Doppelgänger
      for(int i=0; i<n; i++) {
        if(ziehung[i] == zahl)
          continue do_label;  // Schleifendurchgang wiederholen   
      }
      ziehung[n]=zahl;
      n++;
    } while(n<6);
    
    Arrays.sort(ziehung);
    return ziehung;
  }
  
}
