package com.projetoInicial.controllers;

import com.projetoInicial.models.ProdutoEntity;
import com.projetoInicial.models.UsuarioEntity;
import com.projetoInicial.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping("/")
    public ModelAndView listar(){

        ModelAndView modelAndView = new ModelAndView("produtos");

        List<ProdutoEntity> produtoServiceList = produtoService.listar();

        modelAndView.addObject("listaDeProdutos",produtoServiceList);

        return modelAndView;
    }

    @GetMapping("/add")
    public String addShowPage(ProdutoEntity produtoEntity){

        return "produtos_add";
    }

    @PostMapping("/add")
    public String add(ProdutoEntity produtoEntity){

        produtoService.save(produtoEntity);

        return "redirect:/produtos/";
    }

    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable(value = "id") Long id){

        ProdutoEntity produtoEntity  =new ProdutoEntity();

        produtoEntity = produtoService.findProdutoById(id);

        produtoService.deletar(produtoEntity);

        return "redirect:/produtos/";
    }

    @GetMapping("editar/{id}")
    public ModelAndView editarPage(@PathVariable(value = "id") Long id){
        ModelAndView modelAndView = new ModelAndView("produtos_editar");
        ProdutoEntity produtoEntity = produtoService.findProdutoById(id);

        modelAndView.addObject("produtoEntity",produtoEntity);

        return modelAndView;

    }

    @PostMapping("editar/{id}")
    public String editar(ProdutoEntity produtoEntity){

        produtoService.save(produtoEntity);

        return "redirect:/produtos/";

    }



}
