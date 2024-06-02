package level1;

/**
 * Lesson76501
 */
public class P76501 {

    public static void main(String[] args) {
        int[] absolute = {4,7,12};
        boolean[] signs = {true,false,true};
        int result = solution(absolute, signs);
       
        System.out.println(result);

    }

    public static int solution(int[] a, boolean[] s) {
        int answer = 0;
        for (int i=0; i<a.length; i++) {
            if (s[i] == false) {
                a[i] *= -1;
            }
            answer += a[i];
        }
        return answer;
    }
}