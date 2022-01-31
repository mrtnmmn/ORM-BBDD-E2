package VOmodels;

import java.sql.Date;

public class VOvuelo {

    public int numVuelo;
    public String origen;
    public String destino;
    public Date fecha;

    public VOvuelo(int numVuelo, String origen, String destino, Date fecha) {
        this.numVuelo = numVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
