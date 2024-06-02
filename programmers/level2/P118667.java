package level2;

import java.util.LinkedList;
import java.util.Queue;

public class P118667 {
    public static void main(String[] args) {
        P118667 p = new P118667();
        int result = p.solution(new int[] { 3, 2, 7, 2 }, new int[] { 4, 6, 5, 1 });
        // int result = p.solution(new int[] { 1, 2, 1, 2 }, new int[] { 1, 10, 1, 2 });
        // int result = p.solution(new int[] { 1, 1 }, new int[] { 1, 5 });
        System.out.println(result);
    }

    public int solution(int[] queue1, int[] queue2) {
        int answer = -1;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long total = 0; // 전체합계
        long q1_total = 0; // q1 합계
        long q2_total = 0; // q2 합계

        // 배열을 큐로 저장
        for (int q : queue1) {
            q1.add(q);
            total += q;
            q1_total += q;
        }
        for (int q : queue2) {
            q2.add(q);
            total += q;
            q2_total += q;
        }

        // 합계가 짝수가 아니면 두 배열 합계 같을 수 없음
        if (total % 2 != 0)
            return -1;

        int count = 0;
        // 최대 이동횟수만큼 반복
        while (count < (q1.size() + q2.size()) * 2) {
            if (q1_total < total / 2) { // q1이 작으면
                int temp = q2.poll();
                q1.add(temp);
                q1_total += temp;
                q2_total -= temp;
            } else if (q1_total > total / 2) { // q1이 크면
                int temp = q1.poll();
                q2.add(temp);
                q1_total -= temp;
                q2_total += temp;
            } else {
                // System.out.println(count);
                answer = count; // 같으면 answer에 저장
                break;
            }

            count++;
        }

        // System.out.println(total + ", " + q1_total + ", " + q2_total + ", " + count);

        return answer;
    }

}
