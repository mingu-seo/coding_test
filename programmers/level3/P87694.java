package level3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P87694 {
    public static void main(String[] args) {
        P87694 p = new P87694();
        int result = p.solution(new int[][] { { 1, 1, 7, 4 }, { 3, 2, 5, 5 }, { 4, 3, 6, 9 }, { 2, 6, 8, 8 } }, 1, 3, 7,
                8);
        System.out.println(result);
    }

    // 최종 결과를 저장할 변수
    int answer = 0;
    // 이동 방향을 나타내는 배열 (동, 북, 서, 남)
    int[] dx = { 1, 0, -1, 0 };
    int[] dy = { 0, 1, 0, -1 };

    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {

        // 지도의 크기를 101x101으로 설정 (맵 초기화)
        int[][] map = new int[101][101];

        // 주어진 사각형 좌표로 맵을 설정
        for (int i = 0; i < rectangle.length; i++) {
            // 주어진 좌표를 2배로 확장하여 작업 (경계와 내부를 더 정확하게 구분)
            for (int j = rectangle[i][0] * 2; j <= rectangle[i][2] * 2; j++) {
                for (int k = rectangle[i][1] * 2; k <= rectangle[i][3] * 2; k++) {
                    // 이미 설정된 좌표는 건너뜀
                    if (map[j][k] == 2)
                        continue;
                    // 사각형 내부를 2로 표시
                    map[j][k] = 2;
                    // 사각형의 경계는 1로 표시
                    if (j == rectangle[i][0] * 2 || j == rectangle[i][2] * 2 || k == rectangle[i][1] * 2
                            || k == rectangle[i][3] * 2)
                        map[j][k] = 1;
                }
            }
        }

        // for (int[] m : map) {
        // System.out.println(Arrays.toString(m));
        // }

        // BFS 탐색 시작
        bfs(map, characterX * 2, characterY * 2, itemX * 2, itemY * 2);

        // 최종 결과 반환
        return answer;
    }

    void bfs(int[][] map, int startX, int startY, int itemX, int itemY) {
        // BFS 탐색을 위한 큐 초기화
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { startX, startY });

        // 각 지점까지의 비용을 저장할 배열 초기화
        int[][] cost = new int[101][101];
        cost[startX][startY] = 1;

        // 큐가 비어있을 때까지 반복
        while (!q.isEmpty()) {
            int[] move = q.poll(); // 현재 위치를 큐에서 꺼냄

            // 네 방향으로 이동 시도
            for (int i = 0; i < 4; i++) {
                int moveX = move[0] + dx[i];
                int moveY = move[1] + dy[i];

                // 맵 범위를 벗어나는 경우 무시
                if (0 > moveX || 0 > moveY || moveX > 100 || moveY > 100)
                    continue;

                // 경로가 유효하고 아직 방문하지 않은 경우
                if (map[moveX][moveY] == 1 && cost[moveX][moveY] == 0) {
                    cost[moveX][moveY] = cost[move[0]][move[1]] + 1; // 이동 비용 업데이트
                    q.offer(new int[] { moveX, moveY }); // 큐에 새 위치 추가
                }
            }
        }

        // 목표 지점까지의 비용을 2로 나눈 값을 결과로 저장 (한 칸에 두 번 포함된 것으로 가정)
        answer = cost[itemX][itemY] / 2;
    }
}
