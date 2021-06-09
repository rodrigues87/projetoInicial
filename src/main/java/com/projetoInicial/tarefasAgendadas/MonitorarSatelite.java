package com.projetoInicial.tarefasAgendadas;

import com.projetoInicial.services.SateliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MonitorarSatelite {

    @Autowired
    SateliteService sateliteService;

    @Scheduled(fixedRate = 2000)
    public void verificarDataHoraAtual(){

        sateliteService.buscarSatelite();

    }
}
