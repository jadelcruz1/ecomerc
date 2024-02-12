package com.example.jardel.ecomerc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cadastros") // por convenção usa-se o nome da entidade no plural.
public class Cadastro {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)

    Long id;
    String rua;
    String numero;
    String cnpj;
    String bairro;
    String cidade;
    String estado;

    public Long getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
