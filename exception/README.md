## π©π»βπ»  μμΈ μ²λ¦¬μ μ€λ₯ νμ΄μ§
- νλ‘μ νΈ μμ±
- μλΈλ¦Ώ μμΈ μ²λ¦¬ - μμ
- μλΈλ¦Ώ μμΈ μ²λ¦¬ - μ€λ₯ νλ©΄ μ κ³΅
- μλΈλ¦Ώ μμΈ μ²λ¦¬ - μ€λ₯ νμ΄μ§ μλ μλ¦¬ 
- μλΈλ¦Ώ μμΈ μ²λ¦¬ - νν°
- μλΈλ¦Ώ μμΈ μ²λ¦¬ - μΈν°μν°
- μ€νλ§ λΆνΈ - μ€λ₯ νμ΄μ§1
- μ€νλ§ λΆνΈ - μ€λ₯ νμ΄μ§2
- μ λ¦¬


## π©π»βπ»  sendError νλ¦
- http://localhost:8080/error-ex
- http://localhost:8080/error-404
- http://localhost:8080/error-500
```
WAS(sendError νΈμΆ κΈ°λ‘ νμΈ) <- νν° <- μλΈλ¦Ώ <- μΈν°μν° <- μ»¨νΈλ‘€λ¬
(response.sendError())
```

## π©π»βπ»  errorPage λ±λ‘
```java
hello.exception.WebServerCustomizer

```
- http://localhost:8080/error-page/404
- http://localhost:8080/error-page/500


## π©π»βπ» errorPage springboot μ κ³΅ 
```java
BasicErrorController λ·° μ°μ μμ
```

1. λ·°ννλ¦Ώ 
   1. resources/templates/error/500.html 
   2. resources/templates/error/5xx.html
2. μ μ λ¦¬μμ€(static,public)
   1. resources/static/error/400.html 
   2. resources/static/error/404.html 
   3. resources/static/error/4xx.html 
3. μ μ© λμμ΄ μμ λ λ·° μ΄λ¦(error)
   1. resources/templates/error.html

- http://localhost:8080/error-404 404.html
- http://localhost:8080/error-400 4xx.html (400 μ€λ₯ νμ΄μ§κ° μμ§λ§ 4xxκ° μμ)
- http://localhost:8080/error-500 500.html http://localhost:8080/error-ex 500.html (μμΈλ 500μΌλ‘ μ²λ¦¬)
- http://localhost:8080/error-ex?message=&errors=&trace=


## π©π»βπ» API μμΈ μ²λ¦¬

- API μμΈ μ²λ¦¬ 9. API μμΈ μ²λ¦¬ - API μμΈ μ²λ¦¬
- μ€νλ§ λΆνΈ κΈ°λ³Έ μ€λ₯ μ²λ¦¬
- HandlerExceptionResolver μμ
- HandlerExceptionResolver νμ©
- μ€νλ§μ΄ μ κ³΅νλ ExceptionResolver1 
- μ€νλ§μ΄ μ κ³΅νλ ExceptionResolver2 
- @ExceptionHandler
- @ControllerAdvice

## π©π»βπ» API νμ€νΈ
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
