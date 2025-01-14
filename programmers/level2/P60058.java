package level2;

/*
make 메서드
문자열 p를 올바른 괄호 문자열로 만들기 위한 재귀적 과정이 담겨 있습니다.
문자열 u, v를 분리하는 과정에서 pair 변수로 괄호의 균형을 잡는데, 이는 올바른 접근입니다. 하지만 for 루프에서 사용하는 String.valueOf(p.charAt(i)) 대신 char 타입을 사용하여 더 효율적으로 처리할 수 있습니다.
u의 처음과 마지막 문자를 제외한 부분을 변환하는 로직 역시 StringBuilder를 사용하는 것이 성능면에서 더 유리합니다.

isRight 메서드
올바른 괄호 문자열인지 확인하는 메서드에서 pair를 사용하는 방식은 효율적이지만, 올바른 문자열이 아닌 경우에 대해 더 명확한 처리가 필요합니다.


 char 사용: String.valueOf(p.charAt(i)) 대신 char 타입을 직접 사용하여 메모리 및 성능 최적화.
 StringBuilder 사용: 문자열을 변환할 때 StringBuilder를 사용하여 성능을 개선.
 */
public class P60058 {
    public static void main(String[] args) {
        P60058 p = new P60058();
        // String result = p.solution("(()())()");
        // String result = p.solution(")(");
        String result = p.solution("()))((()");
        System.out.println(result);
    }

    public String solution(String p) {
        // 빈 문자열이거나 올바른 문자열인 경우 그대로 반환
        if (p.isEmpty() || isRight(p)) {
            return p;
        }
        // 올바른 문자열로 변환
        return make(p);
    }

    // 문자열 p를 올바른 괄호 문자열로 변환하는 메서드
    String make(String p) {
        // 이미 올바른 괄호 문자열이라면 그대로 반환
        if (isRight(p)) {
            return p;
        }

        String u = "";
        String v = "";
        int pair = 0; // 괄호 짝 개수를 셈
        for (int i = 0; i < p.length(); i++) {
            // char 타입으로 처리하여 성능 개선
            char s = p.charAt(i);

            if (s == '(') {
                pair++;
            } else {
                pair--;
            }

            // 균형 잡힌 문자열 분리
            if (pair == 0) {
                u = p.substring(0, i + 1);
                v = p.substring(i + 1);
                break;
            }
        }

        // u가 올바른 문자열이면 v를 재귀적으로 처리하여 연결
        if (isRight(u)) {
            return u + make(v);
        } else {
            // 올바르지 않다면 새로운 문자열 생성
            StringBuilder s = new StringBuilder();
            for (int i = 1; i < u.length() - 1; i++) {
                // 괄호를 반대로 변환
                s.append(u.charAt(i) == '(' ? ")" : "(");
            }
            // 변환된 문자열 반환
            return "(" + make(v) + ")" + s.toString();
        }
    }

    // 올바른 괄호 문자열인지 확인하는 메서드
    boolean isRight(String str) {
        int pair = 0; // 괄호 짝 개수
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);

            if (s == '(') {
                pair++;
            } else {
                pair--;
            }

            // 괄호 짝이 맞지 않으면 false 반환
            if (pair < 0) {
                return false;
            }
        }
        // 모든 괄호가 맞으면 true 반환
        return pair == 0;
    }
}
