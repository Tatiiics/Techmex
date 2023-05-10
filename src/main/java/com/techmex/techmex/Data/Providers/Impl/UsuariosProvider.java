package com.techmex.techmex.Data.Providers.Impl;

import com.techmex.techmex.Data.Dao.IUsuariosDao;
import com.techmex.techmex.Data.Entities.UsuariosModel;
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
    public UsuariosDto insertUsuarios(String nombre, String email,String contrasenia,boolean empleado,boolean admin) {
       UsuariosModel newUsuario = UsuariosModel.builder()
               .nombre(nombre)
               .email(email)
               .contrasenia(contrasenia)
               .empleado(empleado)
               .admin(admin)

               .build();
       iUsuariosDao.save(newUsuario);
        return mapperUsuarios.mapToDto(newUsuario);
    }

    @Override
    public UsuariosDto updateUsuarios(Integer id, String nombre, String email, String contrasenia, boolean empleado, boolean admin) {
        UsuariosModel newUsuario = iUsuariosDao.findById(id).orElse(null);
        newUsuario = newUsuario.builder()
                .id_usuario(id)
                .nombre(nombre)
                .email(email)
                .contrasenia(contrasenia)
                .empleado(empleado)
                .admin(admin)
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

}
