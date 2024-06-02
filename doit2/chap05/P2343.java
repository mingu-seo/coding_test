package doit2.chap05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2343 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int start = 0;
        int end = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            // 최대값
            if (start < arr[i]) {
                start = arr[i];
            }
            // 합계
            end += arr[i];
        }
        // System.out.println(start + ":" + end);
        int result = binarySearch(arr, M, start, end);
        System.out.println(result);
    }

    static int binarySearch(int[] data, int M, int start, int end) {
        if (start > end) { // 범위를 넘어도 못찾으면 -1 리턴
            return start;
        }
        int sum = 0;
        int count = 0;
        int mid = (start + end) / 2; // 중간값
        for (int i = 0; i < data.length; i++) {
            if (sum + data[i] > mid) {
                count++;
                sum = 0;
            }
            sum += data[i];
        }
        if (sum != 0) {
            count++;
        }
        if (count > M) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }

        // 줄어든 범위를 다시 재귀호출로 탐색
        return binarySearch(data, M, start, end);
    }
}
