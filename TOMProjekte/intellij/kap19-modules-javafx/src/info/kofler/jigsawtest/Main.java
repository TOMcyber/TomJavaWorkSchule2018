package info.kofler.jigsawtest;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  final int MAX = 1000;

  // Fenster zum Zeichnen öffnen
  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Grafik mit JavaFX");
    Canvas canvas = new Canvas(MAX, MAX);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    drawShapes(gc);
    Group root = new Group();
    root.getChildren().add(canvas);
    primaryStage.setScene(new Scene(root));
    primaryStage.show();
  }

  // einfaches Gitternetz zeichnen
  private void drawShapes(GraphicsContext gc) {
    // Linien
    gc.setLineWidth(2);

    for(int i = 0; i <= 1000; i = i + 25) {
      gc.setStroke(Color.BLUE);
      gc.strokeLine(0, 1000 - i, i, 0);
      gc.setStroke(Color.RED);
      gc.strokeLine(0, 1000 - i, 1000 - i, 1000);
      gc.setStroke(Color.GREEN);
      gc.strokeLine(1000, i, 1000 - i, 1000);
      gc.setStroke(Color.YELLOW);
      gc.strokeLine(i, 0, 1000, i);
    }

  }
}