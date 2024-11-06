# OAuth Login Project

이 프로젝트는 JWT토큰 기반 Spring Security와 OAuth2.0을 적용한 토이 프로젝트 입니다.


## 주요 기능

- 네이버 OAuth2 로그인
- 로그인 상태 관리


## 프로젝트 구조

src/main/java/com/example/oauthlogin/
├── config/
│ └── SecurityConfig.java
├── controller/
│ └── UserController.java
├── dto/
│ └── SignupRequestDto.java
├── entity/
│ └── User.java
├── oauth2/
│ └── OAuthAttributes.java
├── repository/
│ └── UserRepository.java
├── service/
│ └── UserService.java
└── OauthLoginApplication.java

### 패키지 설명

- `config`: 보안 설정 관련 클래스
- `controller`: HTTP 요청을 처리하는 컨트롤러 클래스
- `dto`: DTO 클래스
- `entity`: 데이터베이스 엔티티 클래스
- `oauth2`: OAuth2 인증 관련 클래스
- `repository`: JPA 인터페이스
- `service`: 회원가입, 로그인, 로그아웃 서비스 