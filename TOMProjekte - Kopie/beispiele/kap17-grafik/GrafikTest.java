import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.stage.Stage;

public class GrafikTest extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  final int W=400, H=300;
  
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
    // Linien
    // standardmäßig schwarz, 1 Pixel breit 
    gc.strokeLine(10, 10, 200, 20);
    
    // rot, 5 Pixel breit
    gc.setStroke(Color.RED);
    gc.setLineWidth(5);
    gc.strokeLine(10, 30, 200, 40);
    
    // grün, mit runden Endpunkten
    gc.setStroke(Color.GREEN);
    gc.setLineCap(StrokeLineCap.ROUND);
    gc.strokeLine(10, 50, 200, 60);
    
    // einige Kreise
    for(int r=20; r<80; r+=10)
      gc.strokeOval(110-r, 150-r, 2*r, 2*r);
    
    // gefülltes Polygon
    double[] x = new double[] {240, 360, 300, 360, 220};
    double[] y = new double[] {40, 60, 150, 290, 240};
    
    gc.setFill(Color.YELLOW);          // Innenfarbe
    gc.fillPolygon(x, y, x.length);    // Polygon füllen

    gc.setStroke(Color.BLUE);          // Linienfarbe
    gc.setLineJoin(StrokeLineJoin.ROUND);  // runde Ecken
    gc.strokePolygon(x, y, x.length);  // Umrandung
    
  }
}