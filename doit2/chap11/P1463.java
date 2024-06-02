package doit2.chap11;

import java.util.Arrays;
import java.util.Scanner;

public class P1463 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        // 배열1부터 처리하도록
        int[] dp = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        // System.out.println(Arrays.toString(dp));
        System.out.println(dp[N]);
    }
}
