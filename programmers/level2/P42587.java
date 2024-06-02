package level2;

import java.util.LinkedList;
import java.util.Queue;

public class P42587 {
    public static void main(String[] args) {
        P42587 p = new P42587();
        // int result = p.solution(new int[]{2, 1, 3, 2},2);
        int result = p.solution(new int[]{1, 1, 9, 1, 1, 1},0);
        System.out.println(result);
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        for (int i=0; i<priorities.length; i++) {
            queue1.add(priorities[i]);
            queue2.add(i);
        }
        // System.out.println(queue1);
        // System.out.println(queue2);
        while (!queue1.isEmpty()) {
            Integer e1 = queue1.poll();
            Integer e2 = queue2.poll();
            boolean isMax = false;
            for (Integer t : queue1) {
                if (e1 < t) {
                    isMax = true;
                    queue1.add(e1);
                    queue2.add(e2);
                    
                    break;
                }
            }
            // System.out.println(queue1);
            // System.out.println(queue2);
            if (!isMax) {
                answer++;

                if (e2 == location) {
                    break;
                }
            }
            
        }

        return answer;
    }
}