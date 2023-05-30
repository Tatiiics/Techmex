
package com.techmex.techmex.Core.Services;

import com.techmex.techmex.Data.Entities.UsuariosModel;
import com.techmex.techmex.Dtos.UsuariosDto;

import java.util.List;

public interface IUsuariosService {

    List<UsuariosDto> getListaUsuarios();
    UsuariosDto getUsuariosId (Integer id);

    UsuariosDto insertUsuarios(String nombre, String email, String contrasenia);

    UsuariosDto updateUsuarios(Integer id, String nombre, String email, String contrasenia);

    void deleteUsuariosId(Integer id);

    UsuariosDto findByEmail(String email);

}
