package com.techmex.techmex.Dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OrdenesDto {
    private Integer id_orden;
    private Integer id_servicio;
    private Integer id_linea_orden;
}
