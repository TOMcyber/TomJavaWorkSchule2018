package logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import models.Customer;

/**
* Singleton fuer das Dateihandling,<br>
 * welcher die Threadsicherheit.<br>
 * gewaehrleistet.<br>
 * 
 * Diese ist ein Controller/Handler/Manager
 * @author Alfa
 *
 */
public class FileHandler {
	
	public static final String	INITIAL_FILE_PATH	= "D:/";
	public static final String	INITIAL_FILE_NAME	= "customer.csv";
	public static final String	LOG_FILE_NAME		= "logMessagesCustomerAdministration.txt";

	public static final String	LOG_FILE_FULLPATH	= INITIAL_FILE_PATH + LOG_FILE_NAME;
	public static final String	INITAL_FULL_PATH	= INITIAL_FILE_PATH + INITIAL_FILE_NAME;

	
	/**
	 * Einzige Instanz dieser Klasse<br>
	 * zur kompletten Laufzeit
	 *
	 */
	private static FileHandler instance;
	
	/**
	 * Privater Konstruktor kann nur innerhalb dieser Klasse, sprich der
	 * {@link FileHandler} Klasse aufgerufen werden. Dies Geschieht ein einziges mal
	 * beim ersten Aufruf der Funktion: {@link FileHandler#getInstance()}
	 */
	private FileHandler() {
		System.out.println("FileHandler gestartet");
	}
	
	/**
	 * Gibt die hier in dieser Funktion<br>
	 * einmalig generierte Instanz dieser Klasse<br>
	 * zurueck. Das Schluesselwort synchronized,<br>
	 * snychronisiert selbst den Zugriff auf<br>
	 * diese Funktion und damit auf die Instanz.<br>
	 * <br>
	 * Da nur diese Instanz in Dateien schreibt oder diese ausliest, ist der Zugriff
	 * somit<br>
	 * Threadsicher.<br>
	 * <br>
	 * Threadsicher bedeutet das keine zwei parallel<br>
	 * laufenden Prozesse gleichzeitig auf eine Datei<br>
	 * zugreifen koennen.<br>
	 * 
	 * @return instance : {@link FileHandler}: einzige Instance
	 */
	public static synchronized FileHandler getInstance() {
		if(instance == null) {
			instance = new FileHandler();
		}
		
		return instance;
	}
	
	public void logTextFile(String logMessage) {
		
		Path logFilePath = Paths.get(LOG_FILE_FULLPATH);
		File logFile = logFilePath.toFile();
		
		if(!logFile.exists()) {
			try {
				logFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try (BufferedWriter out = Files.newBufferedWriter(logFilePath,StandardOpenOption.APPEND)) {

			out.write(logMessage + "\n");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void saveCustomerListInCsvFile(List<Customer> customerList) {

		Path customerCsvFilePath = Paths.get(INITAL_FULL_PATH);
		File customerCsvFile = customerCsvFilePath.toFile();

		if (customerCsvFile.exists()) {
			customerCsvFile.delete();
		}

		try (BufferedWriter out = Files.newBufferedWriter(customerCsvFilePath)) {

			for (Customer c : customerList) {
				out.write(c.getAllAttributsAsCsvString() + "\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public List<Customer> loadCustomerListFromCsvFile() {
		List<Customer> customerList = new ArrayList<>();

		Path customerCsvFilePath = Paths.get(INITAL_FULL_PATH);
		File customerCsvFile = customerCsvFilePath.toFile();

		if (customerCsvFile.exists()) {

			try (BufferedReader in = Files.newBufferedReader(customerCsvFilePath)) {

				boolean eof = false;

				while (!eof) {
					String csvLine = in.readLine();

					if (csvLine != null) {
						Customer c = new Customer();

						c.setAllAttributsFromCsvString(csvLine);

						customerList.add(c);
					} else {
						eof = true;
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return customerList;

	}

}

	
	
	

