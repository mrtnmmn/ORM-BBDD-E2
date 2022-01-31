package modeloVo;

import java.sql.Date;

public class ListaInmuebles {

	public String codInmueble;
	public String direccion;
	public int precio;
	public boolean estado;
	public Date fechaVencimiento;
	public String propietario;
	public String telefono;
	public int tamaño;
	public boolean piscina;
	public boolean garaje;
	public boolean jardin;
	public ListaInmuebles(String codInmueble, String direccion, int precio, boolean estado, Date fechaVencimiento,
			String propietario, String telefono, int tamaño, boolean piscina, boolean garaje, boolean jardin) {
		super();
		this.codInmueble = codInmueble;
		this.direccion = direccion;
		this.precio = precio;
		this.estado = estado;
		this.fechaVencimiento = fechaVencimiento;
		this.propietario = propietario;
		this.telefono = telefono;
		this.tamaño = tamaño;
		this.piscina = piscina;
		this.garaje = garaje;
		this.jardin = jardin;
	}
	
	public String getCodInmueble() {
		return codInmueble;
	}
	public void setCodInmueble(String codInmueble) {
		this.codInmueble = codInmueble;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public boolean isPiscina() {
		return piscina;
	}
	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}
	public boolean isGaraje() {
		return garaje;
	}
	public void setGaraje(boolean garaje) {
		this.garaje = garaje;
	}
	public boolean isJardin() {
		return jardin;
	}
	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}
	
	
	
	
}
