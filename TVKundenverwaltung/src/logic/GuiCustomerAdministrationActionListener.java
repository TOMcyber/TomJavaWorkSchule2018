package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import gui.GuiCustomerAdminstration;
import helper.DateHelper;
import models.Customer;
import resources.TextResources;

public class GuiCustomerAdministrationActionListener implements ActionListener {

	// region 1 Decl. and Init Attribute
	private GuiCustomerAdminstration	guiCustomerAdminstration;

	private List<Customer>				customerList;
	// endregion

	// regin 2. Konstruktor
	public GuiCustomerAdministrationActionListener(GuiCustomerAdminstration guiCustomerAdministartion) {
		System.out.println("Klasse GuiCustomerAdministrationActionListener - Konstruktor()");
		this.guiCustomerAdminstration = guiCustomerAdministartion;

		// TODO 5. Liste aus Datei per FileHandler auslesen
		List<Customer> customersFromCsvFile = FileHandler.getInstance().loadCustomerListFromCsvFile();

		// TODO 6. Zuweisen des Attributes customerList oder neu geneirerung
		if ((!customersFromCsvFile.isEmpty()) && (customersFromCsvFile != null)) {
			this.customerList = customersFromCsvFile;
		} else {
			this.customerList = new ArrayList<>();
		}
	}
	// endregion

	// region 3. Action Listener
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Klasse GuiCustomerAdministrationActionListener - Methode actionPerformed()");

		if (e.getActionCommand().equalsIgnoreCase(TextResources.ACTION_COMMAND_SAVE_CUSTOMER)) {

			Customer customer = getCheckedCustomerDataFromUi();

			if (customer != null) {

				customerList.add(customer);

				FileHandler.getInstance().saveCustomerListInCsvFile(customerList);

				// Logging
				String logMessage = DateHelper.getCurrentTimeStamp();
				logMessage += " Customer saved: ";
				logMessage += customer.getFirstName() + " ";
				logMessage += customer.getLastName() + "\n";

				FileHandler.getInstance().logTextFile(logMessage);

				JOptionPane.showMessageDialog(null, TextResources.USER_MSG_SAVED_CUSTOMER_SUCCESSFULLY,
						TextResources.SAVED_TEXT, JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, TextResources.USER_MSG_FILL_IN_CUSTOMER_DATA,
						TextResources.FILL_IN_TEXT, JOptionPane.INFORMATION_MESSAGE);

			}

		}

		if (e.getActionCommand().equalsIgnoreCase(TextResources.ACTION_COMMAND_SHOW_ALL_CUSTOMERS)) {
			System.out.println(
					"Klasse GuiCustomerAdministrationActionListener - Methode actionPerformed() - Verzweigung - Alle Kunden ausgeben:");

			customerList.clear();
			customerList = FileHandler.getInstance().loadCustomerListFromCsvFile();

			System.out.println(customerList.toString());
			// TODO 7.
			for (Customer c : this.customerList) {
				this.guiCustomerAdminstration.getUiCustomerList().add(c.getFullName());
			}
		}

		if (e.getActionCommand().equalsIgnoreCase(TextResources.ACTION_COMMAND_EXIT)) {
			System.out.println(
					"Klasse GuiCustomerAdministrationActionListener - Methode actionPerformed() - Verzweigung - Programm beenden");
			int exitDialogResult = JOptionPane.showConfirmDialog(null, TextResources.USER_MSG_EXIT_APPLICATION);

			if (exitDialogResult == JOptionPane.OK_OPTION) {
				System.exit(0);
			}
		}

	}

	// endregion
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

		String firstName = this.guiCustomerAdminstration.getTxtCustomerFirstName().getText();
		String lastName = this.guiCustomerAdminstration.getTxtCustomerLastName().getText();
		String bday = this.guiCustomerAdminstration.getTxtCustomerBday().getText();
		String street = this.guiCustomerAdminstration.getTxtStreet().getText();
		String houseNumber = this.guiCustomerAdminstration.getTxtHouseNumber().getText();
		String zip = this.guiCustomerAdminstration.getTxtZip().getText();
		String city = this.guiCustomerAdminstration.getTxtCity().getText();

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

}
