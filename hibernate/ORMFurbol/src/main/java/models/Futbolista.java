package models;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Futbolistas")
public class Futbolista {

    @Column(name = "fuNumFicha")
    @Id
    private int numFicha;

    @Column(name = "fuNombre")
    private String nombre;

    @Column(name = "fuApellidos")
    private String apellidos;

    @Column(name = "fuFechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @Column(name = "fuAltura")
    private int altura;

    @Column(name = "fuSueldo")
    private int sueldo;

    @OneToMany(mappedBy = "futbolista",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Contrato> contratos = new ArrayList<>();

    public Futbolista() {
    }

    public Futbolista(int numFicha, String nombre, String apellidos, Date fechaNacimiento, int altura, int sueldo) {
        this.numFicha = numFicha;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.sueldo = sueldo;
    }

    public Futbolista(int numFicha, String nombre, String apellidos, Date fechaNacimiento, int altura, int sueldo, List<Contrato> contratos) {
        this.numFicha = numFicha;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.sueldo = sueldo;
        this.contratos = contratos;
    }

    public int getNumFicha() {
        return numFicha;
    }

    public void setNumFicha(int numFicha) {
        this.numFicha = numFicha;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Futbolista that = (Futbolista) o;
        return numFicha == that.numFicha && altura == that.altura && sueldo == that.sueldo && Objects.equals(nombre, that.nombre) && Objects.equals(apellidos, that.apellidos) && Objects.equals(fechaNacimiento, that.fechaNacimiento) && Objects.equals(contratos, that.contratos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numFicha, nombre, apellidos, fechaNacimiento, altura, sueldo, contratos);
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "numFicha=" + numFicha +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", altura=" + altura +
                ", sueldo=" + sueldo +
                ", contratos=" + contratos +
                '}';
    }
}
