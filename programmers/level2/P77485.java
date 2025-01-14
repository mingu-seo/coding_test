package level2;

public class P77485 {
    public static void main(String[] args) {
        P77485 p = new P77485();
        // int[] result = p.solution(6,6, new int[][]{{2,2,5,4},{3,3,6,6},{5,1,6,3}});
        int[] result = p.solution(3,3, new int[][]{{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}});
        for (int r : result) {
            System.out.println(r);
        }
    }

    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];

        int[][] board = new int[rows][columns];
        int v = 1;
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                board[i][j] = v++;
            }
        }

        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                System.out.printf("%3s ",board[i][j]);
            }
            System.out.println();
        }

        // 회전시킬 좌표처리
        
        for (int i=0; i<queries.length; i++) {
            int prev = board[queries[i][0]][queries[i][1]-1];

            int startX = queries[i][0]-1;
            int startY = queries[i][1]-1;
            int endX = queries[i][2]-1;
            int endY = queries[i][3]-1;

            // 최소값을 구하기 위한 변수
            answer[i] = board[startX][startY];

            // System.out.println("왼->오");
            // 왼->오
            for (int j=startY; j<=endY; j++) {
                int temp = board[startX][j];
                board[startX][j] = prev;
                prev = temp;
                // System.out.println(board[startX][j]);

                if (answer[i] > temp) answer[i] = temp;
            }
            // System.out.println("위->아");
            // 위->아
            for (int j=startX+1; j<=endX; j++) {
                int temp = board[j][endY];
                board[j][endY] = prev;
                prev = temp;
                // System.out.println(board[j][endY]);
                if (answer[i] > temp) answer[i] = temp;
            }
            // System.out.println("오->왼");
            // 오->왼
            for (int j=endY-1; j>=startY; j--) {
                int temp = board[endX][j];
                board[endX][j] = prev;
                prev = temp;
                // System.out.println(board[endX][j]);
                if (answer[i] > temp) answer[i] = temp;
            }
            // System.out.println("아->위");
            // 아->위
            for (int j=endX-1; j>startX; j--) {
                int temp = board[j][startY];
                board[j][startY] = prev;
                prev = temp;
                // System.out.println(board[j][startY]);
                if (answer[i] > temp) answer[i] = temp;
            }

            if (i==2) break;
        }

        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                System.out.printf("%3s ",board[i][j]);
            }
            System.out.println();
        }

        return answer;
    }
}
