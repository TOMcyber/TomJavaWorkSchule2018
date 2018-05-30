import java.io.*;
public class Test {
  // Gepufferter Eingabestrom ueber den Standardeingabestrom System.in
  public static BufferedReader 
    in = new BufferedReader(new InputStreamReader(System.in));
  // Methode zum Einlesen von double-Werten
  public static double readDouble() {
    double erg = 0;
    try{
        erg = Double.parseDouble(in.readLine());
    } catch(Exception e){
        System.out.println(e);
    }
    return erg;
  }
  // main-Methode
  public static void main(String[] args) {
    System.out.print("double-Wert eingeben: d = ");
    double d = readDouble();
    System.out.println("d = " + d + " wurde eingelesen");
  }
}
