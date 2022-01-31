package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {

    static String bd = "BDCompanhiaAerea";

    String user = "root";
    String password = "nerv";

    String url = "jdbc:mysql://localhost:3306/"+bd+"?serverTimezone=Europe/Madrid&useSSL = false";

    Connection conexion = null;

    public Conn() {

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
