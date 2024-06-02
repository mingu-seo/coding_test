package level2;

import java.util.Arrays;

public class P12949 {
    public static void main(String[] args) {
        P12949 p = new P12949();
        int[][] result = p.solution(
            new int[][]{
                {2,3,2},
                {4,2,4},
                {3,1,4}
            }, 
            new int[][]{
                {5,4,3},
                {2,4,1},
                {3,1,1,}
            });
        for (int[] r : result) {
            System.out.println(Arrays.toString(r));
        }
    }
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        // 행렬곱 : (0,0) = (0,0)*(0,0) + (0,1)*(1,0)
        // (0,1) = (0,0)*(0,1) + (0,1)*(1,1)
        for (int i=0; i<answer.length; i++) {
            for (int j=0; j<answer[i].length; j++) {
                // System.out.println(i+","+j);
                for (int k=0; k<arr2.length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}
