
public class TestKonto {

  public static void main(String[] args) {
    // Konto-Klasse testen   
    Bankkonto meinBankkonto = 
        new Bankkonto("Michael Kofler", 100, 0);
    meinBankkonto.einzahlen(250);
    meinBankkonto.zeigeInfo();
    meinBankkonto.abheben(50);
    meinBankkonto.zeigeInfo();
    meinBankkonto.abheben(10000);
    meinBankkonto.zeigeInfo();
  }
}
