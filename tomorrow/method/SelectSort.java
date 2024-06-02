package tomorrow.method;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = { 33, 5, 98, 75, 87, 12, 4, 61, 100 };
        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int idxMin, tmp;

        for (int i = 0; i < arr.length - 1; i++) {
            idxMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[idxMin]) {
                    idxMin = j;
                }
            }
            tmp = arr[idxMin];
            arr[idxMin] = arr[i];
            arr[i] = tmp;
        }
    }
}