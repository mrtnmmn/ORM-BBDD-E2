package model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "Personas", schema = "UC03Hibernate", 
	indexes = {@Index(name = "nbIndex", columnList = "apellidos", unique = true)})

/*
@SequenceGenerator(
		name = "PersonaSeq",
		sequenceName = "id_Persona",
		initialValue = 1,
		allocationSize = 10) */

@TableGenerator(
		name = "PersonaTable",
		initialValue = 1,
		pkColumnName = "Entity",
		pkColumnValue = "ID",
		allocationSize = 10,
		table = "Entity_Generator")

public class Persona implements Serializable{

	@Id
	@Column(name = "peId_Persona")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PersonaSeq")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PersonaTable")
	
	private Integer idPersona;
	
	@Column(name = "peNombre", length = 15, nullable = false)
	private String nombre;
	
	@Column(name = "peApellidos", length = 45, nullable = false, unique = true)
	private String apellidos;
	
	@Column(name = "peSalario", scale = 2)
	private Double salario;
	
	@Column(name = "peFecNacimiento", updatable = false)
	@Temporal(TemporalType.DATE)
	private Calendar fechaNacimiento;
	
	private Estado estado;
	
	public enum Estado{
		Casado,
		Divorciado,
		Soltero,
		Viudo
	}
	
	public Persona() {
		super();
	}

	public Persona(Integer idPersona, String nombre, String apellidos, Double salario, Calendar fechaNacimiento,
			Estado estado) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
		this.estado = estado;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPersona);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(idPersona, other.idPersona);
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario="
				+ salario + ", fechaNacimiento=" + fechaNacimiento + ", estado=" + estado + "]";
	}
	
	
	
}
