package gui;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListModel;

import logic.FileHandler;
import logic.GuiCustomerAdministrationActionListener;
import models.Customer;
import resources.IntegerResources;
import resources.TextResources;

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

	private JFrame									mainWindow;
	private GridLayout								mainWindowLayout;

	private JButton									btnSaveCustomer;
	private JButton									btnShowAllCustomers;
	
	//TODO 8. Neue Buttons Edit und Delete deklerarieren generieren einfuegen im MainWindow
	private JButton									btnEditCustomer;
	private JButton									btnDeleteCustomer;
	private JButton									btnExit;

	private JLabel									lblFirstName;
	private JLabel									lblLastName;
	private JLabel									lblBday;
	private JLabel									lblStreet;
	private JLabel									lblHouseNumber;
	private JLabel									lblZip;
	private JLabel									lblCity;

	private JTextField								txtCustomerFirstName;
	private JTextField								txtCustomerLastName;
	private JTextField								txtCustomerBday;
	private JTextField								txtCustomerStreet;
	private JTextField								txtCustomerHouseNumber;
	private JTextField								txtCustomerZip;
	private JTextField								txtCustomerCity;

	//TODO 1. java.awt.Liste deklarieren
	private java.awt.List							uiCustomerList;

	private GuiCustomerAdministrationActionListener	guiCustomerAdminstrationActionListener;
	// endregion

	// region 3. Oeffnen der GUI

	public void openGuiCustomerAdministration() {

		this.generateGuiElements();

		this.configureMainWindow();

		this.configureGuiElements();

		this.addGuiElementsToMainWindow();

		this.generateActionListener();

		this.addActionCommandsToButtons();

		this.addActionListenerToButtons();

		// Fenster oeffnen
		// this.mainWindow.pack();
		this.mainWindow.setVisible(true);

	}

	// endregion

	// region 4. Gui-Hilfsmethoden und Funktionen

	private void generateGuiElements() {
		// 1. Generieren aller GUI-Objekte
		this.mainWindow = new JFrame();
		this.mainWindowLayout = new GridLayout(IntegerResources.MAIN_WINDOW_LAYOUT_ROWS,
				IntegerResources.MAIN_WINDOW_LAYOUT_COLUMNS);

		this.btnSaveCustomer = new JButton();
		this.btnShowAllCustomers = new JButton();
		this.btnEditCustomer = new JButton();
		this.btnDeleteCustomer = new JButton();
		this.btnExit = new JButton();

		this.lblFirstName = new JLabel();
		this.lblLastName = new JLabel();
		this.lblBday = new JLabel();
		this.lblStreet = new JLabel();
		this.lblHouseNumber = new JLabel();
		this.lblZip = new JLabel();
		this.lblCity = new JLabel();

		this.txtCustomerFirstName = new JTextField();
		this.txtCustomerLastName = new JTextField();
		this.txtCustomerBday = new JTextField();
		this.txtCustomerStreet = new JTextField();
		this.txtCustomerHouseNumber = new JTextField();
		this.txtCustomerZip = new JTextField();
		this.txtCustomerCity = new JTextField();

		//TODO 2. java.awt.Liste instzanziieren mit einer Standardgroesse von 2.
		//TODO 2.1 Standard Groesse in der Klasse IntegerResources als Konstante erstellen und hier nutzen
		this.uiCustomerList = new java.awt.List(IntegerResources.DEFAULT_UI_LIST_SIZE);

	}

	private void configureMainWindow() {
		// 2. Konfiguration Hauptfenster
		this.mainWindow.setLayout(this.mainWindowLayout);
		this.mainWindow.setTitle(TextResources.APPLICATION_NAME);
		this.mainWindow.setSize(IntegerResources.DEFAULT_WINDOW_HEIGHT, IntegerResources.DEFAULT_WINDOW_WIDTH);
		this.mainWindow.setResizable(true);

	}

	private void configureGuiElements() {
		// 3. Konfigurieren der Steuerelemente/UI-Elemente/Widgets
		this.btnSaveCustomer.setText(TextResources.SAVE_CUSTOMER_TEXT);
		this.btnShowAllCustomers.setText(TextResources.SHOW_ALL_CUSTOMERS_TEXT);
		this.btnEditCustomer.setText(TextResources.EDIT_CUSTOMER_TEXT);
		this.btnDeleteCustomer.setText(TextResources.DELETE_CUSTOMER_TEXT);
		this.btnExit.setText(TextResources.EXIT_APPLICATION_TEXT);

		this.lblFirstName.setText(TextResources.FIRST_NAME_TEXT);
		this.lblLastName.setText(TextResources.LAST_NAME_TEXT);
		this.lblBday.setText(TextResources.BIRTHDAY_TEXT);
		this.lblStreet.setText(TextResources.STREET_TEXT);
		this.lblHouseNumber.setText(TextResources.HOUSE_NUMBER_TEXT);
		this.lblZip.setText(TextResources.ZIP_TEXT);
		this.lblCity.setText(TextResources.CITY_TEXT);

		this.txtCustomerFirstName.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
		this.txtCustomerLastName.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
		this.txtCustomerBday.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);

