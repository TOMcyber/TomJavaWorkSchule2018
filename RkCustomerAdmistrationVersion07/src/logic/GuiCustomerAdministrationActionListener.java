package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import gui.ActionCommands;
import gui.GuiCustomerAdministration;
import helper.DateHelper;
import models.Customer;
import resources.TextResources;

/**
 * Nimmt die Actions(Klicks) der Klasse {@link GuiCustomerAdministration}
 * entgegen und leitet die weitere Logik ein.
 * 
 * @author Alfa-Dozent
 *
 */
public class GuiCustomerAdministrationActionListener implements ActionListener {
	
	/**
	 * Enumartion zum unterscheiden
	 * welche LoggingMessage rausgeschrieben wird
	 * @author Alfa-Dozent
	 *
	 */
	private enum ECustomerActions{
		SAVE_CUSTOMER,
		EDIT_CUSTOMER,
		DELETE_CUSTOMER;
	}

	// region 0. Konstanten
	private static final int			EDIT_MODE_OFF				= -1;
	private static final int			NO_UI_LIST_SELECTION_VALUE	= -1;
	// endregion

	// region 1. Decl. and Init Attribute
	private GuiCustomerAdministration	guiCustomerAdministration;

	private List<Customer>				customerList;

	private int							indexOfCustomerToEdit;
	// endregion

	// region 2. Konstruktor
	public GuiCustomerAdministrationActionListener(GuiCustomerAdministration guiCustomerAdministration) {
		this.guiCustomerAdministration = guiCustomerAdministration;

		this.indexOfCustomerToEdit = EDIT_MODE_OFF;

		updateUiCustomerLists();
	}
	// endregion

