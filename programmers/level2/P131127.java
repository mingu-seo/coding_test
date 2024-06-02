package level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P131127 {
    public static void main(String[] args) {
        P131127 p = new P131127();
        // int result = p.solution(new String[]{"apple"}, 
        //                         new int[]{10}, 
        //                         new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"});
        int result = p.solution(new String[]{"banana", "apple", "rice", "pork", "pot"}, 
                                new int[]{3, 2, 2, 2, 1}, 
                                new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"});
        System.out.println(result);
    }

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wants = toMap(want, number);
       
        for (int i=0; i<discount.length; i++) {
            int end = i + 10;
            if (end > discount.length) break;
            String[] target = new String[10];
            
            // 10개씩 배열에 저장
            for (int j=i, idx=0; j<end; j++, idx++) {
                target[idx] = discount[j];
            }
            
            Map<String, Integer> map = new HashMap<>();
            for (int j=0; j<target.length; j++) {
                map.put(target[j], map.getOrDefault(target[j], 0)+1);
            }
            // System.out.println(map);
            if (compare(wants, map)) {
                // System.out.println(wants);
                answer += 1; // 딱맞는 할인가능일자 모두 구하기
            }
        }

        
        return answer;
    }

    Map<String, Integer> toMap(String[] want, int[] number) {
        Map<String, Integer> wants = new HashMap<>();
        for (int i=0; i<want.length; i++) {
            wants.put(want[i], wants.getOrDefault(want[i], 0)+number[i]);
        }
        return wants;
    }

    boolean compare(Map<String, Integer> map1, Map<String, Integer> map2) {
        for (String key : map1.keySet()) {
            if (map1.get(key) == map2.get(key)) {
                map2.remove(key);
            }            
        }
        if (map2.size() == 0) {
            return true;
        }
        return false;
    }
}
