package doit2.chap09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class P1068 {

    static int leafNodeCount = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < N; i++) {
            graph.put(i, new ArrayList<>());
        }

        int rootNode = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            Integer c = Integer.parseInt(st.nextToken());
            if (c != -1) {
                graph.get(i).add(c);
                graph.get(c).add(i);
            } else {
                rootNode = i;
            }

        }

        st = new StringTokenizer(br.readLine());
        int D = Integer.parseInt(st.nextToken());
        // System.out.println(graph);
        if (D == rootNode) {
            System.out.println(0);
        } else {
            List<Integer> result = dfs(graph, rootNode, D);
            // System.out.println(result);
            System.out.println(leafNodeCount);
        }
    }

    static List<Integer> dfs(Map<Integer, List<Integer>> graph, Integer start, int D) {
        List<Integer> visited = new ArrayList<>(); // 방문한 노드
        List<Integer> needVisit = new ArrayList<>(); // 방문할 노드

        needVisit.add(start); // 시작노드

        while (needVisit.size() > 0) {
            Integer node = needVisit.remove(needVisit.size() - 1); // 마지막 노드 pop (스택 구조로 처리)
            if (!visited.contains(node)) { // 방문한 노드에 없으면
                visited.add(node); // 방문한 노드에 순서대로 추가
                // System.out.println(node);
                // DFS진행중 삭제노드(D)에 위치하면 더이상 탐색하지 않고 넘어감
                if (node == D) {
                    continue;
                }
                // 자식노드가 존재하는지 여부 체크
                int childCount = 0;
                for (Integer c : graph.get(node)) {
                    // System.out.println(node + ":" + c + ":" + D);
                    if (!visited.contains(c) && c != D)
                        childCount++;
                }

                if (childCount == 0) {
                    leafNodeCount++;
                    // System.out.println("리프노드:" + node);
                }

                if (graph.get(node) != null)
                    needVisit.addAll(graph.get(node)); // 자식 노드가 있으면 방문할 노드에 추가

            }
        }
        return visited;
    }
}
