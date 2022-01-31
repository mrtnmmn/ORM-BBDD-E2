package modeloDao;

import conexion.Conexion;
import modeloVo.Zonas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ZonasDao {

    public static ArrayList<Zonas> getZonas() {
        Conexion connection = new Conexion();
        ArrayList<Zonas> sol = new ArrayList<>();

        String query = "select * from Zonas";

        try {
            PreparedStatement ps = connection.getConection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                sol.add(new Zonas(
                        rs.getString("zoCodigo"),
                        rs.getString("zoNombre")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return sol;
    }

    public static void actualizarContratos(String param1, int param2) {

        Conexion connection = new Conexion();

        String query01 = "call prIncrementarPrecio(param1, param2)";

        try {
            PreparedStatement ps01 = connection.getConection().prepareStatement(query01);

            connection.getConection().setAutoCommit(false);

            ps01.executeUpdate();

            connection.getConection().commit();
            connection.getConection().setAutoCommit(true);

        }catch(SQLException sqle) {
            sqle.printStackTrace();
        }
    }
	 
}