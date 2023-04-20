package com.techmex.techmex.Data.Providers.Mapper.Imp;

import com.techmex.techmex.Data.Entities.LineasOrdenModel;
import com.techmex.techmex.Data.Providers.Mapper.IMapper;
import com.techmex.techmex.Dtos.LineasOrdenDto;
import org.springframework.stereotype.Component;

@Component
public class LineasOrdenMapper implements IMapper<LineasOrdenModel, LineasOrdenDto> {
    @Override
    public LineasOrdenDto mapToDto(LineasOrdenModel lineasOrdenModel) {
        return null;
    }

    @Override
    public LineasOrdenModel mapToEntity(LineasOrdenDto lineasOrdenDto) {
        return null;
    }
}
