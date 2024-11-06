package com.example.oauthlogin.service;

import com.example.oauthlogin.dto.LoginRequestDto;
import com.example.oauthlogin.dto.SignupRequestDto;
import com.example.oauthlogin.entity.User;
import com.example.oauthlogin.exception.CustomException;
import com.example.oauthlogin.exception.ErrorCode;
import com.example.oauthlogin.repository.UserRepository;
import com.example.oauthlogin.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
        private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

        @Override
        @Transactional
        public void signup(SignupRequestDto requestDto) {

            verifyEmailIsUnique(requestDto.getEmail());

            String encodedPassword = passwordEncoder.encode(requestDto.getPassword());

            User user = new User(requestDto, encodedPassword);
            userRepository.save(user);
        }




    private void verifyEmailIsUnique(String email) {
        if (userRepository.findByEmail(email).isPresent()) {
            throw new CustomException(ErrorCode.DUPLICATED_EMAIL);
        }
    }


}
