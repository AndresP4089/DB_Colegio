package com.example.demo.Model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
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
}