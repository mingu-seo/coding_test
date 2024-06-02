import java.util.Arrays;
/**
 * 선택정렬
 */

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        select_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void select_sort(int[] arr) {
        int minIdx = 0; // 최소 인덱스
        int temp = 0; // 임시

        for (int i=0; i<arr.length-1; i++) {
            minIdx = i;
            for (int j=i+1; j<arr.length; j++) {
                // j번째 값보다 크면 minIdx 변경
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // 작은값과 교체
            temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
