
public class Kontakt implements Comparable<Kontakt>{
  public String vorname, nachname, telnr;
  
  // Konstruktor
  Kontakt(String vorname, String nachname, String telnr) {
    this.vorname  = vorname;
    this.nachname = nachname;
    this.telnr    = telnr;
  }

  @Override
  public int compareTo(Kontakt o) {
    String name_this = nachname+" "+ vorname;
    String name_other = o.nachname + " " + o.vorname;
    return name_this.compareTo(name_other);
  }
  
  
}
