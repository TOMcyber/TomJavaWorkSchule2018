
public class TestRechteck {

  public static void main(String[] args) {
    // ein Rechteck-Objekt erzeugen
    Rechteck r1 = new Rechteck();
    r1.laenge=17;
    r1.breite=12;
    System.out.format("Fläche: %f\n", r1.berechneFlaeche());
    System.out.format("Umfang: %f\n", r1.berechneUmfang());
    
    // ein Array mit vielen Rechtecken
    Rechteck[] rechtecke = new Rechteck[10];
    for(int i=0; i<10; i++) {
      rechtecke[i] = new Rechteck();
      rechtecke[i].laenge=12+i;
      rechtecke[i].breite=7+i;
      System.out.format(
        "Rechteck %d hat den Flächeninhalt %f\n", 
        i, rechtecke[i].berechneFlaeche());
    }
    
  }

}
