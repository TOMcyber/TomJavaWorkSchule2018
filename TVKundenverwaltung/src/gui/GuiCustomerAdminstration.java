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

import logic.GuiCustomerAdministrationActionListener;
import models.Customer;
import resources.IntegerResources;
import resources.TextResources;

public class GuiCustomerAdminstration { // Methode

	// //Hauptfenster und dessen Layout
	private JFrame									mainWindow;
	private FlowLayout								mainWindowLayout;

	// Buttons
	private JButton									btnSaveCustomer;
	private JButton									btnShowAllCustomers;
	private JButton									btnExit;

	private JLabel									lblFirstName;
	private JTextField								txtCustomerFirstName;
	private JLabel									lblLastName;
	private JTextField								txtCustomerLastName;
	private JLabel									lblCustomerBday;
	private JTextField								txtCustomerBday;

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
		this.mainWindowLayout = new FlowLayout();

		this.btnSaveCustomer = new JButton();
		this.btnShowAllCustomers = new JButton();
		this.btnExit = new JButton();

		this.lblFirstName = new JLabel();
		this.lblLastName = new JLabel();
		this.lblCustomerBday = new JLabel();

		this.txtCustomerFirstName = new JTextField();
		this.txtCustomerLastName = new JTextField();
		this.txtCustomerBday = new JTextField();

	}

	private void configureMainWindow() { 
		System.out.println("Klasse GuiCustomerAdminstration - Methode configureMainWindow()");
		// 2. Konfigurieren des Hauptfensters
		this.mainWindow.setLayout(this.mainWindowLayout);
		this.mainWindow.setTitle(TextResources.APPLICATION_NAME);
		this.mainWindow.setSize(IntegerResources.DEFAULT_WINDOW_HEIGHT, IntegerResources.DEFAULT_WINDOW_WIDTH);
		this.mainWindow.setResizable(true);
	}

	private void configureGuiElements() { 
		System.out.println("Klasse GuiCustomerAdminstration - Methode configureGuiElements()");
		// 3. Konfigurieren der Steuerelemente
		this.btnSaveCustomer.setText(TextResources.SAVE_CUSTOMER_TEXT);
		this.btnShowAllCustomers.setText(TextResources.SHOW_ALL_CUSTOMERS_TEXT);
		this.btnExit.setText(TextResources.EXIT_APPLICATION_TEXT);

		this.lblFirstName.setText(TextResources.FIRST_NAME_TEXT);
		this.lblLastName.setText(TextResources.LAST_NAME_TEXT);
		this.lblCustomerBday.setText(TextResources.BIRTHDAY_TEXT);

		this.txtCustomerFirstName.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
		this.txtCustomerLastName.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
		this.txtCustomerBday.setColumns(IntegerResources.BDAY_TEXT_FIELD_COLUMNS);

	}

	private void addGuiElementsToMainWindow() {
		System.out.println("Klasse GuiCustomerAdminstration - Methode addGuiElementsToMainWindow()");
		// 4. Steuerelement dem Hauptfenster zuweisen REIHENFOLGE BEACHTEN
		this.mainWindow.add(this.btnSaveCustomer);
		this.mainWindow.add(this.btnShowAllCustomers);
		this.mainWindow.add(this.btnExit);
		this.mainWindow.add(this.lblFirstName);
		this.mainWindow.add(this.txtCustomerFirstName);
		this.mainWindow.add(this.lblLastName);
		this.mainWindow.add(this.txtCustomerLastName);
		this.mainWindow.add(this.lblCustomerBday);
		this.mainWindow.add(this.txtCustomerBday);

	}

	private void generateActionListener() {
		System.out.println("Klasse GuiCustomerAdminstration - Methode generateActionListener()");
		this.guiCustomerAdministrationActionListener = new GuiCustomerAdministrationActionListener(this);
	}

	private void addActionCommandsToButtons() {
		System.out.println("Klasse GuiCustomerAdminstration - Methode addActionCommandsToButtons()");
		this.btnSaveCustomer.setActionCommand(TextResources.ACTION_COMMAND_SAVE_CUSTOMER);
		this.btnShowAllCustomers.setActionCommand(TextResources.ACTION_COMMAND_SHOW_ALL_CUSTOMERS);
		this.btnExit.setActionCommand(TextResources.ACTION_COMMAND_EXIT);

	}

	private void addActionListener() {
		System.out.println("Klasse GuiCustomerAdminstration - Methode addActionListener()");

		// 5. Listener adden
		this.btnSaveCustomer.addActionListener(this.guiCustomerAdministrationActionListener);
		this.btnShowAllCustomers.addActionListener(this.guiCustomerAdministrationActionListener);
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

}
