package gui;

import java.awt.GridLayout;
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
 * Nimmt die Eigabedaten<br>
 * eines {@link Friends} entgegen<br>
 * und leitet das Speichern in einer CSV-Datei ein.<br>
 * Liest Ihre Daten bei Bedarf wieder aus.<br>
 * 
 * @author Thomas Vollmer<br>
 *
 */







public class GuiFriendsAdministration {

	// Region 1. Decl and Init Attribute
	// TODO 1. Buttons deklarieren, generieren und einfuegen
	
	private JFrame									mainWindow;
	private GridLayout								mainWindowLayout;

	private JButton									btnSaveCustomer;
	private JButton									btnShowAllCustomers;
	
	
	// TODO 2. java.awt.Liste deklarieren
	
	//private java.awt.Liste							guiFriendsListe;
	
	private GuiFriendsAdministrationActionListener guiFriendsAdministartionActionListener;
	// EndRegion
	
	// Region 3. oeffnen der Gui
	
	public void openGuiFriendsAdministartion() {
		
		this.generateGuiElements();
		
		this.configureMainWindow();
		
		this.configureGuiElements();
		
		this.addGuiElementsToMainWindow();
		
		this.generateActionListener();
		
		this.addActionCommandsToButtons();
		
		this.addActionListenerToButtons();
		
		// Fenster oeffnen
		// this.mainWindow.pack();
		this.mainWindow.setVisible(true);		// true = Fenster sichtbar
	}
	
	
	
	
	// EndRegion
		
	// Region 4. Gui-Hilfsmethoden und Funktionen
	
		
		private void generateGuiElements() {
	// 1. Generieren aller GUI-Objekte
			
			
			
		
		
	}

}