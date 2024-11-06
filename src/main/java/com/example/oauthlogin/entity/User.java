package com.example.oauthlogin.entity;

import com.example.oauthlogin.dto.SignupRequestDto;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private UserRoleEnum role;

    @Column
    @Enumerated(value = EnumType.STRING)
    private UserStatusEnum status;


    public User(SignupRequestDto requestDto, String encodedPassword) {
        this.username=requestDto.getUsername();
        this.email = requestDto.getEmail();
        this.password = encodedPassword;
        this.role = UserRoleEnum.USER;
        this.status = UserStatusEnum.ACTIVE;
    }
}