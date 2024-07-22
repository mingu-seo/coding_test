package level3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class P42628 {
    public static void main(String[] args) {
        P42628 p = new P42628();
        // int[] result = p.solution(new String[] { "I 16", "I -5643", "D -1", "D 1", "D
        // 1", "I 123", "D -1" });
        int[] result = p
                .solution(new String[] { "I -45", "I 653", "D 1", "I -642", "I 45", "I 97",
                        "D 1", "D -1", "I 333" });
        for (int r : result) {
            System.out.println(r);
        }
    }

    public int[] solution(String[] operations) {
        int[] answer = {};

        // 큐 변수
        List<Integer> queue = new LinkedList<>();

        for (String operation : operations) {
            String[] strArr = operation.split(" ");
            if ("I".equals(strArr[0])) { // 요소 삽입
                queue.add(Integer.parseInt(strArr[1]));
                Collections.sort(queue); // 오름차순 정렬
            } else if ("D".equals(strArr[0])) {
                if ("-1".equals(strArr[1])) { // 최소값 삭제
                    if (queue.size() > 0)
                        queue.remove(0);
                } else { // 최대값 삭제
                    if (queue.size() > 0)
                        queue.remove(queue.size() - 1);
                }
            }
            // System.out.println(queue);
        }
        if (queue.size() == 0) {
            answer = new int[] { 0, 0 };
        } else {
            answer = new int[] { queue.get(queue.size() - 1), queue.get(0) };
        }
        // System.out.println(pq);

        return answer;
    }
}
