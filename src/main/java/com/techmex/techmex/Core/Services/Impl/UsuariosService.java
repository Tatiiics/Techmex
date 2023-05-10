
package com.techmex.techmex.Core.Services.Impl;

import com.techmex.techmex.Core.Services.IUsuariosService;
import com.techmex.techmex.Data.Providers.IUsuariosProvider;
import com.techmex.techmex.Dtos.UsuariosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuariosService implements IUsuariosService {

    private final IUsuariosProvider usuariosProvider;

    @Override
    public List<UsuariosDto> getListaUsuarios() {
        return usuariosProvider.getUsuarios();
    }

    @Override
    public UsuariosDto getUsuariosId(Integer id) {
        return usuariosProvider.getUsuariosId(id);
    }

    @Override
    public UsuariosDto insertUsuarios(String nombre, String email, String contrasenia, boolean empleado, boolean admin) {
        return usuariosProvider.insertUsuarios(nombre, email, contrasenia, empleado, admin);
    }

    @Override
    public UsuariosDto updateUsuarios(Integer id, String nombre, String email, String contrasenia, boolean empleado, boolean admin) {
        return usuariosProvider.updateUsuarios(id, nombre, email, contrasenia, empleado, admin);
    }

    @Override
    public void deleteUsuariosId(Integer id) {
        usuariosProvider.deleteUsuariosId(id);

    }

}
