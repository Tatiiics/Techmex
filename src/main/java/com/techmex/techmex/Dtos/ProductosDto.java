package com.techmex.techmex.Dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProductosDto {

    private Integer producto_id;
    private String nombre;
    private Integer precio;
    private Integer categoria_id;
    private String imagen;
    private String descripcion;

}
