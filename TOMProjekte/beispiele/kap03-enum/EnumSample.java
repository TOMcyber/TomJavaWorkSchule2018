public class EnumSample {
  enum Color {
    RED, GREEN, BLUE, YELLOW, BLACK, WHITE }

  public static void main(String[] args) {
    Color c = Color.GREEN;
    if(c == Color.BLACK)
      System.out.println("schwarz");
  }

}
