package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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


}
