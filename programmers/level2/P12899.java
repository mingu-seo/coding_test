package level2;

/**
 * 3진법으로 변환
 * 1,2,4 -> 0,1,2로 변환해보자
 */
public class P12899 {
  
    public static void main(String[] args) {
        P12899 p = new P12899();
        String r = p.solution(10);
        System.out.println(r);
    }

    public String solution(int n) {
        String answer = "";

        // 3진수로 변환
        StringBuilder value = new StringBuilder();
        while (true) {
            int rest = n % 3;
            value.insert(0,rest);
            n = n / 3;
            if (n < 3)  {
                value = value.insert(0,n);
                break;
            }
        }
        // System.out.println(value);
        // 3진수를 1,2,4로 변경
        // 문자열에 0이 없을때까지 반복
        while (value.toString().contains("0")) {
            for (int i=1; i<value.length(); i++) {
                // 0인 경우 그 앞의 문자를 4로 변경
                // 0이라는 얘기는 단위가 올라가서 10처럼 십의 자리로 늘어난 경우이므로 이전 문자를 하나 감소 시킴
                if (value.charAt(i) == '0') { 
                    value.setCharAt(i, '4');
                    // 현재i보다 왼쪽 문자값을 하나 감소
                    if (value.charAt(i-1) == '4') {
                        value.setCharAt(i-1, '2');
                    } else if (value.charAt(i-1) == '2') {
                        value.setCharAt(i-1, '1');
                    } else if (value.charAt(i-1) == '1') {
                        value.setCharAt(i-1, '0');
                    }
                }
            }
            // 맨앞에 0이 있는 경우 삭제
            if (value.charAt(0) == '0') {
                value.deleteCharAt(0);
            }
        }
        // System.out.println(value);
        answer = value.toString();
        return answer;
    }
}