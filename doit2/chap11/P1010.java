package doit2.chap11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P1010 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            // System.out.println(v1 + "," + v2);
            List<List<Integer>> result = new ArrayList<>();
            comb(result, new ArrayList<>(), new int[v2], 0, v1);
            sb.append(result.size()).append("\n");
        }
        System.out.println(sb);
    }

    // 배열 arr에서 k개의 값을 가지는 조합 추출
    static void comb(List<List<Integer>> result, List<Integer> current, int[] arr, int start, int k) {
        if (k == 0) {
            result.add(new ArrayList<>(current)); // 리스트안에 리스트
            return;
        }
        for (int i = start; i <= arr.length - k; i++) {
            current.add(arr[i]);
            comb(result, current, arr, i + 1, k - 1); // start를 0으로하면 중복가능 조합
            current.remove(current.size() - 1);
        }
    }

}
