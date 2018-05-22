package gui;

	
	import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
	
	public class GuiUserInput {
		
	//region 1. Decl and Init Attribute
		
	// Hauptfenster und dessen Layout
	private JFrame mainWindow;
	private FlowLayout mainWindowLayout;
			
	// Buttons
	private JButton btnShowUserInput;
	private JButton btnExit;
	
	private JLabel labelUserInput;
	
	/**
	 * Nimmt die Usereingabe entgegen
	 */
	
	// Textfelder
	private JTextField txtUserInput;
	// Endregion
	
	
	/**
	 * Konfiguriert und oeffnet die
	 * GUIUserInput
	 */
	public void openGuiUserInput() {
		
		//1. Generieren aller benötigten Objekte
		this.mainWindow = new JFrame();
		this.mainWindowLayout = new FlowLayout();
		
		this.btnShowUserInput = new JButton();
		this.btnExit = new JButton();
		
		this.labelUserInput = new JLabel();
		
		
		this.txtUserInput = new JTextField();
		
		//2. Konfigurieren des Hauptfensters
		this.mainWindow.setLayout(this.mainWindowLayout);
		this.mainWindow.setTitle("Show user input");
		this.mainWindow.setResizable(true);
		
		//3. Konfigurieren der Steuerelemente
		this.btnShowUserInput.setText("Show User Input");
		this.btnExit.setText("Exit");
		
		this.labelUserInput.setText("Please Enter a text in the TextField: ");
		
		this.txtUserInput.setColumns(50);
		
		// 4. Steuerelement dem Hauptfenster zuweisen REIHENFOLGE BEACHTEN
		this.mainWindow.add(this.btnShowUserInput);
		this.mainWindow.add(this.btnExit);
		this.mainWindow.add(this.labelUserInput);
		this.mainWindow.add(this.txtUserInput);
		
		
		// 5. Listener generieren
		this.btnShowUserInput.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Springt hier rein wenn btnExit geklickt wird
				String userInput = txtUserInput.getText();
				
				if (!userInput.isEmpty()) {
					JOptionPane.showMessageDialog(null,  "Your Input is: " + userInput);
				} else {
					JOptionPane.showMessageDialog(null,  "Please Enter an text :)");
					
				}
				
				
				
				
			}
		});
		
		this.btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Springt hier rein wenn btnExit geklickt wird
				
				int closeDialogResult = JOptionPane.showConfirmDialog(null, "Would like to exit application?");
				
				if (closeDialogResult == JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
		});
		
		// 6. Fenster oeffnen und skalieren
		this.mainWindow.pack();
		this.mainWindow.setVisible(true);
		
		
	}
	
	
	}
