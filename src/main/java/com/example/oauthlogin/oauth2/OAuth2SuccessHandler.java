package com.example.oauthlogin.oauth2;

import com.example.oauthlogin.entity.User;
import com.example.oauthlogin.handler.TokenResponseHandler;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.io.IOException;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
public class OAuth2SuccessHandler implements AuthenticationSuccessHandler {
    private final TokenResponseHandler tokenResponseHandler;

    @Value("${front.server.url}")
    private String frontUrl;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
        Map<String, Object> attributes = ((OAuth2User) authentication.getPrincipal()).getAttributes();
        User user = (User) attributes.get("storedUser");

        tokenResponseHandler.addTokensToResponseForSocialLogin(user, response);

        response.sendRedirect(frontUrl + "/oauth2/redirect");
    }
}