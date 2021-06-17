package com.projetoInicial.repositorys;

import com.projetoInicial.models.UsuarioEntity;
import com.projetoInicial.models.VendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<VendaEntity, Long> {

}
