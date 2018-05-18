import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LoginBox extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  // Steuerelemente, die von mehreren Methoden
  // genutzt werden
  public Label         lblError;
  private TextField     txtLogin;
  private PasswordField txtPw;

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Login");
    Button btnOK     = new Button("OK");
    Button btnCancel = new Button("Abbrechen");
    Label  lblLogin  = new Label("Name:");
    Label  lblPw     = new Label("Passwort:");
    lblError         = new Label();
    txtLogin         = new TextField();
    txtPw            = new PasswordField();

    GridPane grid = new GridPane();
    grid.setHgap(10);  // Abstände zwischen den Spalten
    grid.setVgap(10);  // und Zeilen
    grid.setPadding(new Insets(10));

    grid.add(lblLogin, 0, 0);
    grid.add(lblPw, 0, 1);
    grid.add(txtLogin, 1, 0);
    grid.add(txtPw, 1, 1);
    grid.add(lblError, 0, 2, 2, 1);  // über 2 Spalten

    HBox btnBox = new HBox();
    btnBox.setSpacing(5);
    btnBox.setAlignment(Pos.CENTER_RIGHT);
    btnBox.getChildren().add(btnCancel);
    btnBox.getChildren().add(btnOK);
    grid.add(btnBox, 1, 3);

    btnCancel.setOnAction( (ev) -> Platform.exit() );
    btnOK.setOnAction( (ev) -> {
      if(txtLogin.getText().equals("peter") && 
          txtPw.getText().equals("geheim"))
        Platform.exit();
      else
        lblError.setText("Bitte versuchen Sie es erneut!");
    } );

    primaryStage.setScene(new Scene(grid));
    primaryStage.show();
  } 

  public void checkPassword() {
    if(txtLogin.getText().equals("peter") && 
        txtPw.getText().equals("geheim"))
      Platform.exit();
    else 
      lblError.setText("Bitte versuchen Sie es erneut!");
  }
}