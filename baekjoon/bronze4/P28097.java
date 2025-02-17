package baekjoon.bronze4;

import java.util.Arrays;
import java.util.Scanner;

public class P28097 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String line = scan.nextLine();
        String[] arr = line.split(" ");

        int total = 0;
        for (String s : arr) {
            total += Integer.parseInt(s);
        }
        total += (n-1) * 8;
        System.out.println((total / 24) + " " + (total % 24));
    }
}