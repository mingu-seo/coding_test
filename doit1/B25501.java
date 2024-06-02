package doit1;

import java.util.Scanner;

public class B25501 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        int[][] result = new int[N][2];
        for (int i = 0; i < N; i++) {
            String v = scan.nextLine();
            result[i] = isPalindrome(v);
        }
        for (int[] r : result) {
            System.out.println(r[0] + " " + r[1]);
        }
    }

    static int[] recursion(String s, int l, int r, int cnt) {
        cnt++;
        if (l >= r) {
            return new int[] { 1, cnt };
        } else if (s.charAt(l) != s.charAt(r)) {
            return new int[] { 0, cnt };
        } else {
            return recursion(s, l + 1, r - 1, cnt);
        }
    }

    static int[] isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1, 0);
    }
}
