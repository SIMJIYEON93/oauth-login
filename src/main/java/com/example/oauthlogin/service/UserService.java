package com.example.oauthlogin.service;

import com.example.oauthlogin.dto.LoginRequestDto;
import com.example.oauthlogin.dto.LogoutRequestDto;
import com.example.oauthlogin.dto.ReissueRequestDto;
import com.example.oauthlogin.dto.SignupRequestDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface UserService {
    @Transactional
    void signup(SignupRequestDto requestDto);

    void reissueToken(ReissueRequestDto requestDto, HttpServletResponse response);

    void logout(LogoutRequestDto requestDto, HttpServletRequest request);

}
