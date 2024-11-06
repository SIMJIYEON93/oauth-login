package com.example.oauthlogin.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    // user
    DUPLICATED_EMAIL(HttpStatus.BAD_REQUEST, "U002", "이미 가입된 이메일입니다."),
    PASSWORD_NOT_MATCHED(HttpStatus.BAD_REQUEST, "U005", "비밀번호가 일치하지 않습니다.");


    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    ErrorCode(HttpStatus httpStatus, String code, String message) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
    }
}
