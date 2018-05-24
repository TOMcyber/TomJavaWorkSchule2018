package resources;

/**
 * Diese Klasse ist final.<br>
 * Das heisst von Ihr kann nicht<br>
 * abgeleitet werden.<br>
 * 
 * Von kann auch kein Objekt,<br>
 * ausserhalb der Klasse angelegt<br>
 * werden.<br>
 * 
 * Sie enthaelt alle String/Textlichen<br>
 * Werte die die Applikation benoetigt.<br>
 * 
 * Diese sind als oeffentliche Konstanten hinterlegt<br>
 * 
 * @author Alfa-Dozent :)
 *
 */
public final class TextResources {

	public static final String	APPLICATION_NAME						= "Customer Administration";
	public static final String	SAVE_CUSTOMER_TEXT						= "Save customer";
	public static final String	SHOW_ALL_CUSTOMERS_TEXT					= "Show all Customers";
	public static final String	EXIT_APPLICATION_TEXT					= "Exit application";
	public static final String	FIRST_NAME_TEXT							= "First name:";
	public static final String	LAST_NAME_TEXT							= "Last name:";
	public static final String	BIRTHDAY_TEXT							= "Birthday:";
	public static final String	SAVED_TEXT								= "Saved";
	public static final String	FILL_IN_TEXT							= "Fill in";

	public static final String	USER_MSG_SAVED_CUSTOMER_SUCCESSFULLY	= "Saved Customer succesfully";
	public static final String	USER_MSG_FILL_IN_CUSTOMER_DATA			= "Please fill in customer data";
	public static final String	USER_MSG_EXIT_APPLICATION				= "Do you want to exit the application?";

	public static final String	ACTION_COMMAND_SAVE_CUSTOMER			= "actionCommandSaveCustomer";
	public static final String	ACTION_COMMAND_SHOW_ALL_CUSTOMERS		= "actionCommandShowAllCustomers";
	public static final String	ACTION_COMMAND_EXIT						= "actionCommandExit";

	/**
	 * Privater Konstruktor um die Objektinstanziierung von ausserhalb der Klasse
	 * nicht zu ermoeglichen.
	 */
	private TextResources() {
		// Nichts zu tun ausser privat zu sein
	}

}
