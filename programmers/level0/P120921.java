package level0;


public class P120921 {

    public static void main(String[] args) {
        
        int r = solution("hello", "ohell");
        
        System.out.println(r);
        
    }

    public static int solution(String A, String B) {
        int answer = -1;
        if (A.equals(B)) return 0;
        for (int i=0; i<A.length(); i++) {
            A = String.valueOf(A.charAt(A.length()-1)) + A.substring(0, A.length()-1);
            if (A.equals(B)) return i+1;
        }
        return answer;
    }
}