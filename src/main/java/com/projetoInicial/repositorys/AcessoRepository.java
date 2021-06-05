package com.projetoInicial.repositorys;

import com.projetoInicial.models.AcessoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcessoRepository extends JpaRepository<AcessoEntity,Long> {
}
