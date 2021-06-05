package com.projetoInicial.repositorys;

import com.projetoInicial.models.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    UsuarioEntity findUsuarioEntityByid (Long id);

    UsuarioEntity findUsuarioEntityByEmail(String email);
}
