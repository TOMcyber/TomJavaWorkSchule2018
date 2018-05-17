package mySQLZugriffBasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLZugriff {

	public static void main(String[] args) {
		// === Insert, Update, Delete
		
		// Connection String:
		String adresse = "localhost";
		String port = "3306";
		String namedb = "testdatenbank01";
		String user = "root";
		String passwort = "";

		String timezone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

		String urlDB = "jdbc:mysql://" + adresse + ":" + port + "/" + namedb + timezone;
		System.out.println(urlDB);
		
		// INSERT
		String name = "Gitarre";
		float preis = 245.99F;
		int vorraetig = 1;  // wahr
		// VALUES ('Gitarre')
		String sqlInsert = "INSERT INTO produkte (name, preis, vorraetig) "
				+ " VALUES('" + name + "','" + preis + "','" + vorraetig + "') ";
		
		String sqlUpdate = "UPDATE produkte SET name='E-Gitarre', preis='170' WHERE pid='6'";
		
		String sqlDelete = "DELETE FROM produkte WHERE name='Fön'";
		
	
		
		try ( Connection con = DriverManager.getConnection(urlDB, user, passwort);
				Statement stat = con.createStatement() ) {
			
			System.out.println("Connection ok?");
			
			// Insert
			// stat.executeUpdate(sqlInsert);
			
			// Update
			 stat.executeUpdate(sqlUpdate);
			
			// Delete
			stat.executeUpdate(sqlDelete);
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			
			
		
		
		
		
		}
	}

}
