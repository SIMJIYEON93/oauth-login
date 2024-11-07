# OAuth Login Project

이 프로젝트는 JWT토큰으로 Spring Security와 OAuth2.0을 적용한 로그인 기능 소스 코드입니다.

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.3.5-6DB33F?style=for-the-badge&logo=spring-boot)
![Gradle](https://img.shields.io/badge/Gradle-7.x-02303A?style=for-the-badge&logo=gradle) 
![JPA](https://img.shields.io/badge/JPA-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![Redis](https://img.shields.io/badge/redis-%23DD0031.svg?style=for-the-badge&logo=redis&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)


## 주요 기능

- 네이버 OAuth2 로그인
- 회원 상태 관리(회원가입/로그인/로그아웃)


## 디렉토리 구조

```
           │  OauthLoginApplication.java
    │  │              │
    │  │              ├─config
    │  │              │      RedisConfig.java
    │  │              │      WebSecurityConfig.java
    │  │              │
    │  │              ├─controller
    │  │              │      UserController.java
    │  │              │
    │  │              ├─dto
    │  │              │      ApiResponseDto.java
    │  │              │      LoginRequestDto.java
    │  │              │      LogoutRequestDto.java
    │  │              │      ReissueRequestDto.java
    │  │              │      SignupRequestDto.java
    │  │              │      UserResponseDto.java
    │  │              │
    │  │              ├─entity
    │  │              │      BlacklistedToken.java
    │  │              │      RefreshToken.java
    │  │              │      User.java
    │  │              │      UserRoleEnum.java
    │  │              │
    │  │              ├─exception
    │  │              │      CustomException.java
    │  │              │      ErrorCode.java
    │  │              │      ErrorResponse.java
    │  │              │
    │  │              ├─oauth2
    │  │              │      CustomOAuth2UserService.java
    │  │              │      OAuth2SuccessHandler.java
    │  │              │      OAuthAttributes.java
    │  │              │
    │  │              ├─repository
    │  │              │      BlacklistedTokenRepository.java
    │  │              │      RefreshTokenRepository.java
    │  │              │      UserRepository.java
    │  │              │
    │  │              ├─security
    │  │              │      JwtAuthenticationFilter.java
    │  │              │      JwtAuthorizationFilter.java
    │  │              │      JwtUtil.java
    │  │              │      TokenResponseHandler.java
    │  │              │      UserDetailsImpl.java
    │  │              │      UserDetailsServiceImpl.java
    │  │              │
    │  │              └─service
    │  │                      UserService.java
    │  │                      UserServiceImpl.java
    │  │
    │  └─resources
    │      │  application-oauth.properties
    │      │  application.properties
```

### 디렉토리 설명

- `config`: 인증, 인가 설정 및 redis 연결 설정 
- `controller`: 사용자 계정 및 토큰 관련 HTTP 요청 처리
- `dto`: DTO 클래스
- `entity`: user 및 토큰관련  JPA 엔티티 클래스
- `exception`: 커스텀 에러메시지
- `oauth2`: OAuth2 기반 소셜 로그인 기능
- `security`: JWT 생성, 검증, 관리 및 사용자 인증, 인가
- `repository`: 사용자 정보 및 토큰 데이터 액세스
- `service`: JWT 인증 및 재발행 기반 사용자 계정 관리



### 빌드 및 실행 환경
- JDK 17 이상
- Gradle 7.x 이상