package com.techmex.techmex.Data.Providers.Impl;

import com.techmex.techmex.Data.Dao.IUsuariosDao;
import com.techmex.techmex.Data.Entities.UsuariosModel;
import com.techmex.techmex.Data.Entities.enums.UserRole;
import com.techmex.techmex.Data.Providers.IUsuariosProvider;
import com.techmex.techmex.Data.Providers.Mapper.IMapper;
import com.techmex.techmex.Dtos.UsuariosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UsuariosProvider implements IUsuariosProvider {

    private final IUsuariosDao iUsuariosDao;

    private final IMapper <UsuariosModel, UsuariosDto> mapperUsuarios;

    @Override
    public List<UsuariosDto> getUsuarios() {
        return iUsuariosDao.findAll().stream()
                .map(mapperUsuarios::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public  UsuariosDto getUsuariosId(Integer id) {
        return iUsuariosDao.findById(id)
                .map(mapperUsuarios::mapToDto)
                .orElse(null);
    }

    @Override
    public UsuariosDto insertUsuarios(String nombre, String email,String contrasenia) {
       UsuariosModel newUsuario = UsuariosModel.builder()
               .nombre(nombre)
               .email(email)
               .contrasenia(contrasenia)
               // TODO CAMBIAR ESTO AHORA SOLO CREA ADMINS
               .role(UserRole.ADMIN)
               .build();

       iUsuariosDao.save(newUsuario);

        return mapperUsuarios.mapToDto(newUsuario);
    }

    @Override
    public UsuariosDto updateUsuarios(Integer id, String nombre, String email, String contrasenia) {
        UsuariosModel newUsuario = iUsuariosDao.findById(id).orElse(null);
        newUsuario = newUsuario.builder()
                .id_usuario(id)
                .nombre(nombre)
                .email(email)
                .contrasenia(contrasenia)
                .role(UserRole.ADMIN)
                .build();
        iUsuariosDao.save(newUsuario);


        return mapperUsuarios.mapToDto(newUsuario);
    }

    @Override
    public void deleteUsuariosId(Integer id) {
        if(!iUsuariosDao.existsById(id)){
            throw new RuntimeException("EL USUARIO NO EXISTE");
        }

        iUsuariosDao.deleteById(id);
    }

    @Override
    public UsuariosDto findByEmail(String email) {
        return iUsuariosDao.findByEmail(email)
                .map(mapperUsuarios::mapToDto)
                .orElse(null);
    }

    @Override
    public boolean existsByUsername(String username) {
        return iUsuariosDao.findByNombre(username).isPresent();
    }

    @Override
    public boolean matchesPasswordByUsername(String username, String password) {
        return false;
    }

    @Override
    public UsuariosDto getByName(String name) {
        return iUsuariosDao.findByNombre(name)
                .map(mapperUsuarios::mapToDto)
                .orElse(null);
    }

}
