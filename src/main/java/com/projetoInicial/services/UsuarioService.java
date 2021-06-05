package com.projetoInicial.services;

import com.projetoInicial.models.UsuarioEntity;
import com.projetoInicial.repositorys.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public List<UsuarioEntity> findAll(){

        return usuarioRepository.findAll();
    }

    public boolean save(UsuarioEntity usuarioEntity) {

        if(!usuarioEntity.getEmail().equals("")){
            UsuarioEntity usuarioEncontrado = findUsuarioEntityByEmail(usuarioEntity.getEmail());

            if(usuarioEncontrado == null){
                usuarioRepository.save(usuarioEntity);
                return true;
            }
            return false;
        }

        return false;


    }

    public void delete(UsuarioEntity usuarioEntity) {

        usuarioRepository.delete(usuarioEntity);
    }

    public UsuarioEntity findUsuarioEntityByEmail(String email){

        UsuarioEntity usuarioEntity = usuarioRepository.findUsuarioEntityByEmail(email);

        return  usuarioEntity;
    }


    public UsuarioEntity findUsuarioEntityByid(Long id) {

        return usuarioRepository.findUsuarioEntityByid(id);
    }


}
