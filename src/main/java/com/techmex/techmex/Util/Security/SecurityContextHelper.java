package com.techmex.techmex.Util.Security;
import com.techmex.techmex.Dtos.UsuariosRegistroDto;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class SecurityContextHelper {

    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public UsuariosRegistroDto getUser() {
        Authentication authentication = getAuthentication();
        if (authentication == null) {
            return null;
        }

        Object principal = authentication.getPrincipal();
        if (principal instanceof UsuariosRegistroDto) {
            return (UsuariosRegistroDto) principal;
        } else {
            // Manejar el caso en el que el principal no sea del tipo esperado
            // Puedes lanzar una excepción, devolver un valor por defecto, etc.
            return null;
        }
    }


}