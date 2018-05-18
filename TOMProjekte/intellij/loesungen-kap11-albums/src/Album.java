
public class Album {
  String title;
  String interpret;
  Track[] tracks;

  public Album(String title, String interpret, Track[] tracks) {
    this.title = title;
    this.interpret = interpret;
    this.tracks = tracks;
  }

  public double getLength() {
    double total = 0;
    for(Track t : tracks) {
      total += t.length;
    }
    return total;
  }

  public void printInfo() {
    System.out.println("Album: " + title);
    System.out.println("Von:   " + interpret);
    System.out.println("Länge: " + formatTime(getLength()));
    System.out.println();

    int cnt=1;
    for(Track t: tracks) {
      System.out.format("Track %d: %s [%s]\n",
                        cnt ,
                        t.title,
                        formatTime(t.length));
      cnt++;
    }
  }

  // formatiert 3.50 (double) als "3:30"
  private String formatTime(double t) {
    int min = (int)t;
    int sec = (int)((t-min) * 60);
    return String.format("%d:%02d", min, sec);

  }
}
