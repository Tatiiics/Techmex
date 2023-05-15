package com.techmex.techmex.Data.Providers.Impl;

import com.techmex.techmex.Data.Dao.IMesasDao;
import com.techmex.techmex.Data.Entities.MesasModel;
import com.techmex.techmex.Data.Providers.IMesasProvider;
import com.techmex.techmex.Data.Providers.IUsuariosProvider;
import com.techmex.techmex.Data.Providers.Mapper.IMapper;
import com.techmex.techmex.Dtos.MesasDto;
import com.techmex.techmex.Dtos.UsuariosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MesasProvider implements IMesasProvider {
    private final IMesasDao iMesasDao;
    private final IMapper <MesasModel, MesasDto> mapperMesas;


    @Override
    public List<MesasDto> getMesas() {
        return iMesasDao.findAll().stream()
                .map(mapperMesas::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public MesasDto getMesasId(Integer id) {
        return null;
    }

    @Override
    public MesasDto insertMesas(Integer capacidad, Integer qr, boolean llevar) {
        return null;
    }

    @Override
    public MesasDto updateMesas(Integer id, Integer capacidad, Integer qr, boolean llevar) {
        return null;
    }

    @Override
    public void deleteMesasId(Integer id) {

    }
}
