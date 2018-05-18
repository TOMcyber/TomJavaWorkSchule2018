public class Main {

  // Buch- und Kapitel-Klassen testen
  public static void main(String[] args) {
    Chapter c1 =
            new Chapter("Ein Junge ...", 20, "Lorem ipsum ...");
    Chapter c2 =
            new Chapter("Ein Fenster ...", 30, "Lorem ipsum ...");
    Chapter c3 =
            new Chapter("Briefe von ...", 26, "Lorem ipsum ...");
    Chapter[] allChpts = {c1, c2, c3};
    Book b = new Book("Harry Potter", "JK Rowlings", allChpts);

    b.printTOC();
  }
}
