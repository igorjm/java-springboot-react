package com.tds.igorjm.backend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "cliente")
public class Cliente {

    @Id
    private int id;
    private String nome;
    private String endereco;
    private Boolean ativo;

    public Cliente() {
    }

    public Cliente(String nome, String endereco, Boolean ativo) {
        this.nome = nome;
        this.endereco = endereco;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
