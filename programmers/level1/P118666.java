package level1;
/*
 * 성격유형별로 미리 맵에 저장해놓고,
 * 질문지에 따라 맵의 유형을 구분해서 점수 적용
 * 각 유형별로 값비교해서 출력
 */
import java.util.*;
public class P118666 {
    public static void main(String[] args) {
        P118666 p = new P118666();
        String result = p.solution(new String[]{"RT", "RT", "RT"}, 
                                    new int[]{7,2,4});
        System.out.println(result);
    }
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Integer, Map<String, Integer>> map = new HashMap<>();
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("R", 0);
        map1.put("T", 0);
        map.put(0, map1);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("C", 0);
        map2.put("F", 0);
        map.put(1, map2);
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("J", 0);
        map3.put("M", 0);
        map.put(2, map3);
        Map<String, Integer> map4 = new HashMap<>();
        map4.put("A", 0);
        map4.put("N", 0);
        map.put(3, map4);

        Map<String, Integer> index = new HashMap<>();
        index.put("R",0);
        index.put("T",0);
        index.put("C",1);
        index.put("F",1);
        index.put("J",2);
        index.put("M",2);
        index.put("A",3);
        index.put("N",3);
        
        for (int i=0; i<survey.length; i++) {
            char[] carr = survey[i].toCharArray();
            int idx = 0;
            char c = 0;
            int score = 0;
            if (choices[i] < 4) {
                idx = index.get(String.valueOf(carr[0]));
                c = carr[0];
                score = 4-choices[i];
            } else if (choices[i] > 4) {
                idx = index.get(String.valueOf(carr[1]));
                c = carr[1];
                score = choices[i]-4;
            }
            if (choices[i] != 4) {
                map.get(idx).put(String.valueOf(c), map.get(idx).get(String.valueOf(c))+score);
            }
        }

        // 출력해보자
        System.out.println(map.get(0).get("R")+","+map.get(0).get("T"));
        System.out.println(map.get(1).get("C")+","+map.get(1).get("F"));
        System.out.println(map.get(2).get("J")+","+map.get(2).get("M"));
        System.out.println(map.get(3).get("A")+","+map.get(3).get("N"));

        
        if (map.get(0).get("R") < map.get(0).get("T")) {
            answer += "T";
        } else {
            answer += "R";
        }
        if (map.get(1).get("C") < map.get(1).get("F")) {
            answer += "F";
        } else {
            answer += "C";
        }
        if (map.get(2).get("J") < map.get(2).get("M")) {
            answer += "M";
        } else {
            answer += "J";
        }
        if (map.get(3).get("A") < map.get(3).get("N")) {
            answer += "N";
        } else {
            answer += "A";
        }
        
        return answer;
    }
}
