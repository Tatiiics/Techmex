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
@Table(name="LineasOrden")

public class LineasOrdenModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremento del id
    private Integer  linea_orden_id;
    private Integer orden_id;

    @Column(nullable = false)
    private Integer cantidad;
    private Integer  producto_id;

}
