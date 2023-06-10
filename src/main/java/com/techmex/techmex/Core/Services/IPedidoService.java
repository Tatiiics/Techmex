package com.techmex.techmex.Core.Services;

import com.techmex.techmex.Dtos.PedidoDTO;

import java.util.List;

public interface IPedidoService {

    void comprar(Double total, Integer numeroMesa, String[] lista);
    List<PedidoDTO> listaPedidos();
    void pasarEstadoHecho(Integer facturaId);

    void pasarEstadoPagado(Integer facturaId);

}
