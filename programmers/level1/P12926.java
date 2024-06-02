package level1;

/**
 */
public class P12926 {

    public static void main(String[] args) {
        String result = solution("ABZ", 1);
        System.out.println(result);
    }

    public static String solution(String s, int n) {
        for (int j = 1; j<=n; j++) {
            String result = "";
            for (int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                //System.out.println((int)c);
                if (c == ' ') {
                    result += " ";
                } else {
                    if (c == 122) {
                        c = 96;
                    }
                    if (c == 90) {
                        c = 64;
                    }
                    result += (char)(c+1);
                }
            }
            s = result;
        }
        return s;
    }
}