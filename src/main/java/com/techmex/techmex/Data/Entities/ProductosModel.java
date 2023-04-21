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
@Table(name = "Productos")
public class ProductosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_producto;
    @Column(nullable = false)//para que no sea null el valor
    private String nombre;
    private Integer precio;
    private String imagen;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_categorias")
    private CategoriasModel categorias;

}
