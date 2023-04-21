package com.techmex.techmex.Data.Providers.Mapper.Imp;

import com.techmex.techmex.Data.Entities.CategoriasModel;
import com.techmex.techmex.Data.Providers.Mapper.IMapper;
import com.techmex.techmex.Dtos.CategoriasDto;

public class CategoriasMapper implements IMapper<CategoriasModel, CategoriasDto> {
    @Override
    public CategoriasDto mapToDto(CategoriasModel categoriasModel) {
        return CategoriasDto.builder()
                .id_categorias(categoriasModel.getId_categorias())
                .categorias(categoriasModel.getCategorias())
                .build();
    }

    @Override
    public CategoriasModel mapToEntity(CategoriasDto categoriasDto) {
        return null;
    }

}
