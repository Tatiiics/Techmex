package com.techmex.techmex.Core.Controllers;


import com.techmex.techmex.Core.Services.Impl.UsuariosService;
import com.techmex.techmex.Data.Entities.UsuariosModel;
import com.techmex.techmex.Dtos.UsuariosDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import java.util.List;

@Controller
public class AuthController {

    private UsuariosService usuariosService;

    public AuthController(UsuariosService userService) {
        this.usuariosService = userService;
    }

    @GetMapping("index")
    public String home(){
        return "index";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    // handler method to handle user registration request
    @GetMapping("register")
    public String showRegistrationForm(Model model){
        UsuariosDto user = new UsuariosDto();
        model.addAttribute("user", user);
        return "register";
    }

    // handler method to handle register user form submit request
    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("user") UsuariosDto usuario,
                               BindingResult result,
                               Model model){
        UsuariosModel existing = usuariosService.findByEmail(usuario.getEmail());
        if (existing != null) {
            result.rejectValue("email", null, "There is already an account registered with that email");
        }
        if (result.hasErrors()) {
            model.addAttribute("usuario", usuario);
            return "register";
        }
        usuariosService.saveUser(usuario);
        return "redirect:/register?success";
    }

    @GetMapping("/users")
    public String listRegisteredUsers(Model model){
        List<UsuariosDto> usuarios = usuariosService.getListaUsuarios();
        model.addAttribute("users", usuarios);
        return "users";
    }
}
