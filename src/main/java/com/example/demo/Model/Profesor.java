package com.example.demo.Model;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "profesores")
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL)
    private List<Materia> materias;

    public Profesor() {}

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
}