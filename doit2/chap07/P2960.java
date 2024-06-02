package doit2.chap07;

import java.util.Arrays;
import java.util.Scanner;

public class P2960 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] strArr = str.split(" ");

        int N = Integer.parseInt(strArr[0]);
        int M = Integer.parseInt(strArr[1]);

        // 전체 배열(0과 1은 소수가 아니므로 0으로 저장)
        int[] arr = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            arr[i] = i;
        }

        int count = 0;
        int result = 0;
        // 원래 에라토스테네스의 체
        // for (int i = 2; i < (int) Math.sqrt(N) + 1; i++) {
        for (int i = 2; i < N + 1; i++) {
            if (arr[i] == 0)
                continue;
            // 해당 수의 배수들 삭제하기(소수 포함)
            // 원래 에라토스테네스의 체에서는 소수자체는 지우지 않지만 여기서는 같이 지움
            // 그래서 초기값을 i+i가 아니라 i로 설정
            // for (int j = i + i; j <= N; j = j + i) {
            for (int j = i; j <= N; j = j + i) {
                // 다시 지울필요없으므로
                if (j > i && arr[j] == 0)
                    continue;
                count++;
                if (count == M)
                    result = arr[j];
                arr[j] = 0;
            }
            // System.out.println(count + "," + Arrays.toString(arr));
        }
        System.out.println(result);
    }
}
