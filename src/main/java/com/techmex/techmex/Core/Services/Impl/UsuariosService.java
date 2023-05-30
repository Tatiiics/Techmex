
package com.techmex.techmex.Core.Services.Impl;

import com.techmex.techmex.Core.Services.IUsuariosService;
import com.techmex.techmex.Data.Dao.IUsuariosDao;
import com.techmex.techmex.Data.Entities.UsuariosModel;
import com.techmex.techmex.Data.Providers.IUsuariosProvider;
import com.techmex.techmex.Dtos.UsuariosDto;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
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
    public UsuariosDto insertUsuarios(String nombre, String email, String contrasenia) {
        return usuariosProvider.insertUsuarios(nombre, email, contrasenia);
    }

    @Override
    public UsuariosDto updateUsuarios(Integer id, String nombre, String email, String contrasenia) {
        return usuariosProvider.updateUsuarios(id, nombre, email, contrasenia);
    }

    @Override
    public void deleteUsuariosId(Integer id) {
        usuariosProvider.deleteUsuariosId(id);

    }

    @Override
    public UsuariosDto findByEmail(String email) {
        return usuariosProvider.findByEmail(email);
    }


}
