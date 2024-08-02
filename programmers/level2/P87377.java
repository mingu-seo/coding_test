package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P87377 {
    public static void main(String[] args) {
        P87377 p = new P87377();
        String[] result = p
                .solution(new int[][] { { 2, -1, 4 }, { -2, -1, 4 }, { 0, -1, 1 }, { 5, -8, -12 }, { 5, 8, 12 } });
        for (String r : result) {
            System.out.println(r);
        }
    }

    /*
     * 2차원 좌표 평면에서 여러 직선의 교점을 찾아내고, 그 교점들을 포함하는 최소의 직사각형 범위를 찾아 그 범위 안에 있는 교점들을 '*'로
     * 표시하여 문자열 배열로 반환
     */
    public String[] solution(int[][] line) {
        String[] answer = {};
        // 교점을 저장할 리스트
        List<long[]> point = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                // 두 직선의 교점을 계산하는 식 (전부 long으로 변경하면 마지막 29번 문제 맞음, 안바꾸면 틀림)
                double x = (double) ((long) line[i][1] * (long) line[j][2] - (long) line[j][1] * (long) line[i][2])
                        / (double) ((long) line[i][0] * (long) line[j][1] - (long) line[j][0] * (long) line[i][1]);
                double y = (double) ((long) line[j][0] * (long) line[i][2] - (long) line[i][0] * (long) line[j][2])
                        / (double) ((long) line[i][0] * (long) line[j][1] - (long) line[j][0] * (long) line[i][1]);

                // 교점의 좌표가 정수일 경우에만 리스트에 추가
                if (x % 1 != 0 || y % 1 != 0)
                    continue;
                point.add(new long[] { (long) x, (long) y });
            }
        }
        // for (long[] p : point) {
        // System.out.println(Arrays.toString(p));
        // }

        // 최소값
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        for (long[] p : point) {
            if (x > p[0])
                x = p[0];
            if (y > p[1])
                y = p[1];
        }
        long[] min = new long[] { x, y };
        // 최대값
        x = Long.MIN_VALUE;
        y = Long.MIN_VALUE;
        for (long[] p : point) {
            if (x < p[0])
                x = p[0];
            if (y < p[1])
                y = p[1];
        }
        long[] max = new long[] { x, y };

        // 최소값과 최대값을 이용해 직사각형의 너비와 높이를 계산
        long width = max[0] - min[0] + 1;
        long height = max[1] - min[1] + 1;

        // 직사각형의 크기에 맞는 보드를 생성하고 모든 칸을 '.'으로 초기화
        String[][] board = new String[(int) height][(int) width];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ".";
            }
        }

        // 보드를 문자열 배열로 변환
        for (long[] p : point) {
            board[(int) (max[1] - p[1])][(int) (p[0] - min[0])] = "*";
        }

        answer = new String[board.length];
        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board[i].length; j++) {
                row += board[i][j];
            }
            answer[i] = row;
        }

        return answer;
    }
}
