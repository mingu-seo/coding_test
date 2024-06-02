package doit2.chap05;

/**
 * 반복문형태로 구현
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bfs {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, new ArrayList<>(Arrays.asList(2, 3)));
        graph.put(2, new ArrayList<>(Arrays.asList(4)));
        graph.put(3, new ArrayList<>(Arrays.asList(7, 8, 9)));
        graph.put(4, new ArrayList<>(Arrays.asList(5, 6)));
        graph.put(9, new ArrayList<>(Arrays.asList(10)));

        System.out.println(graph);

        List<Integer> result = bfs(graph, 1);
        System.out.println(result);
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
