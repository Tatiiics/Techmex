package com.techmex.techmex.Data.Providers.Mapper.Imp;

import com.techmex.techmex.Data.Entities.ServiciosModel;
import com.techmex.techmex.Data.Providers.Mapper.IMapper;
import com.techmex.techmex.Dtos.ServiciosDto;
import org.springframework.stereotype.Component;

@Component
public class ServiciosMapper implements IMapper<ServiciosModel, ServiciosDto> {
    @Override
    public ServiciosDto mapToDto(ServiciosModel serviciosModel) {
        return null;
    }

    @Override
    public ServiciosModel mapToEntity(ServiciosDto serviciosDto) {
        return null;
    }
}
