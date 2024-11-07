package com.example.oauthlogin.dto;


import com.example.oauthlogin.entity.User;
import lombok.Getter;

@Getter
public class UserResponseDto {
    private Long id;
    private String nickname;


    public UserResponseDto(User user) {
        this.id = user.getId();
        this.nickname = user.getNickname();
    }
}
