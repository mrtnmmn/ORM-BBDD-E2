package model;

import javax.persistence.*;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Proyectos")
public class Proyecto {

    @Column(name = "prCodigo")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(name = "prNombre")
    private String nombre;

    @ManyToMany(targetEntity = Proyecto.class)
    private List<Proyecto> proyectos = new ArrayList<>();



}
