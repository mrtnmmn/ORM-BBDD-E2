package models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Contratos")
public class Contrato {

    @Column(name = "coNumContrato")
    @Id
    private int numContrato;

    @Column(name = "coFecContrato")
    private Date fecContrato;

    @Column(name = "coDuracion")
    private int duracion;

    @Column(name = "coFichaAnual")
    private int fichaAnual;

    @Column(name = "coClausula")
    private int clausula;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coNumContrato")
    private Futbolista futbolista;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coNumContrato")
    private Equipo equipo;



}
