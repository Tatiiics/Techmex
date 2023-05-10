
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

}
