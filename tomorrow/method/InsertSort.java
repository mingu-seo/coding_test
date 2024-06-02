package tomorrow.method;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = { 33, 5, 98, 75, 87, 12, 4, 61, 100 };
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
        // 출력 : [4, 5, 12, 33, 61, 75, 87, 98, 100]
    }

    public static void insertionSort(int[] arr) {
        for (int idx = 1; idx < arr.length; idx++) {
            int tmp = arr[idx];
            int aux = idx - 1;

            while (aux >= 0 && arr[aux] > tmp) {
                arr[aux + 1] = arr[aux];
                aux--;
            }

            arr[aux + 1] = tmp;
        }
    }
}
