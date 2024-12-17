### Kotlin
코틀린은 자바의 단점을 보완하고자 나온 언어이다   
변수보단 상수를 쓰는게 실수나 버그를 줄일 수 있다

### Kotlin 기초 문법




### Java와 차이점
- Null
    - java : null을 허용한다
    - kotlin
      - null을 허용하지 않는다 -> NullPointException 방지
      - list도 수정 불가
      - nullable type : null이 될 수 있는 타입을 명시적으로 표시 (타입 뒤에 물음표 붙임)
      
- 문자열 처리
  - java : + 연산 기호 사용
  - kotlin : $로 연결 가능
     ```kotlin
     fun main(){
       var name = "한석봉"
       val fullName = "홍$name"
       println(fullName) // -> 홍한석봉
     }
     ```
- 확장함수
  - java : 상속 이용
  - kotlin : 기존 클래스에 새로운 메서드 추가하는 것처럼 사용
     ```kotlin
     fun 클래스명.함수명
     ```

