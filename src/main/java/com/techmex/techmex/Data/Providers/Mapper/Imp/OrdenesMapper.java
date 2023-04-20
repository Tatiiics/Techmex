package com.techmex.techmex.Data.Providers.Mapper.Imp;

import com.techmex.techmex.Data.Entities.OrdenesModel;
import com.techmex.techmex.Data.Providers.Mapper.IMapper;
import com.techmex.techmex.Dtos.OrdenesDto;
import org.springframework.stereotype.Component;

@Component
public class OrdenesMapper implements IMapper<OrdenesModel, OrdenesDto> {
    @Override
    public OrdenesDto mapToDto(OrdenesModel ordenesModel) {
        return null;
    }

    @Override
    public OrdenesModel mapToEntity(OrdenesDto ordenesDto) {
        return null;
    }
}
