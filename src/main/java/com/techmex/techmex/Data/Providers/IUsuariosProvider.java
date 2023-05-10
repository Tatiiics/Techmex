<<<<<<< Updated upstream
package com.techmex.techmex.Data.Providers.Mapper;public interface IUsuariosProvider {
=======
package com.techmex.techmex.Data.Providers;

import com.techmex.techmex.Dtos.UsuariosDto;

import java.util.List;

public interface IUsuariosProvider {

    List<UsuariosDto> getUsuarios();
     UsuariosDto getUsuariosId(Integer id);
     UsuariosDto insertUsuarios(String nombre, String email,String contrasenia,boolean empleado,boolean admin);
     UsuariosDto updateUsuarios(Integer id, String nombre, String email, String contrasenia, boolean empleado, boolean admin);
     void deleteUsuariosId(Integer id);

>>>>>>> Stashed changes
}
