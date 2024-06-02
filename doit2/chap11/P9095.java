package doit2.chap11;

import java.util.Arrays;
import java.util.Scanner;

public class P9095 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] dp = new int[11];
        dp[1] = 1; // 1일때 경우의 수 1
        dp[2] = 2; // 2일때 경우의 수 2
        dp[3] = 4; // 3일때 경우의 수 4
        // 점화식 = dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        for (int i = 4; i < 11; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }
        // System.out.println(Arrays.toString(dp));
        int[] result = new int[T];
        for (int i = 0; i < T; i++) {
            int n = scan.nextInt();
            result[i] = dp[n];
        }
        for (int r : result) {
            System.out.println(r);
        }
    }
}
