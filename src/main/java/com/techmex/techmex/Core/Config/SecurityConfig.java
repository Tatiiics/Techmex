package com.techmex.techmex.Core.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/public/**").permitAll() // Rutas públicas que no requieren autenticación
                .antMatchers("/admin/**").hasRole("ADMIN") // Rutas que requieren el rol "ADMIN"
                .anyRequest().authenticated() // Todas las demás rutas requieren autenticación
                .and()
                .formLogin().permitAll(); // Permitir acceso al formulario de inicio de sesión

        // Puedes personalizar otras configuraciones, como acceso a recursos estáticos, CSRF, etc.
    }

    // Configurar autenticación (por ejemplo, en memoria, base de datos, LDAP, etc.)
    // Puedes sobrescribir el método `configure(AuthenticationManagerBuilder)` para agregar proveedores de autenticación

    // Configurar usuarios en memoria (solo para pruebas, no en producción)
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password("{noop}admin").roles("ADMIN")
                .and()
                .withUser("user").password("{noop}user").roles("USER");
    }
}


