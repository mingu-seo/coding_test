package doit1.chap03;

import java.util.Arrays;

public class BinarySearchTester {
    public static void main(String[] args) {
        int[] number = { 15, 25, 10, 5, 30, 1, 50 };

        int search = 30;
        // 정렬 후 검색해야함
        Arrays.sort(number);
        int idx = Arrays.binarySearch(number, search);
        System.out.println(number[idx]);
    }
}
