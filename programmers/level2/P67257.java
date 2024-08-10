package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P67257 {

    public static void main(String[] args) {
        P67257 p = new P67257();
        long result = p.solution("100-200*300-500+20");
        System.out.println(result);
    }

    public long solution(String expression) {
        long answer = 0;

        StringTokenizer st = new StringTokenizer(expression, "*+-", true);
        List<String> tokens = new ArrayList<>();
        while (st.hasMoreTokens()) {
            tokens.add(st.nextToken());
        }
        // System.out.println(tokens);
        // 3가지 연산 우선순위 모든 경우의수
        String[][] operators = {
                { "*", "+", "-" },
                { "*", "-", "+" },
                { "+", "*", "-" },
                { "+", "-", "*" },
                { "-", "*", "+" },
                { "-", "+", "*" }
        };

        // 모든 경우의 수중에 가장 큰값 구하기
        for (String[] operator : operators) {
            // 토큰을 새로운 변수로 만들어서 비교(각 경우의 수 별로 구해서 비교해야 하므로)
            List<String> tokens_temp = new ArrayList<>(tokens);
            for (String oper : operator) { // 연산자 하나
                for (int i = 0; i < tokens_temp.size(); i++) {
                    if (oper.equals(tokens_temp.get(i))) { // 토큰의 i값과 연산자가 일치하면
                        long result = operate(oper, Long.parseLong(tokens_temp.get(i - 1)),
                                Long.parseLong(tokens_temp.get(i + 1)));
                        // +를 만났다면 그 앞과 뒤값을 가지고 연산한 뒤, 그 앞의 값을 3번 지우면 모두 삭제
                        tokens_temp.remove(i - 1);
                        tokens_temp.remove(i - 1);
                        tokens_temp.remove(i - 1);
                        // 연산된 값을 토큰의 i-1위치에 삽입
                        tokens_temp.add(i - 1, result + "");
                        i -= 2; // 현재 위치를 추가한 값 그전으로 이동
                    }
                }
            }
            // System.out.println(Math.abs(Long.parseLong(tokens_temp.get(0))));
            if (answer < Math.abs(Long.parseLong(tokens_temp.get(0)))) {
                answer = Math.abs(Long.parseLong(tokens_temp.get(0)));
            }

        }

        return answer;
    }

    // 연산자에 따른 두 항의 연산결과 리턴
    long operate(String operator, long a, long b) {
        if ("*".equals(operator)) {
            return a * b;
        } else if ("+".equals(operator)) {
            return a + b;
        } else if ("-".equals(operator)) {
            return a - b;
        }
        return 0;
    }
}