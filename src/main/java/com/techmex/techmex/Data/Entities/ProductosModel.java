package com.techmex.techmex.Data.Entities;

import javax.persistence.*;
import javax.validation.constraints.Min;

import com.techmex.techmex.Data.Entities.enums.CategoriaRol;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "Productos")
public class ProductosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer producto_id;
    @Column(nullable = false, length = 50, unique = true )//para que no sea null el valor
    private String nombre;
    @Min(0)
    @Column(nullable = false)
    private Double precio;
    @Column(length = 250)
    private String descripcion;
    @Column(length = 30, name = "categoria_rol")
    @Enumerated(EnumType.STRING)
    private CategoriaRol categoriaRol;

}
