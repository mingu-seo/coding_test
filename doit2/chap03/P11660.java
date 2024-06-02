package doit2.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 구간 합 구하기2
 * 
 * 원본 배열의 2차원배열 안에 있는 구간 합
 * 원본 A, 구간합 B
 * B[i][1] = B[i-1][1] + A[i][1]
 * B[1][j] = B[1][j-1] + A[1][j]
 * 따라서
 * B[i][j] = B[i-1][j] + B[i][j-1] - B[i-1][j-1] + A[i][j]
 * 
 * (2,2) ~ (3,4) 까지의 합이라면
 * 전체(3,4)에서 위쪽여백(1,4) 빼고, 왼쪽여백(3,1) 빼고, 겹친부분(두번뺀부분)(1,1) 더해주면 구간합이됨
 * 
 * B[3][4] - B[1][4] - B[3][1] + D[1][1]
 */
public class P11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 원본배열 (위쪽, 왼쪽 0으로 채운형태)
        int[][] A = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 1; j <= N; j++) {
                // System.out.println(j);
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // for (int[] a : A) {
        // System.out.println(Arrays.toString(a));
        // }

        // 구간합배열
        int[][] B = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                // 구간합 배열 채우기
                B[i][j] = B[i - 1][j] + B[i][j - 1] - B[i - 1][j - 1] + A[i][j];
            }
        }
        // for (int[] b : B) {
        // System.out.println(Arrays.toString(b));
        // }

        // 합계 구하기
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            int total = B[endX][endY] - B[startX - 1][endY] - B[endX][startY - 1] + B[startX - 1][startY - 1];
            result.add(total);
        }
        for (Integer r : result) {
            System.out.println(r);
        }
    }
}