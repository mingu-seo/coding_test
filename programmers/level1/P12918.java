package level1;

/**
 */
public class P12918 {

    public static void main(String[] args) {
        boolean result = solution("1234");
        System.out.println(result);
    }

    public static boolean solution(String s) {
        
        if (s.length() != 4 && s.length() != 6) return false;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) < 48 || s.charAt(i) > 57) {
                return false;
            }
        }
        return true;
    }
}