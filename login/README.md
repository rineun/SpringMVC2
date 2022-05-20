## 👩🏻‍💻 로그인 처리1 - 쿠키, 세션
 - 로그인 요구사항 
 - 프로젝트 생성 
 - 홈 화면
 - 회원 가입
 - 로그인 기능
 - 로그인 처리하기 - 쿠키 사용
 - 쿠키와 보안 문제
 - 로그인 처리하기 - 세션 동작 방식
 - 로그인 처리하기 - 세션 직접 만들기
 - 로그인 처리하기 - 직접 만든 세션 적용 
 - 로그인 처리하기 - 서블릿 HTTP 세션1 
 - 로그인 처리하기 - 서블릿 HTTP 세션2 
 - 세션 정보와 타임아웃 설정
 - 정리


## 👩🏻‍💻 실행화면
- <img width="1006" alt="image" src="https://user-images.githubusercontent.com/80495141/169233904-888974da-4e9d-4ceb-9697-5d8d837fc892.png">
- 쿠키로그인
- <img width="1137" alt="image" src="https://user-images.githubusercontent.com/80495141/169251085-32b884f6-8e1a-4721-b20d-fe27474219c6.png">
- 내가만든 세션 로그인 v2
- <img width="1194" alt="image" src="https://user-images.githubusercontent.com/80495141/169255599-c07fd32d-6de7-4696-a4fa-18620ccc673c.png">
- 세션
- <img width="1186" alt="image" src="https://user-images.githubusercontent.com/80495141/169258409-02432ebd-a494-4b5c-9999-8beb2e10d5d9.png">


## 👩🏻‍💻 로그인 처리2 - 필터, 인터셉터
- 서블릿 필터 - 소개
- 서블릿 필터 - 요청 로그
- 서블릿 필터 - 인증 체크
- 스프링 인터셉터 - 소개
- 스프링 인터셉터 - 요청 로그 
- 스프링 인터셉터 - 인증 체크 
- ArgumentResolver 활용 
- 정리

## 👩🏻‍💻서블릿필터

- 필터흐름
```
 HTTP 요청 -> WAS-> 필터 -> 서블릿 -> 컨트롤러
```

- 필터제한
```
HTTP 요청 -> WAS -> 필터 -> 서블릿 -> 컨트롤러 //로그인 사용자
HTTP 요청 -> WAS -> 필터(적절하지 않은 요청이라 판단, 서블릿 호출X) //비 로그인 사용자
```

- 필터 체인
  - 필터는 체인으로 구성되는데, 중간에 필터를 자유롭게 추가할 수 있다
```
HTTP 요청 ->WAS-> 필터1-> 필터2-> 필터3-> 서블릿 -> 컨트롤러
```


## 👩🏻‍💻 스프링 인터셉터

- 스프링 인터셉터 흐름
  - 스프링 인터셉터는 디스패처 서블릿과 컨트롤러 사이에서 컨트롤러 호출 직전에 호출 된다.
```
HTTP 요청 ->WAS-> 필터 -> 서블릿 -> 스프링 인터셉터 -> 컨트롤러
```

- 스프링 인터셉터 제한
```
HTTP 요청 -> WAS -> 필터 -> 서블릿 -> 스프링 인터셉터 -> 컨트롤러 //로그인 사용자
HTTP 요청 -> WAS -> 필터 -> 서블릿 -> 스프링 인터셉터(적절하지 않은 요청이라 판단, 컨트롤러 호출 X) // 비 로그인 사용자

```
- 스프링 인터셉터 체인
```
HTTP 요청 -> WAS -> 필터 -> 서블릿 -> 인터셉터1 -> 인터셉터2 -> 컨트롤러
```


## 👩🏻‍💻 PathPattern 공식 문서
https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/util/pattern/PathPattern.html
```
- ? 한 문자 일치
- * 경로(/) 안에서 0개 이상의 문자 일치
- ** 경로 끝까지 0개 이상의 경로(/) 일치
- {spring} 경로(/)와 일치하고 spring이라는 변수로 캡처
- {spring:[a-z]+} matches the regexp [a-z]+ as a path variable named 
- "spring" {spring:[a-z]+} regexp [a-z]+ 와 일치하고, "spring" 경로 변수로 캡처
- {*spring} 경로가 끝날 때 까지 0개 이상의 경로(/)와 일치하고 spring이라는 변수로 캡처
- /pages/t?st.html — matches /pages/test.html, /pages/tXst.html but not /pages/
  toast.html
- /resources/*.png — matches all .png files in the resources directory
- /resources/** — matches all files underneath the /resources/ path, including /
- resources/image.png and /resources/css/spring.css
- /resources/{*path} — matches all files underneath the /resources/ path and
- captures their relative path in a variable named "path"; /resources/image.png
- will match with "path" → "/image.png", and /resources/css/spring.css will match
- with "path" → "/css/spring.css"
- /resources/{filename:\\w+}.dat will match /resources/spring.dat and assign the
  value "spring" to the filename variable
```
