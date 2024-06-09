package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 전력망 둘로 나누기
 * 
 */
public class P86971 {
    public static void main(String[] args) {
        P86971 p = new P86971();
        int result = p.solution(7,
                new int[][] { { 1, 2 }, { 2, 7 }, { 3, 7 }, { 3, 4 }, { 4, 5 }, { 6, 7 } });
        // int result = p.solution(4,
        // new int[][] { { 1, 2 }, { 2, 3 }, { 3, 4 } });
        // int result = p.solution(9,
        // new int[][] { { 1, 3 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 4, 6 }, { 4, 7 }, {
        // 7, 8 }, { 7, 9 } });
        System.out.println(result);
    }

    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < wires.length; i++) {
            Map<Integer, List<Integer>> graph = new HashMap<>();
            for (int j = 0; j < wires.length; j++) {
                // i와 j가 같으면 건너띔(연결끊은 송전탑 빼기)
                if (i == j)
                    continue;
                // 시작노드(wires[j][0])가 없으면 new ArrayList 없으면 add
                if (graph.get(wires[j][0]) == null) {
                    graph.put(wires[j][0], new ArrayList<>(Arrays.asList(wires[j][1])));
                } else {
                    graph.get(wires[j][0]).add(wires[j][1]);
                }
                // 시작노드(wires[j][1])가 없으면 new ArrayList 없으면 add
                if (graph.get(wires[j][1]) == null) {
                    graph.put(wires[j][1], new ArrayList<>(Arrays.asList(wires[j][0])));
                } else {
                    graph.get(wires[j][1]).add(wires[j][0]);
                }
            }
            // System.out.println(graph);
            List<Integer> result1 = dfs(graph, wires[i][0]);
            List<Integer> result2 = dfs(graph, wires[i][1]);
            // System.out.println(result1);
            // System.out.println(result2);
            // 두 경로의 차이의 절대값이 가장 작아야 두 경로가 비슷한 것임
            int minCount = Math.abs(result1.size() - result2.size());
            if (minCount < answer)
                answer = minCount;

        }

        return answer;
    }

    static List<Integer> dfs(Map<Integer, List<Integer>> graph, Integer start) {
        List<Integer> visited = new ArrayList<>(); // 방문한 노드
        List<Integer> needVisit = new ArrayList<>(); // 방문할 노드

        needVisit.add(start); // 시작노드

        while (needVisit.size() > 0) {
            Integer node = needVisit.remove(needVisit.size() - 1); // 마지막 노드 pop (스택 구조로 처리)
            if (!visited.contains(node)) { // 방문한 노드에 없으면
                visited.add(node); // 방문한 노드에 순서대로 추가
                // System.out.println(node);
                if (graph.get(node) != null)
                    needVisit.addAll(graph.get(node)); // 자식 노드가 있으면 방문할 노드에 추가
            }
        }
        return visited;
    }
}
