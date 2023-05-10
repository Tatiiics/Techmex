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
    private Integer orden_id;
 /*   @ManyToOne
    @JoinColumn(name = mesa_id)
    private MesasModel mesa_id;*/
   /* @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuariosModel usuario_Id;*/
}
