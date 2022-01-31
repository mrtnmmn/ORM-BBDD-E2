package modeloDao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.Conexion;
import modeloVo.ListaInmuebles;
import modeloVo.Zonas;

public class ListaInmueblesDAO {

    public static ArrayList<ListaInmuebles> getListas(String cod) {
        Conexion connection = new Conexion();
        ArrayList<ListaInmuebles> sol = new ArrayList<>();

        String query = "select inCodigo, Inmuebles.inDireccion, inPrecio, inEstado, C.coFechaVencimiento, I.inNombre, I.inTelefono, inSuperficie, inPiscina, inGaraje, inJardin from Inmuebles "
        		+ "join Contratos C on Inmuebles.inCodigo = C.coCodInmueble "
        		+ "join Inquilinos I on C.coDNIInquilino = I.inDNI "
        		+ "where inCodZona = '"+ cod + "'";

        try {
            PreparedStatement ps = connection.getConection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                sol.add(new ListaInmuebles(
                        rs.getString("inCodigo"),
                        rs.getString("inDireccion"),
                        rs.getInt("inPrecio"),
                        rs.getBoolean("inEstado"),
                        rs.getDate("coFechaVencimiento"),
                        rs.getString("inNombre"),
                        rs.getString("inTelefono"),
                        rs.getInt("inSuperficie"),
                        rs.getBoolean("inPiscina"),
                        rs.getBoolean("inGaraje"),
                        rs.getBoolean("inJardin")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return sol;
    }

	
}
