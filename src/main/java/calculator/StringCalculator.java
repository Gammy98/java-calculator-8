package calculator;

import java.util.*;

//MVC 에서 MODEL역할이고 Application이 Controller 그리고 Console.readLine 과 System.out과 같은 입출력이 View!!
public class StringCalculator {

    //null 과 빈문자열 여부 확인 + 전체계산 과정 조율
    public int add(String input) {

        if (input == null || input.isEmpty()) {
            return 0;
        }

        ParsedInput parsed = parseInput(input);
        List<String> numberStrings = tokenize(parsed.getText(), parsed.getSeparator());
        return sumNumbers(numberStrings);
    }

    // 입력 문자열 분석 , 커스텀 구분자 판단
    private ParsedInput parseInput(String input) {
        String separator = ",:";
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
        return new ParsedInput(text, separator);
    }

    //문자열을 토큰화
    private List<String> tokenize(String text, String separator) {
        StringTokenizer st = new StringTokenizer(text, separator);
        List<String> numberList = new ArrayList<>();
        while (st.hasMoreTokens()) {
            numberList.add(st.nextToken());
        }
        return numberList;
    }

    //tokenize에서 얻은 문자열 리스트로 숫자 합계 계산
    private int sumNumbers(List<String> numberStrings) {
        int result = 0;
        for (String snum : numberStrings) {
            if (snum.isEmpty()) {
                continue;
            }
            int number = validateTest(snum);
            result += number;
        }
        return result;
    }

    //하나의 문자열 조각을 검증 후 숫자로 변환
    private int validateTest(String snum) {
        int number;
        try {
            number = Integer.parseInt(snum);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("입력값 중 문자가 있습니다");
        }

        if (number < 0) {
            throw new IllegalArgumentException("입력값 중 음수가 있습니다");
        }
        return number;
    }

    //(숫자부분 문자열, 구분자) 인 데이터 구조 설정
    private static class ParsedInput{
        private final String text;
        private final String separator;

        ParsedInput(String text, String separator) {
            this.text = text;
            this.separator = separator;
        }

        String getText() {
            return text;
        }
        String getSeparator(){
            return separator;
        }
    }
}

