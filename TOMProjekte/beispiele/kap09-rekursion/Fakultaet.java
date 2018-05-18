
public class Fakultaet {

  public static void main(String[] args) {
    System.out.println( fakultaet(5) );
  }

  public static double fakultaet(int n) {
    if(n<=1)
      return 1.0;
    else
      return n * fakultaet(n-1);
  }
  
}
