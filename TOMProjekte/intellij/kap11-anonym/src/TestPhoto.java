import java.io.File;
import java.io.FilenameFilter;


public class TestPhoto {

  public static void main(String[] args) {
    // Heimatverzeichnis ermitteln
    String homedir = System.getProperty("user.home");

    // Photo-Objekt erzeugen
    Photo ph = new Photo(new File(homedir));

    // alle JPEG-Dateien im Heimatverzeichnis ermitteln
    File[] pictures = ph.getPictures();
    for(File f: pictures)
      System.out.println(f.getAbsolutePath());


    // alle JPEG-Dateien im Heimatverzeichnis ermitteln
    System.out.println("-----");
    pictures = ph.getPicturesAnonym();
    for(File f: pictures)
      System.out.println(f.getAbsolutePath());

    // alle JPEG-Dateien im Heimatverzeichnis ermitteln
    System.out.println("-----");
    pictures = ph.getPicturesLambda();
    for(File f: pictures)
      System.out.println(f.getAbsolutePath());
    
  }

}
