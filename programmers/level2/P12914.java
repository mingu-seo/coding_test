package level2;

import java.util.Arrays;
/**
 * 1 : 1
 * 2 : 2
 * 3 : 3
 * 4 : 5
 * 5 : 8
 * 
 * 피보나치 수열임
 * 0,1 일때는 그대로 리턴하고 나머지는 -1 + -2 더한값
 */

public class P12914 {
    public static void main(String[] args) {
        P12914 p = new P12914();
        long result = p.solution(4);
        System.out.println(result);
    }
    public long solution(int n) {
        if (n == 0 || n == 1) return n;
        long answer = 0;
        int[] narr = new int[n];
        
        narr[0] = 1;
        narr[1] = 2;
        for (int i=2; i<n; i++) {
            // 다음값은 -1값과 -2값을 더한값
            narr[i] = (narr[i-1] + narr[i-2]) % 1234567;
        }

        // System.out.println(Arrays.toString(narr));
        answer = narr[n-1];

        return answer;
    }

}
