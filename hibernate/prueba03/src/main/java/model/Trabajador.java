package model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Trabajadores")
public class Trabajador {

    @Column(name = "trCodigo")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(name = "trNombre")
    private String nombre;

    @Column(name = "trSalario")
    private String salario;

    @ManyToMany(targetEntity = Proyecto.class)
    private List<Proyecto> proyectos = new ArrayList<>();

}
