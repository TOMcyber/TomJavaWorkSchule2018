
public class Beispiele {

  public static void main(String[] args) {
    
    // Beispiel 1: Leerzeichen, Klein- und Großbuchstaben zählen
    String satz="Java ist eine tolle Programmiersprache.";
    int anzKlein=0, anzGross=0, anzLeer=0, anzAndere=0;
    for(char c : satz.toCharArray()) {
      if(c==' ')
        anzLeer++;
      else if(Character.isUpperCase(c))
        anzGross++;
      else if(Character.isLowerCase(c))
        anzKlein++;
      else
        anzAndere++;
    }
    System.out.format("Der Satz enthält %d Kleinbuchstaben.\n", anzKlein);
    System.out.format("Der Satz enthält %d Großbuchstaben.\n", anzGross);
    System.out.format("Der Satz enthält %d Leerzeichen.\n", anzLeer);
    System.out.format("Der Satz enthält %d andere Zeichen.\n", anzAndere);

    // Beispiel 2: Pfad und Dateiname trennen
    String bilddatei = "/home/kofler/Bilder/foto.jpeg";
    String pfad, dateiname;
    int pos=bilddatei.lastIndexOf("/");
    if(pos>0) {
      pfad = bilddatei.substring(0, pos+1);
      dateiname = bilddatei.substring(pos+1);
    } else {
      pfad = "";
      dateiname = bilddatei;
    }
    System.out.println("Pfad:  " + pfad);
    System.out.println("Datei: " + dateiname);
    
  }

}
