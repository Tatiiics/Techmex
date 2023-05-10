<<<<<<< Updated upstream
package com.techmex.techmex.Dtos;public class UsuariosDto {
=======
package com.techmex.techmex.Dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UsuariosDto {

    private Integer id_usuarios;
    private String nombre;
    private String email;
    private String contrasenia;
    private boolean empleado;
    private boolean admin;
>>>>>>> Stashed changes
}
