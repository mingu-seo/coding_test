package level2;

import java.util.ArrayList;
import java.util.List;

public class P1844 {
    public static void main(String[] args) {
        P1844 p = new P1844();
        int r = p.solution(new int[][] { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 },
                { 0, 0, 0, 0, 1 } });
        System.out.println(r);
    }

    public int solution(int[][] maps) {
        int answer = 0;
        List<int[]> result = bfs(maps, 0, 0);
        // for (int[] r : result) {
        // System.out.println(Arrays.toString(r));
        // }
        answer = maps[maps.length - 1][maps[0].length - 1];
        if (answer == 1)
            answer = -1;
        return answer;
    }

    // 아래코드 효율성 전부 실패
    // 방문여부체크에서 반복문 제거하는 방법
    /*
     * List<int[]> bfs(int[][] maps, int x, int y) {
     * List<int[]> visited = new ArrayList<>(); // 방문한 노드
     * List<int[]> needVisit = new ArrayList<>(); // 방문할 노드
     * 
     * int[] dx = { -1, 1, 0, 0 };
     * int[] dy = { 0, 0, -1, 1 };
     * 
     * needVisit.add(new int[] { x, y }); // 시작
     * 
     * while (needVisit.size() > 0) {
     * int[] node = needVisit.remove(0);
     * int x2 = node[0];
     * int y2 = node[1];
     * 
     * visited.add(node);
     * 
     * // 이동가능한 좌표 확인
     * for (int i = 0; i < 4; i++) {
     * int nextX = x2 + dx[i];
     * int nextY = y2 + dy[i];
     * 
     * // 가능한 좌표이면
     * if (nextX >= 0 && nextX < maps.length && nextY >= 0 && nextY <
     * maps[0].length) {
     * // 이동가능한 위치(값이 1인 경우)
     * if (maps[nextX][nextY] == 1) {
     * // 방문한 노드에 없으면
     * boolean isNeed = true;
     * for (int[] v : visited) {
     * if (v[0] == nextX && v[1] == nextY) {
     * isNeed = false;
     * break;
     * }
     * }
     * if (isNeed) {
     * maps[nextX][nextY] = maps[x2][y2] + 1; // 이전 좌표값에서 +1 (이동횟수를 더하기 위해)
     * needVisit.add(new int[] { nextX, nextY });
     * }
     * }
     * }
     * 
     * }
     * }
     * return visited;
     * }
     */

    // 해당 좌표값을 불리언으로 체크
    List<int[]> bfs(int[][] maps, int x, int y) {
        List<int[]> visited = new ArrayList<>(); // 방문한 노드
        List<int[]> needVisit = new ArrayList<>(); // 방문할 노드
        boolean[][] isVisited = new boolean[maps.length][maps[0].length];

        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };

        needVisit.add(new int[] { x, y }); // 시작
        isVisited[x][y] = true;

        while (needVisit.size() > 0) {
            int[] node = needVisit.remove(0);
            int x2 = node[0];
            int y2 = node[1];

            visited.add(node);
            isVisited[x2][y2] = true;

            // 이동가능한 좌표 확인
            for (int i = 0; i < 4; i++) {
                int nextX = x2 + dx[i];
                int nextY = y2 + dy[i];

                // 가능한 좌표이면
                if (nextX >= 0 && nextX < maps.length && nextY >= 0 && nextY < maps[0].length) {
                    // 이동가능한 위치(값이 1인 경우)
                    if (maps[nextX][nextY] == 1) {
                        // 방문한 노드에 없으면
                        if (!isVisited[nextX][nextY]) {
                            maps[nextX][nextY] = maps[x2][y2] + 1; // 이전 좌표값에서 +1 (이동횟수를 더하기 위해)
                            needVisit.add(new int[] { nextX, nextY });
                        }
                    }
                }

            }
        }
        return visited;
    }

}
