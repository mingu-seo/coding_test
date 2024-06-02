package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P154538 {
    public static void main(String[] args) {
        P154538 p = new P154538();
        int result = p.solution(10, 40, 5);
        System.out.println(result);
    }

    public int solution(int x, int y, int n) {
        int answer = 0;

        int[] dp = new int[y + 1];
        // 동적계획법 비교를 위해 정수최대값으로 전체배열 세팅
        for (int i = 0; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[x] = 0; // x 초기값은 0으로 저장

        // x부터 y까지 3가지 연산을 각각 진행
        for (int i = x; i <= y; i++) {
            if (dp[i] < Integer.MAX_VALUE) { // dp[i]값이 최대값이 아닌 경우에만 연산 실행

                if (i + n <= y) {
                    dp[i + n] = Math.min(dp[i + n], dp[i] + 1);
                }
                if (i * 2 <= y) {
                    dp[i * 2] = Math.min(dp[i * 2], dp[i] + 1);
                }
                if (i * 3 <= y) {
                    dp[i * 3] = Math.min(dp[i * 3], dp[i] + 1);
                }
            }
        }
        // System.out.println(Arrays.toString(dp));
        if (dp[y] == Integer.MAX_VALUE) { // 값이 변하지 않은 경우는 -1로 리턴
            answer = -1;
        } else {
            answer = dp[y];
        }
        return answer;
    }

}
