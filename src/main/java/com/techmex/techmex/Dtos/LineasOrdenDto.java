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

    private Integer lineasOrden_id;
    private Integer factura_id;
    private Integer producto_id;

}
