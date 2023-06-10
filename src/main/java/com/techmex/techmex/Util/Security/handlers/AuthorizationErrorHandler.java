package com.techmex.techmex.Util.Security.handlers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.techmex.techmex.Util.Security.service.RestResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@AllArgsConstructor
public class AuthorizationErrorHandler implements AccessDeniedHandler {

    private final ObjectMapper jsonMapper;

    @Override
    public void handle(
            HttpServletRequest request,
            HttpServletResponse response,
            AccessDeniedException accessDeniedException
    ) throws IOException {
        response.setContentType("application/json");
        response.getOutputStream().println(
                jsonMapper.writeValueAsString(
                                RestResponse.encapsulate(accessDeniedException, HttpStatus.FORBIDDEN)
                        )
        );
    }
}