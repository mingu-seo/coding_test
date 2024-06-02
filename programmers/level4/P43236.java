package level4;

import java.util.Arrays;

public class P43236 {
    /*
     * 완전탐색으로 하는 경우 조합으로 연산됨
     * 바위n개를 이용하여 특정거리 d에 대해 모든 지점 사이의 거리가 d 이상이 되는 d중 가장 큰 값 구하기
     * 
     * 1. 바위 위치 순회
     * 2. 인접 거리가 d보다 작으면 바위 없애기
     * 3. 순회가 끝났을때 없앤 바위 개수가 n이하인지 체크
     */
    public static void main(String[] args) {
        P43236 p = new P43236();
        int r = p.solution(25, new int[] { 2, 14, 11, 21, 17 }, 2);
        System.out.println(r);
    }

    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        // 도착지점가지의 거리도 고려하기 위해 배열에 추가
        int[] rocks2 = Arrays.copyOf(rocks, rocks.length + 1);
        rocks2[rocks2.length - 1] = distance; // 마지막값
        Arrays.sort(rocks2);

        int start = 1;
        int end = distance + 1; // 도착지까지의 거리+1

        // 이분탐색
        while (end - start > 1) {
            int mid = (start + end) / 2;

            // 순회하면서 바위제거
            int remove = 0; // 제거한 바위개수
            int last = 0; // 마지막 바위
            for (int rock : rocks2) {
                if (rock - last < mid) { // 마지막바위와의 거리가 mid 보다 작으면 바위제거
                    remove++;
                    continue;
                }
                last = rock;
            }
            if (remove <= n) {
                start = mid;
            } else {
                end = mid;
            }
        }
        answer = start;
        return answer;
    }
}
