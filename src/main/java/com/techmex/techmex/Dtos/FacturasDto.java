package com.techmex.techmex.Dtos;

import com.techmex.techmex.Data.Entities.enums.FormasPago;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class FacturasDto {
    private Integer factura_id;

    private Date fecha;

    private Double total;

    private Double cambio;

    private FormasPago formasPago;
    private Integer orden_id;
}
