package com.projetoInicial.controllers;

import com.projetoInicial.models.ProdutoEntity;
import com.projetoInicial.models.UsuarioEntity;
import com.projetoInicial.models.VendaEntity;
import com.projetoInicial.services.ProdutoService;
import com.projetoInicial.services.UsuarioService;
import com.projetoInicial.services.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/vendas")
public class VendaController {
    @Autowired
    ProdutoService produtoService;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    VendaService vendaService;

    @GetMapping("/")
    public String adicionarProdutoNaVenda(){

        ProdutoEntity produtoEntity1 = new ProdutoEntity();
        produtoEntity1.setNome("pera");
        produtoEntity1.setValor(14.00);

        produtoService.save(produtoEntity1);

        ProdutoEntity produtoEntity2 = new ProdutoEntity();
        produtoEntity2.setNome("goiaba");
        produtoEntity2.setValor(15.00);

        produtoService.save(produtoEntity2);

        List<ProdutoEntity> produtoEntityList = new ArrayList<>();

        produtoEntityList.add(produtoEntity1);
        produtoEntityList.add(produtoEntity2);



        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setNome("ADMIN");
        usuarioEntity.setEmail("123456@gmail.com");

        usuarioService.save(usuarioEntity);


        VendaEntity vendaEntity = new VendaEntity();

        vendaEntity.setProdutoEntityList(produtoEntityList);
        vendaEntity.setUsuarioEntity(usuarioEntity);

        vendaService.save(vendaEntity);

        return "dashboard";
    }
}
