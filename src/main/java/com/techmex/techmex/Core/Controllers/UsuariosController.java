package com.techmex.techmex.Core.Controllers;

import com.techmex.techmex.Core.Services.IUsuariosService;
import com.techmex.techmex.Dtos.UsuariosDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/usuarios")
public class UsuariosController {

    private final IUsuariosService usuariosService;

    //GET = SELECT
    @GetMapping("/lista")
    public List<UsuariosDto> listaUsuarios (){
        return usuariosService.getListaUsuarios();
    }

    //GET = SELECT
    @GetMapping("/buscar/{id}")
    public UsuariosDto buscarUsuariosId(@PathVariable Integer id){
        return usuariosService.getUsuariosId(id);

    }

    //POST = INSERT
    @PostMapping("/insertar")
    public UsuariosDto insertarEmpleado(String nombre, String email, String contrasenia, boolean empleado, boolean admin){
        return usuariosService.insertUsuarios(nombre, email, contrasenia, empleado, admin);
    }

    //PUT = UPDATE
    @PutMapping ("/actualizar/{id}")
    public UsuariosDto updateEmpleado (@PathVariable Integer id, String nombre, String email, String contrasenia, boolean empleado, boolean admin){
        return usuariosService.updateUsuarios(id, nombre, email, contrasenia, empleado, admin);
    }

    //DELETE = DELETE

    @DeleteMapping ("/borrar/{id}")
    public void borrarUsuario(@PathVariable Integer id){
        usuariosService.deleteUsuariosId(id);
    }

}
