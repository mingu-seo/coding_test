package level3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P64064 {
    public static void main(String[] args) {
        P64064 p = new P64064();
        int result = p.solution(new String[] { "frodo", "fradi", "crodo", "abc123",
                "frodoc" },
                new String[] { "fr*d*", "abc1**" });
        // int result = p.solution(new String[] { "frodo", "fradi", "crodo", "abc123",
        // "frodoc" },
        // new String[] { "*rodo", "*rodo", "******" });
        // int result = p.solution(new String[] { "frodo", "fradi", "crodo", "abc123",
        // "frodoc" },
        // new String[] { "fr*d*", "*rodo", "******", "******" });
        System.out.println(result);
    }

    public int solution(String[] user_id, String[] banned_id) {
        int answer = 0;

        // 정규식에 매칭되는 문자열은 set자료형으로 담을 리스트 변수
        List<Set<String>> list = new ArrayList<>();
        for (int i = 0; i < banned_id.length; i++) {
            String id = banned_id[i].replace("*", "."); // 정규식의 한문자(.)으로 변환(정규식 비교를 위해)
            Set<String> ids = new HashSet<>(); // 아이디를 담을 set변수
            for (int j = 0; j < user_id.length; j++) {
                if (user_id[j].matches(id)) { // 정규식에 부합하는지 여부
                    // System.out.println(user_id[j] + ":" + id);
                    ids.add(user_id[j]);
                }
            }
            // System.out.println(ids);
            list.add(ids);
        }
        // System.out.println(list);

        // List<Set<String>>으로 하면 중복되는 값까지 같이 들어감
        // Set<Set<String>>으로 선언해서 중복 제거
        Set<Set<String>> result = new HashSet<>(); // 최종 결과를 담을 변수
        comb(result, new HashSet<>(), list, 0); // 재귀호출

        // System.out.println(result);

        answer = result.size(); // 최종결과값의 개수(중복제거된 경우의 수)

        return answer;
    }

    // com(결과값, current, list, idx)
    void comb(Set<Set<String>> result, Set<String> current, List<Set<String>> list, int idx) {
        if (idx == list.size()) { // 재귀호출에서 1씩 증가하다 list 개수만큼 늘어나면 중단
            result.add(new HashSet<>(current));
            return;
        }

        for (String id : list.get(idx)) {
            if (current.contains(id)) // 현재 current에 id가 포함되어 있으면 다음 반복으로 건너띔
                continue;
            current.add(id);
            comb(result, current, list, idx + 1); // idx+1 재귀호출
            current.remove(id);
        }
    }
}
