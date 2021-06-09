package com.projetoInicial.services;

import com.projetoInicial.models.SateliteEntity;
import com.projetoInicial.repositorys.SateliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SateliteService {

    @Autowired
    SateliteRepository sateliteRepository;

    public void buscarSatelite(){

        RestTemplate restTemplate = new RestTemplate();
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.build();

        SateliteEntity satelite = restTemplate.getForObject("https://api.wheretheiss.at/v1/satellites/25544", SateliteEntity.class);

        save(satelite);
    }

    public void save(SateliteEntity sateliteEntity){
        //JÁ EXISTE UM SATELITE COM ID sateliteEntity.getId()?

        SateliteEntity sateliteEntityEncontrado = sateliteRepository.findSateliteEntityById(sateliteEntity.getId());

        if(sateliteEntityEncontrado == null){
            sateliteRepository.save(sateliteEntity);
        }else {
            update(sateliteEntityEncontrado,sateliteEntity );

        }

    }

    public void update(SateliteEntity sateliteEntityEncontrado, SateliteEntity sateliteEntityJson){

        sateliteEntityEncontrado.update(sateliteEntityJson);

        sateliteRepository.save(sateliteEntityEncontrado);

    }


}
