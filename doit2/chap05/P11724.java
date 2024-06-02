package doit2.chap05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class P11724 {
    static Map<Integer, List<Integer>> map = new HashMap<>(); // 그래프
    static List<Integer> visited = new ArrayList<>(); // 방문한 노드
    static List<Integer> needVisit = new ArrayList<>(); // 방문할 노드

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        // System.out.println(map);
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            map.get(p).add(c);
            map.get(c).add(p);
        }
        // System.out.println(map);

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited.contains(i)) {
                count++;
                dfs(i);
            }
        }
        System.out.println(count);
    }

    static List<Integer> dfs(Integer start) {

        needVisit.add(start); // 시작노드

        while (needVisit.size() > 0) {
            Integer node = needVisit.remove(needVisit.size() - 1); // 마지막 노드 pop (스택 구조로 처리)
            if (!visited.contains(node)) { // 방문한 노드에 없으면
                visited.add(node); // 방문한 노드에 순서대로 추가
                // System.out.println(node);
                if (map.get(node) != null)
                    needVisit.addAll(map.get(node)); // 자식 노드가 있으면 방문할 노드에 추가
            }
        }
        return visited;
    }
}
