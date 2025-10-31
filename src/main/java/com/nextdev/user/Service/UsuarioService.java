package com.nextdev.user.Service;

import com.nextdev.user.Mappers.UsuarioMapper;
import com.nextdev.user.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioMapper mapper;

    @Autowired
    UsuarioRepository repository;



}
