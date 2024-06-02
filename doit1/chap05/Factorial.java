package doit1.chap05;

public class Factorial {
    public static void main(String[] args) {
        int result = factorial(10);
        System.out.println(result);
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}
