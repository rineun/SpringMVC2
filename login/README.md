## ๐ฉ๐ปโ๐ป ๋ก๊ทธ์ธ ์ฒ๋ฆฌ1 - ์ฟ ํค, ์ธ์
 - ๋ก๊ทธ์ธ ์๊ตฌ์ฌํญ 
 - ํ๋ก์ ํธ ์์ฑ 
 - ํ ํ๋ฉด
 - ํ์ ๊ฐ์
 - ๋ก๊ทธ์ธ ๊ธฐ๋ฅ
 - ๋ก๊ทธ์ธ ์ฒ๋ฆฌํ๊ธฐ - ์ฟ ํค ์ฌ์ฉ
 - ์ฟ ํค์ ๋ณด์ ๋ฌธ์ 
 - ๋ก๊ทธ์ธ ์ฒ๋ฆฌํ๊ธฐ - ์ธ์ ๋์ ๋ฐฉ์
 - ๋ก๊ทธ์ธ ์ฒ๋ฆฌํ๊ธฐ - ์ธ์ ์ง์  ๋ง๋ค๊ธฐ
 - ๋ก๊ทธ์ธ ์ฒ๋ฆฌํ๊ธฐ - ์ง์  ๋ง๋  ์ธ์ ์ ์ฉ 
 - ๋ก๊ทธ์ธ ์ฒ๋ฆฌํ๊ธฐ - ์๋ธ๋ฆฟ HTTP ์ธ์1 
 - ๋ก๊ทธ์ธ ์ฒ๋ฆฌํ๊ธฐ - ์๋ธ๋ฆฟ HTTP ์ธ์2 
 - ์ธ์ ์ ๋ณด์ ํ์์์ ์ค์ 
 - ์ ๋ฆฌ


## ๐ฉ๐ปโ๐ป ์คํํ๋ฉด
- <img width="1006" alt="image" src="https://user-images.githubusercontent.com/80495141/169233904-888974da-4e9d-4ceb-9697-5d8d837fc892.png">
- ์ฟ ํค๋ก๊ทธ์ธ
- <img width="1137" alt="image" src="https://user-images.githubusercontent.com/80495141/169251085-32b884f6-8e1a-4721-b20d-fe27474219c6.png">
- ๋ด๊ฐ๋ง๋  ์ธ์ ๋ก๊ทธ์ธ v2
- <img width="1194" alt="image" src="https://user-images.githubusercontent.com/80495141/169255599-c07fd32d-6de7-4696-a4fa-18620ccc673c.png">
- ์ธ์
- <img width="1186" alt="image" src="https://user-images.githubusercontent.com/80495141/169258409-02432ebd-a494-4b5c-9999-8beb2e10d5d9.png">


## ๐ฉ๐ปโ๐ป ๋ก๊ทธ์ธ ์ฒ๋ฆฌ2 - ํํฐ, ์ธํฐ์ํฐ
- ์๋ธ๋ฆฟ ํํฐ - ์๊ฐ
- ์๋ธ๋ฆฟ ํํฐ - ์์ฒญ ๋ก๊ทธ
- ์๋ธ๋ฆฟ ํํฐ - ์ธ์ฆ ์ฒดํฌ
- ์คํ๋ง ์ธํฐ์ํฐ - ์๊ฐ
- ์คํ๋ง ์ธํฐ์ํฐ - ์์ฒญ ๋ก๊ทธ 
- ์คํ๋ง ์ธํฐ์ํฐ - ์ธ์ฆ ์ฒดํฌ 
- ArgumentResolver ํ์ฉ 
- ์ ๋ฆฌ

## ๐ฉ๐ปโ๐ป์๋ธ๋ฆฟํํฐ

- ํํฐํ๋ฆ
```
 HTTP ์์ฒญ -> WAS-> ํํฐ -> ์๋ธ๋ฆฟ -> ์ปจํธ๋กค๋ฌ
```

- ํํฐ์ ํ
```
HTTP ์์ฒญ -> WAS -> ํํฐ -> ์๋ธ๋ฆฟ -> ์ปจํธ๋กค๋ฌ //๋ก๊ทธ์ธ ์ฌ์ฉ์
HTTP ์์ฒญ -> WAS -> ํํฐ(์ ์ ํ์ง ์์ ์์ฒญ์ด๋ผ ํ๋จ, ์๋ธ๋ฆฟ ํธ์ถX) //๋น ๋ก๊ทธ์ธ ์ฌ์ฉ์
```

