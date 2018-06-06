// Meine GUI
// Hier spring ich von der Main aus rein.
/**
 * Nimmt die Eigabedaten<br>
 * eines {@link Friends} entgegen<br>
 * und leitet das Speichern in einer CSV-Datei ein.<br>
 * Liest Ihre Daten bei Bedarf wieder aus.<br>
 * 
 * @author Thomas Vollmer<br>
 *
 */

package gui;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListModel;

import logic.FileHandler;
import logic.GuiFriendsAdministrationActionListener;
import models.Friends;
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
public class GuiFriendsAdministration {

	// region 1. Decl. and Init Attribute

	private JFrame									mainWindow;
	private GridLayout								mainWindowLayout;

	private JButton									btnExit;

	private JLabel									lblFirstName;
	private JLabel									lblLastName;
	private JLabel									lblBday;
	private JLabel									lblStreet;
	private JLabel									lblHouseNumber;
	private JLabel									lblZip;
	private JLabel									lblCity;

	private GuiFriendsAdministrationActionListener	guiFriendsAdminstrationActionListener;
	// endregion
	private JButton btnDeleteFriends;
	private JButton btnEditFriends;
	private JButton btnShowAllFriends;
	private JButton btnSaveFriends;
	private JTextField txtFriendsFirstName;
	private JTextField txtFriendsLastName;
	private JTextField txtFriendsBday;
	private JTextField txtFriendsStreet;
	private JTextField txtFriendsHouseNumber;
	private JTextField txtFriendsZip;
	private JTextField txtFriendsCity;
	private java.awt.List GuiCustomerList;

	// region 3. Oeffnen der GUI

	public void openGuiFriendAdministration() {

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
		// 1. Generieren aller meiner GUI-Objekte
		this.mainWindow = new JFrame();
		this.mainWindowLayout = new GridLayout(IntegerResources.MAIN_WINDOW_LAYOUT_ROWS,
				IntegerResources.MAIN_WINDOW_LAYOUT_COLUMNS);

		this.btnSaveFriends = new JButton();
		this.btnShowAllFriends = new JButton();
		this.btnEditFriends = new JButton();
		this.btnDeleteFriends = new JButton();
		this.btnExit = new JButton();

		this.lblFirstName = new JLabel();
		this.lblLastName = new JLabel();
		this.lblBday = new JLabel();
		this.lblStreet = new JLabel();
		this.lblHouseNumber = new JLabel();
		this.lblZip = new JLabel();
		this.lblCity = new JLabel();

		this.txtFriendsFirstName = new JTextField();
		this.txtFriendsLastName = new JTextField();
		this.txtFriendsBday = new JTextField();
		this.txtFriendsStreet = new JTextField();
		this.txtFriendsHouseNumber = new JTextField();
		this.txtFriendsZip = new JTextField();
		this.txtFriendsCity = new JTextField();

		// TODO 2. java.awt.Liste instzanziieren mit einer Standardgroesse von 2.
		// TODO 2.1 Standard Groesse in der Klasse IntegerResources als Konstante
		// erstellen und hier nutzen
		this.GuiCustomerList = new java.awt.List(IntegerResources.DEFAULT_UI_LIST_SIZE);

	}

	private void configureMainWindow() {
		// 2. Konfiguration Hauptfenster
		this.mainWindow.setLayout(this.mainWindowLayout);
		this.mainWindow.setTitle(TextResources.APPLICATION_NAME);
		this.mainWindow.setSize(IntegerResources.DEFAULT_WINDOW_WIDTH, IntegerResources.DEFAULT_WINDOW_HEIGHT);
		this.mainWindow.setResizable(true);

	}

