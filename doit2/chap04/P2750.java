package doit2.chap04;

import java.util.Arrays;
import java.util.Scanner;

public class P2750 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());

        int[] result = new int[size];

        for (int i = 0; i < result.length; i++) {
            int value = Integer.parseInt(scan.nextLine());
            result[i] = value;
        }
        Arrays.sort(result);
        for (int r : result) {
            System.out.println(r);
        }
    }
}
