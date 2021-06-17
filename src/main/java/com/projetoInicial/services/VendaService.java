package com.projetoInicial.services;

import com.projetoInicial.models.VendaEntity;
import com.projetoInicial.repositorys.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {

    @Autowired
    VendaRepository vendaRepository;

    public List<VendaEntity> listar(){

        return vendaRepository.findAll();
    }

    public void save(VendaEntity produtoEntity) {
        vendaRepository.save(produtoEntity);
    }

    public void deletar(VendaEntity produtoEntity) {
        vendaRepository.delete(produtoEntity);
    }
}
