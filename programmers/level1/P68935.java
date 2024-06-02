package level1;

/**
 */
public class P68935 {

    public static void main(String[] args) {
        int result = solution(125);
        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = 0;
        String val = "";
        while (true) {
            int remain = n % 3;
            val = remain + val;
            n = n / 3;
            if (n < 3) {
                if (n > 0) val = n + val;
                break;
            }
        }
        for (int i=0; i<val.length(); i++) {
            int v = Integer.parseInt(String.valueOf(val.charAt(i)));
            if (v != 0) answer += v * Math.pow(3, (i));
        }
        return answer;
    }
}