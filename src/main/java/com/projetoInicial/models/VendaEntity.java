package com.projetoInicial.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class VendaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<ProdutoEntity> produtoEntityList;

    @OneToOne
    private UsuarioEntity usuarioEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProdutoEntity> getProdutoEntityList() {
        return produtoEntityList;
    }

    public void setProdutoEntityList(List<ProdutoEntity> produtoEntityList) {
        this.produtoEntityList = produtoEntityList;
    }

    public UsuarioEntity getUsuarioEntity() {
        return usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }
}
