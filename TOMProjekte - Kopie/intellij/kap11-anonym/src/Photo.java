import java.io.*;

class Photo {
  File basedir;

  // Konstruktor
  public Photo(File basedir) {
    this.basedir = basedir;
  }

  // Methode, die alle JPEG-Dateien zurückgibt
  public File[] getPictures() {
    PicFilter pf = new PicFilter();
    return basedir.listFiles(pf);
  }

  // geschachtelte Klasse picFilter zum Filtern von JPEG-Dateien
  class PicFilter implements FilenameFilter {
    public boolean accept(File f, String s) {
      return s.toLowerCase().endsWith(".jpg") ||
          s.toLowerCase().endsWith(".jepg");
    }
  }

  // wie getPictures, aber mit einer anonymen
  // statt mit einer lokalen Klasse
  public File[] getPicturesAnonym() {
    FilenameFilter pf = new FilenameFilter() {
      public boolean accept(File f, String s) {
        return s.toLowerCase().endsWith(".jpg") || 
            s.toLowerCase().endsWith(".jepg");
      }
    };
    return basedir.listFiles(pf);
  }

  //wie getPictures, aber mit einem Lambda-Ausdruck
  public File[] getPicturesLambda() {
    FilenameFilter pf = (File f, String s) ->
       s.toLowerCase().endsWith(".jpg") || 
       s.toLowerCase().endsWith(".jepg");
    return basedir.listFiles(pf);
  }


}
