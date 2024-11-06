package com.example.oauthlogin.service;

import com.example.oauthlogin.dto.SignupRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface UserService {
    @Transactional
    void signup(SignupRequestDto requestDto);

}
