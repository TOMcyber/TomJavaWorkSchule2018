
public class Schleife {

  public static void main(String[] args) {
    double start=125, ende=160, x;
    int schritte=11;
    double delta=(ende-start) / (schritte-1);

    for(int n=0; n<schritte; n++) {
      x = start + delta * n;
      System.out.println(x);
    }

  }

}
