package level2;

import java.util.Arrays;

public class P135807 {
    public static void main(String[] args) {
        P135807 p = new P135807();
        // int result = p.solution(new int[] { 10, 17 }, new int[] { 5, 20 });
        // int result = p.solution(new int[] { 10, 20 }, new int[] { 5, 17 });
        int result = p.solution(new int[] { 14, 35, 119 }, new int[] { 18, 39, 102 });
        System.out.println(result);
    }

    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;

        // 두 배열 정렬
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        // 두 배열의 최소값
        int arrayAmin = arrayA[0];
        int arrayBmin = arrayB[0];

        // arrayA는 모두 나누어 떨어지고, arrayB는 모두 나누어 떨어지지 않는 값중 가장 큰 값
        int a = 0;
        for (int i = arrayAmin; i >= 2; i--) {
            // arrayA
            boolean equalA = true;
            // 전부 나누어 떨어지는지
            for (int j = 0; j < arrayA.length; j++) {
                if (arrayA[j] % i != 0) {
                    equalA = false;
                    break;
                }
            }
            if (equalA == true) {
                boolean equalB = true;
                // 전부 나누어 떨어지지 않는지
                for (int k = 0; k < arrayB.length; k++) {
                    if (arrayB[k] % i == 0) {
                        equalB = false;
                        break;
                    }
                }
                if (equalA == true && equalB == true && a < i) {
                    a = i;
                }
            }

        }

        // arrayB는 모두 나누어 떨어지고, arrayA는 모두 나누어 떨어지지 않는 값중 가장 큰 값
        int b = 0;
        for (int i = arrayBmin; i >= 2; i--) {
            // arrayA
            boolean equalB = true;
            // 전부 나누어 떨어지는지
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayB[j] % i != 0) {
                    equalB = false;
                    break;
                }
            }
            if (equalB == true) {
                boolean equalA = true;
                // 전부 나누어 떨어지지 않는지
                for (int k = 0; k < arrayA.length; k++) {
                    if (arrayA[k] % i == 0) {
                        equalA = false;
                        break;
                    }
                }
                if (equalB == true && equalA == true && b < i) {
                    b = i;
                }
            }
        }
        // System.out.println("a:" + a + "b:" + b);
        answer = Math.max(a, b); // 두 값중 큰값

        return answer;
    }

}
