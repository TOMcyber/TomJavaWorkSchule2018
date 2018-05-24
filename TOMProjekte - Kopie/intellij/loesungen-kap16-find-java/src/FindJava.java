import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FindJava {

  public static void main(String[] args) {
    // Startverzeichnis = Home-Verzeichnis
    String current = System.getProperty("user.home");
    Path startverzeichnis = Paths.get(current);

    // ausgehend vom Startverzeichnis die ganze Festplatte nach Java-Dateien
    // durchsuchen
    long groesseJava = durchsucheEinVerzeichnis(startverzeichnis);
    System.out.print("Die Gesamtgröße aller Java-Dateien beträgt ");
    System.out.println(groesseJava / 1024 + " kByte.");
    
  }
  
  // durchsucht ein Verzeichnis nach *.java-Dateien und summiert
  // die Größe der gefundenen Dateien; ruft sich selbst rekursiv
  // für alle Unterverzeichnisse auf
  public static long durchsucheEinVerzeichnis(Path start) {
    // hier speichern wir den Platzbedarf der gefundenen Java-Dateien
    long gesamt=0;
    
    // DirectoryStream<Path> verhält sich ähnlich wie ein Array
    // von Path-Objekten, also Path[]; enthält Objekte, die
    // die Dateien und Unterverzeichnisse des aktuellen Verzeichnisses beschreiben
    try(DirectoryStream<Path> files = 
        Files.newDirectoryStream(start)) {
      
      // Scheife über alle gefundenen Path-Objekte
      for(Path p : files) {
        if(Files.isDirectory(p)) {
          // rekursiver Aufruf von 'durchsucheEinVerzeichnis' für 
          // die Unterverzeichnisse; der Rückgabewert ist der Speicher-
          // bedarf aller Java-Dateien in den Unterverzeichnissen
          gesamt += durchsucheEinVerzeichnis(p);
        }
        else if(Files.isRegularFile(p)) {
          if(p.toString().endsWith(".java")) {
            System.out.println("Java-Datei " + p.toString());
            gesamt += Files.size(p);
          }
        }
      }
    } catch (IOException e) {
      // wir wollen die Fehlermeldungen gar nicht alle sehen
      // e.printStackTrace();
    }
    return gesamt;
  }

}
