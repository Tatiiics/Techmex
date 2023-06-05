package com.techmex.techmex.Data.Entities;


import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Embeddable
@Table(name="LineasOrden")

public class LineasOrdenModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremento del id
    private Integer  lineasOrden_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "factura_id" ,
    foreignKey = @ForeignKey(name = "FK_factura_lineaOrden"))
    private FacturasModel factura;
    @OneToOne
    @JoinColumn(name = "producto_id",
    foreignKey = @ForeignKey(name = "FK_lineaOrden_producto"))
    private ProductosModel producto;

}
