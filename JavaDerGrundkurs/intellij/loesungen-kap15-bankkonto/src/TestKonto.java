import java.util.*;

public class TestKonto {

  public static void main(String[] args) {
    
    // Konten einrichten
    Map<String, Bankkonto> konten = new HashMap<>();
    konten.put("12323123", new Bankkonto("name1", 100, 0));
    konten.put("12323124", new Bankkonto("name2", 720, 100));
    konten.put("12323125", new Bankkonto("name3", 1250, 0));
    konten.put("12323126", new Bankkonto("name4", 0, 0));
   
    // Schleife über alle Konten
    konten.forEach( (nr, kt) -> 
      System.out.format("Konto %s: Guthaben %.2f\n", 
                        nr, kt.ermittleGuthaben()));
    
    // durchschnittliches Guthaben
    OptionalDouble dguthaben = 
        konten.values().stream()
          .mapToDouble(k -> k.ermittleGuthaben())
          .average();
    System.out.format("Durchschnittsguthaben: %.2f\n",
                      dguthaben.getAsDouble());
    
    // Namen der Kontoinhaber mit mehr als 500 EUR Guthaben
    konten.values().stream()
        .filter(k -> k.ermittleGuthaben()>500)
        .forEach(k -> System.out.println(k.getInhaber()));
  }
}
