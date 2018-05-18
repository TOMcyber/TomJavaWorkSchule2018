
public class Quadrat {

  public static void main(String[] args) {
    // Standardeingabe lesen
    java.util.Scanner scan = 
        new java.util.Scanner(System.in);
    System.out.print("Geben Sie eine ganze Zahl ein: ");
    long zahl = scan.nextLong();
    scan.close();
    
    // Zeichenkette in long-Zahl umwandeln
    System.out.println("Eingabe: " + zahl);
    System.out.println("Quadrat: " + zahl*zahl);
  }


}
