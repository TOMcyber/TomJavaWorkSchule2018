
public class Schaltjahr {

  public static void main(String[] args) {
    // Test für alle Monate 2018
    for(int m=1; m<=12; m++) {
      System.out.format("Jahr 2018, Monat %d: %d Tage\n",
          m, tage(2018, m));
    }
    System.out.println();
    
    // Test für alle Februar-Monate von 2000 bis 2020
    for(int jahr=2000; jahr<=2020; jahr++) {
      System.out.format("Jahr %d, Monat Februar: %d Tage\n",
          jahr, tage(jahr, 2));
    }
    
  }



  // Schaltjahr oder nicht
  public static boolean schaltjahr(int jahr) {
    if(jahr%400 == 0) {
      return true;
    } 
    else if(jahr%100 == 0) {
      return false;
    } 
    else if(jahr%4 == 0) {
      return true;
    } 
    else {
      return false;
    }
  }

  // Anzahl der Tage pro Monat
  public static int tage(int jahr, int monat) {
    // Parameter testen
    if(jahr>=1900 && jahr<=2100 && monat>0 && monat<=12) {
      // Parameter OK, auswerten   
      switch(monat) {
      case 4: case 6: case 9: case 11:
        return 30;
        // break überflüssig wegen return
      case 2:
        if(schaltjahr(jahr)) {
          return 29;
        } else {
          return 28;
        }
        // break überflüssig wegen return
      default:
        return 31;
      }
    } else {
      // Parameter nicht OK, 0 zurückgeben
      return 0;
    }
  }

}
