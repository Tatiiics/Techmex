<<<<<<< Updated upstream
package com.techmex.techmex.Data.Entities;public class MesasModel {
=======
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
@Table (name = "Mesas")
public class MesasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_mesas;
    private Integer capacidad;
    private String QR;
    private boolean llevar;

>>>>>>> Stashed changes
}
