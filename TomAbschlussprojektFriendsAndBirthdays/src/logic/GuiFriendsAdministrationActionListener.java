package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import gui.ActionCommands;
import gui.GuiFriendsAdministration;
import helper.DateHelper;
import models.Friends;
import resources.TextResources;


public class GuiFriendsAdministrationActionListener {

	
	/**
	 * Enumartion zum unterscheiden
	 * welche LoggingMessage rausgeschrieben wird
	 * @author Alfa-Dozent Herr Kasper
	 *
	 */
	private enum EFriendsActions{
		SAVE_FRIENDS,
		EDIT_FRIENDS,
		DELETE_FRIENDS;
	}

	// region 0. Konstanten
	private static final int			EDIT_MODE_OFF				= -1;
	private static final int			NO_UI_LIST_SELECTION_VALUE	= -1;
	// endregion

	// region 1. Decl. and Init Attribute
	private GuiFriendsAdministration	guiFriendsAdministration;

	private List<Friends>				friendsList;

	private int							indexOfFriendsToEdit;
	// endregion

	// region 2. Konstruktor
	public GuiFriendsAdministrationActionListener(GuiFriendsAdministration guiFriendsAdministration) {
		this.guiFriendsAdministration = guiFriendsAdministration;

		this.indexOfFriendsToEdit = EDIT_MODE_OFF;

		updateUiFriendsLists();
	}
	private void updateUiFriendsLists() {					// Hier Richtig die Methode ?
		// TODO Auto-generated method stub
		
	}
	// endregion

