package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import gui.GuiCustomerAdminstration;
import models.Customer;
import resources.TextResources;

public class GuiCustomerAdministrationActionListener implements ActionListener {

	//region 1 Decl. and Init Attribute
	private GuiCustomerAdminstration guiCustomerAdminstration;
	
	private List<Customer> customerList;
	//endregion
	
	//regin 2. Konstruktor
	public GuiCustomerAdministrationActionListener(GuiCustomerAdminstration guiCustomerAdministartion) {
		System.out.println("Klasse GuiCustomerAdministrationActionListener - Konstruktor()");
		this.guiCustomerAdminstration = guiCustomerAdministartion;	
		this.customerList = new ArrayList<>();	
	}
	//endregion
	
	
	//region 3. Action Listener
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Klasse GuiCustomerAdministrationActionListener - Methode actionPerformed()");
		
		if(e.getActionCommand().equalsIgnoreCase(TextResources.ACTION_COMMAND_SAVE_CUSTOMER)) {
			System.out.println("Klasse GuiCustomerAdministrationActionListener - Methode actionPerformed() - Verzweigung - Speichern des Kunden");
			String firstName = this.guiCustomerAdminstration.getTxtCustomerFirstName().getText();
			String lastName = this.guiCustomerAdminstration.getTxtCustomerLastName().getText();
			String bday = this.guiCustomerAdminstration.getTxtCustomerBday().getText();

			boolean userInputValid = true;

			/**
			 * NUR firstName ist leer NUR lastName ist leer NUR bday ist leer
			 * 
			 * firstName nicht leer
			 * 
			 */

			if (firstName.isEmpty() || lastName.isEmpty() || bday.isEmpty()) {

				userInputValid = false;
			}

			if (userInputValid) {
				customerList.add(new Customer(firstName, lastName, bday));

				JOptionPane.showMessageDialog(null, TextResources.USER_MSG_SAVED_CUSTOMER_SUCCESSFULLY, TextResources.SAVED_TEXT,
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null,TextResources.USER_MSG_FILL_IN_CUSTOMER_DATA, TextResources.FILL_IN_TEXT,
						JOptionPane.INFORMATION_MESSAGE);

			}
			
		}
		
		if(e.getActionCommand().equalsIgnoreCase(TextResources.ACTION_COMMAND_SHOW_ALL_CUSTOMERS)) {
			System.out.println("Klasse GuiCustomerAdministrationActionListener - Methode actionPerformed() - Verzweigung - Alle Kunden ausgeben:");
			System.out.println(customerList.toString());
			
		}
		
		if(e.getActionCommand().equalsIgnoreCase(TextResources.ACTION_COMMAND_EXIT)) {
			System.out.println("Klasse GuiCustomerAdministrationActionListener - Methode actionPerformed() - Verzweigung - Programm beenden");
			int exitDialogResult = JOptionPane.showConfirmDialog(null, TextResources.USER_MSG_EXIT_APPLICATION
					);

			if (exitDialogResult == JOptionPane.OK_OPTION) {
				System.exit(0);
			}
		}
		
	}
	//endregion

	
	
	
	
	
	
	
	
}
