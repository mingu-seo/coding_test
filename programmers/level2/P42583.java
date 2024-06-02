package level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P42583 {
    public static void main(String[] args) {
        P42583 p = new P42583();
        // int result = p.solution(2, 10, new int[]{7,4,5,6});
        int result = p.solution(100, 100, new int[]{10});
        System.out.println(result);
    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = bridge_length;

        Queue<Integer> truck = new LinkedList<>(); // 트럭
        for (int i=0; i<truck_weights.length; i++) {
            truck.add(truck_weights[i]);
        }
        Queue<Integer> bridge = new LinkedList<>(); // 다리를 건너는 트럭
        for (int i=0; i<bridge_length; i++) {
            bridge.add(0);
        }

        // 처음 시작은 하나빼고 시작
        answer++;
        int cur_weights = 0; // 현재 무게
        // 첫트럭 추가
        bridge.poll();
        cur_weights = truck.peek();
        bridge.add(truck.poll());

        // 트럭큐가 없을때까지
        while (!truck.isEmpty()) {
            // System.out.println(truck);
            int b = bridge.poll();
            if (b > 0) { // 트럭이 있다면
                cur_weights -= b; // 현재무게에서 제거
            }
            // 다음 트럭과 현재무게를 더한 무게가 최대무게 이하이면
            if (cur_weights + truck.peek() <= weight) {
                cur_weights += truck.peek(); // 현재무게에 추가
                bridge.add(truck.poll()); // 다리를 건너는 트럭에 추가하고 트럭큐에서 제거
            } else { // 최대무게보다 크면 0만 추가(1초 증가해야하므로)
                bridge.add(0);
            }
            answer++;
        }

        return answer;
    }
}