package doit2.chap07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P15649 {
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
        perm(result, new ArrayList(), arr, M);
        // System.out.println(result);

        for (List<Integer> r : result) {
            for (Integer n : r) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    static void perm(List<List<Integer>> result, List<Integer> current, int[] arr, int k) {
        if (k == 0) {
            result.add(new ArrayList<>(current)); // 리스트안에 리스트
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (current.contains(arr[i])) { // 중복체크 (이 부분 제거하면 중복가능한 순열)
                continue;
            }
            current.add(arr[i]);
            perm(result, current, arr, k - 1);
            current.remove(current.size() - 1);
        }
    }

}