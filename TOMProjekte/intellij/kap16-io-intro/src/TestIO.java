import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.stream.Stream;

public class TestIO {

  public static void main(String[] args) {
    String current = System.getProperty("user.dir");
    String home = System.getProperty("user.home");
    String tmp = System.getProperty("java.io.tmpdir");
    System.out.println("Heimatverzeichnis      " + home);
    System.out.println("Aktuelles Verzeichnis  " + current);
    System.out.println("Temporäres Verzeichnis " + tmp);

    // Eigenschaften der Datei datei.pdf im Heimatverzeichnis
    // ermitteln
    Path p = Paths.get(home, "datei.pdf");     
    if(Files.exists(p)) {
      try {
        System.out.println("Dateiname: " + p.toAbsolutePath());
        System.out.println("Größe    : " + Files.size(p));
        System.out.println("Besitzer:  " + Files.getOwner(p).getName());
        Instant changeInst = Files.getLastModifiedTime(p).toInstant();
        LocalDateTime changeLdt = LocalDateTime.ofInstant(changeInst, ZoneId.systemDefault());
        System.out.println("Letzte Änderung: " + changeLdt);

        BasicFileAttributes basic = Files.readAttributes(p, BasicFileAttributes.class);
        Instant createInst = basic.creationTime().toInstant();
        LocalDateTime createLdt = LocalDateTime.ofInstant(createInst, ZoneId.systemDefault());
        System.out.println("Erzeugt: " + createLdt);

        // DosFileAttributes dos = Files.readAttributes(p, DosFileAttributes.class);
        // PosixFileAttributes posix = Files.readAttributes(p, PosixFileAttributes.class);
      } catch (IOException ioex) {
        System.out.println("Fehler: " + ioex.getMessage());
      }
    }

    // alle *.pdf-Dateien im Heimatverzeichnis ermitteln
    System.out.println("---");
    Path phome = Paths.get(home);
    try(DirectoryStream<Path> files = Files.newDirectoryStream(phome)) {
      for (Path found : files)
        if(Files.isRegularFile(found) && 
           found.toString().toLowerCase().endsWith(".pdf"))
          System.out.println(found);
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Variante mit list
    System.out.println("---");
    try(Stream<Path> st = Files.list(phome)) {
      st.filter(pth -> Files.isRegularFile(pth))
        .filter(pth -> pth.toString().toLowerCase().endsWith(".pdf"))
        .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
