package doit2.chap07;

import java.util.Scanner;

public class P2581 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();

        int total = 0; // 소수합
        int minPrime = 0; // 최소값

        for (int i = M; i < N + 1; i++) {
            boolean isPrime = true;
            for (int j = 2; j < (int) Math.sqrt(i) + 1; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (i > 1 && isPrime) {
                total += i;
                if (minPrime == 0)
                    minPrime = i;
            }
        }
        if (total == 0) {
            System.out.println(-1);
        } else {
            System.out.println(total);
            System.out.println(minPrime);
        }
    }
}
