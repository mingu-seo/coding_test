package doit2.chap11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P14501 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        // 1일부터 편하게 처리하기 위해 N+1개로 지정
        int[] T = new int[N + 1]; // 상담완료기간
        int[] P = new int[N + 1]; // 금액

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        // System.out.println(Arrays.toString(T));
        // System.out.println(Arrays.toString(P));

        // T,P보다 1일 이후도 계산에서 필요하므로
        int[] dp = new int[N + 2];// dp 배열

        // 뒤에서부터 금애계산처리
        for (int i = N; i > 0; i--) {
            // 오늘 시작하는 상담이 퇴사일까지 끝나지 않으면
            if (i + T[i] > N + 1) {
                dp[i] = dp[i + 1]; // 다음날 상담금액합계 그대로 가져옴
            } else {
                dp[i] = Math.max(dp[i + 1], dp[i + T[i]] + P[i]); // 다음날 상담금액합계와 오늘날짜에서 상담완료일수 이후 금액(dp[i+T[i]])과 오늘
                                                                  // 상담금액(P[i]) 중 큰값 저장
            }
        }
        // System.out.println(Arrays.toString(dp));
        System.out.println(dp[1]);
    }
}
