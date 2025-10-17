package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();

        int result = 0;
        if (input != null && !input.isEmpty()) {
            String[] seperatedInput = input.split(",|:");

            for (String strnum : seperatedInput) {
                if (!strnum.isEmpty()) {  //구분자가 동시에 올경우
                    result += Integer.parseInt(strnum);
                }
            }
        }
        System.out.println("결과 : " + result);
    }
}
