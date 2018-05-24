import java.time.LocalDateTime;


public class Termin {
  public String beschreibung;
  public String ort;
  public LocalDateTime zeit;
  
  public Termin(String was, String wo, LocalDateTime wann) {
    beschreibung=was;
    ort=wo;
    zeit=wann;
  }
}
