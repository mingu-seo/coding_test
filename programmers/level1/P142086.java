package level1;

/**
 * Lesson42748
 */
public class P142086 {

    public static void main(String[] args) {
        int[] result = solution("banana");
        for (int a : result) {
            System.out.println(a);
        }
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        for (int i=0; i<s.length(); i++) {
            // char c = s.charAt(i);
            int distance = 0;
            answer[i] = -1;
            for (int j=i-1; j>=0; j--) {
                // System.out.println(s.charAt(i)+":"+s.charAt(j));
                distance++;
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = distance;
                    break;
                }
            }
        }
        return answer;
    }
}