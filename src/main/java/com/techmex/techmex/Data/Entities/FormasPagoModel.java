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
@Table(name = "Formas_Pago")

public class FormasPagoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer forma_pago_id;
    @Column(nullable = false)
    private String forma_pago;
}
