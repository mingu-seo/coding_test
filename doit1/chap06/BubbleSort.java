package doit1.chap06;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 3, 7, 1, 9, 8, 2, 5 };
        arr = bubble(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // 버블 정렬
    static int[] bubble(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
