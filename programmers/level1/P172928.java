package level1;
/*
 * 공원산책
 * 
 * park변수를 2차원 배열로 저장하여 x,y 좌표형태로 처리하기 쉽도록 저장
 * routes 변수의 동/서/남/북 값과 거리 값을 비교해서
 * 현재좌표가 board 범위에서 벗어나는지여부, 현재좌표와 이동되는 좌표간에 X값이 없으면 이동
 */

public class P172928 {
    public static void main(String[] args) {
        P172928 p = new P172928();
        int[] result = p.solution(new String[]{"OSO","OOO", "OXO","OOO"}, new String[]{"E 2","S 3","W 1"});
        for (int r : result) {
            System.out.println(r);
        }
    }
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        String[][] board = new String[park.length][park[0].length()];

        int x = 0;
        int y = 0;
        for (int i=0; i<park.length; i++) {
            for (int j=0; j<park[i].length(); j++) {
                board[i][j] = String.valueOf(park[i].charAt(j));
                if (board[i][j].equals("S")) {
                    x = i;
                    y = j;
                }
            }
        }
        
        for (int i=0; i<routes.length; i++) {
            String[] xy = routes[i].split(" ");
            String direct = xy[0];
            int move = Integer.parseInt(xy[1]);
            if ("N".equals(direct)) {
                if (x - move >= 0) {
                    boolean isMove = true;
                    for (int v = x; v>=x-move; v--) {
                        if (board[v][y].equals("X")) {
                            isMove = false;
                            break;
                        }
                    }
                    if (isMove) x -= move;
                }
            } else if ("S".equals(direct)) {
                if (x + move < board.length) {
                    boolean isMove = true;
                    for (int v=x; v<=x+move; v++) {
                        if (board[v][y].equals("X")) {
                            isMove = false;
                            break;
                        }
                    }
                    if (isMove) x += move;
                }
            } else if ("W".equals(direct)) {
                if (y - move >= 0) {
                    boolean isMove = true;
                    for (int v=y; v>=y-move; v--) {
                        if (board[x][v].equals("X")) {
                            isMove = false;
                            break;
                        }
                    }
                    if (isMove) y -= move;
                }
            } else if ("E".equals(direct)) {
                if (y + move < board[0].length) {
                    boolean isMove = true;
                    for (int v=y; v<=y+move; v++) {
                        if (board[x][v].equals("X")) {
                            isMove = false;
                            break;
                        }
                    }
                    if (isMove) y += move;
                }
            }
        }
        // System.out.println(x+","+y);
        answer = new int[]{x,y};
        return answer;
    }
}
