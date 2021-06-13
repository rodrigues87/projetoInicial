package com.projetoInicial.services;

import com.projetoInicial.models.ProdutoEntity;
import com.projetoInicial.repositorys.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<ProdutoEntity> listar(){

        return produtoRepository.findAll();
    }

    public void save(ProdutoEntity produtoEntity) {

        produtoRepository.save(produtoEntity);
    }

    public void deletar(ProdutoEntity produtoEntity) {

        produtoRepository.delete(produtoEntity);
    }

    public ProdutoEntity findProdutoById(Long id) {

        return produtoRepository.findProdutoById(id);
    }
}
