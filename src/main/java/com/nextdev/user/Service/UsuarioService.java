package com.nextdev.user.Service;


import com.nextdev.user.Mappers.UsuarioMapper;
import com.nextdev.user.Repositories.UsuarioRepository;
import com.nextdev.user.model.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UsuarioService {


    private final UsuarioMapper mapper;
    private final UsuarioRepository repository;

    public ResponseEntity<List<Usuario>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

}
