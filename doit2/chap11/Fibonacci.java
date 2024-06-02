package doit2.chap11;

public class Fibonacci {

    static int cnt = 0;

    public static void main(String[] args) {
        // 단순 재귀방식
        // System.out.println(fibo(40));

        // 메모이제이션
        // System.out.println(fibo_memo(40));

        // 타뷸레이션
        int[] arr = new int[41];
        for (int i = 0; i < memo.length; i++) {
            arr[i] = (i < 2) ? i : arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[arr.length - 1]);
        System.out.println(cnt);
    }

    static long fibo(int n) {
        cnt++;
        if (n < 2) {

            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    static long[] memo = new long[41];

    static long fibo_memo(int n) {
        cnt++;
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = n < 2 ? n : fibo_memo(n - 1) + fibo_memo(n - 2);
        return memo[n];
    }
}
