package com.techmex.techmex.Data.Providers.Mapper.Imp;

import com.techmex.techmex.Data.Entities.FacturasModel;
import com.techmex.techmex.Data.Providers.Mapper.IMapper;
import com.techmex.techmex.Dtos.FacturasDto;

public class FacturasMapper implements IMapper<FacturasModel, FacturasDto> {

    @Override
    public FacturasDto mapToDto(FacturasModel facturasModel) {
        return FacturasDto.builder()
                .factura_id(facturasModel.getFactura_id())
                .fecha(facturasModel.getFecha())
                .total(facturasModel.getTotal())
                .efectivo(facturasModel.getEfectivo())
                .cambio(facturasModel.getCambio())
                //.forma_pago_id(facturasModel.getForma_pago_id())
                //.orden_id(facturasModel.getOrden_id())
                .build();
    }

    @Override
    public FacturasModel mapToEntity(FacturasDto facturasDto) {
        return null;
    }
}