- ํํฐ ์ฒด์ธ
  - ํํฐ๋ ์ฒด์ธ์ผ๋ก ๊ตฌ์ฑ๋๋๋ฐ, ์ค๊ฐ์ ํํฐ๋ฅผ ์์ ๋กญ๊ฒ ์ถ๊ฐํ  ์ ์๋ค
```
HTTP ์์ฒญ ->WAS-> ํํฐ1-> ํํฐ2-> ํํฐ3-> ์๋ธ๋ฆฟ -> ์ปจํธ๋กค๋ฌ
```


## ๐ฉ๐ปโ๐ป ์คํ๋ง ์ธํฐ์ํฐ

- ์คํ๋ง ์ธํฐ์ํฐ ํ๋ฆ
  - ์คํ๋ง ์ธํฐ์ํฐ๋ ๋์คํจ์ฒ ์๋ธ๋ฆฟ๊ณผ ์ปจํธ๋กค๋ฌ ์ฌ์ด์์ ์ปจํธ๋กค๋ฌ ํธ์ถ ์ง์ ์ ํธ์ถ ๋๋ค.
```
HTTP ์์ฒญ ->WAS-> ํํฐ -> ์๋ธ๋ฆฟ -> ์คํ๋ง ์ธํฐ์ํฐ -> ์ปจํธ๋กค๋ฌ
```

- ์คํ๋ง ์ธํฐ์ํฐ ์ ํ
```
HTTP ์์ฒญ -> WAS -> ํํฐ -> ์๋ธ๋ฆฟ -> ์คํ๋ง ์ธํฐ์ํฐ -> ์ปจํธ๋กค๋ฌ //๋ก๊ทธ์ธ ์ฌ์ฉ์
HTTP ์์ฒญ -> WAS -> ํํฐ -> ์๋ธ๋ฆฟ -> ์คํ๋ง ์ธํฐ์ํฐ(์ ์ ํ์ง ์์ ์์ฒญ์ด๋ผ ํ๋จ, ์ปจํธ๋กค๋ฌ ํธ์ถ X) // ๋น ๋ก๊ทธ์ธ ์ฌ์ฉ์

```
- ์คํ๋ง ์ธํฐ์ํฐ ์ฒด์ธ
```
HTTP ์์ฒญ -> WAS -> ํํฐ -> ์๋ธ๋ฆฟ -> ์ธํฐ์ํฐ1 -> ์ธํฐ์ํฐ2 -> ์ปจํธ๋กค๋ฌ
```


## ๐ฉ๐ปโ๐ป PathPattern ๊ณต์ ๋ฌธ์
https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/util/pattern/PathPattern.html
```
- ? ํ ๋ฌธ์ ์ผ์น
- * ๊ฒฝ๋ก(/) ์์์ 0๊ฐ ์ด์์ ๋ฌธ์ ์ผ์น
- ** ๊ฒฝ๋ก ๋๊น์ง 0๊ฐ ์ด์์ ๊ฒฝ๋ก(/) ์ผ์น
- {spring} ๊ฒฝ๋ก(/)์ ์ผ์นํ๊ณ  spring์ด๋ผ๋ ๋ณ์๋ก ์บก์ฒ
- {spring:[a-z]+} matches the regexp [a-z]+ as a path variable named 
- "spring" {spring:[a-z]+} regexp [a-z]+ ์ ์ผ์นํ๊ณ , "spring" ๊ฒฝ๋ก ๋ณ์๋ก ์บก์ฒ
- {*spring} ๊ฒฝ๋ก๊ฐ ๋๋  ๋ ๊น์ง 0๊ฐ ์ด์์ ๊ฒฝ๋ก(/)์ ์ผ์นํ๊ณ  spring์ด๋ผ๋ ๋ณ์๋ก ์บก์ฒ
- /pages/t?st.html โ matches /pages/test.html, /pages/tXst.html but not /pages/
  toast.html
- /resources/*.png โ matches all .png files in the resources directory
- /resources/** โ matches all files underneath the /resources/ path, including /
- resources/image.png and /resources/css/spring.css
- /resources/{*path} โ matches all files underneath the /resources/ path and
- captures their relative path in a variable named "path"; /resources/image.png
- will match with "path" โ "/image.png", and /resources/css/spring.css will match
- with "path" โ "/css/spring.css"
- /resources/{filename:\\w+}.dat will match /resources/spring.dat and assign the
  value "spring" to the filename variable
```
