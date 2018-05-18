
public class Intro {

  // Startpunkt des Programms
  public static void main(String[] args) {
    System.out.println("In main()");
    m1();   // Aufruf der Methode m1
    System.out.println("Wieder in main()");
  }

  // Methode m1
  public static void m1() {
    System.out.println("In m1()");
    int ergebnis = m2(7, 12);
    System.out.println("Ergebnis: " + ergebnis);
  }

  // Methode m2
  public static int m2(int a, int b) {
    System.out.println("In m2()");
    if(a>b)
      return a*b;
    else
      return a+2*b;
  }
  
}
