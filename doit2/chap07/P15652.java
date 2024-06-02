package doit2.chap07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P15652 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strArr = scan.nextLine().split(" ");
        int N = Integer.parseInt(strArr[0]);
        int M = Integer.parseInt(strArr[1]);

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        List<List<Integer>> result = new ArrayList<>();
        comb(result, new ArrayList<>(), arr, 0, M);
        // System.out.println(result);

        // 출력도 그냥 출력하면 시간초과됨
        StringBuilder sb = new StringBuilder();
        for (List<Integer> r : result) {
            for (Integer n : r) {
                // System.out.print(n + " ");
                sb.append(n + " ");
            }
            // System.out.println();
            sb.append("\n");
        }
        System.out.println(sb);
    }

    // 배열 arr에서 k개의 값을 가지는 조합 추출
    static void comb(List<List<Integer>> result, List<Integer> current, int[] arr, int start, int k) {
        if (k == 0) {
            result.add(new ArrayList<>(current)); // 리스트안에 리스트
            return;
        }
        for (int i = start; i < arr.length; i++) { // 반복도 -k 빼고 반복
            current.add(arr[i]);
            comb(result, current, arr, i, k - 1); // start를 i로 수정
            current.remove(current.size() - 1);
        }
    }
}
