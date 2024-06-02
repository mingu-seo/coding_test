package doit2.chap05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class P1260 {

    static List<Integer> visitedDFS = new ArrayList<>(); // dfs 경로
    static List<Integer> visitedBFS = new ArrayList<>(); // bfs 경로
    static List<Integer> needVisit = new ArrayList<>(); // 방문할 노드 (큐)

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            graph.put(i, new ArrayList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(p).add(c);
            graph.get(c).add(p);
        }
        // System.out.println(graph);

        // 작은번호를 먼저 방문하도록 정렬하자
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        // DFS
        dfs(graph, V);
        // System.out.println(visitedDFS);
        for (Integer e : visitedDFS) {
            System.out.print(e + " ");
        }
        System.out.println();
        // BFS
        needVisit.add(V); // 시작값
        bfs(graph);
        // System.out.println(visitedBFS);
        for (Integer e : visitedBFS) {
            System.out.print(e + " ");
        }
    }

    static void dfs(Map<Integer, List<Integer>> graph, Integer start) {
        if (visitedDFS.contains(start)) {
            return;
        }

        visitedDFS.add(start); // 시작노드

        List<Integer> nodes = graph.get(start);
        if (nodes != null) {
            for (Integer node : nodes) {
                if (!visitedDFS.contains(node)) {
                    dfs(graph, node);
                }
            }
        }

    }

    static void bfs(Map<Integer, List<Integer>> graph) {
        if (needVisit.isEmpty()) {
            return;
        }

        Integer node = needVisit.remove(0);

        if (!visitedBFS.contains(node)) {
            visitedBFS.add(node);

            List<Integer> nodes = graph.get(node);
            if (nodes != null) {
                for (Integer n : nodes) {
                    if (!visitedBFS.contains(n) && !needVisit.contains(n)) {
                        needVisit.add(n);
                    }
                }
            }
        }

        bfs(graph);
    }
}
