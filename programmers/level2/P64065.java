package level2;

/*
 * },}로 쪼개서 각 정수들을 튜플단위로 쪼개고 ,로 쪼개서 맵에 개수 저장
 * 리스트에서 정렬하기 위해 Map.Entry객체로 하나씩 나눠서 리스트에 저장
 * 정렬한 후 개수가 많은 숫자부터 출력
 */

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P64065 {
    public static void main(String[] args) {
        P64065 p = new P64065();
        int[] result = p.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
        for (int r : result) {
            System.out.println(r);
        }
    }

    public int[] solution(String s) {
        int[] answer = {};
        
        s = s.substring(2, s.length()-2);
        // System.out.println(s);
        String[] sArr = s.split("\\},\\{");
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<sArr.length; i++) {
            String[] nArr = sArr[i].split(",");
            for (int j=0; j<nArr.length; j++) {
                map.put(Integer.parseInt(nArr[j]), map.getOrDefault(Integer.parseInt(nArr[j]), 0)+1);
            }
        }
        // System.out.println(map);
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>();
        for (Integer k : map.keySet()) {
            Map.Entry<Integer, Integer> e = new AbstractMap.SimpleEntry<>(k, map.get(k));
            list.add(e);
        }
        // System.out.println(list);
        Collections.sort(list, (o1, o2)-> {
            return o2.getValue() - o1.getValue();
        });
        // System.out.println(list);
        answer = list.stream().mapToInt(i->i.getKey()).toArray();
        return answer;
    }
}
