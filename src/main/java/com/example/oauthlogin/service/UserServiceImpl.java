package com.example.oauthlogin.service;

import com.example.oauthlogin.dto.SignupRequestDto;
import com.example.oauthlogin.entity.User;
import com.example.oauthlogin.exception.CustomException;
import com.example.oauthlogin.exception.ErrorCode;
import com.example.oauthlogin.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
        private final UserRepository userRepository;

        @Override
        @Transactional
        public void signup(SignupRequestDto requestDto) {
            verifyEmailIsUnique(requestDto.getEmail());
            User user = new User(requestDto);
            userRepository.save(user);
        }






    private void verifyEmailIsUnique(String email) {
        if (userRepository.findByEmail(email).isPresent()) {
            throw new CustomException(ErrorCode.DUPLICATED_EMAIL);
        }
    }
}
