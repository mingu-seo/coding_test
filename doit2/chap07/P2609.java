package doit2.chap07;

import java.util.Scanner;

public class P2609 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strArr = scan.nextLine().split(" ");

        int n1 = Integer.parseInt(strArr[0]);
        int n2 = Integer.parseInt(strArr[1]);

        // 최대공약수
        int m = Math.min(n1, n2);
        int result = 1;
        for (int j = m; j > 0; j--) {
            if (n1 % j == 0 && n2 % j == 0) {
                result = j;
                break;
            }
        }
        System.out.println(result);

        // 최소공배수
        System.out.println(n1 * n2 / result);
    }
}
