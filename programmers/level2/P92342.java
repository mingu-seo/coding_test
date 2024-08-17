package level2;

import java.util.Arrays;

public class P92342 {
    public static void main(String[] args) {
        P92342 p = new P92342();
        // int[] result = p.solution(5, new int[] { 2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0 });
        // int[] result = p.solution(1, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        int[] result = p.solution(9, new int[] { 0, 0, 1, 2, 0, 1, 1, 1, 1, 1, 1 });
        for (int r : result) {
            System.out.println(r);
        }
    }

    /*
     * 완전탐색으로 풀이
     * 
     * 재귀적으로 라이언의 최적의 화살 배치를 계산하여 반환
     * answer: 라이언의 최적의 화살 배치 배열, 만약 라이언이 승리할 수 없으면 [-1] 반환
     */

    public int[] solution(int n, int[] info) {
        // n: 라이언이 쏠 수 있는 화살의 총 개수
        // info: 어피치의 과녁 점수 배열 (어피치가 각 점수에서 몇 발을 맞췄는지)

        // 점수 최대 길이 11
        int[] answer = recursive(0, n, new int[11], info);
        if (answer == null)
            answer = new int[] { -1 }; // 라이언이 승리할 수 없을 때 [-1] 반환
        return answer;
    }

    // 인덱스, 화살수, 라이언 점수배열 어피치의 점수배열
    // idx: 현재 고려 중인 점수의 인덱스 (0부터 10까지, 0점에서 10점까지의 과녁)
    // n: 남은 화살의 수
    // ryan: 라이언의 현재 화살 배치
    // info: 어피치의 화살 배치 (고정)
    int[] recursive(int idx, int n, int[] ryan, int[] info) {
        if (idx == ryan.length) {
            if (n > 0) // 화살이 남았으면 무효 (해당 배치 무효)
                return null;
            // 점수차가 0이하이면 null리턴
            if (getDiff(info, ryan) <= 0)
                return null;
            return Arrays.copyOf(ryan, ryan.length);
        }

        int maxDiff = 0; // 최대 점수 차이
        int[] winner = null; // 최대 점수 차이를 가진 라이언의 화살 배치
        // i: 현재 점수에서 라이언이 쏠 수 있는 화살 수 (0부터 남은 화살 수 n까지)
        for (int i = 0; i <= n; i++) {
            ryan[idx] = i;
            // 다음 점수에 대해 재귀 호출
            int[] scores = recursive(idx + 1, n - i, ryan, info);

            if (scores == null)
                continue;

            // System.out.println(Arrays.toString(scores));

            // 점수차
            int diff = getDiff(info, scores);

            // System.out.println("diff:" + diff);
            if (maxDiff < diff) {
                maxDiff = diff;
                winner = scores;
            } else if (maxDiff == diff) {
                // 점수 차이가 같은 경우, 더 유리한 배치(낮은 점수를 적게 맞춘 배치)를 선택
                // System.out.println("maxDiff:" + maxDiff);
                if (isThanSmall(winner, scores)) {
                    maxDiff = diff; // 동일 점수 차이에서 유리한 배치로 업데이트
                    winner = scores;
                }
            }

        }
        return winner;
    }

    // 어피치와 라이언의 점수 차이를 계산
    int getDiff(int[] info, int[] scores) {
        int diff = 0; // 총 점수 차이
        for (int j = 0; j < info.length; j++) {
            if (scores[j] == 0 && info[j] == 0)
                continue;
            if (scores[j] <= info[j]) {
                diff -= 10 - j; // 어피치가 이기는 경우 점수 차이를 음수로
            } else {
                diff += 10 - j; // 라이언이 이기는 경우 점수 차이를 양수로
            }
        }
        return diff;
    }

    // 뒤에서부터 차례대로 점수비교해서 낮은점수면 승리(true) 높은점수면 패배(false) 동점이면 다음(앞점수)비교
    boolean isThanSmall(int[] my, int[] target) {
        for (int i = target.length - 1; i >= 0; i--) {
            if (my[i] < target[i]) {
                return true;
            } else if (my[i] > target[i]) {
                return false;
            }
        }
        return false;
    }
}