	// region 3. ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (ActionCommands.SAVE_FRIENDS.equalsIgnoreCase(e.getActionCommand())) {
			saveCustomer();
		}

		if (ActionCommands.EDIT_FRIENDS.equalsIgnoreCase(e.getActionCommand())) {
			editCustomer();
		}

		if (ActionCommands.DELETE_FRIENDS.equalsIgnoreCase(e.getActionCommand())) {

			deleteCustomer();
		}

		if (ActionCommands.SHOW_ALL_FRIENDS.equalsIgnoreCase(e.getActionCommand())) {

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
		Friends friends = getCheckedFriendsDataFromUi();

		if (friends != null) {

			if (indexOfFriendsToEdit > EDIT_MODE_OFF) {
				// Update Friends in der Liste
				friendsList.set(indexOfFriendsToEdit, friends);

				logFriendsActionMessage(friends, EFriendsActions.EDIT_FRIENDS);

				indexOfFriendsToEdit = EDIT_MODE_OFF;

				JOptionPane.showMessageDialog(null, TextResources.USER_MSG_EDITED_FRIENDS_SUCCESSFULLY,
						TextResources.SAVED_TEXT, JOptionPane.INFORMATION_MESSAGE);
			} else {
				friendsList.add(friends);

				logFriendsActionMessage(friends, EFriendsActions.SAVE_FRIENDS);

				JOptionPane.showMessageDialog(null, TextResources.USER_MSG_SAVED_FRIENDS_SUCCESSFULLY,
						TextResources.SAVED_TEXT, JOptionPane.INFORMATION_MESSAGE);
			}

			FileHandler.getInstance().saveFriendsListInCsvFile(friendsList);

			updateUiCustomerLists();

			clearTextFields();
		} else {
			JOptionPane.showMessageDialog(null, TextResources.USER_MSG_FILL_IN_FRIENDS_DATA,
					TextResources.FILL_IN_TEXT, JOptionPane.INFORMATION_MESSAGE);
		}
	}

	/**
	 * Editieren der Freunde
	 */
	private void editFriends() {

		if ((!this.friendsList.isEmpty()) && (isItemSelectedInUiFriendsList())) {

			indexOfFriendsToEdit = this.guiFriendsAdministration.getUiFriendsList().getSelectedIndex();

			Friends friendsToEdit = this.friendsList.get(indexOfFriendsToEdit);

			this.guiFriendsAdministration.getTxtFriendsFirstName().setText(friendsToEdit.getFirstName());
			this.guiFriendsAdministration.getTxtFriendsLastName().setText(friendsToEdit.getLastName());
			this.guiFriendsAdministration.getTxtFriendsBday().setText(friendsToEdit.getBday());
			this.guiFriendsAdministration.getTxtFriendsStreet().setText(friendsToEdit.getStreet());
			this.guiFriendsAdministration.getTxtFriendsHouseNumber().setText(friendsToEdit.getHouseNumber());
			this.guiFriendsAdministration.getTxtFriendsZip().setText(friendsToEdit.getZip());
			this.guiFriendsAdministration.getTxtFriendsCity().setText(friendsToEdit.getCity());
		}

	}

	/**
	 * Loeschen der Freunde
	 */
	private void deleteFriends() {

		if ((!this.friendsList.isEmpty()) && (isItemSelectedInUiFriendsList())) {

			int indexOfCustomerToDelete = this.guiFriendsAdministration.getUiFriendsList().getSelectedIndex();
			Friends friendsToDelete = this.friendsList.get(indexOfCustomerToDelete);

			int deleteDialogResult = JOptionPane.showConfirmDialog(null,
					TextResources.USER_MSG_DELETE_FRIENDS + friendsToDelete.getFullName());

			if (deleteDialogResult == JOptionPane.OK_OPTION) {
				
				logFriendsActionMessage(friendsToDelete, EFriendsActions.DELETE_FRIENDS);

				this.friendsList.remove(indexOfFriendsToDelete);

				FileHandler.getInstance().saveFriendsListInCsvFile(this.friendsList);
			}

			updateUiFriendsLists();
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
	 * sind. Ist dies der Fall wird ein befuelltes {@link Friends}<br>
	 * Objekt zurueck gegeben, anderfalls null.<br>
	 * 
	 * @return friends : {@link Friends} : Befuellt oder null
	 */
	private Friends getCheckedFriendsDataFromUi() {
		Friends friends = null;

		String firstName = this.guiFriendsAdministration.getTxtFriendsFirstName().getText();
		String lastName = this.guiFriendsAdministration.getTxtFriendsLastName().getText();
		String bday = this.guiFriendsAdministration.getTxtFriendsBday().getText();
		String street = this.guiFriendsAdministration.getTxtFriendsStreet().getText();
		String houseNumber = this.guiFriendsAdministration.getTxtFriendsHouseNumber().getText();
		String zip = this.guiFriendsAdministration.getTxtFriendsZip().getText();
		String city = this.guiFriendsAdministration.getTxtFriendsCity().getText();

		boolean userInputIsValid = true;

		if (firstName.isEmpty() || lastName.isEmpty() || bday.isEmpty()) {

			userInputIsValid = false;
		}

		if (userInputIsValid) {
			friends = new Customer(firstName, lastName, bday);

			friends.setStreet(street);
			friends.setHouseNumber(houseNumber);
			friends.setZip(zip);
			friends.setCity(city);
		}

		return friends;
	}

	/**
	 * Weisst allen Textfeldern einen Leerstring zu
	 */
	private void clearTextFields() {
		this.guiFriendsAdministration.getTxtFriendsFirstName().setText("");
		this.guiFriendsAdministration.getTxtFriendsLastName().setText("");
		this.guiFriendsAdministration.getTxtFriendsBday().setText("");
		this.guiFriendsAdministration.getTxtFriendsStreet().setText("");
		this.guiFriendsAdministration.getTxtFriendsHouseNumber().setText("");
		this.guiFriendsAdministration.getTxtFriendsZip().setText("");
		this.guiFriendsAdministration.getTxtFriendsCity().setText("");

	}

	/**
	 * Update den Laufzeitspeicher als auch die customerUiList
	 */
	private void updateUiFriendsLists() {
		// Liste aus Datei per FileHandler auslesen
		List<Friends> friendsFromCsvFile = FileHandler.getInstance().loadFriendsListFromCsvFile();

		// Zuweisen des Attributes customerList oder neu geneirerung
		if ((!friendsFromCsvFile.isEmpty()) && (friendsFromCsvFile != null)) {
			this.friendsList = friendsFromCsvFile;

			this.guiFriendsAdministration.getUiFriendsList().removeAll();

			for (Friends c : this.friendsList) {
				this.guiFriendsAdministration.getUiFriendsList().add(c.getFullName());
			}

		} else {
			this.friendsList = new ArrayList<>();
		}
	}

	/**
	 * Checkt ob ein Item in der uiCustomerList selektiert ist oder nicht
	 * 
	 * @return isSelected : boolean : true selektiert, false nicht selektiert
	 */
	private boolean isItemSelectedInUiFriendsList() {
		boolean isSelected = true;
		int selectedIndex = this.guiFriendsAdministration.getUiFriendsList().getSelectedIndex();

		if (selectedIndex == NO_UI_LIST_SELECTION_VALUE) {
			isSelected = false;
		}

		return isSelected;
	}

	/**
	 * Loggt verschieden Messages in eine Logdatei
	 * 
	 * @param friends
	 *            : {@link Friends} : Freundedaten
	 * @param newFriends
	 *            : neuer Freund oder bearbeitet -> Wird nachher zum Enum
	 */
	public void logFriendsActionMessage(Friends friends, EFriendsActions eFriendsActions) {
		
		
		// Logging
		String logMessage = DateHelper.getCurrentTimeStamp();

		switch (eFriendsActions) {
			case SAVE_FRIENDS:
				logMessage += TextResources.LOG_MSG_FRIENDS_SAVED;
				break;
				
			case EDIT_FRIENDS:
				logMessage += TextResources.LOG_MSG_FRIENDS_EDITED;
				break;
				
			case DELETE_FRIENDS:
				logMessage += TextResources.LOG_MSG_FRIENDS_DELETE;
				break;
		}

		logMessage += friends.getFullName();

		FileHandler.getInstance().logTextFile(logMessage);

	}
	// endregion

}

	

