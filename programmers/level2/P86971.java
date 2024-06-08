package level2;

import java.util.ArrayList;
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
        int result = p.solution(9,
                new int[][] { { 1, 3 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 4, 6 }, { 4, 7 }, { 7, 8 }, { 7, 9 } });
        System.out.println(result);
    }

    public int solution(int n, int[][] wires) {
        int answer = -1;

        for (int[] wire : wires) {
            int start = 1;
            Map<Integer, List<Integer>> graph = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            for (int w : wire) {
                list.add(w);
            }
            graph.put(start++, list);
            List<Integer> result = bfs(graph, 1);
            System.out.println(result);
        }

        return answer;
    }

    static List<Integer> bfs(Map<Integer, List<Integer>> graph, Integer start) {
        List<Integer> visited = new ArrayList<>(); // 방문한 노드
        List<Integer> needVisit = new ArrayList<>(); // 방문할 노드

        needVisit.add(start); // 시작노드

        while (needVisit.size() > 0) {
            Integer node = needVisit.remove(0); // 처음 노드 (큐 구조로 처리)
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
