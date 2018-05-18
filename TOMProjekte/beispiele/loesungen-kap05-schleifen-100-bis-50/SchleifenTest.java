
public class SchleifenTest {

  public static void main(String[] args) {
    int i;

    // mit for
    for(i=100; i>=50; i-=5) {
      System.out.println(i);
    }

    // mit while
    i=100;
    while(i>=50) {
      System.out.println(i);
      i-=5;
    }
    
    // mit do-while
    i=100;
    do {
      System.out.println(i);
      i-=5;
    } while(i>=50);
  }
}
