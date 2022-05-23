## 👩🏻‍💻  예외 처리와 오류 페이지
- 프로젝트 생성
- 서블릿 예외 처리 - 시작
- 서블릿 예외 처리 - 오류 화면 제공
- 서블릿 예외 처리 - 오류 페이지 작동 원리 
- 서블릿 예외 처리 - 필터
- 서블릿 예외 처리 - 인터셉터
- 스프링 부트 - 오류 페이지1
- 스프링 부트 - 오류 페이지2
- 정리


## 👩🏻‍💻  sendError 흐름
- http://localhost:8080/error-ex
- http://localhost:8080/error-404
- http://localhost:8080/error-500
```
WAS(sendError 호출 기록 확인) <- 필터 <- 서블릿 <- 인터셉터 <- 컨트롤러
(response.sendError())
```

## 👩🏻‍💻  errorPage 등록
```java
hello.exception.WebServerCustomizer

```
- http://localhost:8080/error-page/404
- http://localhost:8080/error-page/500


## 👩🏻‍💻 errorPage springboot 제공 
```java
BasicErrorController 뷰 우선순위
```

1. 뷰템플릿 
   1. resources/templates/error/500.html 
   2. resources/templates/error/5xx.html
2. 정적리소스(static,public)
   1. resources/static/error/400.html 
   2. resources/static/error/404.html 
   3. resources/static/error/4xx.html 
3. 적용 대상이 없을 때 뷰 이름(error)
   1. resources/templates/error.html

- http://localhost:8080/error-404 404.html
- http://localhost:8080/error-400 4xx.html (400 오류 페이지가 없지만 4xx가 있음)
- http://localhost:8080/error-500 500.html http://localhost:8080/error-ex 500.html (예외는 500으로 처리)
- http://localhost:8080/error-ex?message=&errors=&trace=


## 👩🏻‍💻 API 예외 처리

- API 예외 처리 9. API 예외 처리 - API 예외 처리
- 스프링 부트 기본 오류 처리
- HandlerExceptionResolver 시작
- HandlerExceptionResolver 활용
- 스프링이 제공하는 ExceptionResolver1 
- 스프링이 제공하는 ExceptionResolver2 
- @ExceptionHandler
- @ControllerAdvice

## 👩🏻‍💻 API 테스트
- GET http://localhost:8080/api/members/spring
- GET http://localhost:8080/api/members/ex
- GET http://localhost:8080/api/members/bad 
- GET http://localhost:8080/api/members/user-ex 
- GET http://localhost:8080/api/response-status-ex1?message=
- GET http://localhost:8080/api/response-status-ex2
- GET http://localhost:8080/api/default-handler-ex
- GET http://localhost:8080/api2/members/bad
- GET http://localhost:8080/api2/members/user-ex
- GET http://localhost:8080/api2/members/ex
