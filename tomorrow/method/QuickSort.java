package tomorrow.method;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 33, 5, 98, 75, 87, 12, 4, 61, 100 };
        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
        // 출력 : [4, 5, 12, 33, 61, 75, 87, 98, 100]
    }

    public static void quickSort(int[] arr, int p, int r) {
        if (p < r) {
            int q = partition(arr, p, r);
            quickSort(arr, p, q - 1);
            quickSort(arr, q + 1, r);
        }
    }

    public static int partition(int[] arr, int p, int r) {
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
