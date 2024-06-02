package doit1.chap03;

import java.util.Arrays;

public class BinarySearchTester2 {
    public static void main(String[] args) {
        int[] number = { 15, 25, 10, 5, 30, 1, 50 };

        int search = 30;
        // 정렬 후 검색해야함
        Arrays.sort(number);
        int idx = binarySearch(number, search, 0, number.length - 1);
        System.out.println(number[idx]);
    }

    static int binarySearch(int[] data, int target, int start, int end) {
        if (start > end) { // 범위를 넘어도 못찾으면 -1 리턴
            return -1;
        }
        int mid = (start + end) / 2; // 중간값

        if (data[mid] == target) { // 중간값과 target이 같으면 mid 리턴
            return mid;
        } else if (data[mid] > target) { // 중간값보다 target이 작으면 왼쪽탐색
            end = mid - 1;
        } else { // 중간값보다 target이 크면 오른쪽 탐색
            start = mid + 1;
        }

        // 줄어든 범위를 다시 재귀호출로 탐색
        return binarySearch(data, target, start, end);
    }
}
