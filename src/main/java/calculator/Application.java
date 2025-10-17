package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();

        if (input == null || input.isEmpty()) { //Consol이 빈문자열을 반환하거나 null 반환
            System.out.println("결과 : 0");
        }
        else {
            // TODO : 4번기능 구현
            // TODO : 기능 마저 구현후 중복 방지로 출력 위치변경 필요해보임
        }
    }
}
