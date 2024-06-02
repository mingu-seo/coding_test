package level1;

import java.util.Arrays;

/**
 * Lesson42748
 */
public class P42748 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{1,5,2,6,3,7,4}, new int [][]{{2,5,3}, {4,4,1}, {1,7,3}});
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i=0; i<commands.length; i++) {
            // 추출된 배열만큼만 생성
            int len = commands[i][1] - commands[i][0] + 1;
            int[] arr = new int[len];
            int idx=0;
            for (int j=commands[i][0]-1; j<=commands[i][1]-1; j++) {
                arr[idx] = array[j];
                idx++;
            }
            idx = 0;
            
            // 배열정렬
            Arrays.sort(arr);

            // 정렬된배열의 x번째값만 추출
            answer[i] = arr[commands[i][2]-1];
            // for (int a : arr) {
            //     System.out.print(a+" ");
            // }
            // System.out.println();
        }
        return answer;
    }
}