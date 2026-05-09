package com.ejemplo.demo.api.dto;

import java.time.Instant;

public record CategoriaResponse(
        Long id,
        String nombre,
        String descripcion,
        Instant creadoEn
) {
} 
