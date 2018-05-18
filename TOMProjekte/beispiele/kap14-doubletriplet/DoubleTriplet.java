// Klasse zur Verarbeitung von drei Double-Objekten
public class DoubleTriplet {
  public double a, b, c;

  public DoubleTriplet(double data1, double data2, double data3) {
    a = data1; 
    b = data2;
    c = data3;
  }

  public void printout() {
    System.out.format("[%f, %f, %f]\n", a, b, c);
  }

  public void printoutDetail() {
    System.out.format("Triplet a=%f, b=%f, c=%f, len=%f\n", 
        a, b, c, Math.sqrt(a*a + b*b + c*c));
  }
}
