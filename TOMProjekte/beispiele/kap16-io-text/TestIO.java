import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.*;


public class TestIO {

  public static void main(String[] args) {
    String current = System.getProperty("user.dir");
    Path txtfile = Paths.get(current, "test.txt");

    // Textausgabe mit einem BufferedWriter
    try(BufferedWriter bw = 
        Files.newBufferedWriter(txtfile, 
            StandardOpenOption.APPEND,
            StandardOpenOption.CREATE)) {
      bw.write(LocalDateTime.now() + "\n");
      bw.write("Hello BufferedWriter!\n");
      bw.write("äöü\n");
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // Textausgabe mit write
    String[] txt = {"Noch", "mehr", "Text."};
    List<String> txtlist = Arrays.asList(txt);
    try {
      Files.write(txtfile, txtlist, StandardOpenOption.APPEND);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // Textdatei mit BufferedReader lesen
    try(BufferedReader br = 
        Files.newBufferedReader(txtfile)) {
      String line;
      while((line=br.readLine()) != null)
        System.out.println(line);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // Textdatei mit readAllLines lesen
    System.out.println("-----");
    try {
      List<String> all = Files.readAllLines(txtfile);
      all.stream().forEach(System.out::println);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // Textdatei mit lines lesen
    System.out.println("-----");
    try {
      Files.lines(txtfile)
        .limit(3)
        .forEach(System.out::println);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    
    // Textdatei im Cp1252-Zeichensatz schreiben und lesen
    System.out.println("-----");
    Path winfile = Paths.get(current, "cp1252.txt");
    String[] msg = {"Text", "mit", "Umlauten:", "äöüß"};
    List<String> msglist = Arrays.asList(msg);
    try {
      Files.write(winfile, msglist, Charset.forName("windows-1252"));
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    try {
      Files.lines(winfile, Charset.forName("windows-1252"))
           .forEach(System.out::println);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

  }

}
