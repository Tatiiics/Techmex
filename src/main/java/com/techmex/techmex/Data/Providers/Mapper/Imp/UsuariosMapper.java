package com.techmex.techmex.Data.Providers.Mapper.Imp;


import com.techmex.techmex.Data.Entities.UsuariosModel;
import com.techmex.techmex.Data.Entities.enums.UserRole;
import com.techmex.techmex.Data.Providers.Mapper.IMapper;
import com.techmex.techmex.Dtos.UsuariosDto;
import org.springframework.stereotype.Component;

@Component
public class UsuariosMapper implements IMapper<UsuariosModel, UsuariosDto> {
    @Override
    public UsuariosDto mapToDto(UsuariosModel usuariosModel) {
        return UsuariosDto.builder()
                .id_usuarios(usuariosModel.getId_usuario())
                .nombre(usuariosModel.getNombre())
                .email(usuariosModel.getEmail())
                .contrasenia(usuariosModel.getContrasenia())
                //TODO CAMBIAR A FUTURO AHORA SOLO HACE ADMINS
                .rol(UserRole.ADMIN)
                .build();
    }

    @Override
    public UsuariosModel mapToEntity(UsuariosDto usuariosDto) {
        return null;
    }

}
