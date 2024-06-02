package level2;

import java.util.Arrays;

public class P178870 {
    public static void main(String[] args) {
        P178870 p = new P178870();
        // int[] result = p.solution(new int[] { 1, 2, 3, 4, 5 }, 7);
        int[] result = p.solution(new int[] { 1, 1, 1, 2, 3, 4, 5 }, 5);
        // int[] result = p.solution(new int[] { 2, 2, 2, 2, 2 }, 6);
        System.out.println(Arrays.toString(result));
    }

    /*
     * public int[] solution(int[] sequence, int k) {
     * int[] answer = new int[2];
     * for (int i = 0; i < sequence.length; i++) {
     * int tot = 0;
     * for (int j = i; j < sequence.length; j++) {
     * tot += sequence[j];
     * if (tot == k) {
     * if (answer[0] == 0 && answer[1] == 0) {
     * answer[0] = i;
     * answer[1] = j;
     * } else if (answer[1] - answer[0] > j - i) {
     * answer[0] = i;
     * answer[1] = j;
     * }
     * } else if (tot > k) {
     * break;
     * }
     * }
     * }
     * return answer;
     * }
     */
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];

        int start = 0; // 시작인덱스
        int end = 0; // 끝인덱스
        long total = 0; // 합계
        int min = Integer.MAX_VALUE;
        while (true) {
            if (total == k) { // 합계가 k와 같으면
                if (min > (end - start)) { // 길이가 더 짧은 경우에만 변경
                    min = end - start;
                    // System.out.println(start + ":" + (end - 1));
                    answer[0] = start;
                    answer[1] = end - 1;
                }
                // 다음 경우의 수를 구하기 위해(다음 start값) 합계에서 start인덱스값 빼고 1증가
                total -= sequence[start];
                start++;
            } else if (total < k) { // 합계가 k보다 작으면
                if (end == sequence.length) // end인덱스가 배열길이와 같아지면 while문 중지
                    break;
                // end인덱스값 합계에 추가 1증가
                total += sequence[end];
                end++;
            } else if (total > k) { // 합계가 k보다 크면
                // 현재 start인덱스값 빼고 1증가
                total -= sequence[start];
                start++;
            }
        }
        return answer;
    }
}
