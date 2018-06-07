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

import java.awt.Component;
// Imports kommen hier rein
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListModel;

import logic.GuiFriendsAdministrationActionListener;        //Packages angelegt
import resources.IntegerResources;
import resources.TextResources;

	import logic.FileHandler;
	import logic.GuiFriendsAdministrationActionListener;
                                                      // 	import models.Friends;
 	import resources.IntegerResources;
	import resources.TextResources;




public class GuiFriendsAdministration {

	private JFrame mainWindow;
	private GridLayout mainWindowLayout;
	
	private Object btnSaveFriends;
	private JButton btnExit;
	private JButton btnDeleteFriends;
	private JButton btnEditFriends;
	private JButton btnShowAllFriends;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JLabel lblBday;
	private JLabel lblStreet;
	private JLabel lblHouseNumber;
	private JLabel lblZip;
	private JLabel lblCity;
	private JLabel lblComment;
	private JLabel lblHobby;
	private JTextField txtFriendsFirstName;
	private JTextField txtFriendsLastName;
	private JTextField txtFriendsBday;
	private JTextField txtFriendsStreet;
	private JTextField txtFriendsHouseNumber;
	private JTextField txtFriendsZip;
	private JTextField txtFriendsCity;
	private JTextField txtFriendsComment;
	private JTextField txtFriendsHobby;
	
	private LayoutManager mainLayout;
	private ActionListener guiFriendsAdminstrationActionListener;
	private ActionListener guiCustomerAdminstrationActionListener;
	
/*	private Component txtHobby;
	private Component txtComment;
	private Component btnSaveFriend;
	private Component guiFriendsList;
*/	

	public void openGuiFriendsAdministration() {					
		//  Region 1. Decl. and Init Attribute
		
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
		private JLabel									lblComment;
		private JLabel									lblHobby;
		
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
		private JTextField txtFriendsComment;
		private JTextField txtFriendsHobby;
		private java.awt.List GuiCustomerList;
		 
		
		private GuiFriendsAdministrationActionListener	guiFriendsAdminstrationActionListener;
		
		
		// Region 3. Oeffnen der Gui
		
		public void openGuiFriendsAdministration() {
			
			this.generateGuiElements();
			
			this.configureMainWindow();
			
			this.addGuiElementsToMainWindow();
			
			this.generateActionListener();

			this.addActionCommandsToButtons();

			this.addActionListenerToButtons();
			
			
			// Fenster oeffnen
			// this.mainWindow.pack();
			this.mainWindow.setVisible(true);
					
		}
		
		// endregion
		
		// Region 4. Gui-Hilfsmethoden und Funktionen
		
		private void generateGuiElements() {
			//1. Generieren aller meiner GUI-Objekte
			
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
			this.lblComment = new JLabel();
			this.lbl.Hobby = new JLabel();
			
			
			this.txtFriendsFirstName = new JTextField();
			this.txtFriendsLastName = new JTextField();
			this.txtFriendsBday = new JTextField();
			this.txtFriendsStreet = new JTextField();
			this.txtFriendsHouseNumber = new JTextField();
			this.txtFriendsZip = new JTextField();
			this.txtFriendsCity = new JTextField();
			this.txtFriendsComment = new JTextField();
			this.txtFriendsHobby = new JTextField();
			
			
			this.GuiFriendsList = new java.awt.List(IntegerResources.DEFAULT_UI_LIST_SIZE);
		}
	
	
		private void configureMainWindow() {
			// 2. Hauptfenster konfigurieren
			
			this.mainWindow.setLayout(this.mainLayout);
			this.mainWindow.setTitle(TextResources.APPLICATION_NAME);
			this.mainWindow.setSize(IntegerResources.DEFAULT_WINDOW_WIDTH);
			this.mainWindow.setResizeable(true);			//aktiviert Größenverstellbarkeit des Fensters
			
		}
		private void configureGuiElements() {
			// 3. Steuerelemente/UI-Elemente und Widgets konfigurieren
			// Buttons
			this.btnSaveFriends.setText(TextResources.SAVE_FRIENDS_TEXT);
			this.btnShowAllFriends.setText(TextResources.SHOW_ALL_FRIENDS_TEXT);
			this.btnEditFriends.setText(TextResources.EDIT_FRIEND_TEXT);
			this.btnDeleteFriends.setText(TextResources.DELETE_FRIENDS_TEXT);
			this.btnExit.setText(TextResources.EXIT_APPLICATION_TEXT);
			// Labels
			this.lblFirstName.setText(TextResources.FIRST_NAME_TEXT);
			this.lblLastName.setText(TextResources.LAST_NAME_TEXT);
			this.lblBday.setText(TextResources.BIRTHDAY_TEXT);
			this.lblStreet.setText(TextResources.STREET_TEXT);
			this.lblHouseNumber.setText(TextResources.HOUSE_NUMBER_TEXT);
			this.lblZip.setText(TextResources.ZIP_TEXT);
			this.lblCity.setText(TextResources.CITY_TEXT);
			this.lblComment.setText(TextResources.COMMENT_TEXT);
			this.lblHobby.setText(TextResources.HOBBY_TEXT);
			
			// Textfelder
			this.txtFriendsFirstName.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
			this.txtFriendsLastName.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
			this.txtFriendsBday.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
			this.txtFriendsComment.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
			this.txtFriendsHobby.setColumns(IntegerResources.DEFAULT_TEXT_FIELD_COLUMNS);
			
			// this.uiCustomerList.setSize(width, height);
			
		}
		
		private void addGuiElementsToMainWindow() {
			// 4. Steuerlemente zum Hauptfenster hinzufuegen
			
			this.mainWindow.add(this.btnSaveFriend);
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
			
			this.mainWindow.add(this.lblComment);
			this.mainWindow.add(this.txtComment);
			
			this.mainWindow.add(this.lblHobby);
			this.mainWindow.add(this.txtHobby);
			
			// jawa.awt.List GuiFriendsList dem Main Window hinzufügen
			this.mainWindow.add(this.guiFriendsList);
		}
		// Ein Ohr mach auf und lausche
		private void generateActionListener() {        
			this.guiFriendsAdminstrationActionListener = new GuiFriendsAdministrationActionListener(this);
		}
		
		private void addActionCommandsToButtons() {  // Buttons Funktionen zuweisen !!!
			this.btnSaveFriends.setActionCommand(ActionCommands.SAVE_FRIENDS);
			this.btnShowAllFriends.setActionCommand(ActionCommands.SHOW_ALL_FRIENDS);
			this.btnEditFriends.setActionCommand(ActionCommands.EDIT_FRIENDS);
			this.btnDeleteFriends.setActionCommand(ActionCommands.DELETE_FRIENDS);
			this.btnExit.setActionCommand(ActionCommands.EXIT);
		}
		
		private void addActionListenerToButtons() {  // Buttons Lauscher zuweisen !!!
			this.btnSaveFriends.addActionListener(this.guiFriendsAdminstrationActionListener);
			this.btnShowAllFriends.addActionListener(this.guiFriendsAdminstrationActionListener);
			this.btnEditFriends.addActionListener(this.guiFriendsAdminstrationActionListener);
			this.btnDeleteFriends.addActionListener(this.guiFriendsAdminstrationActionListener);
			this.btnExit.addActionListener(this.guiCustomerAdminstrationActionListener);
		}

		// Endregion
		
		// region 3. Getter / Setter
		
		// Endregion
		
	}

	private void addActionListenerToButtons() {
		// TODO Auto-generated method stub
		
	}
	

}
