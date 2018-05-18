import java.util.Random;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Lissajous extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  final int W=600, H=600;
  final int W2=W/2, H2=H/2;

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Lissajous-Figur");
    Canvas canvas = new Canvas(W, H);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    drawShapes(gc);
    StackPane root = new StackPane();
    root.getChildren().add(canvas);
    primaryStage.setScene(new Scene(root));
    primaryStage.show();
  }

  private void drawShapes(GraphicsContext gc) {

    gc.setLineWidth(3);
    
    Random r = new Random();
    int n1 = 11; // 6 + r.nextInt(5);
    int n2 = 12; // 6 + r.nextInt(5);
    double offset1 = r.nextDouble() * 2 * Math.PI;
    double offset2 = r.nextDouble() * 2 * Math.PI;
    
    
    double delta = 0.005;
    
    for(double t=0; t<2*Math.PI+delta; t+=delta) {
      double t0, t1, x0, x1, y0, y1;
      t0 = t;          // t für Startpunkt
      t1 = t+delta;    // t für Endpunkt der Linie
      x0 = W2 + (W2-5) * Math.sin(offset1 + t0 * n1);  // Startpunkt
      y0 = H2 + (H2-5) * Math.sin(offset2 + t0 * n2);
      x1 = W2 + (W2-5) * Math.sin(offset1 + t1 * n1);  // Endpunkt
      y1 = H2 + (H2-5) * Math.sin(offset2 + t1 * n2);
      gc.strokeLine(x0, y0, x1, y1);
      
    }
  
  
  
  }
}
