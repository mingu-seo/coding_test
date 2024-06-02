import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * 퀵정렬
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, };

        quick_sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void quick_sort(int[] arr, int p, int r) {
        if (p < r) {
            int q = partition(arr, p, r);
            quick_sort(arr, p, q - 1);
            quick_sort(arr, q + 1, r);
        }
    }

    static int partition(int[] arr, int p, int r) {
        int i = p, j = r;
        int pivot = arr[p];
        while (i < j) {
            while (pivot < arr[j]) {
                j--;
            }
            while (i < j && pivot >= arr[i]) {
                i++;
            }
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        arr[p] = arr[i];
        arr[i] = pivot;
        return i;
    }

}
