package com.techmex.techmex.Core.Services;

import com.techmex.techmex.Data.Entities.enums.EstadoPedidoRolEnum;
import com.techmex.techmex.Data.Entities.enums.FormasPago;
import com.techmex.techmex.Data.Entities.enums.ServicioEnum;
import com.techmex.techmex.Dtos.FacturasDto;

import java.util.Date;
import java.util.List;

public interface IFacturasService {
    List<FacturasDto> getListaFacturas();
    FacturasDto getFacturasId(Integer id);


    FacturasDto insertFacturas(Date fecha, Double total, int num_mesa, FormasPago formasPago, Integer usuario_id, EstadoPedidoRolEnum estadoPedidoRolEnum, ServicioEnum servicioEnum);

    FacturasDto updateFacturas(Integer id, Date fecha, Double total,  int num_mesa, FormasPago formasPago, Integer usuario_id);


    void deleteFacturasId(Integer id);

}
