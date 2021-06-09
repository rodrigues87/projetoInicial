package com.projetoInicial.tarefasAgendadas;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class VerificarData {

    //@Scheduled(fixedRate = 2000)
    public void verificarDataHoraAtual(){

        Date date = new Date();

        System.out.println("Data hora atual: "+ date);

    }
}
