package level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P152996 {
    public static void main(String[] args) {
        P152996 p = new P152996();
        long result = p.solution(new int[]{100,180,360,100,270});
        System.out.println(result);
    }

    public long solution(int[] weights) {
        long answer = 0;

        // 작은순 비교하기 위해 으로 정렬
        Arrays.sort(weights);

        // System.out.println(Arrays.toString(weights));

        Map<Integer, Integer> map = new HashMap<>();
        for (int w : weights) {
            // 같은 값이 존재하면 같은 거리에서 무조건 균형을 이루므로 +1
            if (map.get(w) != null) {
                // System.out.println("w:"+w);
                answer += map.get(w);
            } else { // 없으면 일단 0으로 초기화
                map.put(w, 0);
            }
            map.put(w, map.get(w)+1);

            // 3가지 비율 처리
            // 180과 270은 2 미터 , 3 미터 거리에서 균형
            // 2 : 3 비율은 180 / 2 * 3
            int w2 = 0;
            if (w % 2 == 0) {
                w2 = w / 2 * 3;
                map.put(w2, map.getOrDefault(w2, 0)+1);
            }

            // 2 : 4 비율
            w2 = w * 2;
            map.put(w2, map.getOrDefault(w2, 0)+1);

            // 3 : 4 비율
            if (w % 3 == 0) {
                w2 = w / 3 * 4;
                map.put(w2, map.getOrDefault(w2, 0)+1);
            }
        }
        // System.out.println(map);
        return answer;
    }
}
