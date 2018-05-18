
public class ArraySinus {
  public static void main(String[] args) {
    double data[] = new double[1000];
    for(int x=0; x<1000; x++) {
      data[x] = Math.sin(x/100.0);
    }
  }
}
