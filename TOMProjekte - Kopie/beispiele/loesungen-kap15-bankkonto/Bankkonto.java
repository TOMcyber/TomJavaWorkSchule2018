
public class Bankkonto {
  // Instanzvariablen
  private String inhaber;
 

  private double guthaben;
  private double rahmen;

  // die Konstruktoren
  public Bankkonto(String name) {
    this(name, 0, 0);
  }
  public Bankkonto(String name, double startguthaben) {
    this(name, startguthaben, 0);
  }
  public Bankkonto(String name, double startguthaben,
      double rahmen) {
    inhaber = name;
    guthaben = startguthaben;
    this.rahmen = rahmen;
  }

  // Methoden
  public double ermittleGuthaben() {
    return guthaben;
  }

  public void einzahlen(double betrag) {
    guthaben = guthaben + betrag;
  }

  // abheben: liefert true zurück, wenn OK, sonst false
  public boolean abheben(double betrag) {
    if(guthaben + rahmen >= betrag) {
      guthaben = guthaben - betrag;
      return true;
    } else {
      System.out.println("Leider zuwenig Geld auf dem Konto!");
      return false;
    }
  }

  // Kontodaten anzeigen
  public void zeigeInfo() {
    System.out.println("Dieses Konto gehört " + inhaber);
    System.out.println(
        "  Das Guthaben beträgt " + guthaben + " Euro.");
    System.out.println(
        "  Der Überziehungsrahmen beträgt " + rahmen + " Euro.");
  }
  
  // neue getter-Methode für Inhaber
  public String getInhaber() {
    return inhaber;
  }

}
