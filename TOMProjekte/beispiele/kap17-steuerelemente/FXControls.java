import javafx.application.*;
import javafx.collections.*;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FXControls extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  private TextArea    txtInput;
  private String      fntFamily = "Arial";
  private double      fntSize   = 12;
  private FontWeight  fntBold   = FontWeight.NORMAL;
  private FontPosture fntItalic = FontPosture.REGULAR;

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Steuerelemente");

    // vier RadioButtons erzeugen
    RadioButton rbRed   = new RadioButton("rot");
    RadioButton rbGreen = new RadioButton("grün");
    RadioButton rbBlue  = new RadioButton("blau");
    RadioButton rbBlack = new RadioButton("schwarz");
    RadioButton[] rbAll = new RadioButton[] {rbRed, rbGreen, rbBlue, rbBlack};
    rbBlack.setSelected(true);

    // die vier RadioButtons in eine
    // vertikale Box stellen und zu einer
    // Gruppe zusammenfassen
    final ToggleGroup colorGroup = new ToggleGroup();
    VBox colorBox = new VBox();
    for(RadioButton rb : rbAll) { 
      colorBox.getChildren().add(rb);
      rb.setToggleGroup(colorGroup);
      rb.setOnAction((ev) -> setColor(ev));
    }
    colorBox.setSpacing(5);  // Abstand zw. den Elementen
    colorBox.setPadding(new Insets(5));  // innerer Rand

    // zwei CheckBoxes erzeugen
    CheckBox cbBold   = new CheckBox("fett");
    CheckBox cbItalic = new CheckBox("kursiv");
    cbBold.setOnAction((ev) -> setBold(ev));
    cbItalic.setOnAction((ev) -> setItalic(ev));
    VBox fontBox = new VBox();
    fontBox.getChildren().add(cbBold);
    fontBox.getChildren().add(cbItalic);
    fontBox.setSpacing(5);  // Abstand zw. den Elementen
    fontBox.setPadding(new Insets(5));  // innerer Rand
    
    // Listenfeld und Label für Schriftgröße
    Label lblSize = new Label("Schriftgröße");
    ObservableList<String> options = 
        FXCollections.observableArrayList(
            "10", "12", "15", "18", "24", "36");
    ComboBox<String> cmbSize = new ComboBox<>(options);
    cmbSize.setValue("12");
    cmbSize.setOnAction((ev) -> setSize(ev));

    VBox sizeBox = new VBox();
    sizeBox.getChildren().add(lblSize);
    sizeBox.getChildren().add(cmbSize);
    sizeBox.setSpacing(5);  // Abstand zw. den Elementen
    sizeBox.setPadding(new Insets(5));  // innerer Rand

    // Steuerelemente nebeneinander anordnen
    HBox controlBox = new HBox();
    controlBox.getChildren().add(colorBox);
    controlBox.getChildren().add(fontBox);
    controlBox.getChildren().add(sizeBox);
    HBox.setHgrow(colorBox, Priority.ALWAYS); 
    HBox.setHgrow(sizeBox, Priority.ALWAYS);
    sizeBox.setAlignment(Pos.TOP_RIGHT);
    
    
    // Textfeld
    txtInput = new TextArea("erste Zeile\nzweite Zeile");
    changeTxtFont();

    // alles zusammenbauen
    BorderPane all = new BorderPane();
    all.setBottom(controlBox);  // Steuerelementen unten
    all.setCenter(txtInput);    // den Rest füllt das Textfeld

    // Fenster erzeugen
    primaryStage.setScene(new Scene(all, 400, 200));
    primaryStage.show();
  }

  // Farbe einstellen
  public  void setColor(Event ev) {
    RadioButton rb = (RadioButton)ev.getSource();
    if(rb.getText().equals("grün"))
      txtInput.setStyle("-fx-text-fill: green;");
    else if(rb.getText().equals("blau"))
      txtInput.setStyle("-fx-text-fill: blue;");
    else if(rb.getText().equals("rot"))
      txtInput.setStyle("-fx-text-fill: red;");
    else if(rb.getText().equals("schwarz"))
      txtInput.setStyle("-fx-text-fill: black;");

  }

  // Schriftgröße einstellen
  public void setSize(Event ev) {
    @SuppressWarnings("unchecked")
    ComboBox<String> cb = (ComboBox<String>)ev.getSource();
    String size = cb.getValue().toString();
    fntSize = Integer.valueOf(size);
    changeTxtFont();
  }

  // Schrift fett/kursiv setzen
  public void setBold(Event ev) {
    CheckBox chb = (CheckBox)ev.getSource();
    fntBold = chb.isSelected() ? FontWeight.BOLD : FontWeight.NORMAL;
    changeTxtFont();
  }
  public void setItalic(Event ev) {
    CheckBox chb = (CheckBox)ev.getSource();
    fntItalic = chb.isSelected() ? FontPosture.ITALIC : FontPosture.REGULAR;
    changeTxtFont();
  }

  // Font des TextArea-Steuerelements neu einstellen
  public void changeTxtFont() {
    txtInput.setFont(Font.font(fntFamily, fntBold, fntItalic, fntSize));
  }
}