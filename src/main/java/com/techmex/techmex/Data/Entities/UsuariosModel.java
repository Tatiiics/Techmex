<<<<<<< Updated upstream
package com.techmex.techmex.Data.Entities;public class UsuariosModel {
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
@Table (name = "Usuarios")
public class UsuariosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;
    private String nombre;
    private String email;
    private String contrasenia;
    private boolean empleado;
    private boolean admin;

>>>>>>> Stashed changes
}
