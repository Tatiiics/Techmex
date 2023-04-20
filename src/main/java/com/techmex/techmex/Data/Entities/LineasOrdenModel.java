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
    private Integer id_linea_orden;
    private Integer id_orden;

    @Column(nullable = false)
    private Integer cantidad;
    private Integer id_producto;

}
