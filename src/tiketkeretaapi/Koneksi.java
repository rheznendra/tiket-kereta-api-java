package tiketkeretaapi;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RZ
 */
public class Koneksi {

	public Connection conn;
	public static String driverName = "oracle.jdbc.driver.OracleDriver",
			url = "jdbc:oracle:thin:@localhost:1521:xe",
			userDB = "rz",
			passDB = "root";

	public Koneksi() {
		conn = getKoneksi();
	}

	public static Connection getKoneksi() {
		try {
			Class.forName(driverName);
			return DriverManager.getConnection(url, userDB, passDB);
		} catch (SQLException | ClassNotFoundException ex) {
			Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
}
