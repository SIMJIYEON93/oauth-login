package com.example.oauthlogin.controller;

import com.example.oauthlogin.dto.*;
import com.example.oauthlogin.security.UserDetailsImpl;
import com.example.oauthlogin.service.UserServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/auth/reissue")
    public ResponseEntity<ApiResponseDto> reissueToken(@Valid @RequestBody ReissueRequestDto requestDto,
                                                       HttpServletResponse response) {
        userService.reissueToken(requestDto, response);
        return ResponseEntity.ok(new ApiResponseDto("토큰 재발급 성공", HttpStatus.OK.value()));
    }

    @PostMapping("/auth/logout")
    public ResponseEntity<ApiResponseDto> logout(@Valid @RequestBody LogoutRequestDto requestDto,
                                                 HttpServletRequest request) {
        userService.logout(requestDto, request);
        return ResponseEntity.ok(new ApiResponseDto("로그아웃 성공", HttpStatus.OK.value()));
    }

}
