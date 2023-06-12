package com.techmex.techmex.Dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PedidoDTO {

    private Integer idFactura;
    private List<String> productos;
    private Integer numeroMesa;
    private String tomarLlevar;
    private String estadoPedido;
    private String opcion;

}
