
public class RandomSample {

  public static void main(String[] args) {
    java.util.Random r = new java.util.Random();
    double x = r.nextDouble();   // zwischen 0.0 (inkl.) und 1.0 (exkl.)
    int i    = r.nextInt(100);   // zwischen 0 und 99
    long n   = r.nextLong();     // gesamter long-Zahlenbereich
    double g = r.nextGaussian(); // normalverteilt (Mittelwert 0, Standardabweichung 1)

    System.out.println(x);
    System.out.println(i);
    System.out.println(n);
    System.out.println(g);
    
    
  }

}
