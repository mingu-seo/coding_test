package doit1.chap06;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = { 6, 4, 3, 7, 1, 9, 8, 2, 5 };
        merge(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] buff; // 임시 배열

    static void __merge(int[] arr, int left, int right) {
        if (left < right) {
            int i;
            int center = (left + right) / 2;
            int p = 0;
            int j = 0;
            int k = left;

            __merge(arr, left, center); // 배열앞부분
            __merge(arr, center + 1, right); // 배열뒷부분

            for (i = left; i <= center; i++) {
                buff[p++] = arr[i];
            }
            while (i <= right && j < p) {
                arr[k++] = (buff[j] <= arr[i]) ? buff[j++] : arr[i++];
            }
            while (j < p) {
                arr[k++] = buff[j++];
            }
        }
    }

    // 삽입 정렬
    static void merge(int[] arr, int n) {
        buff = new int[n];

        __merge(arr, 0, n - 1);

        buff = null;
    }
}
