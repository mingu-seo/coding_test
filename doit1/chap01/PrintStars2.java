package doit1.chap01;

import java.util.Scanner;

public class PrintStars2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] v = scan.nextLine().split(" ");

        int n = Integer.parseInt(v[0]);
        int w = Integer.parseInt(v[1]);

        for (int i = 1; i <= n / w; i++) {
            System.out.println("*".repeat(w));
        }
        System.out.println("*".repeat(n % w));
    }
}
