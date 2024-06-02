import java.util.Arrays;
/**
 * 버블정렬
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble_sort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length-i-1; j++) {
                // System.out.println(i+","+j);
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
}
