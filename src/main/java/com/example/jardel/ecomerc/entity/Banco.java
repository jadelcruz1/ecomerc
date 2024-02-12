package com.example.jardel.ecomerc.entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "produtos") // por convenção usa-se o nome da entidade no plural.
public class Banco{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)

    private Long id;
    private String nomeProduto;
    private double preco;

    public Long getId() {
        return id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}