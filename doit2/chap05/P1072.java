package doit2.chap05;

import java.util.Scanner;

public class P1072 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strArr = scan.nextLine().split(" ");
        long X = Integer.parseInt(strArr[0]);
        long Y = Integer.parseInt(strArr[1]);
        int Z = (int) (((double) Y * 100 / X)); // int Z = (int) (((double) Y / X)) * 100; 차이 (X:50, Y:29)

        if (Z >= 99) {
            System.out.println(-1);
            return;
        }

        // System.out.println(Z);
        long newY = binarySearch(Z, X, Y, 0, X);
        System.out.println(newY);
    }

    static long result = -1;

    static long binarySearch(int Z, long X, long Y, long min, long max) {

        if (min > max) {
            return result;
        }
        long mid = (min + max) / 2;
        // System.out.println("mid:" + mid);
        int newZ = (int) (((double) ((mid + Y) * 100) / (mid + X)));
        // System.out.println("newZ:" + newZ);
        if (Z < newZ) {
            result = mid;
            max = mid - 1;
        } else {
            min = mid + 1;
        }

        // 줄어든 범위를 다시 재귀호출로 탐색
        return binarySearch(Z, X, Y, min, max);
    }
}
