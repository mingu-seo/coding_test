package level2;

import java.util.Arrays;

/*
0,1,3,6
 */
public class P68645 {
    public static void main(String[] args) {
        P68645 p = new P68645();
        int[] result = p.solution(6);

        System.out.println(Arrays.toString(result));

    }

    public int[] solution(int n) {

        int[][] arr = new int[n][n];

        int v = 1;
        arr[0][0] = v++;
        // 시작위치
        int i = 0;
        int j = 0;

        int max_value = 0;
        for (int a = 1; a <= arr.length; a++) {
            max_value += a;
        }
        int[] answer = new int[max_value];
        // System.out.println(max_value);

        int[][] direct = { { 1, 0 }, { 0, 1 }, { -1, -1 } };
        int loc = 0;

        while (v <= max_value) {
            // System.out.println(i + ":" + j + "=" + v);

            if (loc == 0 && (i + 1 >= n || arr[i + 1][j] > 0)) { // 아래로
                loc = 1;

            } else if (loc == 1 && (j + 1 > i || arr[i][j + 1] > 0)) {
                loc = 2;

            } else if (loc == 2 && (i - 1 < 0 || j - 1 < 0 || arr[i - 1][j - 1] > 0)) {
                loc = 0;

            }

            i += direct[loc][0];
            j += direct[loc][1];
            arr[i][j] = v++;
            // break;
        }

        int idx = 0;
        for (int[] ar : arr) {
            for (int a : ar) {
                if (a > 0) {
                    answer[idx] = a;
                    idx++;
                }
            }
        }

        return answer;
    }
}
