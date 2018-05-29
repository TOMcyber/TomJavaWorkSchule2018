package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import models.Customer;
import recources.IntegerResources;
import recources.TextResources;

/**
 * Nimmt die Eingabedaten<br>
 * eines {@link Customer}s<br>
 * entgegen. Und leitet das<br>
 * Speichern in einer CSV-Datei ein.<br>
 * Liest die Daten bei Bedarf wieder aus.<br>
 * 
 * @author Alfa-Dozent
 *
 */
public class GuiCustomerAdministration {

	// region 1. Decl. and Init Attribute

	private JFrame			mainWindow;
	private FlowLayout		mainWindowLayout;

	private JButton			btnSaveCustomer;
	private JButton			btnShowAllCustomers;
	private JButton			btnExit;

	private JLabel			lblFirstName;
	private JLabel			lblLastName;
	private JLabel			lblBday;

	private JTextField		txtCustomerFirstName;
	private JTextField		txtCustomerLastName;
	private JTextField		txtCustomerBday;

	private List<Customer>	customerList;

	// endregion

	// region 2. Oeffnen der GUI

	public void openGuiCustomerAdministration() {
		// 1. Generieren aller GUI-Objekte
		this.mainWindow = new JFrame();
		this.mainWindowLayout = new FlowLayout();

		this.btnSaveCustomer = new JButton();
		this.btnShowAllCustomers = new JButton();
		this.btnExit = new JButton();

		this.lblFirstName = new JLabel();
		this.lblLastName = new JLabel();
		this.lblBday = new JLabel();

		this.txtCustomerFirstName = new JTextField();
		this.txtCustomerLastName = new JTextField();
		this.txtCustomerBday = new JTextField();

		// 2. Konfiguration Hauptfenster
		this.mainWindow.setLayout(this.mainWindowLayout);
		this.mainWindow.setTitle(TextResources.APPLICATION_NAME);
		this.mainWindow.setSize(300, 300);
		this.mainWindow.setResizable(false);

		// 3. Konfigurieren der Steuerelemente/UI-Elemente/Widgets
		this.btnSaveCustomer.setText(TextResources.SAVE_CUSTOMER_TEXT);
		this.btnShowAllCustomers.setText(TextResources.SHOW_ALL_CUSTOMERS_TEXT);
		this.btnExit.setText(TextResources.EXIT_APPLICATION_TEXT);

		this.lblFirstName.setText(TextResources.FIRST_NAME_TEXT);
		this.lblLastName.setText(TextResources.LAST_NAME_TEXT);
		this.lblBday.setText(TextResources.BIRTHDAY_TEXT);

		this.txtCustomerFirstName.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
		this.txtCustomerLastName.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
		this.txtCustomerBday.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);

		// 4. Steuerlemente zum Hauptfenster hinzufuegen
		this.mainWindow.add(this.btnSaveCustomer);
		this.mainWindow.add(this.btnShowAllCustomers);
		this.mainWindow.add(this.btnExit);

		this.mainWindow.add(this.lblFirstName);
		this.mainWindow.add(this.txtCustomerFirstName);

		this.mainWindow.add(this.lblLastName);
		this.mainWindow.add(this.txtCustomerLastName);

		this.mainWindow.add(this.lblBday);
		this.mainWindow.add(this.txtCustomerBday);

		// 5. Liste generieren
		this.customerList = new ArrayList<>();

		//6. Listener geneireren
		this.btnSaveCustomer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String firstName = txtCustomerFirstName.getText();
				String lastName = txtCustomerLastName.getText();
				String bday = txtCustomerBday.getText();
				
				boolean userInputIsValid = true;

	
				if (firstName.isEmpty() || 
						lastName.isEmpty() || 
						bday.isEmpty()) {
					
					userInputIsValid = false;
				}
				
				if(userInputIsValid) {
					customerList.add(new Customer(firstName, lastName, bday));
					
					JOptionPane.showMessageDialog(null,
							TextResources.USER_MSG_SAVED_CUSTOMER_SUCCESSFULLY, 
							TextResources.SAVED_TEXT, JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, TextResources.USER_MSG_FILL_IN_CUSTOMER_DATA,
							TextResources.FILL_IN_TEXT, JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		
		this.btnShowAllCustomers.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(customerList.toString());				
			}
		});
		
		this.btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int exitDialogResult = JOptionPane.showConfirmDialog(null, TextResources.USER_MSG_EXIT_APPLICATION);
				
				if(exitDialogResult == JOptionPane.OK_OPTION) {
					System.exit(0);
				}
				
			}
		});

		// . Fenster oeffnen
		this.mainWindow.setVisible(true);

	}

	// endregion

}
