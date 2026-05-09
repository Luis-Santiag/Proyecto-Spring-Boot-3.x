package com.ejemplo.demo.api.dto;

import java.math.BigDecimal;
import java.time.Instant;

public record ProductoResponse(
        Long id,
        String nombre,
        BigDecimal precio,
        Long categoriaId,
        String categoriaNombre,
        Instant creadoEn
) {
}
