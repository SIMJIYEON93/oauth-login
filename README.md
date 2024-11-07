# OAuth Login Project

이 프로젝트는 JWT토큰으로 Spring Security와 OAuth2.0을 적용한 로그인 기능 소스 코드입니다.

![Spring](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)
![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)
![Redis](https://img.shields.io/badge/redis-%23DD0031.svg?style=for-the-badge&logo=redis&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)


## 주요 기능

- 네이버 OAuth2 로그인
- 회원 상태 관리(회원가입/로그인/로그아웃)


## 디렉토리 구조

```
|   |               +---config
|   |               |       RedisConfig.java
|   |               |       WebSecurityConfig.java
|   |               |
|   |               +---controller
|   |               |       UserController.java
|   |               |
|   |               +---dto
|   |               |       ApiResponseDto.java
|   |               |       LoginRequestDto.java
|   |               |       LogoutRequestDto.java
|   |               |       ReissueRequestDto.java
|   |               |       SignupRequestDto.java
|   |               |       UserResponseDto.java
|   |               |
|   |               +---entity
|   |               |       BlacklistedToken.java
|   |               |       RefreshToken.java
|   |               |       User.java
|   |               |       UserRoleEnum.java
|   |               |       UserStatusEnum.java
|   |               |
|   |               +---exception
|   |               |       CustomException.java
|   |               |       ErrorCode.java
|   |               |       ErrorResponse.java
|   |               |
|   |               +---handler
|   |               |       TokenResponseHandler.java
|   |               |
|   |               +---oauth2
|   |               |       CustomOAuth2UserService.java
|   |               |       OAuth2SuccessHandler.java
|   |               |       OAuthAttributes.java
|   |               |
|   |               +---repository
|   |               |       BlacklistedTokenRepository.java
|   |               |       RefreshTokenRepository.java
|   |               |       UserRepository.java
|   |               |
|   |               +---security
|   |               |       JwtAuthenticationFilter.java
|   |               |       JwtAuthorizationFilter.java
|   |               |       JwtUtil.java
|   |               |       UserDetailsImpl.java
|   |               |       UserDetailsServiceImpl.java
|   |               |
|   |               \---service
|   |                       UserService.java
|   |                       UserServiceImpl.java
|   |
|   \---resources
|       |   application-oauth.properties
|       |   application.properties
```

### 디렉토리 설명

- `config`: 보안,redis 설정 관련 클래스
- `controller`: HTTP 요청을 처리하는 컨트롤러 클래스
- `dto`: DTO 클래스
- `entity`: user 및 토큰 엔티티 클래스
- `oauth2`: OAuth2 인증 관련 클래스
- `handler`: 토큰 생성 및 Http 응답 추가 클래스
- `repository`: JPA 인터페이스
- `service`: 회원가입, 로그인, 로그아웃 서비스 