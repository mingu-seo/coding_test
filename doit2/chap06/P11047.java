package doit2.chap06;

import java.util.Scanner;

public class P11047 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] coin = new int[N];

        for (int i = 0; i < N; i++) {
            coin[i] = scan.nextInt();
        }

        int result = 0;
        // 동전 가치가 큰 금액부터 뒤에서 반복
        for (int i = N - 1; i > -1; i--) {
            int c = coin[i];
            result += K / c;
            K = K % c;
        }
        System.out.println(result);
    }
}