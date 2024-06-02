package level1;

import java.util.Arrays;
import java.util.Comparator;

/**
 */
public class P135808 {

    public static void main(String[] args) {
        int arr = solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
        System.out.println(arr);
    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] score2 = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(score2, Comparator.reverseOrder());
        int count = 0;
        for (int i=0; i<score2.length; i++) {
            count++;
            if (m == count) {
                answer += score2[i] * m;
                count = 0;
            }
        }
        
        return answer;
    }
}