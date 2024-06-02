package tomorrow.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraysEx {
    public static void main(String[] args) {
        int[] arr = { 5, 26, 1, 74, 59, 38 };
        Arrays.sort(arr); // 정렬
        System.out.println(Arrays.toString(arr));

        // 배열을 ArrayList로 변환
        Integer[] arr2 = { 5, 26, 1, 74, 59, 38 };
        List<Integer> list = Arrays.asList(arr2);
        System.out.println(list);
    }
}
