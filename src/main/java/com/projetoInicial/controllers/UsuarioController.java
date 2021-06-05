package com.projetoInicial.controllers;

import com.projetoInicial.models.UsuarioEntity;
import com.projetoInicial.repositorys.UsuarioRepository;
import com.projetoInicial.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/")
    public ModelAndView listarUsuarios(){

        ModelAndView modelAndView = new ModelAndView("usuarios_listar");

        modelAndView.addObject("titulo","USUÁRIOS");

        List<UsuarioEntity> usuarioEntityList = usuarioService.findAll();

        modelAndView.addObject("listaDeUsuarios",usuarioEntityList);

        return modelAndView;
    }

    @GetMapping("/add")
    public String addUsuarioPage(UsuarioEntity usuarioEntity){

        return "usuarios_add";
    }

    @PostMapping("/add")
    public ModelAndView addUsuario(UsuarioEntity usuarioEntity){

        if(usuarioService.save(usuarioEntity)){
            return listarUsuarios();
        }

        ModelAndView modelAndView = new ModelAndView("usuarios_add");
        modelAndView.addObject("erroEmail","Email inválido");

        System.out.println("");


        return modelAndView;
    }

    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable(value = "id") Long id){

        UsuarioEntity usuarioEntity = usuarioService.findUsuarioEntityByid(id);

        usuarioService.delete(usuarioEntity);

        return "redirect:/usuarios/";
    }

    @GetMapping("/editar/{id}")
    public ModelAndView editarPage(@PathVariable(value = "id") Long id){

        UsuarioEntity usuarioEntity = usuarioService.findUsuarioEntityByid(id);

        ModelAndView modelAndView = new ModelAndView("usuarios_editar");

        modelAndView.addObject("usuarioEntity",usuarioEntity);

        return modelAndView;
    }

    @PostMapping("/editar/{id}")
    public String editar(UsuarioEntity usuarioEntity){

        usuarioService.save(usuarioEntity);

        return "redirect:/usuarios/";
    }


}
