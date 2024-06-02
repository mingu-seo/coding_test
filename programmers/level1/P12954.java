package level1;

/**
 * Lesson42748
 */
public class P12954 {

    public static void main(String[] args) {
        long[] arr = solution(2, 5);
        for (long a : arr) {
            System.out.println(a);
        }
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i=0; i<n; i++) {
            answer[i] = (i+1) * (long)x; // x를 long으로 형변환하지 않으면 13,14 테스트케이스 에러
        }
        return answer;
    }
}