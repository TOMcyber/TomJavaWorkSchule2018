import java.util.*;

public class StreamTest {

  public static void main(String[] args) {
    String lorem = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";
    List<String> lst = Arrays.asList(lorem.split(" "));

    // alle Wörter mit mehr als sechs Zeichen ausgeben
    // Ausgabe: consetetur sadipscing invidunt aliquyam 
    //              voluptua. accusam dolores gubergren, ...
    lst.stream()
      .filter( s -> s.length()>6 )
      .forEach( s -> System.out.println(s) );

    // alle Wörter mit mehr als sechs Zeichen zählen (ohne Doppelgänger)
    long n = lst.stream()
        .filter(s -> s.length()>6)
        .distinct()
        .count();
    System.out.println(n);

    // durchschnittliche Wortlänge  
    OptionalDouble avg = lst.stream()
        .mapToInt(s -> s.length())
        .average();
    System.out.println(avg.getAsDouble());

    // Liste der Zahlen 1 bis 10
    List<Integer> zahlen = new ArrayList<>();
    for(int i=1; i<=10; i++)
      zahlen.add(i);

    // Quadrate bilden und ausgeben
    zahlen.stream().map(i -> i*i).forEach(System.out::println);

    // Summe und Fakultät
    Optional<Integer> summe = zahlen.stream().reduce((i1, i2) -> i1+i2);
    System.out.println(summe.get());
    Optional<Integer> fakultaet = zahlen.stream().reduce((i1, i2) -> i1*i2);
    System.out.println(fakultaet.get());
    
  }

}
