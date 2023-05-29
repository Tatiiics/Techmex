
package com.techmex.techmex.Dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
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
    @NotEmpty
    private String nombre;
    @NotEmpty(message = "El email no puede estar vacío")
    @Email
    private String email;
    //@NotEmpty(message = "No puede estar el campo contraseña vacío")
    private String contrasenia;
    private boolean empleado;
    private boolean admin;

}
