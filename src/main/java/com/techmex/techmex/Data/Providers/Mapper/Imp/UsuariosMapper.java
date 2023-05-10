<<<<<<< Updated upstream
package com.techmex.techmex.Data.Providers.Mapper.Imp;public class UsuariosMapper {
=======
package com.techmex.techmex.Data.Providers.Mapper.Imp;


import com.techmex.techmex.Data.Entities.UsuariosModel;
import com.techmex.techmex.Data.Providers.Mapper.IMapper;
import com.techmex.techmex.Dtos.UsuariosDto;

public class UsuariosMapper implements IMapper<UsuariosModel, UsuariosDto> {
    @Override
    public UsuariosDto mapToDto(UsuariosModel usuariosModel) {
        return UsuariosDto.builder()
                .id_usuarios(usuariosModel.getId_usuario())
                .nombre(usuariosModel.getNombre())
                .email(usuariosModel.getEmail())
                .contrasenia(usuariosModel.getContrasenia())
                .empleado(usuariosModel.isEmpleado())
                .admin(usuariosModel.isAdmin())
                .build();
    }

    @Override
    public UsuariosModel mapToEntity(UsuariosDto usuariosDto) {
        return null;
    }
>>>>>>> Stashed changes
}
