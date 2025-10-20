# WEEK 1
# java-calculator-precourse

---
## 📌  Features
* [x] 사용자에게 "덧셈할 문자을 입력해주세요." 라는 안내문구 출력한다
* [x] 사용자로부터 덧셈할 문자열을 입력받는다.
* [x] 입력받은 문자열이 빈 문자열인 경우 0을 반환한다.
* [x] 기본 구분자(쉼표, 콜론)를 기준으로 문자열을 분리하여 각 숫자의 합을 반환한다.
* [x] 커스텀 구분자('//'와 '\n 사이)를 기준으로 문자열을 분리하여 각 숫자의 합을 반환한다.
* [x] 분리된 문자열에 숫자가 아니거나 음수인 문자가 포함되어있으면 IllegalArgumentException을 발생시킨다.
* [x] 최종결과를 "결과 : [숫자]" 형태로 출력한다.


<br>
<br>

## 💡 Think about
- OOP refactoring
- MVC refactoring


<br>
<br>

## 💻  What I learn(simply)
1. fork의 개념
2. README.md 파일의 다양한 보기지원이 우측상단 아이콘으로 정해진다
3. README.md 문법과 작성요령 (특히 기능의 세분화정도 고민)
4. 평상시 사용하던 BufferedReader대신 build.gradle dependency에 있는 API같은 걸로도 입력을 받을 수 있다.
5. 입력받을때 예외처리로 항상 null도 신경써주자 !!
6. main 함수가 복잡해짐에 따라 MVC디자인 적용(main = Controller, Separating = Model, console/System.out = View)
7. 코드를 구현할 때 다양한 입력(특히 예외경우)을 생각해보며 코드작성해야함.. (EX : sepindex가 -1인경우 )
8. 개행문자 처리하느라 시간많이 씀(애초에 백슬래시 자체도 이스케이프에 쓰이는 특수문자) > main함수에서 replace로 해결
9. SRP에 따른 책임분리
