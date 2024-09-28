package level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P159993 {
    public static void main(String[] args) {
        P159993 p = new P159993();
        int r = p.solution(new String[] { "SOOOL", "XXXXO", "OOOOO", "OXXXX", "OOOOE" });
        System.out.println(r);
    }
    /*
     * 길찾기에서 레버처리부분을 추가?
     * 예전에 미로찾기 문제를 재귀로 풀었었나? 그거 응용하면 가능하지 않을까?
     * 
     * bfs형태로 모든 좌표의 네방향을 체크해서 방문여부와 현재 거리카운트값을 1더해서 구해봄(47.8)
     */

    public int solution(String[] maps) {
        int answer = 0;
        String[][] map = new String[maps.length][maps[0].length()];
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                map[i][j] = String.valueOf(maps[i].charAt(j));
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        // 시작/도착/레버좌표 찾기
        int[] start = new int[2];
        int[] end = new int[2];
        int[] lever = new int[2];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if ("S".equals(map[i][j])) {
                    start[0] = i;
                    start[1] = j;
                }
                if ("E".equals(map[i][j])) {
                    end[0] = i;
                    end[1] = j;
                }
                if ("L".equals(map[i][j])) {
                    lever[0] = i;
                    lever[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(start));
        System.out.println(Arrays.toString(end));
        System.out.println(Arrays.toString(lever));

        // 시작->레버까지 최단거리
        int d1 = search(map, start, lever, "L");

        if (d1 == 0)
            return -1;

        // 레버->도착 최단거리
        int d2 = search(map, lever, end, "E");

        if (d2 == 0)
            return -1;

        answer = d1 + d2;

        return answer;
    }

    // bfs형태로?
    int search(String[][] map, int[] start, int[] end, String target) {
        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 };
        Queue<int[]> route = new LinkedList<>(); // 큐
        boolean[][] visited = new boolean[map.length][map[0].length]; // 방문여부
        int[][] result = new int[map.length][map[0].length]; // 거리카운트값

        route.add(start); // 시작좌표
        visited[start[0]][start[1]] = true; // 시작좌표 방문여부 체크
        // result[start[0]][start[1]] = 0; // 최단거리값
        int count = 0;

        while (!route.isEmpty()) {
            int[] current = route.poll(); // 현재위치
            int curX = current[0];
            int curY = current[1];

            // 4방향 체크
            for (int i = 0; i < dx.length; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                // 전체좌표범위 벗어나면 continue;
                if (nextX < 0 || nextX > map.length - 1 || nextY < 0 || nextY > map[0].length - 1) {
                    continue;
                } else {
                    // 갈수없거나 이미 방문한 곳이면 continue
                    if ("X".equals(map[nextX][nextY]) || visited[nextX][nextY]) {
                        continue;
                    }

                    if (target.equals(map[nextX][nextY])) {
                        count = result[curX][curY] + 1;
                        break;
                    } else {
                        result[nextX][nextY] = result[curX][curY] + 1;
                        visited[nextX][nextY] = true;
                        route.add(new int[] { nextX, nextY });
                    }
                }
            }
        }
        return count;
    }
}
