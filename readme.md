## 1차 요구사항 구현
- [ ] 유저가 루트 url로 접속시에 게시글 리스트 페이지(http://주소:포트/article/list)가 나온다.
- [ ] 리스트 페이지에서는 등록 버튼이 있고 버튼을 누르면 http://주소:포트/article/create 경로로 이동하고 등록 폼이 나온다.
- [ ] 게시글 등록을 하면 http://주소:포트/article/create로 POST 요청을 보내어 DB에 해당 내용을 저장한다.
- [ ] 게시글 등록이 되면 해당 게시글 리스트 페이지로 리다이렉트 된다. 페이지 URL 은 http://주소:포트/article/list 이다.
- [ ] 리스트 페이지에서 해당 게시글을 클릭하면 상세페이지로 이동한다. 해당 경로는 http://주소:포트/article/detail/{id} 가 된다.
- [ ] 게시글 상세 페이지에는 id에 맞는 게시글 데이터와 목록 버튼이 있다. 목록 버튼을 누르면 게시글 리스트 페이지로 이동하게 된다.

- (추가 기능이나 구현기능설명이 필요한 경우 서술)

## 미비사항 or 막힌 부분
- ...

## MVC 패턴
- ...

## 스프링에서 의존성 주입(DI) 방법 3가지 방법
- 1 생성자 주입 
- 2 필드 주입
- 3 수정자 주입

## JPA의 장점과 단점
- 장점
    1. 특정 데이터베이스에 종속되지 않는다
    2. 객체지향적 프로그래밍이다.
    3. 생산성 향상된다.

- 단점
    1. 쿼리 처리가 복잡하다
    2. 성능 저하 위험
    3. 학습시간이 오래걸린다. 
## HTTP GET 요청과 POST 요청의 차이

사용목적 : GET은 서버의 리소스에서 데이터를 요청할 때, POST는 서버의 리소스를 새로 생성하거나 업데이트할 때 사용한다.
DB로 따지면 GET은 SELECT 에 가깝고, POST는 Create 에 가깝다고 보면 된다.
요청에 body 유무 : GET 은 URL 파라미터에 요청하는 데이터를 담아 보내기 때문에 HTTP 메시지에 body가 없다. POST 는 body 에 데이터를 담아 보내기 때문에 당연히 HTTP 메시지에 body가 존재한다.

멱등성 (idempotent) : GET 요청은 멱등이며, POST는 멱등이 아니다.