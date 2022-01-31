package models;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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
    private Date fechaNacimiento;

    @Column(name = "fuAltura")
    private int altura;

    @Column(name = "fuSueldo")
    private int sueldo;

    @OneToMany
    private List<Contrato> contrtos = new ArrayList<>();



}
