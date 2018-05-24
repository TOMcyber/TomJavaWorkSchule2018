
public class MinMax {

  public static void main(String[] args) {
    int[] tst = {7, 234, 74, -9, 0, 23};
    System.out.println( findMinimum(tst) );
    System.out.println( findMaximum(tst) );
  }
  
  public static int findMinimum(int[] data) { 
    int min = data[0];
    // Schleife über alle Elemente    
    for(int i : data) {
      if(i<min)
        min=i;
    }
    // Ergebnis zurückgeben
    return min;
  }

  public static int findMaximum(int[] data) { 
    int max = data[0];
    
    for(int i : data) {
      if(i>max)
        max=i;
    }
    
    return max;
  }

  
}
