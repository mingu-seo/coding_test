package doit2.chap09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class P11725 {
    static int[] parent;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Map<Integer, List<Integer>> graph = new HashMap<>();
        parent = new int[N];

        for (int i = 1; i <= N; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Integer p = Integer.parseInt(st.nextToken());
            Integer c = Integer.parseInt(st.nextToken());
            graph.get(p).add(c);
            graph.get(c).add(p);
        }
        // System.out.println(graph);
        dfs(graph, 1);
        // System.out.println(result);
        // System.out.println(Arrays.toString(parent));

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < parent.length; i++) {
            sb.append(parent[i]).append("\n");
        }
        System.out.println(sb);
    }

    // 속도개선을 위해 방문경로가 아니라 방문여부만 배열로 체크하는 형태로 변경해보자
    static boolean[] dfs(Map<Integer, List<Integer>> graph, Integer start) {
        boolean[] visited = new boolean[graph.size()]; // 방문한 노드
        Queue<Integer> needVisit = new LinkedList<>(); // 방문할 노드

        needVisit.add(start); // 시작노드

        while (needVisit.size() > 0) {
            Integer node = needVisit.remove(); // 마지막 노드 pop (스택 구조로 처리)
            if (!visited[node - 1]) { // 방문한 노드에 없으면
                visited[node - 1] = true; // 방문한 노드에 순서대로 추가
                // System.out.println(node);
                if (graph.get(node) != null) {
                    needVisit.addAll(graph.get(node)); // 자식 노드가 있으면 방문할 노드에 추가

                    for (Integer c : graph.get(node)) {
                        if (!visited[c - 1]) {
                            parent[c - 1] = node;
                        }
                    }
                }

            }
        }
        return visited;
    }

}
