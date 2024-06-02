package level1;

import java.util.Arrays;

/**
 */
public class P12982 {

    public static void main(String[] args) {
        int result = solution(new int[]{1,3,2,5,4}, 9);
        System.out.println(result);
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i=0; i<d.length; i++) {
            if (budget - d[i] >= 0) {
                budget = budget - d[i];
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}