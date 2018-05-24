import java.util.*;


public class MapTest {

  public static void main(String[] args) {
    Map<String, Book> books = new HashMap<String, Book>();
    books.put("978-3-8362-3775-8", 
      new Book("Linux -- Das umfassende Handbuch", 2015));
    books.put("978-3-8362-3778-9", 
      new Book("Linux-Kommandoreferenz", 2016));
    books.put("978-3-8362-4220-2", 
      new Book("Raspberry Pi -- Das umfassende Handbuch",  2016));
    
    // Schleife über alle Keys
    for(String isbn: books.keySet()) {
      Book b = books.get(isbn);
      System.out.format("ISBN: %s\n", isbn);
      System.out.format("  %s (%d)\n", b.title, b.published);
    }

    // Schleife über Values
    for(Book b: books.values()) {
      System.out.format("%s (%d)\n", b.title, b.published);
    }

    // Schleife über Values + Keys gemeinsam
    for(Map.Entry<String, Book> e: books.entrySet()) {
      System.out.format("ISBN: %s\n", e.getKey());
      Book b = e.getValue();
      System.out.format("  %s (%d)\n", b.title, b.published);
    }

    // Schleife mit forEach
    books.forEach( (isbn, b) -> {
      System.out.format("ISBN: %s\n", isbn);
      System.out.format("  %s (%d)\n", b.title, b.published); } );
  }

}
