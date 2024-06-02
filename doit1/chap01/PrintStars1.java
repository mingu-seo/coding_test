package doit1.chap01;

import java.util.Scanner;

public class PrintStars1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] v = scan.nextLine().split(" ");

        int n = Integer.parseInt(v[0]);
        int w = Integer.parseInt(v[1]);

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            if (i % w == 0) {
                System.out.println();
            }
        }
    }
}
