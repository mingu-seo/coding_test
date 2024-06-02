package doit1.chap06;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 3, 7, 1, 9, 8, 2, 5 };
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    // 퀵 정렬
    static void quick(int[] arr, int left, int right) {
        int pl = left;
        int pr = right;
        int x = arr[(pl + pr) / 2];

        // left,right,x값 확인
        System.out.println("arr[" + left + "]:arr[" + right + "]:x=" + x);
        for (int i = left; i <= right; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        do {
            while (arr[pl] < x)
                pl++;
            while (arr[pr] > x)
                pr--;
            if (pl <= pr) {
                int temp = arr[pl];
                arr[pl] = arr[pr];
                arr[pr] = temp;
                pl += 1;
                pr -= 1;
            }
        } while (pl <= pr);

        if (left < pr)
            quick(arr, left, pr);
        if (pl < right)
            quick(arr, pl, right);
    }
}
