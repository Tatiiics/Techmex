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
@Table(name="Ordenes")
public class OrdenesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremento del id
    private Integer id_orden;
    @Column(nullable = false)
    private Integer id_servicio;
    @ManyToOne
    @JoinColumn(name = "id_linea_orden")
    private LineasOrdenModel id_linea_orden;
}
