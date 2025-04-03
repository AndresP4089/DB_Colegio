package com.example.demo.Model;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @ManyToMany(mappedBy = "cursos")
    private List<Estudiante> estudiantes;

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<Materia> materias;

    public Curso() {}

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
}