package doit2.chap07;

import java.util.Scanner;

public class P1978 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();

        String str = scan.nextLine();
        String[] strArr = str.split(" ");
        int result = 0;
        for (int i = 0; i < strArr.length; i++) {
            boolean isPrime = true;
            int v = Integer.parseInt(strArr[i]);
            for (int j = 2; j < (int) Math.sqrt(v) + 1; j++) {
                if (v % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (v > 1 && isPrime) {
                result++;
            }
        }
        System.out.println(result);
    }
}
