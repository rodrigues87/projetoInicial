package com.projetoInicial.repositorys;

import com.projetoInicial.models.SateliteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SateliteRepository extends JpaRepository<SateliteEntity, Long> {

    SateliteEntity findSateliteEntityById(int id);
}
