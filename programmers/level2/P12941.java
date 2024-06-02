package level2;

/*
 * 기본자료형 배열을 참조자료형 배열로 변환하는것도 시간복잡도 추가됨
 * 내림차순 정렬하려고 Integer배열로 변환하려고 했는데, 그냥 뒤에서 부터 곱하면 됨
 */

import java.util.Arrays;

public class P12941 {
    public static void main(String[] args) {
        P12941 p = new P12941();
        int result = p.solution(new int[]{1, 2}, new int[]{3, 4});
        System.out.println(result);
    }

    public int solution(int []A, int []B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        // System.out.println(Arrays.toString(A2));
        // System.out.println(Arrays.toString(B2));

        for (int i=0; i<A.length; i++) {
            answer += A[i] * B[A.length-i-1];
        }
        return answer;
    }
}
