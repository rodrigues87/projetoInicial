package com.projetoInicial.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ProdutoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double valor;

    @ManyToOne
    private VendaEntity vendaEntity;

    public VendaEntity getVendaEntity() {
        return vendaEntity;
    }

    public void setVendaEntity(VendaEntity vendaEntity) {
        this.vendaEntity = vendaEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
