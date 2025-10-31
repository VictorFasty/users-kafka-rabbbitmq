package com.nextdev.user.Mappers;


import com.nextdev.user.Dtos.UsuarioDTO;
import com.nextdev.user.model.Usuario;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    UsuarioDTO toDto(Usuario usuario);
    Usuario toEntity(UsuarioDTO usuarioDTO);
}
