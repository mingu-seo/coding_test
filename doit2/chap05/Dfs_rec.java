package doit2.chap05;

/**
 * 재귀호출형태로 구현
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dfs_rec {

    static List<Integer> visited = new ArrayList<>(); // 방문한 노드

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, new ArrayList<>(Arrays.asList(2, 3)));
        graph.put(2, new ArrayList<>(Arrays.asList(4)));
        graph.put(3, new ArrayList<>(Arrays.asList(7, 8, 9)));
        graph.put(4, new ArrayList<>(Arrays.asList(5, 6)));
        graph.put(9, new ArrayList<>(Arrays.asList(10)));

        System.out.println(graph);

        dfs(graph, 1);
        System.out.println(visited);
    }

    static void dfs(Map<Integer, List<Integer>> graph, Integer start) {
        if (visited.contains(start)) {
            return;
        }

        visited.add(start); // 시작노드

        List<Integer> nodes = graph.get(start);
        if (nodes != null) {
            for (Integer node : nodes) {
                if (!visited.contains(node)) {
                    dfs(graph, node);
                }
            }
        }

    }
}
