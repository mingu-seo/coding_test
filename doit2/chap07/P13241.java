package doit2.chap07;

import java.util.Scanner;

public class P13241 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] strArr = scan.nextLine().split(" ");
        long n1 = Long.parseLong(strArr[0]);
        long n2 = Long.parseLong(strArr[1]);
        long m = Math.min(n1, n2);

        long result = 0;
        for (long j = m; j > 0; j--) {
            if (n1 % j == 0 && n2 % j == 0) {
                result = j;
                break;
            }
        }
        System.out.println(n1 * n2 / result);

    }
}
