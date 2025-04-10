package baekjoon.bronze4;

import java.util.Scanner;

public class P2848 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        int total = p*50 + c*-10;
        if (p > c) total += 500;
        System.out.println(total);
    }
}
