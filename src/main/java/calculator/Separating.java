package calculator;

//MVC 에서 MODEL역할이고 Application이 Controller 그리고 Console.readLine 과 System.out과 같은 입출력이 View!!
public class Separating {
    public int add(String input) {
        int result = 0; // 0으로 초기화

        // 3번 + 4번 기능 로직 (main에서 그대로 가져옴)
        // "만약 text가 null도 아니고, 비어있지도 않다면 계산"
        if (input != null && !input.isEmpty()) {
            String[] strNum = input.split(",|:"); // 4번 기능

            for (String snum : strNum) {
                // TODO : 음수거나 숫자가 아닌 문자가 있으면 예외처리 필요
                if (!snum.isEmpty()) {
                    result += Integer.parseInt(snum);
                }
            }
        }
        return result; // 0 또는 계산된 sum을 반환
    }
}

