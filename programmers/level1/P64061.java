package level1;

import java.util.*;

public class P64061 {
    public static void main(String[] args) {
        P64061 p = new P64061();
        int result = p.solution(new int[][]{
            {0,0,0,0,0}, {0,0,1,0,3},
            {0,2,5,0,1}, {4,2,4,4,2},
            {3,5,1,3,1}
        }, new int[]{1,5,3,5,1,2,1,4});
        System.out.println(result);
    }
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> basket = new ArrayList<>();
        // moves 배열 반복
        for (int i=0; i<moves.length; i++) {
            // board 배열에서 해당 라인 확인
            for (int j=0; j<board.length; j++) {
                // System.out.println(board[j][moves[i]-1]);
                // 가장 위의 인형이 0이 아니면
                if (board[j][moves[i]-1] != 0) {
                    // 바구니에 이전값과 비교해서 같으면 제거
                    if (basket.size() > 0 && basket.get(basket.size()-1) == board[j][moves[i]-1]) {
                        basket.remove(basket.size()-1);
                        answer+=2;
                    } else {
                        basket.add(board[j][moves[i]-1]); // 바구니에 추가
                    }
                    // 기존 자리에는 0으로 변경
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}
