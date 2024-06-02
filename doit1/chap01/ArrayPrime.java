package doit1.chap01;

import java.util.ArrayList;
import java.util.List;

public class ArrayPrime {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // 결과값을 담을 리스트(몇개일지 모르므로)
        List<Integer> result = new ArrayList<>();

        // 배열 순회
        for (int i = 0; i < arr.length; i++) {
            // 소수판별 (1과 자신의 수를 제외한 다른 정수로 나누어 떨어지지 않는 정수)
            boolean isPrime = true;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) { // 소수아님
                    isPrime = false;
                    break;
                }
            }
            if (arr[i] != 1 && isPrime)
                result.add(arr[i]);
        }

        System.out.println(result);
    }
}
