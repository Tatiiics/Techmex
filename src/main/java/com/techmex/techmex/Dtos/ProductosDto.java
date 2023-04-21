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

    private Integer id_producto;
    private String nombre;
    private Integer precio;
    private Integer id_categorias;
    private String imagen;
    private String descripcion;

}
