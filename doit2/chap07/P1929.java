package doit2.chap07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1929 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        List<Integer> result = new ArrayList<>();
        for (int i = N; i <= M; i++) {
            boolean isPrime = true;
            for (int j = 2; j < (int) Math.sqrt(i) + 1; j++) { // 반드시 정수로 형변환 후 +1해야함
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (i > 1 && isPrime) {
                result.add(i);
            }
        }
        for (Integer r : result) {
            System.out.println(r);
        }
    }
}
