package shinhands.exam_240710;

import java.util.Stack;

public class P2 {
    public static void main(String[] args) {
        P2 p = new P2();
        String[] expression = { "2-1x5-4x3+2", "2x3-1" };
        for (String e : expression) {
            long result = p.solution(e);
            System.out.println(result);
        }
    }

    public long solution(String expression) {
        long answer = 0;
        // 괄호가 들어가는 전체 경우의 수 구하기
        // 길이는 최대 101이므로 시간복잡도는 문제없지 않을까
        for (int i = 0; i < expression.length(); i += 2) {
            for (int j = i + 2; j <= expression.length(); j += 2) {
                long temp = calc(expression.substring(0, i)
                        + "(" + expression.substring(i, j + 1) + ")"
                        + expression.substring(j + 1));
                if (answer < temp) {
                    answer = temp;
                }
            }
        }
        return answer;
    }

    // 식 계산
    public long calc(String expression) {
        Stack<Integer> values = new Stack<>(); // 값을 저장할 스택
        Stack<Character> ops = new Stack<>(); // 연산자를 저장할 스택
        char[] tokens = expression.toCharArray(); // 식을 캐릭터배열로 저장

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == ' ') { // 공백 문자인 경우 건너띔
                continue;
            }

            // 숫자인 경우
            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuilder sbuf = new StringBuilder();
                // 숫자가 끝날 때까지 계속 읽음
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') {
                    sbuf.append(tokens[i++]);
                }
                // 완성된 숫자를 정수로 변환하여 값 스택에 추가
                values.push(Integer.parseInt(sbuf.toString()));
                i--; // 다음 반복에서 현재 문자를 다시 처리하기 위해 인덱스 조정
            } else if (tokens[i] == '(') { // 여는 괄호인 경우
                ops.push(tokens[i]); // 연산자 스택에 저장
            } else if (tokens[i] == ')') { // 닫는 괄호인 경우
                // 여는 괄호를 만날 때까지 연산 수행
                while (ops.peek() != '(') {
                    values.push(operate(ops.pop(), values.pop(), values.pop()));
                }
                ops.pop();
            } else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == 'x') {
                // 현재 연산자의 우선순위가 스택의 연산자보다 낮거나 같으면 연산 수행
                while (!ops.empty() && isOperate(tokens[i], ops.peek()))
                    values.push(operate(ops.pop(), values.pop(), values.pop()));
                ops.push(tokens[i]); // 현재 연산자를 스택에 추가
            }
        }

        // 전체 모든연산 수행
        while (!ops.empty()) {
            values.push(operate(ops.pop(), values.pop(), values.pop()));
        }

        // 마지막 결과값
        return values.pop();
    }

    // 연산자의 우선순위 판단
    public boolean isOperate(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == 'x') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        return true;
    }

    // +, -, x 연산
    public int operate(char op, int b, int a) {
        int result = 0;
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == 'x') {
            return a * b;
        }
        return result;
    }
}
