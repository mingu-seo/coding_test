package doit1.chap06;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 3, 7, 1, 9, 8, 2, 5 };
        arr = insert(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // 삽입 정렬
    static int[] insert(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int j;
            int temp = arr[i];
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
        return arr;
    }
}
