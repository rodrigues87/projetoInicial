package com.projetoInicial.controllers;

import com.projetoInicial.models.AcessoEntity;
import com.projetoInicial.repositorys.AcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;

@Controller
public class InicialController {

    @Autowired
    AcessoRepository acessoRepository;

    @GetMapping("/")
    public String mostrarPaginaIncial(){

        AcessoEntity acessoEntity = new AcessoEntity();

        acessoEntity.setPagina("paginaInicial");

        Date date = new Date();

        acessoEntity.setData(date);

        acessoRepository.save(acessoEntity);

        List<AcessoEntity> acessoEntityList = acessoRepository.findAll();

        System.out.println(acessoEntityList.size());

        return "paginaInicial";
    }


}
