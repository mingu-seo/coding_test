package level1;

/**
 */
public class P147355 {

    public static void main(String[] args) {
        int arr = solution("10203", "15");
        System.out.println(arr);
    }

    public static int solution(String t, String p) {
        int answer = 0;
        int size = t.length()-p.length();
        for (int i=0; i<=size; i++) {
            System.out.println(t.substring(i, i+p.length()));
            long val = Long.parseLong(t.substring(i, i+p.length()));
            if (Long.parseLong(p) >= val) {
                answer++;
            }
        }
        return answer;
    }
}