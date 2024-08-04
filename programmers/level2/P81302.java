package level2;

import java.util.Arrays;

public class P81302 {
    public static void main(String[] args) {
        P81302 p = new P81302();
        int[] result = p.solution(new String[][] { { "POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP" },
                { "POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP" }, { "PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX" },
                { "OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO" }, { "PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP" } });
        for (int r : result) {
            System.out.println(r);
        }
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for (int i = 0; i < places.length; i++) {
            String[] p = places[i]; // 각대기실
            // 각 대기실을 2차원 배열로 저장
            char[][] room = new char[p.length][];
            for (int j = 0; j < p.length; j++) {
                room[j] = p[j].toCharArray();
            }
            System.out.println("------------");
            for (char[] r : room) {
                System.out.println(Arrays.toString(r));
            }
            System.out.println("------------");

            // 거리두기 지켰는지 체크
            boolean isOk = true;
            for (int j = 0; j < room.length; j++) { // x좌표값
                for (int k = 0; k < room[j].length; k++) { // y좌표값
                    // 현재 좌표값이 P일때만 체크 주위 체크
                    System.out.println(j + "," + k);
                    if (room[j][k] == 'P') {
                        // 4방향 체크
                        int dx[] = { 0, -1, 1, 0 };
                        int dy[] = { -1, 0, 0, 1 };

                        for (int l = 0; l < 4; l++) {
                            int temp_x = j + dx[l]; // 임시 x좌표값
                            int temp_y = k + dy[l]; // 임시 y좌표값
                            System.out.println("네 방향" + temp_x + "," + temp_y);
                            // 대기실 전체좌표에서 벗어나면
                            if (temp_x < 0 || temp_x >= room.length || temp_y < 0 || temp_y >= room[temp_x].length) {
                                continue;
                            }
                            // 4방향에 응시자가 있으면
                            if (room[temp_x][temp_y] == 'P') {
                                isOk = false;
                                break;
                            } else if (room[temp_x][temp_y] == 'O') {
                                // 없으면 그 위치의 맨하튼거리가 2인 위치도 체크
                                // temp_x, temp_y에서 상하좌우 값이 맨하튼거리가 2인 경우임
                                // 여기서 현재위치 temp_x, temp_y는 제외해야함
                                for (int m = 0; m < 4; m++) {
                                    if (m == 3 - l) { // 현재 반복 m값과 상위반복 l값이 같은 경우는 제외(반대방향이 나오게 하려면 3에서 빼야함)
                                        // dx, dy방향이 위, 왼, 우, 하인데, 위(0)의 반대는 하(3), 왼(1)의 반대는 오(2)
                                        continue;
                                    } else {
                                        int temp_x2 = temp_x + dx[m];
                                        int temp_y2 = temp_y + dy[m];
                                        if (temp_x2 < 0 || temp_x2 >= room.length || temp_y2 < 0
                                                || temp_y2 >= room[temp_x2].length) {
                                            continue;
                                        }
                                        // 맨하튼 거리가 2인 위치에 응시자가 있으면
                                        if (room[temp_x2][temp_y2] == 'P') {
                                            isOk = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            // 거리두기 지켰으면 1로 저장
            if (isOk)
                answer[i] = 1;
        }
        return answer;
    }
}
