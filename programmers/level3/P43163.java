package level3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class P43163 {
    public static void main(String[] args) {
        P43163 p = new P43163();
        // int result = p.solution("hit", "cog", new String[] { "hot", "dot", "dog",
        // "lot", "log", "cog" });
        int result = p.solution("hit", "cog", new String[] { "hot", "dot", "dog", "lot", "log" });
        System.out.println(result);
    }

    public int solution(String begin, String target, String[] words) {
        int answer = 0;

        boolean[] isVisited = new boolean[words.length]; // 방문여부
        Queue<Map<String, Integer>> queue = new LinkedList<>(); // 큐에 맵(문자열, 변환횟수)을 넣는 자료구조
        Map<String, Integer> map = new HashMap<>();
        map.put(begin, 0); // 시작값
        queue.add(map);

        while (!queue.isEmpty()) { // 큐가 빌때까지 반복
            Map<String, Integer> e = queue.poll(); // 큐에서 첫번째값 꺼내기
            String org = (String) e.keySet().toArray()[0]; // 첫번째값의 키(문자열)
            if (org.equals(target)) { // target문자열이 맵의 키값과 같으면 변환횟수 리턴
                return e.get(target);
            } else {
                for (int i = 0; i < words.length; i++) {
                    String next = words[i];

                    // 두 문자열이 한글자만다르고, 방문하지 않은 경우 (해당문자열,변환횟수+1) 큐에 저장
                    if (isDiff(org, next) && !isVisited[i]) {
                        isVisited[i] = true;
                        Map<String, Integer> newMap = new HashMap<>();
                        newMap.put(next, e.get(org) + 1);
                        queue.add(newMap);
                    }
                }
            }
        }

        return answer;
    }

    // 두 문자열의 문자가 서로 하나만 다른지 체크
    boolean isDiff(String org, String target) {
        int count = 0;
        for (int i = 0; i < org.length(); i++) {
            if (org.charAt(i) != target.charAt(i)) {
                count++;
            }
        }
        return count == 1;
    }
}
