package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GuiCustomerAdminstration {

	// //Hauptfenster und dessen Layout
	private JFrame mainWindow;
	private FlowLayout mainWindowLayout;

	// Buttons
	private JButton btnSaveCustomer;
	private JButton btnShowAllCustomers;
	private JButton btnExit;

	private JLabel lblFirstName;
	private JTextField txtCustomerFirstName;
	private JLabel lblLastName;
	private JTextField txtCustomerLastName;
	private JLabel lblCustomerBday;
	private JTextField txtCustomerBday;

	
	public void openGuiCustomerAdministration() {
		// 1. Generieren aller benoetigten Objekte
		this.mainWindow = new JFrame();
		this.mainWindowLayout = new FlowLayout();
		
		this.btnSaveCustomer = new JButton();
		this.btnShowAllCustomers = new JButton();
		this.btnExit = new JButton();
		
		this.lblFirstName = new JLabel();
		this.lblLastName = new JLabel();
		this.lblCustomerBday = new JLabel();
		
		this.txtCustomerFirstName = new JTextField();
		
		
	// 2. Konfigurieren des Hauptfensters
		this.mainWindow.setLayout(this.mainWindowLayout);
		this.mainWindow.setTitle("Show User Input");
		this.mainWindow.setResizable(true);
		
	//3. Konfigurieren der Steuerelemente
		this.btnSaveCustomer.setText("Save Customer");
		this.btnShowAllCustomers.setText("Show all customers");
		this.btnExit.setText("Exit");
		
		this.lblFirstName.setText("First name:");
		this.lblLastName.setText("Last name:");	
		this.lblCustomerBday.setText("Geburtstag");	
		
		this.txtCustomerFirstName.setColumns(10);
		
	//4. Steuerelement dem Hauptfenster zuweisen REIHENFOLGE BEACHTEN
		this.mainWindow.add(this.btnSaveCustomer);
		this.mainWindow.add(this.btnShowAllCustomers);
		this.mainWindow.add(this.btnExit);
		this.mainWindow.add(this.lblFirstName);
		this.mainWindow.add(this.txtCustomerFirstName);
		this.mainWindow.add(this.lblLastName);
		//TODO adden txtLastName
		this.mainWindow.add(this.lblCustomerBday);
		//TODO adden txtBday
			
	//5. Fenster oeffnen und skalieren
		this.mainWindow.pack();
		this.mainWindow.setVisible(true);
		
	}
}
