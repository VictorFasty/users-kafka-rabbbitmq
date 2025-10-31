package com.nextdev.user.Controllers;


import com.nextdev.user.Service.UsuarioService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService service;



    @GetMapping("/all")
    public ResponseEntity<?> FindAll() {
        return service.findAll();
    }


    
}
