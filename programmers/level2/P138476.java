package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 배열의 값들을 기준으로 개수를 맵에 저장
 * 각 키의 값들을 리스트에 담아 정렬
 * 정렬한 순서대로 k개의 값을 몇번만에 처리되는 횟수 구함
 */

public class P138476 {
    public static void main(String[] args) {
        P138476 p = new P138476();
        int result = p.solution(4, new int[]{1,3,2,5,4,5,2,3});
        System.out.println(result);
    }
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0)+1);
        }
        // System.out.println(map);
        List<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            list.add(map.get(key));
        }
        Collections.sort(list, Comparator.reverseOrder());
        for (int i=0; i<list.size(); i++) {
            k -= list.get(i);
            answer++;
            if (k <=0) break;
        }
        return answer;
    }
}
