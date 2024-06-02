package level1;

/*
 * 신고 결과 받기
 * 
 * id_list 배열로 각 아이디와 메일받은 횟수저장한 맵생성
 * report배열을 반복시켜 맵(신고당한 아이디: 신고한아이디 리스트) 저장
 * 반복 중 신고한 아이디 리스트가 k개 이상이면 메일받은 횟수+1
 */
import java.util.*;

public class P92334 {
    public static void main(String[] args) {
        P92334 p = new P92334();
        int[] result = p.solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                                new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"},2);
        for (int r : result) {
            System.out.println(r);
        }
    }

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> id_result = new HashMap<>();
        for (int i=0; i<id_list.length; i++) {
            id_result.put(id_list[i], 0);
        }
        Map<String, List<String>> to_from = new HashMap<>();
        for (int i=0; i<report.length; i++) {
            String[] ids = report[i].split(" ");
            String from = ids[0];
            String to = ids[1];
            if (to_from.get(to) == null) {
                List<String> list = new ArrayList<>();
                list.add(from);
                to_from.put(to, list);
            } else {
                List<String> list = to_from.get(to);
                if (!list.contains(from)) {
                    list.add(from);
                    to_from.put(to, list);
                }
            }
        }

        for (int i=0; i<id_list.length; i++) {
            // System.out.print(id_list[i]+":"+to_from.get(id_list[i]).size());
            if (to_from.get(id_list[i]) != null && to_from.get(id_list[i]).size() >= k) {
                for (String from : to_from.get(id_list[i])) {
                    // System.out.print(from+",");
                    id_result.put(from, id_result.get(from)+1);
                }
                // System.out.println();
            }
        }
        
        for (int i=0; i<id_list.length; i++) {
            // System.out.println(id_list[i]+":"+id_result.get(id_list[i]));
            answer[i] = id_result.get(id_list[i]);
        }
        return answer;
    }
}
