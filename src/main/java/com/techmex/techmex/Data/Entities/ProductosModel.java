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
    private Integer producto_id;
    @Column(nullable = false, length = 50 )//para que no sea null el valor
    private String nombre;
    @Column(nullable = false)
    private Integer precio;
    private String imagen;
    @Column(length = 250)
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name = "categoria_id",
            foreignKey = @ForeignKey(name = "FK_categoria_productos"))
    private CategoriasModel categoria;

}
