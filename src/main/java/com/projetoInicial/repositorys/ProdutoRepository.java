package com.projetoInicial.repositorys;

import com.projetoInicial.models.ProdutoEntity;
import com.projetoInicial.models.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {

    ProdutoEntity findProdutoById(Long id);
}
