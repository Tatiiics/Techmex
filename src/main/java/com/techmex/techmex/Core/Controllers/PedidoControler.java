package com.techmex.techmex.Core.Controllers;

import com.techmex.techmex.Core.Services.IFacturasService;
import com.techmex.techmex.Core.Services.IPedidoService;
import com.techmex.techmex.Dtos.PedidoDTO;
import lombok.AllArgsConstructor;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/pedido")
public class PedidoControler {

    private final IPedidoService iPedidoService;


    @GetMapping("/list")
    public List<PedidoDTO> getListaPedidos() {
        return iPedidoService.listaPedidos();
    }

    @PutMapping("/comprar")
    public void comprar(Double total, Integer numeroMesa, String[] lista, String formaPago, String opciones) {
        System.out.println(formaPago + opciones);
        iPedidoService.comprar(total,numeroMesa, lista, formaPago, opciones);
    }

    @PostMapping("/pasarEstadoHecho")
    public void pasarEstadoHecho(Integer facturaId) {
        iPedidoService.pasarEstadoHecho(facturaId);
    }

    @PostMapping("/pasarEstadoPagado")
    public void pasarEstadoPagado(Integer facturaId) {
        iPedidoService.pasarEstadoPagado(facturaId);
    }
}
