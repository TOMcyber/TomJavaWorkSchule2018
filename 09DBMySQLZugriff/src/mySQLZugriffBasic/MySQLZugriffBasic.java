package mySQLZugriffBasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MySQLZugriffBasic {

	public static void main(String[] args) {
		// ====== Connection erzeugen =====

		// Connection String:
		String adresse = "localhost";
		String port = "3306";
		String namedb = "testdatenbank01";
		String user = "root";
		String passwort = "";

		String timezone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

		String urlDB = "jdbc:mysql://" + adresse + ":" + port + "/" + namedb + timezone;
		System.out.println(urlDB);
		
		// Tabelle auslesen
		// MySQL arbeitet mit SQL-Statements
		String sqlQuery = "SELECT pid, name, preis, vorraetig FROM produkte" + " WHERE name='Buch'";
		
		List<Produkte> liste = new ArrayList<Produkte>();

		try (Connection con = DriverManager.getConnection(urlDB, user, passwort); 
			Statement stm = con.createStatement();
			ResultSet result = stm.executeQuery(sqlQuery)	) {
			
			System.out.println("Connection etabliert");
			
			// Über ResultSet iterieren:
			while( result.next() ) {// solange Result Set noch ungelesen Zeile enthält
				
				int ppid = result.getInt("pid");
				String pname = result.getString("name");
				Float ppreis = result.getFloat("preis");
				boolean pvorraetig = result.getBoolean("vorraetig");
				
				System.out.println("Produkt : " + ppid + "" + ppreis +"" + pvorraetig);
				
				Produkte p =new Produkte();
				p.setPid(ppid);
				p.setName(pname);
				p.setPreis(ppreis);
				p.setVorraetig(pvorraetig);
				
				liste.add(p);
				
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}

	}

}

class Produkte {					//  Getter und Setter automatisch erstellt
	int pid;
	String name;
	float preis;
	boolean vorraetig;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPreis() {
		return preis;
	}
	public void setPreis(float preis) {
		this.preis = preis;
	}
	public boolean isVorraetig() {
		return vorraetig;
	}
	public void setVorraetig(boolean vorraetig) {
		this.vorraetig = vorraetig;
	}
	
}
