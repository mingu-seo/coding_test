package level1;

import java.util.Arrays;

/**
 */
public class P86491 {

    public static void main(String[] args) {
        int arr = solution(new int[][]{{60,50},{30,70},{60,30},{80,40}});
        System.out.println(arr);
    }

    public static int solution(int[][] sizes) {
        int answer = 0;
        int one = 0;
        int two = 0;
        for (int i=0; i<sizes.length; i++) {
            Arrays.sort(sizes[i]);
            if (sizes[i][0] > one) one = sizes[i][0];
            if (sizes[i][1] > two) two = sizes[i][1];
        }
        answer = one * two;
        return answer;
    }
}