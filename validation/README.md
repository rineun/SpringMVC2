# Spring mvc
- http://localhost:8080 
- http://localhost:8080/validation/v1/items
- `errors?.` 은 errors 가 null 일때 NullPointerException 이 발생하는 대신, null 을 반환하는 문법이다.
- `BindingResult bindingResult` 파라미터의 위치는 `@ModelAttribute Item item` 다음에 와야한다.
- 
``` java
  //FieldError 생성자 요약
  public FieldError(String objectName, String field, String defaultMessage) {}
  ```

-
```java
//ObjectError 생성자 요약
public ObjectError(String objectName, String defaultMessage) {}
```

- 
```java
void rejectValue(@Nullable String field, String errorCode,
@Nullable Object[] errorArgs, @Nullable String defaultMessage);
```

## 👩🏻‍💻 1. Validation
 - 검증 요구사항
 - 프로젝트 설정 V1
 - 검증 직접 처리 - 소개
 - 검증 직접 처리 - 개발
 - 프로젝트 준비 V2
 - BindingResult1
 - BindingResult2
 - FieldError, ObjectError
 - 오류 코드와 메시지 처리1 
 - 오류 코드와 메시지 처리2 
 - 오류 코드와 메시지 처리3 
 - 오류 코드와 메시지 처리4 
 - 오류 코드와 메시지 처리5 
 - 오류 코드와 메시지 처리6 
 - Validator 분리1
 - Validator 분리2
 - 정리



## 👩🏻‍💻 DefaultMessageCodesResolver의 기본 메시지 생성 규칙
- 객체 오류
```java
객체 오류의 경우 다음 순서로 2가지 생성 
        1.: code + "." + object name
        2.: code
예) 오류 코드: required, object name: item 
        1.: required.item 
        2.: required
```
- 필드오류
```java
 필드 오류의 경우 다음 순서로4가지 메시지 코드 생성
        1.: code + "." + object name + "." + field
        2.: code + "." + field
        3.: code + "." + field type
        4.: code 
예) 오류 코드: typeMismatch, object name "user", field "age", field type: int 
        1. "typeMismatch.user.age"
        2. "typeMismatch.age"
        3. "typeMismatch.int"
        4. "typeMismatch"
```

- 정리
1. rejectValue() 호출
2. MessageCodesResolver 를 사용해서 검증 오류 코드로 메시지 코드들을 생성
3. new FieldError() 를 생성하면서 메시지 코드들을 보관
4. th:erros 에서 메시지 코드들로 메시지를 순서대로 메시지에서 찾고, 노출


## 👩🏻‍💻 Bean Validation
- Bean Validation - 소개
- Bean Validation - 시작
- Bean Validation - 프로젝트 준비 V3
- Bean Validation - 스프링 적용
- Bean Validation - 에러 코드
- Bean Validation - 오브젝트 오류
- Bean Validation - 수정에 적용
- Bean Validation - 한계
- Bean Validation - groups
- Form 전송 객체 분리 - 프로젝트 준비 V4 
- Form 전송 객체 분리 - 소개
- Form 전송 객체 분리 - 개발
  - postman
  - ```java
     POST http://localhost:8080/validation/api/items/add
      {"itemName":"hello", "price":1000, "quantity": 10}
      ```
- 정리


