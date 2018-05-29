package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import gui.GuiCustomerAdminstration;
import helper.DateHelper;
import logic.GuiCustomerAdministrationActionListener.ECustomerActions;
import models.Customer;
import resources.TextResources;

/**
 * Nimmt die Actions(Klicks) der Klasse {@link GuiCustomerAdministration}
 * entgegen und leitet die weitere Logik ein.
 * 
 * @author Alfa-Dozent
 *
 */

public class GuiCustomerAdministrationActionListener implements ActionListener { // hier lauscht er aus Schüssel

	/**
	 * Enumartion zum unterscheiden welche LoggingMessage rausgeschrieben wird
	 * 
	 * @author Alfa-Dozent
	 *
	 */
	private enum ECustomerActions {
		SAVE_CUSTOMER, EDIT_CUSTOMER, DELETE_CUSTOMER;
	}

	// region 0 . Konstanten
	private static final int			EDIT_MODE_OFF				= -1;
	private static final int			NO_UI_LIST_SELECTION_VALUE	= -1;
	// endregion

	// region 1 Decl. and Init Attribute
	private GuiCustomerAdminstration	guiCustomerAdministration;

	private List<Customer>				customerList;

	private int							indexOfCustomerToEdit;
	// endregion

	// regin 2. Konstruktor
	public GuiCustomerAdministrationActionListener(GuiCustomerAdminstration guiCustomerAdministartion) {
		System.out.println("Klasse GuiCustomerAdministrationActionListener - Konstruktor()"); // SR
		this.guiCustomerAdministration = guiCustomerAdministartion;

		this.indexOfCustomerToEdit = EDIT_MODE_OFF;

		updateUiCustomerLists();
	}
	// endregion

