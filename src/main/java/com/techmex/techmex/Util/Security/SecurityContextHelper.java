package com.techmex.techmex.Util.Security;
import com.techmex.techmex.Dtos.UsuariosDto;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class SecurityContextHelper {

    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public UsuariosDto getUser() {
        return (UsuariosDto) getAuthentication().getPrincipal();
    }

}