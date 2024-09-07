package level2;

import java.util.Stack;

public class P60058 {
    public static void main(String[] args) {
        P60058 p = new P60058();
        // String result = p.solution("(()())()");
        // String result = p.solution(")(");
        String result = p.solution("()))((()");
        System.out.println(result);
    }

    public String solution(String p) {
        String answer = "";

        if ("".equals(p) || isRight(p)) {
            answer = p;
        } else {
            answer = make(p);
        }

        return answer;
    }

    String make(String p) {
        if (isRight(p))
            return p;

        String u = "";
        String v = "";
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < p.length(); i++) {
            String s = String.valueOf(p.charAt(i));

            if ("(".equals(s)) {
                stack.push(s);
            } else {
                if (stack.size() > 0) {
                    if ("(".equals(stack.peek())) {
                        stack.pop();
                    } else {
                        stack.push(s);
                    }
                }
            }
            if (stack.size() == 0) {
                u = p.substring(0, i + 1);
                v = p.substring(i + 1);
                break;
            }
        }
        // System.out.println("u:" + u + ", v:" + v);

        if (isRight(u)) {
            return u + make(v);
        } else {
            String s = "";
            for (int i = 1; i < u.length() - 1; i++) {
                if ("(".equals(u.substring(i, i + 1))) {
                    s += ")";
                } else {
                    s += "(";
                }
            }
            // System.out.println("이전:" + s);
            s = "(" + make(v) + ")" + s;
            // System.out.println("이후:" + s);
            return s;
        }
    }

    // 올바른 문자열인지 체크
    boolean isRight(String str) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));

            if ("(".equals(s)) {
                stack.push(s);
            } else {
                if (stack.size() == 0) {
                    return false;
                } else {
                    if ("(".equals(stack.peek())) {
                        stack.pop();
                    } else {
                        stack.push(s);
                    }
                }
            }
        }
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
