package com.techmex.techmex.Core.Security;

import com.techmex.techmex.Data.Dao.IUsuariosDao;
import com.techmex.techmex.Data.Entities.RolesModel;
import com.techmex.techmex.Data.Entities.UsuariosModel;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class CustomerUserDetailsService implements UserDetailsService {

    private IUsuariosDao usuariosDao;

    public CustomerUserDetailsService(IUsuariosDao usuariosDao) {
        this.usuariosDao = usuariosDao;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UsuariosModel usuario = usuariosDao.findByEmail(email);

        if (usuario != null) {
            return new org.springframework.security.core.userdetails.User(usuario.getEmail(),
                    usuario.getContrasenia(),
                    mapRolesToAuthorities(usuario.getRoles()));
        }else{
            throw new UsernameNotFoundException("Invalid username or password.");
        }
    }

    private Collection< ? extends GrantedAuthority> mapRolesToAuthorities(Collection <RolesModel> roles) {
        Collection < ? extends GrantedAuthority> mapRoles = roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
        return mapRoles;
    }
}
