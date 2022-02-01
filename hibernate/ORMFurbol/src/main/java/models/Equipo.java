package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Equipos")
public class Equipo {

    @Column(name = "eqNombre")
    @Id
    private String nombre;

    @Column(name = "eqPresidente")
    private String presidente;

    @Column(name = "eqEstadio")
    private String estadio;

    @Column(name = "eqAnhoFundacion")
    private int anhoFund;

    @Column(name = "eqNumSocios")
    private int numSocios;

    @OneToMany(mappedBy = "equipo",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Contrato> contratos = new ArrayList<>();

    public Equipo() {
    }

    public Equipo(String nombre, String presidente, String estadio, int anhoFund, int numSocios) {
        this.nombre = nombre;
        this.presidente = presidente;
        this.estadio = estadio;
        this.anhoFund = anhoFund;
        this.numSocios = numSocios;
    }

    public Equipo(String nombre, String presidente, String estadio, int anhoFund, int numSocios, List<Contrato> contratos) {
        this.nombre = nombre;
        this.presidente = presidente;
        this.estadio = estadio;
        this.anhoFund = anhoFund;
        this.numSocios = numSocios;
        this.contratos = contratos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getAnhoFund() {
        return anhoFund;
    }

    public void setAnhoFund(int anhoFund) {
        this.anhoFund = anhoFund;
    }

    public int getNumSocios() {
        return numSocios;
    }

    public void setNumSocios(int numSocios) {
        this.numSocios = numSocios;
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
        Equipo equipo = (Equipo) o;
        return anhoFund == equipo.anhoFund && numSocios == equipo.numSocios && Objects.equals(nombre, equipo.nombre) && Objects.equals(presidente, equipo.presidente) && Objects.equals(estadio, equipo.estadio) && Objects.equals(contratos, equipo.contratos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, presidente, estadio, anhoFund, numSocios, contratos);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", presidente='" + presidente + '\'' +
                ", estadio='" + estadio + '\'' +
                ", anhoFund=" + anhoFund +
                ", numSocios=" + numSocios +
                ", contratos=" + contratos +
                '}';
    }
}
