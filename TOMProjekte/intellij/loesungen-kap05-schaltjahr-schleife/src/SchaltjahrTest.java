
public class SchaltjahrTest {

  public static void main(String[] args) {
    int jahr=2018;
    boolean schaltjahr;
    for(jahr=1999; jahr<=2020; jahr++) {
      if( jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0)) {
        schaltjahr=true;
        System.out.println(jahr + " ist ein Schaltjahr.");
      } else {
        schaltjahr=false;
        System.out.println(jahr + " ist kein Schaltjahr."); 
      }
    }

  }

}
