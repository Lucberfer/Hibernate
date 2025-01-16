package org.example.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "personita")

public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    @Column(unique = true)
    private String email;

    private float salario;

    // constructores
    public Persona() {}

    public Persona(String nombre, String email, Integer id, float salario) {

        this.nombre = nombre;
        this.email = email;
        this.id = id;
        this.salario = salario;
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public float getSalario() {return salario;}

    public void setSalario(float salario) {this.salario = salario;}
}
