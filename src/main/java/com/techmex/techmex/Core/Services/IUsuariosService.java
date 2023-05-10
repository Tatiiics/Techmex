
package com.techmex.techmex.Core.Services;

import com.techmex.techmex.Dtos.UsuariosDto;

import java.util.List;

public interface IUsuariosService {

    List<UsuariosDto> getListaUsuarios();
    UsuariosDto getUsuariosId (Integer id);

    UsuariosDto insertUsuarios(String nombre, String email, String contrasenia, boolean empleado, boolean admin);

    UsuariosDto updateUsuarios(Integer id, String nombre, String email, String contrasenia, boolean empleado, boolean admin);

    void deleteUsuariosId(Integer id);

}
