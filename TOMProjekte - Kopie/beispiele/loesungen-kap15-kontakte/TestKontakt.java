import java.util.*;

public class TestKontakt {

  public static void main(String[] args) {
    // Array zur Speicherung von bis zu 100 Kontaten
    List<Kontakt> meineKontakte = new ArrayList<>();

    // drei Kontakte mit Daten füllen
    meineKontakte.add( 
        new Kontakt("Hermine", "Huber", 
            "Lange Gasse 1234, 8010 Graz",
            "+43 664 87878787"));
    meineKontakte.add( 
        new Kontakt("Manfred", "Müller", "",
            "+43 316 3345354"));
    meineKontakte.add(new Kontakt("Simon", "Schmiedt"));

    // alle Kontakte ausgeben
    meineKontakte.forEach(k -> k.print());
    
    // oder mit Referenz auf Methode
    meineKontakte.forEach(Kontakt::print);
    

  }

}
