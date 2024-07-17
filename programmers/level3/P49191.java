package level3;

import java.util.Arrays;

public class P49191 {
    public static void main(String[] args) {
        P49191 p = new P49191();
        int result = p.solution(5, new int[][] { { 4, 3 }, { 4, 2 }, { 3, 2 }, { 1, 2 }, { 2, 5 } });
        System.out.println(result);
    }

    /*
     * 인접행렬로 풀이
     */
    public int solution(int n, int[][] results) {
        int answer = 0;
        // [x][y] 좌표 인접행렬
        boolean[][] matrix = new boolean[n][n];
        for (int i = 0; i < results.length; i++) {
            // 입력값의 해당 x,y 좌표를 true로 변경
            matrix[results[i][0] - 1][results[i][1] - 1] = true;
        }
        // for (boolean[] m : matrix) {
        // System.out.println(Arrays.toString(m));
        // }

        for (int i = 0; i < n; i++) {
            int winCount = winCount(i, matrix, new boolean[n]) - 1;
            int loseCount = loseCount(i, matrix, new boolean[n]) - 1;
            if (winCount + loseCount + 1 == n) {
                answer++;
            }
        }

        return answer;
    }

    // 승리횟수
    int winCount(int x, boolean[][] matrix, boolean[] isVisited) {
        int count = 1;
        for (int i = 0; i < matrix[x].length; i++) {
            // x선수의 모든 상대 체크해서 승리(true)했고 방문안한 경우
            if (matrix[x][i] == true && isVisited[i] == false) {
                isVisited[i] = true;
                count += winCount(i, matrix, isVisited);
            }
        }
        return count;
    }

    // 패배횟수
    int loseCount(int y, boolean[][] matrix, boolean[] isVisited) {
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            // y선수의 모든 상대 체크해서 패배(true)했고 방문안한 경우
            if (matrix[i][y] == true && isVisited[i] == false) {
                isVisited[i] = true;
                count += loseCount(i, matrix, isVisited);
            }
        }
        return count;
    }
}
