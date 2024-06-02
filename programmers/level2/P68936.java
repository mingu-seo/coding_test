package level2;

import java.util.Arrays;

public class P68936 {
    public static void main(String[] args) {
        P68936 p = new P68936();
        // int[] result = p.solution(new int[][] { { 1, 1, 0, 0 }, { 1, 0, 0, 0 }, { 1,
        // 0, 0, 1 }, { 1, 1, 1, 1 } });
        int[] result = p.solution(new int[][] { { 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 1, 1, 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 1, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1, 0, 0, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 } });
        for (int r : result) {
            System.out.println(r);
        }
    }

    // 4분의1로 나눠가면서 비교해보자(x축도 /2, y축도 /2)
    public int[] solution(int[][] arr) {
        int[] answer = {};

        // 재귀호출 시작
        check(arr);
        // System.out.println("최종:" + Arrays.toString(count));

        answer = count;
        return answer;
    }

    int[] count = new int[] { 0, 0 };

    void check(int[][] arr) {
        // arr 출력
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // 1 * 1로 쪼개지면 카운트 더하고 재귀호출 중지
        if (arr.length == 1) {
            count[arr[0][0]] += 1;
            return;
        }

        // i,j 부터 사각형 기준으로 같은 값인지 체크
        int v = arr[0][0];
        boolean isEqual = false;
        target: for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (v == arr[i][j]) {
                    isEqual = true;
                } else {
                    isEqual = false;
                    break target;
                }
            }
        }

        if (isEqual) {
            count[v] += 1;
            // System.out.println("모두 같음");
            return;
        } else {
            // 값이 다 같지 않으면 반반 나눠서 재귀호출
            int[][] arr1 = new int[arr.length / 2][arr.length / 2];
            int[][] arr2 = new int[arr.length / 2][arr.length / 2];
            int[][] arr3 = new int[arr.length / 2][arr.length / 2];
            int[][] arr4 = new int[arr.length / 2][arr.length / 2];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i < arr.length / 2) {
                        if (j < arr[i].length / 2) {
                            arr1[i][j] = arr[i][j];
                        } else {
                            // 쪼개진 배열중 오른쪽 배열은 0부터 시작해야하므로
                            arr2[i][j - arr2.length] = arr[i][j];
                        }
                    } else {
                        if (j < arr[i].length / 2) {
                            arr3[i - arr3.length][j] = arr[i][j];
                        } else {
                            arr4[i - arr4.length][j - arr4.length] = arr[i][j];
                        }
                    }
                }
            }
            // 4등분한 배열을 재귀호출
            check(arr1);
            check(arr2);
            check(arr3);
            check(arr4);
        }
    }
}
