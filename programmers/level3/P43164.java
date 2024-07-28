package level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P43164 {
    public static void main(String[] args) {
        P43164 p = new P43164();
        // String[] result = p.solution(new String[][] { { "ICN", "JFK" }, { "HND",
        // "IAD" }, { "JFK", "HND" } });
        String[] result = p.solution(new String[][] { { "ICN", "SFO" }, { "ICN", "ATL" }, { "SFO", "ATL" },
                { "ATL", "ICN" }, { "ATL", "SFO" } });
        for (String r : result) {
            System.out.println(r);
        }
    }

    boolean[] used; // 티켓 사용 여부
    List<String> list = new ArrayList<>(); // 가능한 경로

    public String[] solution(String[][] tickets) {
        String[] answer = {};
        used = new boolean[tickets.length]; // 티켓 사용 여부를 배열 초기화

        dfs(tickets, 0, "ICN", "ICN");

        Collections.sort(list); // 정렬
        System.out.println(list);
        answer = list.get(0).split(",");
        return answer;
    }

    void dfs(String[][] tickets, int depth, String start, String route) {
        // 모든 티켓을 사용한 경우 경로를 리스트에 추가하고 종료
        if (depth == tickets.length) {
            list.add(route);
            return;
        } else {
            for (int i = 0; i < tickets.length; i++) {
                // 티켓을 사용하지 않았으며, 티켓의 출발지가 현재 출발지와 같은 경우
                if (!used[i] && start.equals(tickets[i][0])) {
                    used[i] = true; // 티켓을 사용으로 표시
                    // 다음 출발지로 dfs 진행, 경로 업데이트
                    dfs(tickets, depth + 1, tickets[i][1], route + "," + tickets[i][1]);
                    used[i] = false; // 탐색 후 티켓을 미사용으로 다시 표시
                }
            }
        }
    }
}
