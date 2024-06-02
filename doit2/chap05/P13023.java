package doit2.chap05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class P13023 {
    static Map<Integer, List<Integer>> map = new HashMap<>(); // 그래프
    static boolean success = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        // System.out.println(map);
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            map.get(p).add(c);
            map.get(c).add(p);
        }
        // System.out.println(map);

        // 재귀호출 형태로 바꿔보자
        List<Integer> visited = new ArrayList<>(); // 방문한 노드

        for (Integer i = 0; i < N; i++) {
            dfs(map, visited, i, 1);
        }
        // System.out.println(success);
        if (success)
            System.out.println(1);
        else
            System.out.println(0);
    }

    static void dfs(Map<Integer, List<Integer>> map, List<Integer> visited, Integer start, int depth) {
        if (depth == 5 || success == true) { // success == true를 넣지 않으면 시간초과
            success = true;
            return;
        }

        visited.add(start);

        for (Integer i : map.get(start)) {
            if (!visited.contains(i)) {
                dfs(map, visited, i, depth + 1);
            }
        }

        visited.remove(start);
    }
}
