package level2;

public class P77485 {
    public static void main(String[] args) {
        P77485 p = new P77485();
        int[] result = p.solution(6,6, new int[][]{{2,2,5,4},{3,3,6,6},{5,1,6,3}});
        for (int r : result) {
            System.out.println(r);
        }
    }

    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};

        int[][] board = new int[rows][columns];
        int v = 1;
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                board[i][j] = v++;
            }
        }

        int[][] direct = {{0,1}, {1,0},{0,-1},{-1,-1}};
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                System.out.printf("%3s ",board[i][j]);
            }
            System.out.println();
        }

        // 회전시킬 좌표처리
        for (int i=0; i<queries.length; i++) {
            int startX = queries[i][0]-1;
            int startY = queries[i][1]-1;
            int endX = queries[i][2]-1;
            int endY = queries[i][3]-1;

            // direct[0]
            for (int j=startY; j<=endY; j++) {
                System.out.println(board[startX][j]);
                
            }
        }

        return answer;
    }
}
