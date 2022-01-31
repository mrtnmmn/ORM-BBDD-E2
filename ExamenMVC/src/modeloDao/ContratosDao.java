package modeloDao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.Conexion;
import modeloVo.ListaInmuebles;

public class ContratosDao {


    public static void newContract(String codContrato, String codInq, String codInmueble, String inquilino, Date fecha, Date fechaVencimiento, int precio ) {

        Conexion connection = new Conexion();

        String query01 = "insert into Contratos values (?,?,?,?,?,?)";

        try {
            PreparedStatement ps01 = connection.getConection().prepareStatement(query01);
            
            ps01.setString(1, codContrato);
            ps01.setString(2, codInq);
            ps01.setString(3, codInmueble);
            ps01.setDate(4, fecha);
            ps01.setDate(5, fechaVencimiento);
            ps01.setInt(6, precio);

            connection.getConection().setAutoCommit(false);

            ps01.executeUpdate();

            connection.getConection().commit();
            connection.getConection().setAutoCommit(true);

        }catch(SQLException sqle) {
            sqle.printStackTrace();
        }
    }

}
