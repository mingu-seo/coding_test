import java.util.Arrays;
/*
 * 삽입정렬
 */

public class InsertSort {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1,};
        insert_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insert_sort(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            int temp = arr[i]; // 현재값
            int beforeIdx = i - 1;  // 이전값

            // 이전값이 현재값보다 크면 자리이동하고 그전(이전에 이전)인덱스로 이동하면서 계속 비교
            while (beforeIdx >= 0 && arr[beforeIdx] > temp) {
                arr[beforeIdx+1] = arr[beforeIdx];
                beforeIdx--;
            }
            // 더이상 작은값이 없으면 그자리에 현재값 저장
            arr[beforeIdx + 1] = temp;
        }
    }
}
