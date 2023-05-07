package com.techmex.techmex.Data.Providers.Mapper.Imp;

import com.techmex.techmex.Data.Entities.LineasOrdenModel;
import com.techmex.techmex.Data.Providers.Mapper.IMapper;
import com.techmex.techmex.Dtos.LineasOrdenDto;
import org.springframework.stereotype.Component;

@Component
public class LineasOrdenMapper implements IMapper<LineasOrdenModel, LineasOrdenDto> {
    @Override
    public LineasOrdenDto mapToDto(LineasOrdenModel lineasOrdenModel) {
        return LineasOrdenDto.builder()
                .linea_orden_id(lineasOrdenModel.getLinea_orden_id())
                //.orden_id(lineasOrdenModel.getOrden_id())
                .cantidad(lineasOrdenModel.getCantidad())
                //.producto_id(lineasOrdenModel.getProducto_id())
                .build();
    }

    @Override
    public LineasOrdenModel mapToEntity(LineasOrdenDto lineasOrdenDto) {
        return null;
    }
}
