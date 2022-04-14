## 타임리프 

## 👩🏻‍💻 소개
- 공식 사이트: https://www.thymeleaf.org/
- 공식 메뉴얼 - 기본 기능: https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html 
- 공식 메뉴얼 - 스프링 통합: https://www.thymeleaf.org/doc/tutorials/3.0/thymeleafspring.html

## 👩🏻‍💻  특징
- 서버 사이드 HTML 렌더링 (SSR) 네츄럴 템플릿
- 스프링 통합 지원
- 서버 사이드 HTML 렌더링 (SSR)
- 타임리프는 백엔드 서버에서 HTML을 동적으로 렌더링 하는 용도로 사용된다.



## 👩🏻‍💻 기본 
- 타임리프 소개
- 텍스트 - text, utext 
- 변수 - SpringEL
- 기본 객체들
  - HTTP 요청 파라미터 접근: param
    -  예) ${param.paramData} 
  - HTTP 세션 접근: session
    - 예) ${session.sessionData}
  - 스프링 빈 접근: @
    - 예) ${@helloBean.hello('Spring!')}

- 유틸리티 객체와 날짜
- URL 링크
- 리터럴
- 연산
  - No-Operation: _
    - 마치 타임리프가 실행되지 않는 것 처럼 동작한다. 
    - 이것을 잘 사용하면 HTML 의 내용 그대로 활용할 수 있다. 
    - 마지막 예를 보면 데이터가 없습니다. 부분이 그대로 출력된다
- 속성 값 설정
  - th:attrappend : 속성 값의 뒤에 값을 추가한다.
  - th:attrprepend : 속성 값의 앞에 값을 추가한다. 
  - th:classappend : class 속성에 자연스럽게 추가한다.
- 반복
- 조건부 평가
- 주석
- 블록
- 자바스크립트 인라인
- 템플릿 조각
- 템플릿 레이아웃1
- 템플릿 레이아웃2
- 정리
