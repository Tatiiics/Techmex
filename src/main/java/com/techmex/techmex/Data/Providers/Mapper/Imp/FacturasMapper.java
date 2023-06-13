package com.techmex.techmex.Data.Providers.Mapper.Imp;

import com.techmex.techmex.Data.Entities.FacturasModel;
import com.techmex.techmex.Data.Providers.Mapper.IMapper;
import com.techmex.techmex.Dtos.FacturasDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Component
@AllArgsConstructor
public class FacturasMapper implements IMapper<FacturasModel, FacturasDto> {

    @Override
    public FacturasDto mapToDto(FacturasModel facturasModel) {
        Date fechaActual = facturasModel.getFecha();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        formatoFecha.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));

        String fechaHoraEspaña = formatoFecha.format(fechaActual);

        return FacturasDto.builder()
                .factura_id(facturasModel.getFactura_id())
                .fecha(fechaHoraEspaña)
                .total(facturasModel.getTotal())
                .formasPago(facturasModel.getFormasPago())
                .num_mesa(facturasModel.getNum_mesa())
                .usuario_id((facturasModel.getUsuario()==null)? null: facturasModel.getUsuario().getId_usuario())
                .estadoPedidoRolEnum(facturasModel.getEstadoPedidoRol())
                .servicioEnum(facturasModel.getServicioEnum())
                .build();
    }

    @Override
    public FacturasModel mapToEntity(FacturasDto facturasDto) {
        return null;
    }
}
