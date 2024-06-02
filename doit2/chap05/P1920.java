package doit2.chap05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1920 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        // 정렬
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        int[] result = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            // result[i] = binarySearch(A, target, 0, A.length - 1) > -1 ? 1 : 0;
            result[i] = Arrays.binarySearch(A, target) > -1 ? 1 : 0;
        }

        for (int r : result) {
            System.out.println(r);
        }
    }

    static int binarySearch(int[] data, int target, int start, int end) {
        if (start > end) { // 범위를 넘어도 못찾으면 -1 리턴
            return -1;
        }
        int mid = (start + end) / 2; // 중간값
        if (data[mid] == target) { // 중간값과 target이 같으면 mid 리턴
            return mid;
        } else if (data[mid] > target) { // 중간값보다 target이 작으면 왼쪽탐색
            end = mid - 1;
        } else { // 중간값보다 target이 크면 오른쪽 탐색
            start = mid + 1;
        }

        // 줄어든 범위를 다시 재귀호출로 탐색
        return binarySearch(data, target, start, end);
    }
}
