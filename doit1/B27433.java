package doit1;

import java.util.Scanner;

public class B27433 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long result = factorial(N);
        System.out.println(result);
    }

    static long factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }
}
