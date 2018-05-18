
public class Kontakt {
  String vorname;
  String nachname;
  String adresse;
  String telnr;

  // Konstruktor zur Initialisierung eines vollständigen Kontakts
  public Kontakt(String vorname, String nachname,
      String adresse, String telnr)  {
    this.vorname  = vorname;
    this.nachname = nachname;
    this.adresse  = adresse;
    this.telnr    = telnr;
  }

  // alternativer Konstruktor zur Initialisierung eines Kontakts,
  // wenn nur Vor- und Nachname gegeben sind
  public Kontakt(String vorname, String nachname) {
    this.vorname  = vorname;
    this.nachname = nachname;
    this.adresse  = "";
    this.telnr    = "";
  }


  // Kontaktdaten, soweit vorhanden, ausgeben
  public void print() {
    System.out.println(vorname + " " + nachname);
    if(adresse.length() > 0)
      System.out.println(adresse);
    if(telnr.length() > 0)
      System.out.println(telnr);
    System.out.println("---");
    System.out.println();
  }

}
