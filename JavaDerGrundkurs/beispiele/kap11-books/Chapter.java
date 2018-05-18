// Kapitel-Klasse
public class Chapter {
  String chpHeader;  // die Überschrift des Kapitels
  int pages;         // die Anzahl der Seiten
  String txt;        // der Text des Kapitels

  // Konstruktor
  public Chapter(String chpHeader, int pages, String txt) {
    this.chpHeader = chpHeader;
    this.pages = pages;
    this.txt = txt;
  }
}
