import java.util.Random;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ZufallsGrafik extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  final int W=700, H=500;

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Grafik mit JavaFX");
    Canvas canvas = new Canvas(W, H);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    drawShapes(gc);
    Group root = new Group();
    root.getChildren().add(canvas);
    primaryStage.setScene(new Scene(root));
    primaryStage.show();
  }

  private void drawShapes(GraphicsContext gc) {

    Random r = new Random();
    double xpts[] = new double[10];
    double ypts[] = new double[10];

    gc.setLineWidth(3);

    for(int i=0; i<500; i++) {
      int n = 4 + r.nextInt(5); // 4 bis 8 Punkte
      int x0 = r.nextInt(W-50);
      int y0 = r.nextInt(H-50);
      for(int j=0; j<n; j++) {
        xpts[j] = x0 + r.nextInt(50);
        ypts[j] = y0 + r.nextInt(50);
      }
      gc.setStroke(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
      gc.setFill(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
      gc.fillPolygon(xpts, ypts, n);
      gc.strokePolygon(xpts, ypts, n);
    }
  }
}