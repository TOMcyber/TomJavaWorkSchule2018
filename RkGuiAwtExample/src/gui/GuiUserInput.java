package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GuiUserInput {


	//region 1. Decl. and Init Attribute
	
	//Hauptfenster und dessen Layout
	private JFrame mainWindow;
	private FlowLayout mainWindowLayout;
	
	//Buttons
	private JButton btnShowUserInput;
	private JButton btnExit;
	
	//Textfelder
	private JTextField txtUserInput;
	//endregion
	
	
	/**
	 * Konfiguriert und oeffnet die 
	 * GUIUserInput
	 */
	public void openGuiUserInput() {
		
		//1. Generieren aller benoetigten Objekte
		this.mainWindow = new JFrame();
		this.mainWindowLayout = new FlowLayout();
		
		this.btnShowUserInput = new JButton();
		this.btnExit = new JButton();
		
		this.txtUserInput = new JTextField();
		
		//2. Konfigurieren des Hauptfensters
		this.mainWindow.setLayout(this.mainWindowLayout);
		this.mainWindow.setTitle("Show User Input");
		this.mainWindow.setResizable(true);
		
		//3. Konfigurieren der Steuerelemente
		this.btnShowUserInput.setText("Show User Input");
		this.btnExit.setText("Exit");
		
		this.txtUserInput.setColumns(10);
		
		//4. Steuerelement dem Hauptfenster zuweisen REIHENFOLGE BEACHTEN
		this.mainWindow.add(this.btnShowUserInput);
		this.mainWindow.add(this.btnExit);
		this.mainWindow.add(this.txtUserInput);
		
		
		//5. Fenster oeffnen und skalieren
		this.mainWindow.pack();
		this.mainWindow.setVisible(true);
	}
	
}
