package DAOmodels;

import VOmodels.VOvuelo;
import connection.Conn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOvuelo {

    public static ArrayList<VOvuelo> getVuelos() {
        Conn connection = new Conn();
        ArrayList<VOvuelo> vuelos = new ArrayList<>();

        String query = "select vuNumVuelo, vuOrigen, vuDestino, vuFecha from Vuelos";

        try {
            PreparedStatement ps = connection.getConection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                vuelos.add(new VOvuelo(
                        rs.getInt("vuNumVuelo"),
                        rs.getString("vuOrigen"),
                        rs.getString("vuDeastino"),
                        rs.getDate("vuFecha")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return vuelos;
    }
}
