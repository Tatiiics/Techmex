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
public class ServiciosDto {
    private Integer id_servicio;
    private boolean llevar;
    private Integer num_mesas;
    private Integer id_cliente;
}
