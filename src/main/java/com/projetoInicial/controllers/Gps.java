package com.projetoInicial.controllers;

import com.projetoInicial.models.LocalizacaoEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/gps")
public class Gps {

    @GetMapping("/")
    public String showPage(){

        return "gps";
    }

    @PostMapping("/")
    public @ResponseBody ModelAndView postLocation(@RequestBody LocalizacaoEntity localizacaoEntity){
        ModelAndView modelAndView =new ModelAndView("usuarios_listar");

        return modelAndView;
    }
}