	private void configureGuiElements() {
		// 3. Konfigurieren der Steuerelemente/UI-Elemente/Widgets
		this.btnSaveFriends.setText(TextResources.SAVE_FRIENDS_TEXT);
		this.btnShowAllFriends.setText(TextResources.SHOW_ALL_FRIENDS_TEXT);
		this.btnEditFriends.setText(TextResources.EDIT_FRIENDS_TEXT);
		this.btnDeleteFriends.setText(TextResources.DELETE_FRIENDS_TEXT);
		this.btnExit.setText(TextResources.EXIT_APPLICATION_TEXT);

		this.lblFirstName.setText(TextResources.FIRST_NAME_TEXT);
		this.lblLastName.setText(TextResources.LAST_NAME_TEXT);
		this.lblBday.setText(TextResources.BIRTHDAY_TEXT);
		this.lblStreet.setText(TextResources.STREET_TEXT);
		this.lblHouseNumber.setText(TextResources.HOUSE_NUMBER_TEXT);
		this.lblZip.setText(TextResources.ZIP_TEXT);
		this.lblCity.setText(TextResources.CITY_TEXT);

		this.txtFriendsFirstName.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
		this.txtFriendsLastName.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
		this.txtFriendsBday.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);

		// this.uiFriendsList.setSize(width, height);

	}

	private void addGuiElementsToMainWindow() {
		// 4. Steuerlemente zum Hauptfenster hinzufuegen
		this.mainWindow.add(this.btnSaveFriends);
		this.mainWindow.add(this.btnShowAllFriends);
		this.mainWindow.add(this.btnEditFriends);
		this.mainWindow.add(this.btnDeleteFriends);
		this.mainWindow.add(this.btnExit);

		this.mainWindow.add(this.lblFirstName);
		this.mainWindow.add(this.txtFriendsFirstName);

		this.mainWindow.add(this.lblLastName);
		this.mainWindow.add(this.txtFriendsLastName);

		this.mainWindow.add(this.lblBday);
		this.mainWindow.add(this.txtFriendsBday);

		this.mainWindow.add(this.lblStreet);
		this.mainWindow.add(this.txtFriendsStreet);

		this.mainWindow.add(this.lblHouseNumber);
		this.mainWindow.add(this.txtFriendsHouseNumber);

		this.mainWindow.add(this.lblZip);
		this.mainWindow.add(this.txtFriendsZip);

		this.mainWindow.add(this.lblCity);
		this.mainWindow.add(this.txtFriendsCity);

		// TODO 3. java.awt.List uiFriendsList dem mainWindow hinzufuegen
		this.mainWindow.add(this.uiFriendsList);
	}

	private void generateActionListener() {
		this.guiFriendsAdminstrationActionListener = new GuiFriendsAdministrationActionListener(this);
	}

	private void addActionCommandsToButtons() {
		this.btnSaveFriends.setActionCommand(ActionCommands.SAVE_FRIENDS);
		this.btnShowAllFriends.setActionCommand(ActionCommands.SHOW_ALL_FRIENDS);
		this.btnEditFriends.setActionCommand(ActionCommands.EDIT_FRIENDS);
		this.btnDeleteFriends.setActionCommand(ActionCommands.DELETE_FRIENDS);
		this.btnExit.setActionCommand(ActionCommands.EXIT);
	}

	private void addActionListenerToButtons() {
		this.btnSaveFriends.addActionListener((ActionListener) this.guiFriendsAdminstrationActionListener);
		this.btnShowAllFriends.addActionListener(this.guiFriendsAdminstrationActionListener);
		this.btnEditFriends.addActionListener(this.guiFriendsAdminstrationActionListener);
		this.btnDeleteFriends.addActionListener(this.guiFriendsAdminstrationActionListener);
		this.btnExit.addActionListener(this.guiFriendsAdminstrationActionListener);
	}

	// endregion

	// region 3. Getter / Setter
	public JTextField getTxtFriendsFirstName() {
		return txtFriendsFirstName;
	}

	public JTextField getTxtFriendsLastName() {
		return txtFriendsLastName;
	}

	public JTextField getTxtFriendsBday() {
		return txtFriendsBday;
	}

	public JTextField getTxtFriendsStreet() {
		return txtFriendsStreet;
	}

	public JTextField getTxtFriendsHouseNumber() {
		return txtFriendsHouseNumber;
	}

	public JTextField getTxtFriendsZip() {
		return txtFriendsZip;
	}

	public JTextField getTxtFriendsCity() {
		return txtFriendsCity;
	}

	public java.awt.List getUiFriendsList() {
		return getUiFriendsList();
	}

	
		
	}

	

	// endregion
}
