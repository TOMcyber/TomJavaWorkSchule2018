package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import logic.GuiCustomerAdministrationActionListener;
import resources.IntegerResources;
import resources.TextResources;

public class GuiCustomerAdminstration { // Methode

	// //Hauptfenster und dessen Layout
	private JFrame									mainWindow;
	private GridLayout								mainWindowLayout;

	// Buttons
	private JButton									btnSaveCustomer;
	private JButton									btnShowAllCustomers;
	private JButton									btnEditCustomer;
	private JButton									btnDeleteCustomer;
	private JButton									btnExit;
	
	
	private JLabel									lblFirstName;
	private JTextField								txtCustomerFirstName;
	private JLabel									lblLastName;
	private JTextField								txtCustomerLastName;
	private JLabel									lblCustomerBday;
	private JTextField								txtCustomerBday;
	private JLabel									lblStreet;								// Hier habe ich
																							// weitergemacht.
	private JTextField								txtStreet;
	private JLabel									lblHouseNumber;
	private JTextField								txtHouseNumber;
	private JLabel									lblZip;
	private JTextField								txtZip;
	private JLabel									lblCity;
	private JTextField								txtCity;

	private java.awt.List							uiCustomerList;     					// awt Liste
	
	private GuiCustomerAdministrationActionListener	guiCustomerAdministrationActionListener;
	

	public void openGuiCustomerAdministration() {

		System.out.println("Klasse GuiCustomerAdminstration - Methode openGuiCustomerAdministration()");

		this.generateGuiElements();

		this.configureMainWindow();

		this.configureGuiElements();

		this.addGuiElementsToMainWindow();

		this.generateActionListener();

		this.addActionCommandsToButtons();

		this.addActionListener();

		// 6. Fenster oeffnen und skalieren
		// this.mainWindow.pack(); // Entfernen sonst quasi "AutoSize" des Fensters
		this.mainWindow.setVisible(true);

	}

	private void generateGuiElements() {
		System.out.println("Klasse GuiCustomerAdminstration - Methode generateGuiElements()");
		// 1. Generieren aller benoetigten Objekte
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
		this.lblCustomerBday = new JLabel();
		this.lblStreet = new JLabel();
		this.lblHouseNumber = new JLabel();
		this.lblZip = new JLabel();
		this.lblCity = new JLabel();

		this.txtCustomerFirstName = new JTextField();
		this.txtCustomerLastName = new JTextField();
		this.txtCustomerBday = new JTextField();
		this.txtStreet = new JTextField();
		this.txtHouseNumber = new JTextField();
		this.txtZip = new JTextField();
		this.txtCity = new JTextField();
		
		this.uiCustomerList = new java.awt.List(IntegerResources.DEFAULT_UI_LIST_SIZE);
		

	}
		

	private void configureMainWindow() {
		System.out.println("Klasse GuiCustomerAdminstration - Methode configureMainWindow()");
		// 2. Konfigurieren des Hauptfensters
		this.mainWindow.setLayout(this.mainWindowLayout);
		this.mainWindow.setTitle(TextResources.APPLICATION_NAME);
		this.mainWindow.setSize(IntegerResources.DEFAULT_WINDOW_HEIGHT, IntegerResources.DEFAULT_WINDOW_WIDTH);
		this.mainWindow.setResizable(true); // true - bedeutet die gröse des Fensters ist verstellbar. Bei false wäre
											// die größe unveränderbar.
	}

