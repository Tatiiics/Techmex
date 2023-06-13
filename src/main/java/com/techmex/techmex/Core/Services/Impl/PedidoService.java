package com.techmex.techmex.Core.Services.Impl;

import com.techmex.techmex.Core.Services.IPedidoService;
import com.techmex.techmex.Data.Entities.enums.EstadoPedidoRolEnum;
import com.techmex.techmex.Data.Entities.enums.FormasPago;
import com.techmex.techmex.Data.Entities.enums.ServicioEnum;
import com.techmex.techmex.Data.Providers.IFacturasProvider;
import com.techmex.techmex.Data.Providers.ILineasOrdenProvider;
import com.techmex.techmex.Data.Providers.IProductosProvider;
import com.techmex.techmex.Dtos.FacturasDto;
import com.techmex.techmex.Dtos.LineasOrdenDto;
import com.techmex.techmex.Dtos.PedidoDTO;
import com.techmex.techmex.Dtos.ProductosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class PedidoService implements IPedidoService {

    private final IFacturasProvider facturasProvider;
    private final ILineasOrdenProvider iLineasOrdenProvider;
    private final IProductosProvider iProductosProvider;

    @Override
    public void comprar(Double total, Integer numeroMesa, String[] lista, String formaPago, String opciones) {
        Date fechaactual = new Date();
        fechaactual.getTime();

        //TODO MEJORAR CODIGO
        FacturasDto facturasDto = facturasProvider.insertFacturas(fechaactual, total, numeroMesa, FormasPago.valueOf(formaPago.toUpperCase()), 1, EstadoPedidoRolEnum.PEDIDO, ServicioEnum.valueOf(opciones.toUpperCase()));

        for(int i = 0; i < lista.length; i++) {
            ProductosDto productosDto = iProductosProvider.getProductoNombre(lista[i].replace("[", "").replace("]", "").replace("\"", ""));
            iLineasOrdenProvider.insertLineasOrden(facturasDto.getFactura_id(), productosDto.getId());
        }
    }
    @Override
    public List<PedidoDTO> listaPedidos() {
        List<PedidoDTO> listaPedidos = new ArrayList<>();
        List<FacturasDto> facturasDtos = facturasProvider.getFacturas();

        for(int i = 0; i < facturasDtos.size(); i++) {

            List<LineasOrdenDto> lineasOrdenDtos = iLineasOrdenProvider.getAllByFacturasId(facturasDtos.get(i).getFactura_id());
            List<String> listaProductos = new ArrayList<>();

            for (int j = 0; j < lineasOrdenDtos.size(); j++) {
                listaProductos.add(iProductosProvider.getProductosId(lineasOrdenDtos.get(j).getProducto_id()).getNombre());

            }
            listaPedidos.add(new PedidoDTO(facturasDtos.get(i).getFactura_id(),listaProductos, facturasDtos.get(i).getNum_mesa(), facturasDtos.get(i).getServicioEnum().name(), facturasDtos.get(i).getEstadoPedidoRolEnum().name(), facturasDtos.get(i).getServicioEnum().name()));

        }


        return listaPedidos;
    }

    @Override
    public void pasarEstadoHecho(Integer facturaId) {
        facturasProvider.cambiarEstadoHecho(facturaId);
    }

    @Override
    public void pasarEstadoPagado(Integer facturaId) {
        facturasProvider.cambiarEstadoPagado(facturaId);
    }
}
