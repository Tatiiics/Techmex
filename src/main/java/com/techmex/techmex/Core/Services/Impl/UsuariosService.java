
package com.techmex.techmex.Core.Services.Impl;

import com.techmex.techmex.Core.Services.IUsuariosService;
import com.techmex.techmex.Data.Dao.IRolesDao;
import com.techmex.techmex.Data.Dao.IUsuariosDao;
import com.techmex.techmex.Data.Entities.RolesModel;
import com.techmex.techmex.Data.Entities.UsuariosModel;
import com.techmex.techmex.Data.Providers.IUsuariosProvider;
import com.techmex.techmex.Dtos.UsuariosDto;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;

@Service
public class UsuariosService implements IUsuariosService {

    private final IUsuariosProvider usuariosProvider;
    private IUsuariosDao usuariosDao;
    private IRolesDao rolesDao;
    private PasswordEncoder passwordEncoder;

    public UsuariosService(IUsuariosProvider usuariosProvider,
                           IUsuariosDao usuariosDao,
                           IRolesDao rolesDao) {
        this.usuariosProvider = usuariosProvider;
        this.usuariosDao = usuariosDao;
        this.rolesDao = rolesDao;
    }

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

    @Override
    public UsuariosModel findByEmail(String email) {
        return usuariosDao.findByEmail(email);
    }


    @Override
    public void saveUser(UsuariosDto usuariosDto) {
        UsuariosModel usuariosModel = new UsuariosModel();
        usuariosModel.setNombre(usuariosDto.getNombre());
        usuariosModel.setEmail(usuariosDto.getEmail());

        //encrypt the password once we integrate spring security
        //usuariosModel.setContrasenia(usuariosDto.getContrasenia());

        usuariosModel.setContrasenia(passwordEncoder.encode(usuariosDto.getContrasenia()));
        RolesModel rol = rolesDao.findByName("ROLE_ADMIN");
        if(rol == null){
            rol = checkRoleExist();
        }
        usuariosModel.setRoles(Arrays.asList(rol));
        usuariosDao.save(usuariosModel);
    }
    private RolesModel checkRoleExist() {
        RolesModel rol = new RolesModel();
        rol.setName("ROLE_ADMIN");
        return rolesDao.save(rol);
    }

}
