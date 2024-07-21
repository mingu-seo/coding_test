package level3;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P42627 {
    public static void main(String[] args) {
        P42627 p = new P42627();
        int result = p.solution(new int[][] { { 0, 3 }, { 1, 9 }, { 2, 6 } });
        System.out.println(result);
    }

    public int solution(int[][] jobs) {
        int answer = 0;

        // 시작시간순으로 정렬
        Arrays.sort(jobs, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        // 시작시간 순 큐
        Queue<int[]> q1 = new LinkedList<>();
        for (int[] j : jobs) {
            q1.add(j);
        }

        // 작업순으로 저장할 큐(작업중인 소요시간 순)
        List<int[]> q2 = new LinkedList<>();

        int total = 0; // 총합계시간
        int time = 0; // 현재시간
        // 시작큐나 작업중 큐에 데이터가 있으면
        while (!q1.isEmpty() || !q2.isEmpty()) {
            // 시작시간순으로 time보다 작거나 같은 작업을 q2에 추가
            while (!q1.isEmpty() && q1.peek()[0] <= time) {
                q2.add(q1.poll());
            }
            // q2가 비어있으면 첫번째 시작시간을 time에 저장
            if (q2.isEmpty()) {
                time = q1.peek()[0];
                continue;
            }
            // q2를 소요시간 순으로 정렬 (q2 큐에 저장되는건 시작시간순으로 저장되지만 끝나는 순서는 소요시간 순이어야 하므로)
            Collections.sort(q2, (o1, o2) -> {
                return o1[1] - o2[1];
            });
            /// 첫번째 값 가져와서 (소요시간-시작시간) 합계 계산
            int[] arr = q2.get(0);
            q2.remove(0);
            total += time + arr[1] - arr[0];
            time += arr[1];
        }

        answer = total / jobs.length;

        return answer;
    }
}
