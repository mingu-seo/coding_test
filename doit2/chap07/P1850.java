package doit2.chap07;

import java.util.Scanner;

public class P1850 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strArr = scan.nextLine().split(" ");

        long n1 = Long.parseLong(strArr[0]);
        long n2 = Long.parseLong(strArr[1]);

        // long m = Math.min(n1, n2);
        // long result = 1;
        // for (long j = m; j > 0; j--) {
        // if (n1 % j == 0 && n2 % j == 0) {
        // result = j;
        // break;
        // }
        // }

        // 유클리드호제법 사용
        long result = gcd(n1, n2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result; i++) {
            sb.append("1");
        }
        System.out.println(sb);
    }

    // 유클리드호제법
    static long gcd(long x, long y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }
}
