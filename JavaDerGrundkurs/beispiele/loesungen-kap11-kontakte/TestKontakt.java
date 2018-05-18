
public class TestKontakt {

  public static void main(String[] args) {
    // Array zur Speicherung von bis zu 100 Kontaten
    Kontakt[] meineKontakte = new Kontakt[100];
 
    // drei Kontakte mit Daten füllen
    meineKontakte[0] = 
        new Kontakt("Hermine", "Huber", 
            "Lange Gasse 1234, 8010 Graz",
            "+43 664 87878787");
    meineKontakte[1] = 
        new Kontakt("Manfred", "Müller", "",
            "+43 316 3345354");
    meineKontakte[2] = new Kontakt("Simon", "Schmiedt");

    // alle Kontakte ausgeben
    for(Kontakt k : meineKontakte) {
      if(k != null)
        k.print();
    }

  }

}
