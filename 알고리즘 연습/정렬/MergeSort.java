import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 병합정렬
 */

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        merge_sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void merge_sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            merge_sort(arr, left, mid);
            merge_sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
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
