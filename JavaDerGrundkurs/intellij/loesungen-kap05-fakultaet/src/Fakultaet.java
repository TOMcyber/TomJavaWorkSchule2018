
public class Fakultaet {

  public static void main(String[] args) {
    long f=1;
    double df=1;
    for(int i=1; i<=30; i++) {
      f=f*i;
      df=df*i;
      System.out.println("Die Fakultät von " + i + " ist: " + f);
      System.out.println("Die Fakultät von " + i + " ist: " + df);
      System.out.println();
    }
  }

}
