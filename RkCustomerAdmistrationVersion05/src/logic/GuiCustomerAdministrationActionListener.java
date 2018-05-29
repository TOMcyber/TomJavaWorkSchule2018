package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import gui.GuiCustomerAdministration;
import helper.DateHelper;
import jdk.internal.jline.internal.Nullable;
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

	// region 1. Decl. and Init Attribute
	private GuiCustomerAdministration	guiCustomerAdministration;

	private List<Customer>				customerList;
	// endregion

	// region 2. Konstruktor
	public GuiCustomerAdministrationActionListener(GuiCustomerAdministration guiCustomerAdministration) {
		this.guiCustomerAdministration = guiCustomerAdministration;
		this.customerList = new ArrayList<>();
	}
	// endregion

	// region 3. ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equalsIgnoreCase(TextResources.ACTION_COMMAND_SAVE_CUSTOMER)) {

			Customer customer = getCheckedCustomerDataFromUi();

			if (customer != null) {
				customerList.add(customer);

				FileHandler.getInstance().saveCustomerListInCsvFile(customerList);
				
				//Logging
				String logMessage = DateHelper.getCurrentTimeStamp();
				logMessage += " Customer saved: ";
				logMessage += customer.getFirstName() + " ";
				logMessage += customer.getLastName() + "\n";
				
				FileHandler.getInstance().logTextFile(logMessage);

				JOptionPane.showMessageDialog(null, TextResources.USER_MSG_SAVED_CUSTOMER_SUCCESSFULLY,
						TextResources.SAVED_TEXT, JOptionPane.INFORMATION_MESSAGE);

				clearTextFields();
			} else {
				JOptionPane.showMessageDialog(null, TextResources.USER_MSG_FILL_IN_CUSTOMER_DATA,
						TextResources.FILL_IN_TEXT, JOptionPane.INFORMATION_MESSAGE);
			}

		}

		if (e.getActionCommand().equalsIgnoreCase(TextResources.ACTION_COMMAND_SHOW_ALL_CUSTOMERS)) {
			customerList.clear();
			customerList = FileHandler.getInstance().loadCustomerListFromCsvFile();
			System.out.println(customerList.toString());
		}

		if (e.getActionCommand().equalsIgnoreCase(TextResources.ACTION_COMMAND_EXIT)) {
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
	@Nullable
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

	private void clearTextFields() {
		this.guiCustomerAdministration.getTxtCustomerFirstName().setText("");
		this.guiCustomerAdministration.getTxtCustomerLastName().setText("");
		this.guiCustomerAdministration.getTxtCustomerBday().setText("");
		this.guiCustomerAdministration.getTxtCustomerStreet().setText("");
		this.guiCustomerAdministration.getTxtCustomerHouseNumber().setText("");
		this.guiCustomerAdministration.getTxtCustomerZip().setText("");
		this.guiCustomerAdministration.getTxtCustomerCity().setText("");

	}

}
