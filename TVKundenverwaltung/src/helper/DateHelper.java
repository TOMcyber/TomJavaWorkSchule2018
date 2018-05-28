package helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import resources.TextResources;

public class DateHelper {

	public static String getCurrentTimeStamp() {
		Date currentDate = new Date();
		DateFormat dateFormat = new SimpleDateFormat(TextResources.CURRENT_TIME_STAMP_FORMAT);
		
		return dateFormat.format(currentDate);
	}
	
	/**
	 * Privater Konstruktor
	 * um Objektinstanziierung
	 * dieser Klasse von aussen
	 * nicht zu erlauben
	 */
	private DateHelper() {
		// Nur privat sein
	}

	
	
}
