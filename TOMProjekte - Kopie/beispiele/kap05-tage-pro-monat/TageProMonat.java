
public class TageProMonat {

  public static void main(String[] args) {
    String monat="April";
    int tage=0;
    
    switch(monat) {
    case "Januar": case "März":    case "Mai":
    case "Juli":   case "August":  case "Oktober":
    case "Dezember":
      tage = 31;
      break;
    case "April": case "Juni":
    case "September": case "November":
      tage = 30;
      break;
    case "Februar":
      tage = 28; // oder 29, wenn Schaltjahr
      break;
    default:
      System.out.println("Ungültiger Monatsname!");
      tage = 0;
    }

    if(tage!=0) {
      System.out.println("Der " + monat + 
                         " hat " + tage + " Tage.");
    }
    
  }

}
