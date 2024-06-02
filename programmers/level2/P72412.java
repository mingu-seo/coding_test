package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P72412 {
    public static void main(String[] args) {
        P72412 p = new P72412();
        int[] result = p.solution(
                new String[] { "java backend junior pizza 150", "python frontend senior chicken 210",
                        "python frontend senior chicken 150", "cpp backend senior pizza 260",
                        "java backend junior chicken 80", "python backend senior chicken 50" },
                new String[] { "java and backend and junior and pizza 100",
                        "python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250",
                        "- and backend and senior and - 150", "- and - and - and chicken 100",
                        "- and - and - and - 150" });
        System.out.println(Arrays.toString(result));
    }

    Map<String, List<Integer>> map = new HashMap<>(); // info변수의 값을 맵구조로 담을 변수

    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        // 전체를 반복하면 시간초과가 되므로, 미리 맵 구조에 담아두기

        for (String s : info) {
            String[] arr = s.split(" ");
            int score = Integer.parseInt(arr[4]); // 점수

            // for (int i = 0; i <= 3; i++) {
            loopKey(0, "", arr, score);
            // }
        }

        // value(점수) 정렬
        for (List<Integer> scores : map.values()) {
            Collections.sort(scores);
        }

        // System.out.println(map);

        for (int i = 0; i < query.length; i++) {
            // info 위 key구조로 만들기
            String[] arr = query[i].split(" and ");
            String str = "";
            for (String a : arr) {
                str += a;
            }
            // System.out.println(str);
            String[] strs = str.split(" ");
            String key = strs[0];
            int value = Integer.parseInt(strs[1]);
            if (map.get(key) == null) {
                answer[i] = 0;
            } else {
                answer[i] = map.get(key).size() - binarySearch(map.get(key), value); // 전체길이에서 해당점수위치인덱스값 빼기
            }
        }

        return answer;
    }

    // 재귀호출로 처리할 메서드
    void loopKey(int idx, String key, String[] arr, int score) {
        if (idx == arr.length - 1) {
            // 배열만큼 다 담았으면 맵에 추가
            if (map.get(key) == null)
                map.put(key, new ArrayList<Integer>());
            map.get(key).add(score);
            return;
        }
        loopKey(idx + 1, key + arr[idx], arr, score); // 다음값키로 붙여 생성
        loopKey(idx + 1, key + "-", arr, score); // 전체(-)를 키로 붙여 생성
    }

    // 맵의 밸류에서 해당점수 위치인덱스 찾음 (만약 없으면 전체 개수 리턴)
    int binarySearch(List<Integer> scores, int score) {
        int start = 0;
        int end = scores.size() - 1;

        while (end > start) {
            int mid = (start + end) / 2;

            if (scores.get(mid) >= score) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        if (scores.get(start) < score) {
            return scores.size();
        }
        return start;
    }
}
