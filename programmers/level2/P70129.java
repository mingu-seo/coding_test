package level2;

public class P70129 {
    public static void main(String[] args) {
        P70129 p = new P70129();
        int[] result = p.solution("110010101001");
        for (int r : result) {
            System.out.println(r);
        }
    }

    public int[] solution(String s) {
        int[] answer = {0,0};

        while (!"1".equals(s)) {
            
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i) == '0') answer[1]++;
            }
            s = s.replaceAll("0","");
            s = transform(s.length());
            answer[0]++;
        }
        
        return answer;
    }

    static String transform(int x) {
        String value = "";

        while (x >= 2) {
            int r = x % 2;
            x = x / 2;
            value = String.valueOf(r) + value;
        }
        value = x + value;
        return value;
    }
}
