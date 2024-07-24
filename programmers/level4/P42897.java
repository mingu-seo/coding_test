package level4;

import java.util.Arrays;

public class P42897 {
    public static void main(String[] args) {
        P42897 p = new P42897();
        int result = p.solution(new int[] { 1, 2, 3, 1 });
        System.out.println(result);
    }

    /*
     * 전체를 탐색하는것은 시간초과
     * 0번집을 도둑질하면 1번집은 불가
     * 2번집은 도둑질했을때와 하지않았을때로 나눠짐 (여부에 따라 1번집 가능/불가가 정해지므로)
     * 2번집을 도둑집했을때 : 2번집금액 + 0번집까지의 최대금액
     * 2번집을 도둑질하지 않았을때 : 1번집금액까지의 최대금액
     * ...
     * 이런식으로 점화식을 구하면
     * max(최대금액[i-1], 최대금액[i-2]+i번째집금액)
     * 
     * 이 식을 첫번째를 도둑질했을 경우와 안했을 경우로 나누면 됨
     */
    public int solution(int[] money) {
        int answer = 0;
        int[] dp1 = new int[money.length];
        int[] dp2 = new int[money.length];

        // 첫번째 도둑질한 경우
        dp1[0] = money[0];
        dp1[1] = money[0];
        for (int i = 2; i < money.length; i++) {
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + money[i]);
        }

        // 첫번째 도둑질안한 경우
        dp2[0] = 0;
        dp2[1] = money[1];
        for (int i = 2; i < money.length; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + money[i]);
        }

        // System.out.println(Arrays.toString(dp1));
        // System.out.println(Arrays.toString(dp2));

        // dp1의 최대값은 마지막값이 아니라 마지막에서 1뺀값
        answer = Math.max(dp1[dp1.length - 2], dp2[dp2.length - 1]);
        return answer;
    }
}
