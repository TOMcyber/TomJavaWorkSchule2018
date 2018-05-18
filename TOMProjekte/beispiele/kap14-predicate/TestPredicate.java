import java.util.function.Predicate;


public class TestPredicate {

  public static void main(String[] args) {
    // Integer-Array mit Zahlen zwischen 1 und 100
    // initialisieren
    Integer[] zahlen = new Integer[100];
    for(int i=0; i<100; i++)
      zahlen[i]=i+1;

    System.out.println(Math.sqrt(11));
    System.out.println(Math.sqrt(11)*Math.sqrt(11));
    
    // Zahlen auswählen
    printNumbers(zahlen, z -> z<10);       // Zahlen kleiner 10
    printNumbers(zahlen, z -> z % 2 == 0); // gerade Zahlen
    printNumbers(zahlen, z -> z == (int)Math.sqrt(z)*(int)Math.sqrt(z)); // Quadrate
    
  }

  // Methode, um per Kriterium ausgewählte Elemente von 'daten' auszugeben
  public static void printNumbers(Integer[] daten, Predicate<Integer> kriterium) {
    for(Integer i : daten)
      if(kriterium.test(i))
        System.out.print(i + " ");
    System.out.println();

  }
  
}
