package level1;

/**
 * 없는 숫자 더하기
 */
public class P12922 {

    public static void main(String[] args) {
        String result = solution(3);
        System.out.println(result);
    }

    public static String solution(int n) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<n; i++) {
            if (i%2 == 0) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }
        answer = sb.toString();
        return answer;
    }
}