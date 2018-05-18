import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Sinus extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  final int XMAX=800, YMAX=500;
  
  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Sinus-Funktion");
    Group root = new Group();
    Canvas canvas = new Canvas(XMAX, YMAX);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    drawSinus(gc);
    root.getChildren().add(canvas);
    primaryStage.setScene(new Scene(root));
    primaryStage.show();
  }

  private void drawSinus(GraphicsContext gc) {
    double y0=YMAX/2.0;  // Position von (0,0) am Bildschirm
    double x0=50;

    // Koordinatenkreuz zeichnen
    gc.setStroke(Color.BLACK);
    gc.setLineWidth(2);
    gc.strokeLine(0, y0, XMAX, y0);
    gc.strokeLine(x0, 0, x0, YMAX);

    // Funktionsverlauf zeichnen
    gc.setStroke(Color.RED);
    double delta=0.1;
    double scalex=(XMAX-x0)/10;
    double scaley=-YMAX/2;
    for(double xstart=-1; xstart<10-delta; xstart+=delta) {
      double xend=xstart+delta;
      gc.strokeLine(
          x0 + xstart * scalex, 
          y0 + Math.sin(xstart) * scaley,
          x0 + xend * scalex,
          y0 + Math.sin(xend) * scaley);
    }
  }
}