import java.util.Arrays;


public class ArrayTest {

  public static void main(String[] args) {
    int[] x = {7, 12, 3, 9};
    m1(x);
    System.out.println(Arrays.toString(x)); 
    // Ausgabe: [14, 24, 6, 18]

    x = m2(5);
    System.out.println(Arrays.toString(x));
    // Ausgabe: [0, 1, 2, 3, 4]
  }

  //Methode m1, verändert ein Array
  public static void m1(int[] ar) {
    for(int i=0; i<ar.length; i++)
      ar[i] *=2;
  }

  //Methode m2, gibt ein Array zurück
  public static int[] m2(int n) {
    int[] ar = new int[n];
    for(int i=0; i<n; i++)
      ar[i] = i;
    return ar;
  }


}
