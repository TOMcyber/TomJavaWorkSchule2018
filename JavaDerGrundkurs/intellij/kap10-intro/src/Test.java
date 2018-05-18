public class Test {
  public static void main(String[] args) {
    try {
      m1();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
 
  public static void m1() {
    m2();
  }
 
  public static void m2() {
    int[] ar = {1, 2, 3};
    int sum = 0;
    for(int i=1; i<=3; i++)  // falsch!
      sum += ar[i];
  }
}
 
