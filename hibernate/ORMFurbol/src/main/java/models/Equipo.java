package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany
    private List<Contrato> contrtos = new ArrayList<>();

}
