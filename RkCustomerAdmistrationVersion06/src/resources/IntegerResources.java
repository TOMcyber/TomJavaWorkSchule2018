package resources;

/**
 * *Diese Klasse ist final.<br>
 * Das heisst von Ihr kann nicht<br>
 * abgeleitet werden.<br>
 * 
 * Von kann auch kein Objekt,<br>
 * ausserhalb der Klasse angelegt<br>
 * werden.<br>
 * 
 * Sie enthaelt alle Integer<br>
 * Werte die die Applikation benoetigt.<br>
 * 
 * Diese sind als oeffentliche Konstanten hinterlegt<br>
 * 
 * @author Alfa-Dozent
 *
 */
public final class IntegerResources {

	public static final int	DEFAULT_TEXT_FIELD_COLUMNS	= 15;
	public static final int	DEFAULT_WINDOW_HEIGHT		= 500;
	public static final int	DEFAULT_WINDOW_WIDTH		= 600;
	public static final int	MAIN_WINDOW_LAYOUT_ROWS		= 0;
	public static final int	MAIN_WINDOW_LAYOUT_COLUMNS	= 1;
	public static final int	DEFAULT_UI_LIST_SIZE		= 50;

	private IntegerResources() {
		// Nur privat sein.
	}

}
