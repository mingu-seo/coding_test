package doit1.chap05;

public class Gcd {
    public static void main(String[] args) {
        int result = gcd(22, 8);
        System.out.println(result);
    }

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
}
