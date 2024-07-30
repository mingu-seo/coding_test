package level3;

import java.util.Arrays;

public class P12927 {
    public static void main(String[] args) {
        P12927 p = new P12927();
        long result = p.solution(4, new int[] { 4, 3, 3 });
        // long result = p.solution(1, new int[] { 2, 1, 2 });
        // long result = p.solution(3, new int[] { 1, 1 });
        System.out.println(result);
    }

    // 배열 works에서 n 만큼 작업을 감소시키고 남은 작업들의 제곱합 계산
    public long solution(int n, int[] works) {
        long answer = 0;

        long sum = 0;
        for (int i = 0; i < works.length; i++) {
            sum += works[i];
        }
        // 만약 n이 작업 배열의 총 합계보다 크거나 같으면 더 이상 할 작업이 없으므로 0을 반환
        if (n >= sum) {
            return 0;
        } else {
            // 남은 시간 만큼 작업량 감소하기
            while (n != 0) {
                // 작업 배열에서 최대 값을 찾기
                int max = 0;
                for (int i = 0; i < works.length; i++) {
                    if (works[i] > max)
                        max = works[i];
                }
                for (int i = 0; i < works.length; i++) {
                    if (works[i] == max) {
                        works[i]--;
                        n--;
                        if (n == 0) // n이 0이 되면 더 이상 줄일 필요가 없으므로 루프 종료
                            break;
                    }
                }
            }
        }

        // 남은 작업들의 제곱합을 계산
        for (int i = 0; i < works.length; i++) {
            answer += Math.pow(works[i], 2);
        }
        return answer;
    }
}
