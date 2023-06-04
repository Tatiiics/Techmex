package com.techmex.techmex.Data.Providers.Impl;

import com.techmex.techmex.Data.Dao.IFacturasDao;
import com.techmex.techmex.Data.Dao.IOrdenesDao;
import com.techmex.techmex.Data.Entities.FacturasModel;
import com.techmex.techmex.Data.Entities.OrdenesModel;
import com.techmex.techmex.Data.Entities.enums.FormasPago;
import com.techmex.techmex.Data.Providers.IFacturasProvider;
import com.techmex.techmex.Data.Providers.Mapper.IMapper;
import com.techmex.techmex.Dtos.FacturasDto;
import com.techmex.techmex.Util.Security.SecurityContextHelper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FacturasProvider implements IFacturasProvider {
    private final IFacturasDao iFacturasDao;

    private final IOrdenesDao iOrdenesDao;
    private final IMapper<FacturasModel,FacturasDto> mapperFacturas;

    private final SecurityContextHelper securityContextHelper;
    @Override
    public List<FacturasDto> getFacturas() {
        return iFacturasDao.findAll().stream()
                .map(mapperFacturas::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public FacturasDto getFacturasId(Integer id) {
        return iFacturasDao.findById(id)
                .map(mapperFacturas::mapToDto)
                .orElse(null);
    }

    @Override
    public FacturasDto insertFacturas(Date fecha, Double total,   Double cambio, String formasPago, Integer orden_id) {
        OrdenesModel orden = iOrdenesDao.findById(orden_id).orElse(null);
        FormasPago formasPago1 = FormasPago.valueOf(formasPago);
        FacturasModel factura = FacturasModel.builder()
                .fecha(fecha)
                .total(total)

                .cambio(cambio)
                .formasPago(formasPago1)
                .orden(orden)
                .build();

        iFacturasDao.save(factura);

        return mapperFacturas.mapToDto(factura);
    }

    @Override
    public FacturasDto updateFacturas(Integer id, Date fecha, Double total,   Double cambio, String formasPago, Integer orden_id) {
        OrdenesModel orden = iOrdenesDao.findById(orden_id).orElse(null);
        FormasPago formasPago1 = FormasPago.valueOf(formasPago);
        FacturasModel factura = iFacturasDao.findById(id).orElse(null);

        factura = factura.builder()
                .factura_id(id)
                .fecha(fecha)
                .total(total)

                .cambio(cambio)
                .formasPago(formasPago1)
                .orden(orden)
                .build();

        iFacturasDao.save(factura);

        return mapperFacturas.mapToDto(factura);
    }

    @Override
    public void deleteFacturasId(Integer id) {
        if(!iFacturasDao.existsById(id)){
            throw new RuntimeException("LA FACTURA NO EXISTE");
    }
        iFacturasDao.deleteById(id);
    }


}
