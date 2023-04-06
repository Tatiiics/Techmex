package com.techmex.techmex.Data.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name="Ordenes_Facturas")
public class Ordenes_FacturasModel  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremento del id
    private Integer id_orden_factura;
    @Column(nullable = false)
    private Integer id_orden;
    private Integer id_factura;
}
