
public class EinMalEins {

  public static void main(String[] args) {
    int i, j;
    // Schleife über die Zeilen
    for(i=1; i<=10; i++) {
      // Schleife über die Spalten in einer Zeile
      for(j=1; j<=10; j++) {
        System.out.print(i + "x" + j + "=" + i*j + "\t");
      }
      // neue Zeile beginnen
      System.out.println();
    }


  }

}
