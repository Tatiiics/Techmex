package com.techmex.techmex.Data.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "Factura")

public class FacturaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer factura_id;
    @Column(nullable = false)
    private Date fecha;
    @Column(nullable = false)
    private Double total;
    @Column(nullable = false)
    private Boolean efectivo;
    @Column(nullable = false)
    private Double cambio;
}
