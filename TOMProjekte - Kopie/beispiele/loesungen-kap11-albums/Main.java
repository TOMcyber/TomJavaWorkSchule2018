public class Main {

  public static void main(String[] args) {
    Track t1 = new Track("Speak to Me", "dsotm-1.mp3", 3.95);
    Track t2 = new Track("On the Run", "dsotm-2.mp3", 3.52);
    Track t3 = new Track("Time", "dsotm-3.mp3", 7.08);
    Track[] alltracks = {t1, t2, t3};

    Album darkside = new Album("The Dark Side of the Moon",
            "Pink Floyd",
            alltracks);
    darkside.printInfo();

  }
}
