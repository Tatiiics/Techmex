package com.techmex.techmex.Data.Providers.Mapper.Imp;

import com.techmex.techmex.Data.Entities.FacturasModel;
import com.techmex.techmex.Data.Providers.Mapper.IMapper;
import com.techmex.techmex.Dtos.FacturasDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class FacturasMapper implements IMapper<FacturasModel, FacturasDto> {

    @Override
    public FacturasDto mapToDto(FacturasModel facturasModel) {
        return FacturasDto.builder()
                .factura_id(facturasModel.getFactura_id())
                .fecha(facturasModel.getFecha())
                .total(facturasModel.getTotal())
                .formasPago(facturasModel.getFormasPago())
                .num_mesa(facturasModel.getNum_mesa())
                .usuario_id((facturasModel.getUsuario()==null)? null: facturasModel.getUsuario().getId_usuario())
                .build();
    }

    @Override
    public FacturasModel mapToEntity(FacturasDto facturasDto) {
        return null;
    }
}
