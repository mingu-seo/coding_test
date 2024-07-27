package level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P49189 {
    public static void main(String[] args) {
        P49189 p = new P49189();
        int result = p.solution(6,
                new int[][] { { 3, 6 }, { 4, 3 }, { 3, 2 }, { 1, 3 }, { 1, 2 }, { 2, 4 }, { 5, 2 } });
        System.out.println(result);
    }

    static Map<Integer, List<Integer>> map = new HashMap<>(); // 그래프
    static List<Integer> visited = new ArrayList<>(); // 방문한 노드
    static List<Integer> needVisit = new ArrayList<>(); // 방문할 노드
    static List<Integer> distance; // 각 노드의 거리

    public int solution(int n, int[][] edge) {
        int answer = 0;
        distance = new ArrayList<>(Collections.nCopies(n + 1, -1)); // 최대거리 초기화
        for (int i = 0; i <= n; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        // System.out.println(map);
        for (int i = 0; i < edge.length; i++) {
            int p = edge[i][0];
            int c = edge[i][1];
            map.get(p).add(c);
            map.get(c).add(p);
        }

        // System.out.println(map);
        needVisit.add(1); // 시작값
        distance.set(1, 0); // 시작 노드의 거리는 0
        bfs(map);
        // System.out.println(visited);
        // 최대 거리 찾기
        int maxDistance = 0;
        for (int dist : distance) {
            if (dist > maxDistance) {
                maxDistance = dist;
            }
        }
        // System.out.println(distance);
        for (int dist : distance) {
            if (dist == maxDistance) {
                answer++;
            }
        }
        return answer;
    }

    void bfs(Map<Integer, List<Integer>> graph) {
        if (needVisit.isEmpty()) {
            return;
        }

        Integer node = needVisit.remove(0);

        if (!visited.contains(node)) {
            visited.add(node);

            List<Integer> nodes = graph.get(node);
            if (nodes != null) {
                for (Integer n : nodes) {
                    if (!visited.contains(n) && !needVisit.contains(n)) {
                        needVisit.add(n);
                        if (distance.get(n) == -1) {
                            // System.out.println(n + "," + distance.get(node));
                            distance.set(n, distance.get(node) + 1);
                        }
                    }
                }

            }
        }

        bfs(graph);
    }
}
