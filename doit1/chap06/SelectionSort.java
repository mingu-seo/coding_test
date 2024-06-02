package doit1.chap06;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 3, 7, 1, 9, 8, 2, 5 };
        arr = selection(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // 선택 정렬
    static int[] selection(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int min = i; // 정렬되지 않은 값들 중 가장 작은 값의 인덱스
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp; // 아직 정렬되지 않은 첫번째 인덱스값과 min위치 값을 교체
        }
        return arr;
    }
}
