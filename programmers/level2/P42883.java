package level2;

import java.util.Stack;
import java.util.stream.Collectors;

public class P42883 {
    public static void main(String[] args) {
        P42883 p = new P42883();
        // String result = p.solution("1924", 2);
        String result = p.solution("1231234", 3);
        // String result = p.solution("333222111", 3);
        System.out.println(result);
    }

    /*
     * 처음에 조합으로 하니까 1,2,11,12만 되고 3~10번 메모리초과, 런타임에러 발생
     * 스택으로 처리
     */
    public String solution(String number, int k) {
        String answer = "";
        int result_length = number.length() - k;

        // 최종결과값을 담을 스택변수
        Stack<Character> result = new Stack<>();
        for (int i = 0; i < number.length(); i++) {
            char n = number.charAt(i);

            if (result.size() > 0) {
                // 스택의 가장 마지막값이 문자보다 작고 현재 k값이 0보다 크면 pop, k--
                while (result.peek() < n && k > 0) {
                    result.pop();
                    k--;
                    if (result.size() == 0) // 스택이 비어있으면 중지
                        break;
                }
            }
            result.add(n);
        }
        // System.out.println(result);
        answer = result.stream().map(c -> String.valueOf(c)).collect(Collectors.joining(""));
        // 12번 케이스 실패
        // while문 조건이 만족하지 않아 모든 값이 다 들어가는 경우 배열길이-k 개수만큼만 잘라내기
        answer = answer.substring(0, result_length);
        return answer;
    }

}
