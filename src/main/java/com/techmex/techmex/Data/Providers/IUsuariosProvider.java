package com.techmex.techmex.Data.Providers;

import com.techmex.techmex.Dtos.UsuariosDto;

import java.util.List;

public interface IUsuariosProvider {

    List<UsuariosDto> getUsuarios();
     UsuariosDto getUsuariosId(Integer id);
     UsuariosDto insertUsuarios(String nombre, String email,String contrasenia);
     UsuariosDto updateUsuarios(Integer id, String nombre, String email, String contrasenia);
     void deleteUsuariosId(Integer id);

     UsuariosDto findByEmail(String email);
     boolean existsByUsername(String username);
     boolean matchesPasswordByUsername(String username, String password);
     UsuariosDto getByName(String name);


}
