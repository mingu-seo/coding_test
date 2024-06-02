package doit2.chap05;

/**
 * 반복문형태로 구현
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bfs_rec {
    static List<Integer> visited = new ArrayList<>(); // 방문한 노드
    static List<Integer> needVisit = new ArrayList<>(); // 방문할 노드 (큐)

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, new ArrayList<>(Arrays.asList(2, 3)));
        graph.put(2, new ArrayList<>(Arrays.asList(4)));
        graph.put(3, new ArrayList<>(Arrays.asList(7, 8, 9)));
        graph.put(4, new ArrayList<>(Arrays.asList(5, 6)));
        graph.put(9, new ArrayList<>(Arrays.asList(10)));

        System.out.println(graph);

        needVisit.add(1); // 시작값
        bfs(graph);
        System.out.println(visited);
    }

    static void bfs(Map<Integer, List<Integer>> graph) {
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
                    }
                }
            }
        }

        bfs(graph);
    }
}
