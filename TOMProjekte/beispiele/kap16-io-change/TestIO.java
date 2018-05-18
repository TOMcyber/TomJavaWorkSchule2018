import java.io.IOException;
import java.nio.file.*;

public class TestIO {

  public static void main(String[] args) {
    String home = System.getProperty("user.home");
    
    Path v1  = Paths.get(home, "verz1");
    Path v23 = Paths.get(home, "verz2", "unterverz3");
    Path v23neu = Paths.get(home, "verz2", "uv3-neu");
    Path d1 = v1.resolve("datei1.tmp");
    Path d2 = v1.resolve("datei2.tmp");
    
    try {
      // Verzeichnisse anlegen
      if(!Files.exists(v1))
        Files.createDirectory(v1);
      if(!Files.exists(v23))
        Files.createDirectories(v23);
      
      // Datei löschen, dann neu erzeugen
      if(Files.exists(d1))
        Files.delete(d1);
      Files.createFile(d1);
      
      // Datei kopieren, evt. vorhandene Datei überschreiben
      Files.copy(d1, d2, StandardCopyOption.REPLACE_EXISTING);
      
      
      // Verzeichnis umbennen
      if(!Files.exists(v23neu))
        Files.move(v23, v23neu);
      
  
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    
    

  }

}
