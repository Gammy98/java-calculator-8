package calculator;

import java.util.*;

//MVC 에서 MODEL역할이고 Application이 Controller 그리고 Console.readLine 과 System.out과 같은 입출력이 View!!
public class Separating {
    public int add(String input) {

        if (input == null || input.isEmpty()) {
            return 0;
        }

        String separator = ",:"; //기본구분자 설정
        String text = input;

        if (input.startsWith("//")) {
            int sepindex = input.indexOf("\n");
            if (sepindex == -1) {
                throw new IllegalArgumentException("커스텀 구분자 형식이 올바르지 않습니다.");
            }
            String customseparator = input.substring(2, sepindex);

            if (!customseparator.isEmpty()) {
                separator += customseparator;
            }
            text = input.substring(sepindex + 1);
        }

        StringTokenizer st = new StringTokenizer(text, separator);
        List<String> numberList = new ArrayList<>();
        while (st.hasMoreTokens()) {
            numberList.add(st.nextToken());
        }

        int result = 0;

        for (String snum : numberList) {
            if (snum.isEmpty()) {
                continue;
            }

            int number;
            try {
                number = Integer.parseInt(snum);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("입력값 중 문자가 있습니다");
            }

            if (number < 0) {
                throw new IllegalArgumentException("입력값 중 음수가 있습니다");
            }
            result += number;
        }
        return result; // 0 또는 계산된 sum을 반환
    }
}

