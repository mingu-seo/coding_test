package doit2.chap05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class P2178 {

    static boolean[][] visited; // 방문여부
    static List<int[]> needVisit = new ArrayList<>(); // 방문할 노드 (큐)
    // 상하좌우 탐색을 위한 좌표변경값
    static int[] dx = { 0, 1, 0, -1 };
    static int[] dy = { 1, 0, -1, 0 };

    // 재귀함수(메서드)에서도 사용해야되므로
    static int[][] graph;
    static int N;
    static int M;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N][M];
        graph = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < M; j++) {
                graph[i][j] = Integer.parseInt(line.substring(j, j + 1));
            }

        }
        // for (int[] g : graph) {
        // System.out.println(Arrays.toString(g));
        // }

        needVisit.add(new int[] { 0, 0 });
        bfs(graph);
        // for (int[] g : graph) {
        // System.out.println(Arrays.toString(g));
        // }
        System.out.println(graph[N - 1][M - 1]);
    }

    static void bfs(int[][] graph) {
        if (needVisit.isEmpty()) {
            return;
        }

        int[] node = needVisit.remove(0);

        // 상하좌우 경로 검사
        for (int i = 0; i < 4; i++) {
            int x = node[0] + dx[i];
            int y = node[1] + dy[i];
            if (x >= 0 && y >= 0 && x < N && y < M) {
                if (!visited[x][y] && graph[x][y] != 0) {
                    visited[x][y] = true;
                    graph[x][y] = graph[node[0]][node[1]] + 1; // depth + 1
                    needVisit.add(new int[] { x, y });
                }
            }
        }

        bfs(graph);
    }
}
