package doit2.chap06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1931 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        // 입력배열 2차원
        int[][] arr = new int[N][2];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }
        // 종료시간 오름차순
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0]; // 종료시간이 같으면 시작시간으로 오름차순
                }
                return o1[1] - o2[1];
            }
        });

        int result = 0; // 회의횟수
        int end = -1; // 종료시간
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] >= end) { // 앞 종료시간보다 현재회의 시작시간이 크면
                result++;
                end = arr[i][1];
            }
        }
        System.out.println(result);
    }
}
