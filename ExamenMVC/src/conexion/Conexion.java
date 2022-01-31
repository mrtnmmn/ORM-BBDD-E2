package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	static String bd = "UD02BDInmobiliariaCasas";

	String user = "root";
	String password = "nerv";

	String url = "jdbc:mysql://localhost:3306/"+bd+"?serverTimezone=Europe/Madrid&useSSL = false";

	Connection conexion = null;

	public Conexion() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conexion = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConection() {
		return conexion;
	}

	public void desconectar() {
		conexion = null;
	}
}
