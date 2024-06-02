package level2;

public class P12951 {
    public static void main(String[] args) {
        P12951 p = new P12951();
        String result = p.solution("for the last week");
        // String result = p.solution("z");
        System.out.println(result);
    }

    public String solution(String s) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<s.length(); i++) {
            String text = "";
            char c = s.charAt(i);
            
            if ((i==0 || s.charAt(i-1) == ' ') && ((c >= 65 && c <=90) || (c >= 97 && c <= 122))) {
                text = String.valueOf(c).toUpperCase();
            } else {
                text = String.valueOf(c).toLowerCase();
            }
            
            sb.append(text);
        }
        answer = sb.toString();
        return answer;
    }
}
