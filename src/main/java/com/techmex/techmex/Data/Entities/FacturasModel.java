package com.techmex.techmex.Data.Entities;



import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.techmex.techmex.Data.Entities.enums.EstadoPedidoRolEnum;
import com.techmex.techmex.Data.Entities.enums.FormasPago;
import com.techmex.techmex.Data.Entities.enums.ServicioEnum;
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
@Table(name = "Facturas")

public class FacturasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer factura_id;
    @Column(nullable = false)
    private Date fecha;
    @Column(nullable = false)
    private Double total;


    @Min(1)
    @Max(5)
    private int num_mesa;
    @Enumerated(EnumType.STRING)
    @Column(name="formas_pago")
    private FormasPago formasPago;


     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name ="id_usuario", foreignKey = @ForeignKey (name="FK_facturas_usuario"))
     private UsuariosModel usuario;

     private EstadoPedidoRolEnum estadoPedidoRol;
     private ServicioEnum servicioEnum;
    /*@OneToMany
    @JoinColumn(name="orden_id",
    foreignKey = @ForeignKey(name = "FK_facturas_orden"))
    private LineasOrdenModel lineasOrden;
*/
}
