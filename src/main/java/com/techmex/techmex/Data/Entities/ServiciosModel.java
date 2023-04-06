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
@Table(name="Servicios")
public class ServiciosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremento del id
    private Integer id_servicio;
    @Column(nullable = false)
    private Boolean llevar;
    private Integer num_mesas;
    private Integer id_cliente;
}
