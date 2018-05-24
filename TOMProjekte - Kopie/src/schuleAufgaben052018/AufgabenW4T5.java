package schuleAufgaben052018;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AufgabenW4T5 {

	public static void main(String[] args) {
		// === Verbindung zur Datenbank herstellen
		
		// Connection String:
		String adresse = "localhost";
		String port = "3306";
		String namedb = "kundenDBA";
		String user = "root";
		String passwort = "";
		
		String timezone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		String urlDB = "jdbc:mysql://" + adresse + ":" + port + "/" + namedb + timezone;
		System.out.println(urlDB);
			
		// Connection herstellen
			
		String[] vorname = {"Verena", "Paul", "Hildegard", "Lara" };
		String[] nachname = {"Vetter", "Müller", "von Bingen", "Rehfeld" };
		String email[] = {"vetter@email.com", "mueller@muellermail.com", "hildeb@bingen.de", "larar"};
				
		try( Connection con = DriverManager.getConnection(urlDB,  user,  passwort);
				Statement stat = con.createStatement()) {
			
			// Inserts Durchführen (c)
			for(int i=0; i < vorname.length; i++) {
				String sqlInsert = "INSERT INTO Kunden (Vorname, Nachname, Email) "
						+ "	VALUES('" + vorname[i] + "', '" + nachname[i] + "', '"+ email[i] +  "')";  
						
			// d) Tabelle auslesen
				ResultSet result = stat.executeQuery("select * from Kunden  ");
						// + "WHERE nachname='Müller' OR nachname='Rehfeld'");
				while(result.next()) {
					int kidT = result.getInt("kid");
					String vornameT = result.getString("Vorname");
					String nachnameT = result.getString("Nachname");
					String emailT = result.getString("email");
					
					System.out.println("Kunden: " + kidT + " " + vornameT + " " + nachnameT 
							+ " " + emailT );
				}
				
				
			// e) Update Rehfeld --> Rehfeld Müller
				String sqlUpdate = "UPDATE kunden SET nachname='Rehfeld-Müller' "
						+ "WHERE vorname = 'Lara'";
				
				stat.executeUpdate(sqlUpdate);
				
				
				// Tabelle auslesen
				// ResultSet result = stat.executeQuery("Select)
			}
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
		}

	}

