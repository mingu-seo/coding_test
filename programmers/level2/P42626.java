package level2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class P42626 {
    public static void main(String[] args) {
        P42626 p = new P42626();
        int result = p.solution(new int[] { 1, 2, 3, 9, 10, 12 }, 7);
        System.out.println(result);
    }

    // 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> foods = new PriorityQueue<>();
        for (int s : scoville) {
            foods.add(s);
        }

        int cnt = 0;
        while (foods.peek() < K) {
            if (foods.size() < 2) {
                return -1;
            }
            Integer newFood = foods.poll() + foods.poll() * 2;
            foods.add(newFood);
            cnt++;
        }
        answer = cnt;
        return answer;
    }
}
