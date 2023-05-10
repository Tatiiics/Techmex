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
@Table(name="LineasOrden")

public class LineasOrdenModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremento del id
    private Integer  linea_orden_id;


    @Column(nullable = false)
    private Integer cantidad;
    @ManyToOne
    @JoinColumn(name = "orden_id")
    private OrdenesModel orden;
    @ManyToOne
    @JoinColumn(name = "producto_id")
    private ProductosModel producto;

}
