package level1;

/**
 * Lesson42748
 */
public class P70128 {

    public static void main(String[] args) {
        int result = solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2});
        System.out.println(result);
    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i=0; i<a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}