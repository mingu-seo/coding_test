package level2;

import java.util.Arrays;

/**
 * 처음 배열로 처리하니까 메모리초과 발생
 */

public class P87390 {
    public static void main(String[] args) {
        P87390 p = new P87390();
        // int[] result = p.solution(3,2, 5);
        int[] result = p.solution(4,7, 14);
        for (int r : result) {
            System.out.println(r);
        }
    }

    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];

        for (int i=0; i<answer.length; i++) {
            int x = (int)(left / n)+1;
            int y = (int)(left % n)+1;
            // System.out.println(x+","+y);
            answer[i] = Math.max(x,y);
            left++;
        }
        return answer;
    }
}
