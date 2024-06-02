package doit2.chap03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 정렬
        Arrays.sort(arr);
        // 두 포인터 i,j
        int start = 0;
        int end = N - 1;
        int result = 0; // 합이 M과 같은 횟수

        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == M) {
                result++;
                start++;
                end--;
            } else if (sum < M) {
                start++;
            } else if (sum > M) {
                end--;
            }
        }
        System.out.println(result);
    }
}
