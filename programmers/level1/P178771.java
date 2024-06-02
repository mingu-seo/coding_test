package level1;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Lesson42748
 */
public class P178771 {

    public static void main(String[] args) {
        String[] result = solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"});
        for (String a : result) {
            System.out.println(a);
        }
    }

    public static String[] solution(String[] players, String[] callings) {
        /*
         * 초기에는 이중 for문으로 처리했으나, 시간초과 발생
         * 맵으로 처리하면 배열을 매번 반복해서 찾는 수고를 줄일수 있음
         */
        String[] answer = {};
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        for (int i=0; i<callings.length; i++) {
            String temp = players[map.get(callings[i])-1]; // 배열의 앞등수이름
            players[map.get(callings[i])-1] = callings[i]; // 배열에 앞등수자리에 호명이름 대입
            players[map.get(callings[i])] = temp; // 배열의 뒤등수 자리에 앞등수 이름 대입
            // 맵에도 수정된 배열대로 순서변경
            map.put(callings[i], map.get(callings[i])-1);
            map.put(temp, map.get(temp)+1);
        }

        // map 정렬
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, (o1, o2)->o1.getValue().compareTo(o2.getValue()));
        answer = new String[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i).getKey();
        }
        return answer;
    }
}