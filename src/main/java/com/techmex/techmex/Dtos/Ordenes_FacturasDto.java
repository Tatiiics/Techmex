package com.techmex.techmex.Dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Ordenes_FacturasDto {
    private Integer id_orden_factura;
    private Integer id_orden;
    private Integer id_factura;
}
