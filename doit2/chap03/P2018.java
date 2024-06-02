package doit2.chap03;

import java.util.Scanner;

public class P2018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        int start = 0; // 시작인덱스
        int end = 0; // 끝인덱스
        int total = 0; // 합계
        int result = 0; // 합계가 같은 경우 횟수

        while (end <= N) {
            if (total == N) { // 합계가 같으면
                result++; // 횟수 +1
                end++;
                total += end;
            } else if (total < N) {
                end++;
                total += end;
            } else if (total > N) {
                // 먼저빼야함
                total -= start;
                start++;
            }
        }
        System.out.println(result);
    }
}
