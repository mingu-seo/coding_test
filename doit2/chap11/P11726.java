package doit2.chap11;

import java.util.Scanner;

public class P11726 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] dp = new int[1001];
        dp[1] = 1; // 1일때 경우의 수 1
        dp[2] = 2; // 2일때 경우의 수 2 (위/아래, 오른/왼 2가지 방법)
        // 점화식 = dp[i] = dp[i-1] + dp[i-2];
        for (int i = 3; i < 1001; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        // System.out.println(Arrays.toString(dp));
        System.out.println(dp[n]);
    }
}