	private void configureGuiElements() {
		System.out.println("Klasse GuiCustomerAdminstration - Methode configureGuiElements()");
		// 3. Konfigurieren der Steuerelemente
		this.btnSaveCustomer.setText(TextResources.SAVE_CUSTOMER_TEXT);
		this.btnShowAllCustomers.setText(TextResources.SHOW_ALL_CUSTOMERS_TEXT);
		this.btnExit.setText(TextResources.EXIT_APPLICATION_TEXT);
		this.btnEditCustomer.setText(TextResources.EDIT_CUSTOMER_TEXT);
		this.btnDeleteCustomer.setText(TextResources.DELETE_CUSTOMER_TEXT);
		
		
		this.lblFirstName.setText(TextResources.FIRST_NAME_TEXT);
		this.lblLastName.setText(TextResources.LAST_NAME_TEXT);
		this.lblCustomerBday.setText(TextResources.BIRTHDAY_TEXT);
		this.lblStreet.setText(TextResources.STREET_TEXT);
		this.lblHouseNumber.setText(TextResources.HOUSE_NUMBER_TEXT);
		this.lblZip.setText(TextResources.ZIP_TEXT);
		this.lblCity.setText(TextResources.CITY_TEXT);

		this.txtCustomerFirstName.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
		this.txtCustomerLastName.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
		this.txtCustomerBday.setColumns(IntegerResources.BDAY_TEXT_FIELD_COLUMNS);
		this.txtStreet.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
		this.txtHouseNumber.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
		this.txtZip.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
		this.txtCity.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);

	}

	private void addGuiElementsToMainWindow() {
		System.out.println("Klasse GuiCustomerAdminstration - Methode addGuiElementsToMainWindow()");
		// 4. Steuerelement dem Hauptfenster zuweisen REIHENFOLGE BEACHTEN
		this.mainWindow.add(this.btnSaveCustomer);
		this.mainWindow.add(this.btnShowAllCustomers);
		this.mainWindow.add(this.btnEditCustomer);
		this.mainWindow.add(this.btnDeleteCustomer);
		this.mainWindow.add(this.btnExit);
		this.mainWindow.add(this.lblFirstName);
		this.mainWindow.add(this.txtCustomerFirstName);
		this.mainWindow.add(this.lblLastName);
		this.mainWindow.add(this.txtCustomerLastName);
		this.mainWindow.add(this.lblCustomerBday);
		this.mainWindow.add(this.txtCustomerBday);
		this.mainWindow.add(this.lblStreet);
		this.mainWindow.add(this.txtStreet);
		this.mainWindow.add(this.lblHouseNumber);
		this.mainWindow.add(this.txtHouseNumber);
		this.mainWindow.add(this.lblZip);
		this.mainWindow.add(this.txtZip);
		this.mainWindow.add(this.lblCity);
		this.mainWindow.add(this.txtCity);

		this.mainWindow.add(this.uiCustomerList);
	
		
		
	}

	private void generateActionListener() {
		System.out.println("Klasse GuiCustomerAdminstration - Methode generateActionListener()");
		this.guiCustomerAdministrationActionListener = new GuiCustomerAdministrationActionListener(this);
	}

	private void addActionCommandsToButtons() {
		System.out.println("Klasse GuiCustomerAdminstration - Methode addActionCommandsToButtons()");
		this.btnSaveCustomer.setActionCommand(TextResources.ACTION_COMMAND_SAVE_CUSTOMER);
		this.btnShowAllCustomers.setActionCommand(TextResources.ACTION_COMMAND_SHOW_ALL_CUSTOMERS);
		this.btnEditCustomer.setActionCommand(TextResources.ACTION_COMMAND_EDIT);
		this.btnDeleteCustomer.setActionCommand(TextResources.ACTION_COMMAND_DELETE);
		this.btnExit.setActionCommand(TextResources.ACTION_COMMAND_EXIT);

		
	}

	private void addActionListener() {
		System.out.println("Klasse GuiCustomerAdminstration - Methode addActionListener()");

		// 5. Listener adden
		this.btnSaveCustomer.addActionListener(this.guiCustomerAdministrationActionListener);
		this.btnShowAllCustomers.addActionListener(this.guiCustomerAdministrationActionListener);
		this.btnEditCustomer.addActionListener(this.guiCustomerAdministrationActionListener);
		this.btnDeleteCustomer.addActionListener(this.guiCustomerAdministrationActionListener);
		this.btnExit.addActionListener(this.guiCustomerAdministrationActionListener);

	}

	public JTextField getTxtCustomerFirstName() {
		System.out.println("Klasse GuiCustomerAdminstration - Methode getTxtCustomerFirstName()");

		return txtCustomerFirstName;
	}

	public JTextField getTxtCustomerLastName() {
		System.out.println("Klasse GuiCustomerAdminstration - Methode getTxtCustomerLastName()");

		return txtCustomerLastName;
	}

	public JTextField getTxtCustomerBday() {
		System.out.println("Klasse GuiCustomerAdminstration - Methode getTxtCustomerBday()");

		return txtCustomerBday;
	}

	public JTextField getTxtStreet() {
		return txtStreet;
	}

	public JTextField getTxtHouseNumber() {
		return txtHouseNumber;
	}

	public JTextField getTxtZip() {
		return txtZip;
	}

	public JTextField getTxtCity() {
		return txtCity;
	}

	public java.awt.List getUiCustomerList() {
		return uiCustomerList;
	}
	// hier gehts dann wohl eines Tages weiter....
	
	
	// endregion

}
	
