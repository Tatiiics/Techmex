package com.techmex.techmex.Util.Security.util;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
@AllArgsConstructor
public class AuthenticationFailureEvent implements ApplicationListener<AuthenticationFailureBadCredentialsEvent> {

    private HttpServletRequest request;
    private LoginAttemptsService loginAttemptsService;

    @SneakyThrows
    @Override
    public void onApplicationEvent(AuthenticationFailureBadCredentialsEvent e) {
        final String xfHeader = request.getHeader("X-Forwarded-For");
        if (xfHeader == null) {
            loginAttemptsService.loginFailed(request.getRemoteAddr());
        } else {
            loginAttemptsService.loginFailed(xfHeader.split(",")[0]);
        }
    }
}
