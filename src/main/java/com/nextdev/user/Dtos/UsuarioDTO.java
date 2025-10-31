package com.nextdev.user.Dtos;

import jakarta.validation.constraints.NotNull;

public record UsuarioDTO(
    String email,
    String nome )
{}