	// region 3. Action Listener
	@Override
	public void actionPerformed(ActionEvent e) { // Methode actionPerformed
		System.out.println("Klasse GuiCustomerAdministrationActionListener - Methode actionPerformed()"); // SR

		if (e.getActionCommand().equalsIgnoreCase(TextResources.ACTION_COMMAND_SAVE_CUSTOMER)) {

			Customer customer = getCheckedCustomerDataFromUi();

			if (customer != null) {

				if (indexOfCustomerToEdit > EDIT_MODE_OFF) {
					// Update der Liste
					customerList.set(indexOfCustomerToEdit, customer);

					logCustomerActionMessage(customer, ECustomerActions.EDIT_CUSTOMER);

					indexOfCustomerToEdit = EDIT_MODE_OFF;

					JOptionPane.showMessageDialog(null, TextResources.USER_MSG_UPDATED_CUSTOMER_SUCCESSFULLY,
							TextResources.SAVED_TEXT, JOptionPane.INFORMATION_MESSAGE);

				} else {

					customerList.add(customer);

					// Logging
					String logMessage = DateHelper.getCurrentTimeStamp();
					logMessage += " Customer saved: ";
					logMessage += customer.getFirstName() + " ";
					logMessage += customer.getLastName() + "\n";

					FileHandler.getInstance().logTextFile(logMessage);

					JOptionPane.showMessageDialog(null, TextResources.USER_MSG_SAVED_CUSTOMER_SUCCESSFULLY,
							TextResources.SAVED_TEXT, JOptionPane.INFORMATION_MESSAGE);
				}

				FileHandler.getInstance().saveCustomerListInCsvFile(customerList);
				
				clearTextFields();
				
				updateUiCustomerLists();
				
			} else {
				JOptionPane.showMessageDialog(null, TextResources.USER_MSG_FILL_IN_CUSTOMER_DATA,
						TextResources.FILL_IN_TEXT, JOptionPane.INFORMATION_MESSAGE);

			}

		}

		if (e.getActionCommand().equalsIgnoreCase(TextResources.ACTION_COMMAND_EDIT)) {
			this.indexOfCustomerToEdit = this.guiCustomerAdministration.getUiCustomerList().getSelectedIndex();
			Customer selectedCustomer = this.customerList.get(indexOfCustomerToEdit);

			this.guiCustomerAdministration.getTxtCustomerFirstName().setText(selectedCustomer.getFirstName());
			this.guiCustomerAdministration.getTxtCustomerLastName().setText(selectedCustomer.getLastName());
			//
			this.guiCustomerAdministration.getTxtCustomerBday().setText(selectedCustomer.getBday());
			this.guiCustomerAdministration.getTxtStreet().setText(selectedCustomer.getStreet());
			this.guiCustomerAdministration.getTxtHouseNumber().setText(selectedCustomer.getHouseNumber());
			this.guiCustomerAdministration.getTxtZip().setText(selectedCustomer.getZip());
			this.guiCustomerAdministration.getTxtCity().setText(selectedCustomer.getCity());

		}

		if (e.getActionCommand().equalsIgnoreCase(TextResources.ACTION_COMMAND_DELETE)) {
			
		}
			
  // TODO Löschen implementieren
			
			/**
			 * Loeschen
			 */
			
		private void deleteCustomer() {   // Löschmethode
			
			if ((!this.customerList.isEmpty()) && (isItemSelectedInUiCustomerList())) {

				Customer customerToDelete;
				int deleteDialogResult = JOptionPane.showConfirmDialog(null,
						TextResources.USER_MSG_DELETE_CUSTOMER + customerToDelete.getFullName());
				if (deleteDialogResult == JOptionPane.OK_OPTION
						) {
					
					logCustomerActionMessage(customerToDelete, ECustomerActions.DELETE_CUSTOMER);

					
					Object indexOfCustomerToDelete;
					this.customerList.remove(indexOfCustomerToDelete);

					FileHandler.getInstance().saveCustomerListInCsvFile(this.customerList);
				}

				updateUiCustomerLists();	
		}
			
			
		}

		if (e.getActionCommand().equalsIgnoreCase(TextResources.ACTION_COMMAND_SHOW_ALL_CUSTOMERS)) boolean isItemSelectedInUiCustomerList() {
				// TODO Auto-generated method stub
				return false;
			}

		{
			System.out.println(
					"Klasse GuiCustomerAdministrationActionListener - Methode actionPerformed() - Verzweigung - Alle Kunden ausgeben:");

			customerList.clear();
			customerList = FileHandler.getInstance().loadCustomerListFromCsvFile();

			System.out.println(customerList.toString());

			for (Customer c : this.customerList) {
				this.guiCustomerAdministration.getUiCustomerList().add(c.getFullName());
			}
		}
	
	
		if (e.getActionCommand().equalsIgnoreCase(TextResources.ACTION_COMMAND_EXIT)) {
			System.out.println(
					"Klasse GuiCustomerAdministrationActionListener - Methode actionPerformed() - Verzweigung - Programm beenden");
			int exitDialogResult = JOptionPane.showConfirmDialog(null, TextResources.USER_MSG_EXIT_APPLICATION);

			if (exitDialogResult == JOptionPane.OK_OPTION) {
				System.exit(0);
			}
			// TODO Ausgelesener selektierter Index (indexOfCustomerToEdit)
			// wird Attribut (blau und bezeichnet EIGESCHAFTEN EINER KLASSE)

		}

	}

	private boolean isItemSelectedInUiCustomerList() {
		// TODO Auto-generated method stub
		return false;
	}

	private void logCustomerActionMessage(Customer customer, ECustomerActions editCustomer) {
		// TODO Auto-generated method stub

	}
	// endregion

	// region 4. Customer Actions
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
		String street = this.guiCustomerAdministration.getTxtStreet().getText();
		String houseNumber = this.guiCustomerAdministration.getTxtHouseNumber().getText();
		String zip = this.guiCustomerAdministration.getTxtZip().getText();
		String city = this.guiCustomerAdministration.getTxtCity().getText();

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

	private void updateUiCustomerLists() {
		// endregion

		// 5. Liste aus Datei per FileHandler auslesen
		List<Customer> customersFromCsvFile = FileHandler.getInstance().loadCustomerListFromCsvFile();

		// 6. Zuweisen des Attributes customerList oder neu generierung
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
	 * Weisst allen Textfeldern einen Leerstring zu
	 */
	private void clearTextFields() {
		this.guiCustomerAdministration.getTxtCustomerFirstName().setText("");
		this.guiCustomerAdministration.getTxtCustomerLastName().setText("");
		this.guiCustomerAdministration.getTxtCustomerBday().setText("");
		this.guiCustomerAdministration.getTxtStreet().setText("");
		this.guiCustomerAdministration.getTxtHouseNumber().setText("");
		this.guiCustomerAdministration.getTxtZip().setText("");
		this.guiCustomerAdministration.getTxtCity().setText("");

	}
}
