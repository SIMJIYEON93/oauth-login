# OAuth Login Project

이 프로젝트는 JWT토큰 기반 Spring Security와 OAuth2.0을 적용한 토이 프로젝트 입니다.


## 주요 기능

- 네이버 OAuth2 로그인
- 로그인 상태 관리


## 프로젝트 구조

+---.gradle
|   |   file-system.probe
|   |
|   +---8.10.2
|   |   |   gc.properties
|   |   |
|   |   +---checksums
|   |   |       checksums.lock
|   |   |       md5-checksums.bin
|   |   |       sha1-checksums.bin
|   |   |
|   |   +---dependencies-accessors
|   |   |       gc.properties
|   |   |
|   |   +---executionHistory
|   |   |       executionHistory.bin
|   |   |       executionHistory.lock
|   |   |
|   |   +---expanded
|   |   +---fileChanges
|   |   |       last-build.bin
|   |   |
|   |   +---fileHashes
|   |   |       fileHashes.bin
|   |   |       fileHashes.lock
|   |   |       resourceHashesCache.bin
|   |   |
|   |   \---vcsMetadata
|   +---buildOutputCleanup
|   |       buildOutputCleanup.lock
|   |       cache.properties
|   |       outputFiles.bin
|   |
|   \---vcs-1
|           gc.properties
|
+---.idea
|   |   .gitignore
|   |   compiler.xml
|   |   dataSources.local.xml
|   |   dataSources.xml
|   |   gradle.xml
|   |   jarRepositories.xml
|   |   jpa-buddy.xml
|   |   misc.xml
|   |   modules.xml
|   |   vcs.xml
|   |   workspace.xml
|   |
|   +---dataSources
|   |   |   24e9178d-82ad-4fb5-add4-d94b184a5345.xml
|   |   |   a00851bb-9ba9-4a89-9099-e3f7b8ef5457.xml
|   |   |
|   |   \---a00851bb-9ba9-4a89-9099-e3f7b8ef5457
|   |       \---storage_v2
|   |           \---_src_
|   |               \---schema
|   |                       information_schema.FNRwLQ.meta
|   |                       mysql.osA4Bg.meta
|   |                       performance_schema.kIw0nw.meta
|   |                       sys.zb4BAA.meta
|   |
|   \---modules
|           oauth-login.main.iml
|
+---build
|   +---classes
|   |   \---java
|   |       +---main
|   |       |   \---com
|   |       |       \---example
|   |       |           \---oauthlogin
|   |       |               |   OauthLoginApplication.class
|   |       |               |
|   |       |               +---config
|   |       |               |       RedisConfig.class
|   |       |               |       WebSecurityConfig.class
|   |       |               |
|   |       |               +---controller
|   |       |               |       UserController.class
|   |       |               |
|   |       |               +---dto
|   |       |               |       ApiResponseDto.class
|   |       |               |       LoginRequestDto.class
|   |       |               |       LogoutRequestDto.class
|   |       |               |       ReissueRequestDto.class
|   |       |               |       SignupRequestDto.class
|   |       |               |       UserResponseDto.class
|   |       |               |
|   |       |               +---entity
|   |       |               |       BlacklistedToken.class
|   |       |               |       RefreshToken.class
|   |       |               |       User.class
|   |       |               |       UserRoleEnum$Authority.class
|   |       |               |       UserRoleEnum.class
|   |       |               |       UserStatusEnum.class
|   |       |               |
|   |       |               +---exception
|   |       |               |       CustomException.class
|   |       |               |       ErrorCode.class
|   |       |               |       ErrorResponse$ErrorResponseBuilder.class
|   |       |               |       ErrorResponse.class
|   |       |               |
|   |       |               +---handler
|   |       |               |       TokenResponseHandler.class
|   |       |               |
|   |       |               +---oauth2
|   |       |               |       CustomOAuth2UserService.class
|   |       |               |       OAuth2SuccessHandler.class
|   |       |               |       OAuthAttributes$OAuthAttributesBuilder.class
|   |       |               |       OAuthAttributes.class
|   |       |               |
|   |       |               +---repository
|   |       |               |       BlacklistedTokenRepository.class
|   |       |               |       RefreshTokenRepository.class
|   |       |               |       UserRepository.class
|   |       |               |
|   |       |               +---security
|   |       |               |       JwtAuthenticationFilter.class
|   |       |               |       JwtAuthorizationFilter.class
|   |       |               |       JwtUtil.class
|   |       |               |       UserDetailsImpl.class
|   |       |               |       UserDetailsServiceImpl.class
|   |       |               |
|   |       |               \---service
|   |       |                       UserService.class
|   |       |                       UserServiceImpl.class
|   |       |
|   |       \---test
|   +---generated
|   |   \---sources
|   |       +---annotationProcessor
|   |       |   \---java
|   |       |       \---main
|   |       \---headers
|   |           \---java
|   |               \---main
|   +---resources
|   |   +---main
|   |   |   |   application-oauth.properties
|   |   |   |   application.properties
|   |   |   |
|   |   |   +---static
|   |   |   \---templates
|   |   \---test
|   \---tmp
|       \---compileJava
|           |   previous-compilation-data.bin
|           |
|           \---compileTransaction
|               +---backup-dir
|               \---stash-dir
|                       JwtAuthenticationFilter.class.uniqueId3
|                       JwtAuthorizationFilter.class.uniqueId8
|                       TokenResponseHandler.class.uniqueId4
|                       User.class.uniqueId9
|                       UserController.class.uniqueId0
|                       UserDetailsImpl.class.uniqueId7
|                       UserDetailsServiceImpl.class.uniqueId1
|                       UserRepository.class.uniqueId10
|                       UserResponseDto.class.uniqueId5
|                       UserServiceImpl.class.uniqueId2
|                       WebSecurityConfig.class.uniqueId6
|
+---gradle
|   \---wrapper
|           gradle-wrapper.jar
|           gradle-wrapper.properties
|
\---src
+---main
|   +---java
|   |   \---com
|   |       \---example
|   |           \---oauthlogin
|   |               |
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
|       |
|       +---static
|       \---templates
\---test
\---java
\---com
\---example
\---oauthlogin
OauthLoginApplicationTests.java

### 패키지 설명

- `config`: 보안 설정 관련 클래스
- `controller`: HTTP 요청을 처리하는 컨트롤러 클래스
- `dto`: DTO 클래스
- `entity`: 데이터베이스 엔티티 클래스
- `oauth2`: OAuth2 인증 관련 클래스
- `repository`: JPA 인터페이스
- `service`: 회원가입, 로그인, 로그아웃 서비스 