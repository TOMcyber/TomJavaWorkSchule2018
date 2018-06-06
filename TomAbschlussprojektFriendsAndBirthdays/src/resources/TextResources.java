package resources;

/**
 * 
 * Final Klasse, bedeutet
 * keine Ableitung und das 
 * auch keine Klasse von 
 * Ausserhalb angelegt werden
 * kann.
 * Enthält ausserdem alle Strings
 * welche die App benötigt.
 * 
 * Welche als OEFFENTLICHE Konstanten
 * hinterlegt sind.
 *
 */


public final class TextResources {

	public static final String	APPLICATION_NAME						= "TomAbschlussprojektFriendsAndBirthdays";

	public static final String	SAVE_FRIENDS_TEXT						= "Save friends";
	public static final String	SHOW_ALL_FRIENDS_TEXT					= "Show all Friends";
	public static final String	EDIT_FRIENDS_TEXT						= "Edit Friends";
	public static final String	DELETE_FRIENDS_TEXT					= "Delete Friends";
	public static final String	EXIT_APPLICATION_TEXT					= "Exit application";
	public static final String	FIRST_NAME_TEXT						= "First name:";
	public static final String	LAST_NAME_TEXT							= "Last name:";
	public static final String	BIRTHDAY_TEXT							= "Birthday:";
	public static final String	SAVED_TEXT								= "Saved";
	public static final String	FILL_IN_TEXT							= "Fill in";
	public static final String	STREET_TEXT							= "Straße:";
	public static final String	HOUSE_NUMBER_TEXT						= "House number:";
	public static final String	ZIP_TEXT								= "ZIP:";
	public static final String	CITY_TEXT								= "City:";

	public static final String	USER_MSG_SAVED_FRIENDS_SUCCESSFULLY	= "Saved Customer successfully";
	public static final String	USER_MSG_EDITED_FRIENDS_SUCCESSFULLY	= "Edited Customer successfully";
	public static final String	USER_MSG_DELETE_FRIENDS					= "Do you want to delete this customer:\n\n";
	public static final String	USER_MSG_FILL_IN_FRIENDS_DATA			= "Please fill in customer data";
	public static final String	USER_MSG_EXIT_APPLICATION					= "Do you want to exit the application?";



	public static final String	LOG_MSG_FRIENDS_SAVED					= " Friends saved: ";
	public static final String	LOG_MSG_FRIENDS_EDITED					= " Friends edited: ";
	public static final String	LOG_MSG_FRIENDS_DELETE					= " Friends deleted: ";

	/**
	 * Privater Konstruktor um die Objektinstanziierung von ausserhalb der Klasse
	 * zu verbieten bzw, nicht zu erlauben.
	 */
	private TextResources() {
		// Nur privat sein
	}

}


