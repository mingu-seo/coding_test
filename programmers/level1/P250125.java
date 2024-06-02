package level1;

public class P250125 {
    public static void main(String[] args) {
        P250125 p = new P250125();
        int result = p.solution(new String[][]{
            {"blue", "red", "orange", "red"},
            {"red", "red", "blue", "orange"},
            {"blue", "orange", "red", "red"},
            {"orange", "orange", "red", "blue"}
        }, 3, 3);
        System.out.println(result);
    }

    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[][] move = {{0,1}, {1,0}, {-1,0}, {0,-1}};
        for (int i=0; i<move.length; i++) {
            int x = h + move[i][0];
            int y = w + move[i][1];
            if (x >= 0 && y >= 0 && x <= board.length-1 && y <= board.length - 1) {
                // System.out.println(x+","+y);
                if (board[h][w].equals(board[x][y])) {
                    answer++;
                }
            }
            
        }
        return answer;
    }
}