//		this.uiCustomerList.setSize(width, height);
		
	}

	private void addGuiElementsToMainWindow() {
		// 4. Steuerlemente zum Hauptfenster hinzufuegen
		this.mainWindow.add(this.btnSaveCustomer);
		this.mainWindow.add(this.btnShowAllCustomers);
		this.mainWindow.add(this.btnEditCustomer);
		this.mainWindow.add(this.btnDeleteCustomer);
		this.mainWindow.add(this.btnExit);

		this.mainWindow.add(this.lblFirstName);
		this.mainWindow.add(this.txtCustomerFirstName);

		this.mainWindow.add(this.lblLastName);
		this.mainWindow.add(this.txtCustomerLastName);

		this.mainWindow.add(this.lblBday);
		this.mainWindow.add(this.txtCustomerBday);

		this.mainWindow.add(this.lblStreet);
		this.mainWindow.add(this.txtCustomerStreet);

		this.mainWindow.add(this.lblHouseNumber);
		this.mainWindow.add(this.txtCustomerHouseNumber);

		this.mainWindow.add(this.lblZip);
		this.mainWindow.add(this.txtCustomerZip);

		this.mainWindow.add(this.lblCity);
		this.mainWindow.add(this.txtCustomerCity);
		
		//TODO 3. java.awt.List uiCustomerList dem mainWindow hinzufuegen
		this.mainWindow.add(this.uiCustomerList);
	}

	private void generateActionListener() {
		this.guiCustomerAdminstrationActionListener = new GuiCustomerAdministrationActionListener(this);
	}

	private void addActionCommandsToButtons() {
		this.btnSaveCustomer.setActionCommand(TextResources.ACTION_COMMAND_SAVE_CUSTOMER);
		this.btnShowAllCustomers.setActionCommand(TextResources.ACTION_COMMAND_SHOW_ALL_CUSTOMERS);
		this.btnExit.setActionCommand(TextResources.ACTION_COMMAND_EXIT);
	}

	private void addActionListenerToButtons() {
		this.btnSaveCustomer.addActionListener(this.guiCustomerAdminstrationActionListener);
		this.btnShowAllCustomers.addActionListener(this.guiCustomerAdminstrationActionListener);
		this.btnExit.addActionListener(this.guiCustomerAdminstrationActionListener);
	}

	// endregion

	// region 3. Getter / Setter
	public JTextField getTxtCustomerFirstName() {
		return txtCustomerFirstName;
	}

	public JTextField getTxtCustomerLastName() {
		return txtCustomerLastName;
	}

	public JTextField getTxtCustomerBday() {
		return txtCustomerBday;
	}

	public JTextField getTxtCustomerStreet() {
		return txtCustomerStreet;
	}

	public JTextField getTxtCustomerHouseNumber() {
		return txtCustomerHouseNumber;
	}

	public JTextField getTxtCustomerZip() {
		return txtCustomerZip;
	}

	public JTextField getTxtCustomerCity() {
		return txtCustomerCity;
	}
	
	public java.awt.List getUiCustomerList(){
		return uiCustomerList;
	}

	// endregion
}
