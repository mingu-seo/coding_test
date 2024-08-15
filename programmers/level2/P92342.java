package level2;

import java.util.Arrays;

public class P92342 {
    public static void main(String[] args) {
        P92342 p = new P92342();
        // int[] result = p.solution(5, new int[] { 2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0 });
        int[] result = p.solution(5, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        for (int r : result) {
            System.out.println(r);
        }
    }

    /*
     * 완전탐색으로 풀이
     */

    public int[] solution(int n, int[] info) {
        // 점수 최대 길이 11
        int[] answer = recursive(0, n, new int[11], info);
        if (answer == null)
            answer = new int[] { -1 };
        return answer;
    }

    // 인덱스, 화살수, 라이언 점수배열 어피치의 점수배열
    int[] recursive(int idx, int n, int[] ryan, int[] info) {
        if (idx == ryan.length) {
            if (n > 0)
                return null;

            return Arrays.copyOf(ryan, ryan.length);
        }

        int maxDiff = 0;
        int[] winner = null;
        for (int i = 0; i <= n; i++) {
            ryan[idx] = i;
            int[] scores = recursive(idx + 1, n - i, ryan, info);

            if (scores == null)
                continue;

            System.out.println(Arrays.toString(scores));

            // 점수차
            int diff = 0;
            for (int j = 0; j < scores.length; j++) {
                if (scores[j] == 0 && info[j] == 0)
                    continue;
                if (scores[j] <= info[j]) {
                    diff -= 10 - i;
                } else {
                    diff += 10 - i;
                }

                if (maxDiff < diff) {
                    maxDiff = diff;
                    winner = scores;
                }
            }

        }
        return winner;
    }
}
