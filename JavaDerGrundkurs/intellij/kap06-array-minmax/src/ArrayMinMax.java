
public class ArrayMinMax {

  public static void main(String[] args) {
    int x[] = {43, 6, 12, 8};

    // Minimum
    int i, min=x[0];
    for(i=1; i<x.length; i++) {
      if(x[i]<min) {
        min=x[i];
      }
    }
    System.out.println("Minimum: " + min);

    // Maximum
    int max=x[0];
    for(i=1; i<x.length; i++)
      if(x[i]>max)
        max=x[i];
    System.out.println("Maximum: " + max);

    // Durchschnitt
    long summe=0;
    for(i=0; i<x.length; i++)
      summe+=x[i];
    double durchschnitt = (double)summe / x.length;
    System.out.println("Durchschnitt: " + durchschnitt);
  }
}
