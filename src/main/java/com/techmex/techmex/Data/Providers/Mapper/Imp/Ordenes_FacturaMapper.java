package com.techmex.techmex.Data.Providers.Mapper.Imp;

import com.techmex.techmex.Data.Entities.Ordenes_FacturasModel;
import com.techmex.techmex.Data.Providers.Mapper.IMapper;
import com.techmex.techmex.Dtos.Ordenes_FacturasDto;
import org.springframework.stereotype.Component;

@Component
public class Ordenes_FacturaMapper implements IMapper<Ordenes_FacturasModel, Ordenes_FacturasDto> {
    @Override
    public Ordenes_FacturasDto mapToDto(Ordenes_FacturasModel ordenesFacturasModel) {
        return null;
    }

    @Override
    public Ordenes_FacturasModel mapToEntity(Ordenes_FacturasDto ordenesFacturasDto) {
        return null;
    }
}
