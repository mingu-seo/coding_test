package level2;

public class P12900 {
    public static void main(String[] args) {
        P12900 p = new P12900();
        int result = p.solution(4);
        System.out.println(result);
    }

    public int solution(int n) {
        int answer = 0;
        int[] dp = new int[60001];
        dp[1] = 1; // 1일때 경우의 수 1
        dp[2] = 2; // 2일때 경우의 수 2 (위/아래, 오른/왼 2가지 방법)
        // 점화식 = dp[i] = dp[i-1] + dp[i-2];
        for (int i = 3; i < 60001; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        answer = dp[n];
        return answer;
    }
}