	// region 3. ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (ActionCommands.SAVE_CUSTOMER.equalsIgnoreCase(e.getActionCommand())) {
			saveCustomer();
		}

		if (ActionCommands.EDIT_CUSTOMER.equalsIgnoreCase(e.getActionCommand())) {
			editCustomer();
		}

		if (ActionCommands.DELETE_CUSTOMER.equalsIgnoreCase(e.getActionCommand())) {

			deleteCustomer();
		}

		if (ActionCommands.SHOW_ALL_CUSTOMERS.equalsIgnoreCase(e.getActionCommand())) {

			updateUiCustomerLists();

		}

		if (ActionCommands.EXIT.equalsIgnoreCase(e.getActionCommand())) {
			exitApplication();
		}

	}

	// endregion

	// region 4. Customer Actions

	/**
	 * Speichern
	 */
	private void saveCustomer() {
		Customer customer = getCheckedCustomerDataFromUi();

		if (customer != null) {

			if (indexOfCustomerToEdit > EDIT_MODE_OFF) {
				// Update Customer on Liste
				customerList.set(indexOfCustomerToEdit, customer);

				logCustomerActionMessage(customer, ECustomerActions.EDIT_CUSTOMER);

				indexOfCustomerToEdit = EDIT_MODE_OFF;

				JOptionPane.showMessageDialog(null, TextResources.USER_MSG_EDITED_CUSTOMER_SUCCESSFULLY,
						TextResources.SAVED_TEXT, JOptionPane.INFORMATION_MESSAGE);
			} else {
				customerList.add(customer);

				logCustomerActionMessage(customer, ECustomerActions.SAVE_CUSTOMER);

				JOptionPane.showMessageDialog(null, TextResources.USER_MSG_SAVED_CUSTOMER_SUCCESSFULLY,
						TextResources.SAVED_TEXT, JOptionPane.INFORMATION_MESSAGE);
			}

			FileHandler.getInstance().saveCustomerListInCsvFile(customerList);

			updateUiCustomerLists();

			clearTextFields();
		} else {
			JOptionPane.showMessageDialog(null, TextResources.USER_MSG_FILL_IN_CUSTOMER_DATA,
					TextResources.FILL_IN_TEXT, JOptionPane.INFORMATION_MESSAGE);
		}
	}

	/**
	 * Editieren
	 */
	private void editCustomer() {

		if ((!this.customerList.isEmpty()) && (isItemSelectedInUiCustomerList())) {

			indexOfCustomerToEdit = this.guiCustomerAdministration.getUiCustomerList().getSelectedIndex();

			Customer customerToEdit = this.customerList.get(indexOfCustomerToEdit);

			this.guiCustomerAdministration.getTxtCustomerFirstName().setText(customerToEdit.getFirstName());
			this.guiCustomerAdministration.getTxtCustomerLastName().setText(customerToEdit.getLastName());
			this.guiCustomerAdministration.getTxtCustomerBday().setText(customerToEdit.getBday());
			this.guiCustomerAdministration.getTxtCustomerStreet().setText(customerToEdit.getStreet());
			this.guiCustomerAdministration.getTxtCustomerHouseNumber().setText(customerToEdit.getHouseNumber());
			this.guiCustomerAdministration.getTxtCustomerZip().setText(customerToEdit.getZip());
			this.guiCustomerAdministration.getTxtCustomerCity().setText(customerToEdit.getCity());
		}

	}

	/**
	 * Loeschen
	 */
	private void deleteCustomer() {

		if ((!this.customerList.isEmpty()) && (isItemSelectedInUiCustomerList())) {

			int indexOfCustomerToDelete = this.guiCustomerAdministration.getUiCustomerList().getSelectedIndex();
			Customer customerToDelete = this.customerList.get(indexOfCustomerToDelete);

			int deleteDialogResult = JOptionPane.showConfirmDialog(null,
					TextResources.USER_MSG_DELETE_CUSTOMER + customerToDelete.getFullName());

			if (deleteDialogResult == JOptionPane.OK_OPTION) {
				
				logCustomerActionMessage(customerToDelete, ECustomerActions.DELETE_CUSTOMER);

				this.customerList.remove(indexOfCustomerToDelete);

				FileHandler.getInstance().saveCustomerListInCsvFile(this.customerList);
			}

			updateUiCustomerLists();
		}
	}

	/**
	 * Programm beenden
	 */
	private void exitApplication() {
		int exitDialogResult = JOptionPane.showConfirmDialog(null, TextResources.USER_MSG_EXIT_APPLICATION);

		if (exitDialogResult == JOptionPane.OK_OPTION) {
			System.exit(0);
		}
	}

	// endregion

	// region 5. Hilfsmethoden und Funktionen

	/**
	 * Liest alle Eingabedaten aus den Textfeldern<br>
	 * der Gui aus. Checkt ob diese richtig befuellt worden<br>
	 * sind. Ist dies der Fall wird ein befuelltes {@link Customer}<br>
	 * Objekt zurueck gegeben, anderfalls null.<br>
	 * 
	 * @return customer : {@link Customer} : Befuellt oder null
	 */
	private Customer getCheckedCustomerDataFromUi() {
		Customer customer = null;

		String firstName = this.guiCustomerAdministration.getTxtCustomerFirstName().getText();
		String lastName = this.guiCustomerAdministration.getTxtCustomerLastName().getText();
		String bday = this.guiCustomerAdministration.getTxtCustomerBday().getText();
		String street = this.guiCustomerAdministration.getTxtCustomerStreet().getText();
		String houseNumber = this.guiCustomerAdministration.getTxtCustomerHouseNumber().getText();
		String zip = this.guiCustomerAdministration.getTxtCustomerZip().getText();
		String city = this.guiCustomerAdministration.getTxtCustomerCity().getText();

		boolean userInputIsValid = true;

		if (firstName.isEmpty() || lastName.isEmpty() || bday.isEmpty()) {

			userInputIsValid = false;
		}

		if (userInputIsValid) {
			customer = new Customer(firstName, lastName, bday);

			customer.setStreet(street);
			customer.setHouseNumber(houseNumber);
			customer.setZip(zip);
			customer.setCity(city);
		}

		return customer;
	}

	/**
	 * Weisst allen Textfeldern einen Leerstring zu
	 */
	private void clearTextFields() {
		this.guiCustomerAdministration.getTxtCustomerFirstName().setText("");
		this.guiCustomerAdministration.getTxtCustomerLastName().setText("");
		this.guiCustomerAdministration.getTxtCustomerBday().setText("");
		this.guiCustomerAdministration.getTxtCustomerStreet().setText("");
		this.guiCustomerAdministration.getTxtCustomerHouseNumber().setText("");
		this.guiCustomerAdministration.getTxtCustomerZip().setText("");
		this.guiCustomerAdministration.getTxtCustomerCity().setText("");

	}

	/**
	 * Update den Laufzeitspeicher als auch die customerUiList
	 */
	private void updateUiCustomerLists() {
		// Liste aus Datei per FileHandler auslesen
		List<Customer> customersFromCsvFile = FileHandler.getInstance().loadCustomerListFromCsvFile();

		// Zuweisen des Attributes customerList oder neu geneirerung
		if ((!customersFromCsvFile.isEmpty()) && (customersFromCsvFile != null)) {
			this.customerList = customersFromCsvFile;

			this.guiCustomerAdministration.getUiCustomerList().removeAll();

			for (Customer c : this.customerList) {
				this.guiCustomerAdministration.getUiCustomerList().add(c.getFullName());
			}

		} else {
			this.customerList = new ArrayList<>();
		}
	}

	/**
	 * Checkt ob ein Item in der uiCustomerList selektiert ist oder nicht
	 * 
	 * @return isSelected : boolean : true selektiert, false nicht selektiert
	 */
	private boolean isItemSelectedInUiCustomerList() {
		boolean isSelected = true;
		int selectedIndex = this.guiCustomerAdministration.getUiCustomerList().getSelectedIndex();

		if (selectedIndex == NO_UI_LIST_SELECTION_VALUE) {
			isSelected = false;
		}

		return isSelected;
	}

	/**
	 * Loggt verschieden Messages in eine Logdatei
	 * 
	 * @param customer
	 *            : {@link Customer} : Kundendaten
	 * @param newCustomer
	 *            : neuer Kunde oder bearbeitet -> Wird nachher zum Enum
	 */
	public void logCustomerActionMessage(Customer customer, ECustomerActions eCustomerActions) {
		
		
		// Logging
		String logMessage = DateHelper.getCurrentTimeStamp();

		switch (eCustomerActions) {
			case SAVE_CUSTOMER:
				logMessage += TextResources.LOG_MSG_CUSTOMER_SAVED;
				break;
				
			case EDIT_CUSTOMER:
				logMessage += TextResources.LOG_MSG_CUSTOMER_EDITED;
				break;
				
			case DELETE_CUSTOMER:
				logMessage += TextResources.LOG_MSG_CUSTOMER_DELETE;
				break;
		}

		logMessage += customer.getFullName();

		FileHandler.getInstance().logTextFile(logMessage);

	}
	// endregion

}
