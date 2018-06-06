package models;

public class Friends {

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

	
	// region 0. Konstanten
	
	private static final String	DEFAULT_VALUE_STRING		= "no value";
	private static final String	SPLIT_CHAR					= ";";
	
	private static final int	SPLIT_INDEX_FIRST_NAME		= 0;
	private static final int	SPLIT_INDEX_LAST_NAME			= 1;
	private static final int	SPLIT_INDEX_BDAY				= 2;
	private static final int	SPLIT_INDEX_STREET			= 3;
	private static final int	SPLIT_INDEX_HOUSE_NUMBER		= 4;
	private static final int	SPLIT_INDEX_ZIP				= 5;
	private static final int	SPLIT_INDEX_CITY				= 6;
	
	// endregion

		// region 1. Decl. and Init Attribute
		private String				firstName;
		private String				lastName;
		private String				bday;
		private String				street;
		private String				houseNumber;
		private String				zip;
		private String				city;
		// endregion

		// region 2. Konstruktoren

		/**
		 * Standard Konstruktor zum initalisieren der Attribute
		 */
		public Friends() {
			this.firstName = DEFAULT_VALUE_STRING;
			this.lastName = DEFAULT_VALUE_STRING;
			this.bday = DEFAULT_VALUE_STRING;

			this.street = DEFAULT_VALUE_STRING;
			this.houseNumber = DEFAULT_VALUE_STRING;
			this.zip = DEFAULT_VALUE_STRING;
			this.city = DEFAULT_VALUE_STRING;
		}

		/**
		 * 1. Ueberladener Konstruktor zum direkten initalisieren der Attribute bei
		 * Generierung
		 */
		public Friends(String firstName, String lastName, String bday) {
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
		
		public String getFullName() {
			//TODO 4. Getter fuer vollen Namen einpflegen
			return this.firstName + " " + this.lastName;
		}

		public String getBday() {
			return bday;
		}

		public void setBday(String bday) {
			this.bday = bday;
		}

		// endregion

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getHouseNumber() {
			return houseNumber;
		}

		public void setHouseNumber(String houseNumber) {
			this.houseNumber = houseNumber;
		}

		public String getZip() {
			return zip;
		}

		public void setZip(String zip) {
			this.zip = zip;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		
		public String getAllAttributsAsCsvString() {
			String csvLine = "";

			csvLine += this.firstName + SPLIT_CHAR;
			csvLine += this.lastName + SPLIT_CHAR;
			csvLine += this.bday + SPLIT_CHAR;
			csvLine += this.street + SPLIT_CHAR;
			csvLine += this.houseNumber + SPLIT_CHAR;
			csvLine += this.zip + SPLIT_CHAR;
			csvLine += this.city;

			return csvLine;
		}

		public void setAllAttributsFromCsvString(String csvLine) {
			String[] csvLineSplitArray = csvLine.split(SPLIT_CHAR);
			
			this.firstName = csvLineSplitArray[SPLIT_INDEX_FIRST_NAME];
			this.lastName = csvLineSplitArray[SPLIT_INDEX_LAST_NAME];
			
			this.bday = csvLineSplitArray[SPLIT_INDEX_BDAY];

			this.street = csvLineSplitArray[SPLIT_INDEX_STREET];
			this.houseNumber = csvLineSplitArray[SPLIT_INDEX_HOUSE_NUMBER];
			this.zip = csvLineSplitArray[SPLIT_INDEX_ZIP];
			this.city = csvLineSplitArray[SPLIT_INDEX_CITY];

		}

		@Override
		public String toString() {
			return "Friends [firstName=" + firstName + ", lastName=" + lastName + ", bday=" + bday + ", street=" + street
					+ ", houseNumber=" + houseNumber + ", zip=" + zip + ", city=" + city + "]";
		}



		// region 4. StringFunktionen

		// endregion


	
	
	
	public String getAllAttributsAsCsvString() {
		// TODO Auto-generated method stub
		return null;
	}

}
