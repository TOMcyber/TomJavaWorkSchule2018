import java.util.Arrays;


public class TestKontakt {

  public static void main(String[] args) {
    Kontakt[] kontakte = new Kontakt[4];
    
    kontakte[0] = new Kontakt("Martin", "Müller", "123");
    kontakte[1] = new Kontakt("Peter", "Berger", "325234");
    kontakte[2] = new Kontakt("Gabi", "Gruber", "324123");
    kontakte[3] = new Kontakt("Andrea", "Ert", "123423");
    
    Arrays.sort(kontakte);
    for(Kontakt k : kontakte)
      System.out.println(k.nachname + " " + k.vorname);
    
    
  }

}
