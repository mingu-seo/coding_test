package doit2.chap03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1874 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        List<Integer> stack = new ArrayList<>();
        List<String> result = new ArrayList<>();
        int value = 1;

        for (int i = 0; i < arr.length; i++) {
            int curVal = arr[i]; // 현재인덱스 값
            if (curVal >= value) { // 현재인덱스값이 value 이상이면 push
                while (curVal >= value) {
                    stack.add(value);
                    result.add("+");
                    value++;
                }
                // push다 끝나고 현재인덱스값이 value보다 작아지면 pop
                stack.remove(stack.size() - 1);
                result.add("-");
            } else { // 현재 인덱스값이 value보다 작으면 pop
                int lastVal = stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);
                result.add("-");
                if (lastVal > curVal) { // 마지막값이 현재인덱스값보다 크면 수열 불가
                    result = new ArrayList<>();
                    result.add("NO");
                    break;
                }
            }
            // System.out.println(stack);
        }
        for (String r : result) {
            System.out.println(r);
        }

    }
}
