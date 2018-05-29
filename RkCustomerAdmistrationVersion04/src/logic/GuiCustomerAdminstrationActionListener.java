package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import gui.GuiCustomerAdministration;
import models.Customer;
import resources.TextResources;

public class GuiCustomerAdminstrationActionListener implements ActionListener {

	//region 1. Decl. and Init Attribute
	private GuiCustomerAdministration guiCustomerAdministration;
	
	private List<Customer> customerList;
	//endregion

	//region 2. Konstruktor
	public GuiCustomerAdminstrationActionListener(GuiCustomerAdministration guiCustomerAdministration) {
		this.guiCustomerAdministration = guiCustomerAdministration;
		this.customerList = new ArrayList<>();
	}
	//endregion

	//region 3. ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().
				equalsIgnoreCase(TextResources.ACTION_COMMAND_SAVE_CUSTOMER)) {
			
			String firstName = this.guiCustomerAdministration.getTxtCustomerFirstName().getText();
			String lastName = this.guiCustomerAdministration.getTxtCustomerLastName().getText();
			String bday = this.guiCustomerAdministration.getTxtCustomerBday().getText();

			boolean userInputIsValid = true;

			if (firstName.isEmpty() || lastName.isEmpty() || bday.isEmpty()) {

				userInputIsValid = false;
			}

			if (userInputIsValid) {
				customerList.add(new Customer(firstName, lastName, bday));

				JOptionPane.showMessageDialog(null, TextResources.USER_MSG_SAVED_CUSTOMER_SUCCESSFULLY,
						TextResources.SAVED_TEXT, JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, TextResources.USER_MSG_FILL_IN_CUSTOMER_DATA,
						TextResources.FILL_IN_TEXT, JOptionPane.INFORMATION_MESSAGE);
			}

		}

		if (e.getActionCommand().
				equalsIgnoreCase(TextResources.ACTION_COMMAND_SHOW_ALL_CUSTOMERS)) {
			System.out.println(customerList.toString());
		}

		if (e.getActionCommand().
				equalsIgnoreCase(TextResources.ACTION_COMMAND_EXIT)) {
			int exitDialogResult = JOptionPane.showConfirmDialog(null, TextResources.USER_MSG_EXIT_APPLICATION);

			if (exitDialogResult == JOptionPane.OK_OPTION) {
				System.exit(0);
			}
		}

	}
	//endregion

}
