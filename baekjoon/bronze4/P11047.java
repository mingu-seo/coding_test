package baekjoon.bronze4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P11047 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] NK = scan.nextLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);

        List<Integer> coin = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            coin.add(Integer.parseInt(scan.nextLine()));
        }
        int result = 0;
        for (int i = coin.size() - 1; i >= 0; i--) {
            int c = coin.get(i);
            result += K / c;
            K = K % c;
        }
        System.out.println(result);
    }
}