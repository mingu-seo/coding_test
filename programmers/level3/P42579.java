package level3;

import java.util.*;

/**
 * Lesson42579
 */
public class P42579 {

    public static void main(String[] args) {
        int[] arr = solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500,600,150,800,2500});
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        java.util.Map<String, Integer> map = new java.util.LinkedHashMap<>();
        java.util.List<Integer> list = new java.util.ArrayList<>();
        for (int i=0; i<genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());
        Collections.sort(entries, (o1, o2) -> o2.getValue().compareTo(o1.getValue())); // 내림차순 정렬
        System.out.println(entries);

        java.util.Map<Integer, Integer> map2 = new java.util.LinkedHashMap<>(); // 인덱스:재생횟수
        for (int i=0; i<plays.length; i++) {
            map2.put(i, plays[i]);
        }
        List<Map.Entry<Integer, Integer>> entries2 = new LinkedList<>(map2.entrySet());
        Collections.sort(entries2, (o1, o2) -> o2.getValue().compareTo(o1.getValue())); // 내림차순 정렬
        System.out.println(entries2);

        for (int i=0; i<entries.size(); i++) {
            int cnt = 0;
            for (int j=0; j<entries2.size(); j++) {
                if (genres[entries2.get(j).getKey()].equals(entries.get(i).getKey())) {
                    list.add(entries2.get(j).getKey());
                    cnt++;
                    if (cnt == 2) break;
                }
            }
        }
        
        // for (int l : list) {
        //     System.out.println(l);
        // }
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}