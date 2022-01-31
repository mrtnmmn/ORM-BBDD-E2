package controlador;

import modeloDao.ListaInmueblesDAO;
import modeloDao.ZonasDao;
import modeloDao.ContratosDao;
import modeloVo.ListaInmuebles;
import modeloVo.Zonas;

import javax.swing.*;

import java.sql.Date;
import java.util.ArrayList;

public class Cont {

    public static ArrayList<Zonas> getComboZonas() {

        return ZonasDao.getZonas();

    }

    public static void actualizarContratosController(String param1, int param2) {
        ZonasDao.actualizarContratos(param1, param2);
    }
    
    public static ArrayList<ListaInmuebles> getListaInmuebles(String cod) {
    	return ListaInmueblesDAO.getListas(cod);
    }
    
    public static void nuevoContrato(String codContrato, String codInq, String codInmueble, String inquilino, Date fecha, Date fechaVencimiento, int precio) {
    	ContratosDao.newContract(codContrato, codInq, codInmueble, inquilino, fecha, fechaVencimiento, precio);
    }

}
