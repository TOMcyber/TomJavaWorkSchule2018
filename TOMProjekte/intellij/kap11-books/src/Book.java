// Buch-Klasse
public class Book {
  String title;      // Buchtitel
  String author;     // Autor
  Chapter[] chpts;   // Array mit den Kapiteln

  // Konstruktor
  public Book(String title, String author, Chapter[] chpts) {
    this.title = title;
    this.author = author;
    this.chpts = chpts;
  }

  // gesamte Seitenanzahl ermitteln
  public int getPages() {
    int pages=0;
    for(Chapter ch : chpts) {
      pages+=ch.pages;
    }
    return pages;
  }

  // Inhaltsverzeichnis anzeigen
  public void printTOC() {
    System.out.println("Titel:  " + title);
    System.out.println("Autor:  " + author);
    System.out.println("Seiten: " + getPages());
    System.out.println();

    // Startseite für jedes Kapitel
    int currentpage=1;
    for(int i=0; i<chpts.length; i++) {
      System.out.println("* Kapitel " + (i+1) + " beginnt auf Seite " +  currentpage);
      System.out.println("  " +  chpts[i].chpHeader);
      currentpage+=chpts[i].pages;
    }
  }
}
