package baekjoon.bronze1;

import java.util.Scanner;

public class P1145 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] value = scan.nextLine().split(" ");
        int min = Integer.MAX_VALUE;

        for (String v : value) {
            if (min > Integer.parseInt(v)) {
                min = Integer.parseInt(v);
            }
        }

        while (true) {
            int cnt = 0;
            for (String v : value) {
                if (min % Integer.parseInt(v) == 0) {
                    cnt += 1;
                }
                if (cnt == 3) {
                    break;
                }
            }
            if (cnt == 3)
                break;
            min += 1;
        }
        System.out.println(min);
    }
}