package level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P84021 {
    public static void main(String[] args) {
        P84021 p = new P84021();
        // int result = p.solution(new int[][] { { 1, 1, 0, 0, 1, 0 }, { 0, 0, 1, 0, 1,
        // 0 }, { 0, 1, 1, 0, 0, 1 },
        // { 1, 1, 0, 1, 1, 1 }, { 1, 0, 0, 0, 1, 0 }, { 0, 1, 1, 1, 0, 0 } },
        // new int[][] { { 1, 0, 0, 1, 1, 0 }, { 1, 0, 1, 0, 1, 0 }, { 0, 1, 1, 0, 1, 1
        // }, { 0, 0, 1, 0, 0, 0 },
        // { 1, 1, 0, 1, 1, 0 }, { 0, 1, 0, 0, 0, 0 } });
        int result = p.solution(new int[][] { { 0, 0, 0 }, { 1, 1, 0 }, { 1, 1, 1 } },
                new int[][] { { 1, 1, 1 }, { 1, 0, 0 }, { 0, 0, 0 } });
        System.out.println(result);
    }

    public int solution(int[][] game_board, int[][] table) {
        int answer = 0;

        List<Block> puzzles = new LinkedList<>(); // 퍼즐 조각
        List<Block> blanks = new ArrayList<>(); // 빈 공간

        findBlocks(table, puzzles, 1, 0); // 퍼즐 조각을 찾아 리스트에 추가
        findBlocks(game_board, blanks, 0, 1); // 빈 공간을 찾아 리스트에 추가

        // 모든 빈 공간에 대해 적합한 퍼즐 조각을 찾는다.
        for (Block blank : blanks) {
            for (Block puzzle : puzzles) {
                if (canInsert(puzzle, blank)) { // 퍼즐 조각이 빈 공간에 들어갈 수 있는지 확인
                    answer += puzzle.cnt; // 퍼즐 조각의 크기만큼 정답에 추가
                    puzzles.remove(puzzle); // 사용된 퍼즐 조각을 리스트에서 제거
                    // 사용할 퍼즐이 더이상 없다면 종료
                    if (puzzles.size() == 0) {
                        return answer;
                    }
                    break; // 현재 빈 공간에 맞는 퍼즐을 찾았으므로 다음 빈 공간으로 이동
                }
            }
        }

        return answer;
    }

    // 블록(퍼즐 조각 또는 빈 공간)을 나타내는 클래스
    class Block {
        int cnt;// 칸의 개수
        int[][] shape = new int[6][2];// 모양(좌표)
    }

    // 주어진 맵에서 블록(퍼즐 조각 또는 빈 공간)을 찾아 리스트에 추가
    void findBlocks(int[][] map, List<Block> list, int flag, int nflag) {
        int n = map.length;
        int m = map[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == flag) {
                    list.add(findOne(map, n, m, i, j, flag, nflag));
                }
            }
        }
    }

    // block 하나 찾기
    Block findOne(int[][] map, int n, int m, int x, int y, int flag, int blank) {
        int[] dx = { -1, 0, 1, 0 }, dy = { 0, 1, 0, -1 };
        Block block = new Block();
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { x, y });
        map[x][y] = blank; // 방문한 칸은 빈 칸으로 바꿈

        while (!q.isEmpty()) {
            int[] now = q.poll();
            block.shape[block.cnt++] = now; // 현재 좌표를 블록에 추가
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                // 맵의 범위를 벗어나거나 이미 방문한 칸인 경우 스킵
                if (nx < 0 || nx >= n || ny < 0 || ny >= m || map[nx][ny] == blank) {
                    continue;
                }
                map[nx][ny] = blank; // 새로운 칸을 빈 칸으로 바꾸고 큐에 추가
                q.add(new int[] { nx, ny });
            }
        }

        // 해당 블럭에서 가장 앞에 있는 블럭을 0,0으로 맞추기
        setCenter(block);
        return block;
    }

    void setCenter(Block block) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        // 해당 블럭에서 가장 앞에 있는 블럭 찾기
        for (int i = 0; i < block.cnt; i++) {
            if (block.shape[i][0] < minX) {
                minX = block.shape[i][0];
                minY = block.shape[i][1];
            } else if (block.shape[i][0] == minX && block.shape[i][1] < minY) {
                minY = block.shape[i][1];
            }
        }
        // 블록의 모든 좌표를 최소 x, y 값 기준으로 이동시킴
        for (int i = 0; i < block.cnt; i++) {
            block.shape[i][0] -= minX;
            block.shape[i][1] -= minY;
        }
    }

    // 퍼즐 조각이 빈 공간에 들어갈 수 있는지 확인
    boolean canInsert(Block puzzle, Block blank) {
        // 퍼즐 조각과 빈 공간의 칸 수가 다르면 불가능
        if (puzzle.cnt != blank.cnt) {
            return false;
        }

        int size = puzzle.cnt;
        // 퍼즐 조각을 회전시켜가며 맞는지 확인 (최대 3회 회전)
        for (int i = 0; i < 3; i++) {
            // 맞는 퍼즐 찾으면 return true, 아니면 회전시켜보기
            if (isSameShape(size, puzzle.shape, blank.shape)) {
                return true;
            } else {
                // 퍼즐 조각을 90도 회전
                for (int j = 0; j < puzzle.cnt; j++) {
                    int temp = -puzzle.shape[j][0];
                    puzzle.shape[j][0] = puzzle.shape[j][1];
                    puzzle.shape[j][1] = temp;
                }
                setCenter(puzzle);
            }
        }
        // 마지막으로 한번 더 모양이 같은지 확인
        return isSameShape(size, puzzle.shape, blank.shape);
    }

    boolean isSameShape(int size, int[][] shape1, int[][] shape2) {
        // 첫 번째 블록의 각 좌표가 두 번째 블록의 좌표와 일치하는지 확인
        for (int j = 0; j < size; j++) {
            int k = 0;
            for (; k < size; k++) {
                if (shape1[j][0] == shape2[k][0]
                        && shape1[j][1] == shape2[k][1]) {
                    break;
                }
            }

            // 일치하는 좌표를 찾지 못한 경우 모양이 다르다고 판단
            if (k == size) {
                return false;
            }
        }
        return true;
    }
}
