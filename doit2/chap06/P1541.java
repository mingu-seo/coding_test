package doit2.chap06;

import java.util.Scanner;

public class P1541 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int result = 0;

        // 더하기 연산부터 먼저하기 위해 -로 분해
        String[] first = str.split("-");
        for (int i = 0; i < first.length; i++) {
            // + 로 분해해서 합계 구하기
            int total = 0;
            String[] second = first[i].split("[+]");
            for (int j = 0; j < second.length; j++) {
                total += Integer.parseInt(second[j]);
            }

            // 맨앞의 값은 더하고 나머지는 빼줌
            if (i == 0) {
                result += total;
            } else {
                result -= total;
            }
        }
        System.out.println(result);
    }
}
