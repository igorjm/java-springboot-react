package com.tds.igorjm.backend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection= "pedido")
public class Pedido {

    @Id
    private int id;
    private Cliente cliente;
    private List<Livro> livroList;
    private Date data;



}
