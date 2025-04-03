package com.example.demo.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @ManyToMany
    @JoinTable(
            name = "estudiante_curso",
            joinColumns = @JoinColumn(name = "estudiante_id"),
            inverseJoinColumns = @JoinColumn(name = "curso_id")
    )
    private List<Curso> cursos;

    public Estudiante() {}

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
}