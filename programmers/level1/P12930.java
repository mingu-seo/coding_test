package level1;

/**
 */
public class P12930 {

    public static void main(String[] args) {
        String result = solution("try hello world");
        System.out.println(result);
    }

    public static String solution(String s) {
        String answer = "";
        int idx = 0;
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ' ') {
                idx = 0;
                sb.append(" ");
            } else {
                if (idx % 2 == 0) {
                    sb.append(String.valueOf(s.charAt(i)).toUpperCase());
                } else {
                    sb.append(String.valueOf(s.charAt(i)).toLowerCase());                
                }
                idx++;
            }
        }
        answer = sb.toString();
        return answer;
    }
}