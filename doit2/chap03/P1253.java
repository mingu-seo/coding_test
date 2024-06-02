package doit2.chap03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr); // 정렬
        int result = 0; // 좋은 수 횟수
        // 전체 배열 반복
        for (int i = 0; i < arr.length; i++) {
            long target = arr[i]; // 좋은수인지 비교할 값
            int start = 0; // 시작인덱스
            int end = N - 1; // 끝인덱스
            while (start < end) {
                long sum = arr[start] + arr[end];
                // 두 수의 합이 좋은수인지 비교
                if (sum == target) {
                    // 합계는 같지만 서로 다른 두수여야하므로
                    // 수의 위치가 다르면 값이 같아도 다른 수이다.
                    if (start != i && end != i) {
                        result++;
                        break;
                    } else if (start == i) {
                        start++;
                    } else if (end == i) {
                        end--;
                    }
                } else if (sum < target) {
                    start++;
                } else if (sum > target) {
                    end--;
                }
            }
        }
        System.out.println(result);
    }
}
