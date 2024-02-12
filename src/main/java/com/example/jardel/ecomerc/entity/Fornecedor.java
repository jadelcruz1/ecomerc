package com.example.jardel.ecomerc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "fornecedores") // por convenção usa-se o nome da entidade no plural.
public class Fornecedor {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
