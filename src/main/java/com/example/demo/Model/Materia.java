package com.example.demo.Model;
import jakarta.persistence.*;

@Entity
@Table(name = "materias")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "curso_id", nullable = false)
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "profesor_id", nullable = false)
    private Profesor profesor;

    public Materia() {}

    public Materia(String nombre, Curso curso, Profesor profesor) {
        this.nombre = nombre;
        this.curso = curso;
        this.profesor = profesor;
    }

    // Getters y Setters
}
