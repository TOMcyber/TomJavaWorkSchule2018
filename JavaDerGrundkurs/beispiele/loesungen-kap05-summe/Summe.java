
public class Summe {

  public static void main(String[] args) {
    double summe=0;
    for(int n=2; n<=30; n++) {
      summe += 1.0 / (n*n); 
    }
    System.out.println(summe);

  }

}
