package com.techmex.techmex.Dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class LineasOrdenDto {

    private Integer id_linea_orden;
    private Integer id_orden;
    private Integer cantidad;
    private Integer id_producto;

}
