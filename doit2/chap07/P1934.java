package doit2.chap07;

import java.util.Scanner;

public class P1934 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();

        int[] arr = new int[T];
        for (int i = 0; i < arr.length; i++) {
            String[] strArr = scan.nextLine().split(" ");
            int n1 = Integer.parseInt(strArr[0]);
            int n2 = Integer.parseInt(strArr[1]);
            int m = Math.min(n1, n2);

            int result = 0;
            for (int j = m; j > 0; j--) {
                if (n1 % j == 0 && n2 % j == 0) {
                    result = j;
                    break;
                }
            }
            if (result > 0) // 0인 경우는 없네
                arr[i] = n1 * n2 / result;
        }
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
