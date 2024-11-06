package com.example.oauthlogin.dto;


import com.example.oauthlogin.entity.User;
import lombok.Getter;

@Getter
public class UserResponseDto {
    private Long id;
    private String username;


    public UserResponseDto(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
    }
}
