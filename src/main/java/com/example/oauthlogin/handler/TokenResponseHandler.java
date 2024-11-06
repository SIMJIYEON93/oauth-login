package com.example.oauthlogin.handler;

import com.example.oauthlogin.entity.RefreshToken;
import com.example.oauthlogin.entity.User;
import com.example.oauthlogin.repository.RefreshTokenRepository;
import com.example.oauthlogin.security.JwtUtil;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TokenResponseHandler {

    private final JwtUtil jwtUtil;
    private final RefreshTokenRepository refreshTokenRepository;

    public void addTokensToResponse(User user, HttpServletResponse response) {
        String accessToken = jwtUtil.createAccessToken(user.getEmail(), user.getRole());
        String refreshToken = jwtUtil.createRefreshToken();

        addAccessTokenToHeader(accessToken, response);
        addRefreshTokenToCookie(refreshToken, response);

        refreshTokenRepository.save(new RefreshToken(refreshToken, user.getId()));
    }



    private void addAccessTokenToHeader(String accessToken, HttpServletResponse response) {
        response.addHeader(JwtUtil.AUTHORIZATION_HEADER, JwtUtil.BEARER_PREFIX + accessToken);
    }


    private void addRefreshTokenToCookie(String refreshToken, HttpServletResponse response) {
        Cookie cookie = new Cookie("refreshToken", refreshToken);
        cookie.setPath("/");
        cookie.setMaxAge((int) JwtUtil.REFRESH_TOKEN_TIME / 1000);
        response.addCookie(cookie);
    }
}
