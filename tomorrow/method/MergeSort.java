package tomorrow.method;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 33, 5, 98, 75, 87, 12, 4, 61, 100 };
        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
        // 출력 : [4, 5, 12, 33, 61, 75, 87, 98, 100]
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1, k = left;
        int[] tmp = new int[arr.length];

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            tmp[k++] = arr[i++];
        }

        while (j <= right) {
            tmp[k++] = arr[j++];
        }

        for (int idx = left; idx <= right; idx++) {
            arr[idx] = tmp[idx];
        }
    }
}
