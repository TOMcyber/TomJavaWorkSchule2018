
public class TestRechteck {

  public static void main(String[] args) {
    // ein Rechteck-Objekt erzeugen
    Rechteck r1 = new Rechteck();
    System.out.format("Fläche: %f\n", r1.berechneFlaeche());
    System.out.format("Umfang: %f\n", r1.berechneUmfang());
    
    // ein Array mit vielen Rechtecken
    Rechteck[] rechtecke = new Rechteck[10];
    for(int i=0; i<10; i++) {
      rechtecke[i] = new Rechteck(12+i, 7+i);
      System.out.format(
        "Rechteck %d hat den Flächeninhalt %f\n", 
        i, rechtecke[i].berechneFlaeche());
    }
    
  }

}
