package com.example.oauthlogin.controller;

import com.example.oauthlogin.dto.ApiResponseDto;
import com.example.oauthlogin.dto.LoginRequestDto;
import com.example.oauthlogin.dto.SignupRequestDto;
import com.example.oauthlogin.service.UserServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping("/auth/signup")
    public ResponseEntity<ApiResponseDto> signup(@Valid @RequestBody SignupRequestDto requestDto) {
        userService.signup(requestDto);
        return ResponseEntity.ok(new ApiResponseDto("회원가입 성공", HttpStatus.OK.value()));
    }


}
