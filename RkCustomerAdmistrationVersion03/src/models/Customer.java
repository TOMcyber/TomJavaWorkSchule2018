package models;

/**
 * Modelklassen haben<br>
 * nur zur Aufgabe ihren<br>
 * mit Eigenschaften(Attributen)<br>
 * Daten zur Laufzeit vorzuhalten.<br>
 * 
 * Modelklassen auch Bean-, oder<br>
 * [P]lain [O]ld [J]ava [O]bject<br>
 * Klasse genannt enthalten<br>
 * keinerlei Business-Logik.<br>
 * 
 * Hat zur Aufgabe die Daten<br>
 * von Programmteil A zu<br>
 * Programmteil B zu transportieren<br>
 * 
 * @author Alfa-Dozent
 *
 */
public class Customer {

	// region 0. Konstanten
	private static final String	DEFAULT_VALUE_STRING	= "no value";
	// endregion

	// region 1. Decl. and Init Attribute
	private String				firstName;
	private String				lastName;
	private String				bday;
	// endregion

	// region 2. Konstruktoren
	
	/**
	 * Standard Konstruktor
	 * zum initalisieren
	 * der Attribute
	 */
	public Customer() {
		this.firstName = DEFAULT_VALUE_STRING;
		this.lastName = DEFAULT_VALUE_STRING;
		this.bday = DEFAULT_VALUE_STRING;
	}
	
	/**
	 * 1. Ueberladener Konstruktor
	 * zum direkten initalisieren der 
	 * Attribute bei Generierung
	 */
	public Customer(String firstName, String lastName, String bday) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.bday = bday;
	}
	// endregion

	// region 3. Getter und Setter

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	// endregion

	// region 4. StringFunktionen
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", bday=" + bday + "]";
	}

	// endregion

}
