package com.techmex.techmex.Core.Controllers;


import com.techmex.techmex.Core.Services.IAutenticationService;
import com.techmex.techmex.Core.Services.Impl.UsuariosService;
import com.techmex.techmex.Data.Entities.enums.UserRole;
import com.techmex.techmex.Dtos.UsuariosRegistroDto;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/autentication")
public class AuthController {

    private final UsuariosService usuariosService;
    private final IAutenticationService iAutenticationService;

    @GetMapping("index")
    public String home(){
        return "index";
    }

    @GetMapping("/login")
    public boolean login(String email, String password) {
        return iAutenticationService.loginvConEmail(email, password);
    }

    // handler method to handle user registration request
    @PostMapping("/register")
    public UsuariosRegistroDto showRegistrationForm(@RequestParam("email") String email,
                                                    @RequestParam("user") String nombre,
                                                    @RequestParam("password") String contrasenia){
        System.out.println("Hola");
        return iAutenticationService.registro(
                UsuariosRegistroDto.builder()
                        .nombre(nombre)
                        .email(email)
                        .contrasenia(contrasenia)
                        .rol(UserRole.USER)
                        .build()
        );

    }
    @PostMapping("/registerEmpleado")
    public UsuariosRegistroDto showRegistrationForm(@RequestParam("email") String email,
                                                    @RequestParam("user") String nombre,
                                                    @RequestParam("password") String contrasenia,
                                                    @RequestParam("rol") String rol){

        return iAutenticationService.registro(
                UsuariosRegistroDto.builder()
                        .nombre(nombre)
                        .email(email)
                        .contrasenia(contrasenia)
                        .rol(UserRole.valueOf(rol))
                        .build()
        );

    }
    @GetMapping("IsAdmin")
    public boolean isAdmin(String email, String password) {
        return iAutenticationService.isAdmin(email, password);
    }

}
