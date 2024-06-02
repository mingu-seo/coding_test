package level1;

/**
 * Lesson42748
 */
public class P12903 {

    public static void main(String[] args) {
        String result = solution("abcdef");
        System.out.println(result);
    }

    public static String solution(String s) {
        String answer = "";
        int size = s.length();
        if (size % 2 == 1) {
            answer = s.substring(size / 2, size / 2 + 1);
        } else {
            answer = s.substring(size / 2 - 1, size / 2 + 1);
        }
        return answer;
    }
}