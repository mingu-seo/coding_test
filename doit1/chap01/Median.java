package doit1.chap01;

/**
 * Median
 */
public class Median {

    public static void main(String[] args) {
        int a = 15;
        int b = 13;
        int c = 11;
        int r = med3(a, b, c);
        System.out.println(r);
    }

    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }
}