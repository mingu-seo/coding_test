package doit2.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[] number = new int[Integer.parseInt(st.nextToken())];
        int[] sumNumber = new int[number.length];
        int size = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < number.length; i++) {
            // 입력받음과 동시에 합계를 계산해서 배열에 각각 저장
            int n = Integer.parseInt(st.nextToken());
            number[i] = n;
            if (i == 0) {
                sumNumber[i] = n;
            } else {
                sumNumber[i] = sumNumber[i - 1] + n;
            }
        }

        int[][] result = new int[size][2];
        for (int i = 0; i < result.length; i++) {
            st = new StringTokenizer(bf.readLine());
            result[i][0] = Integer.parseInt(st.nextToken());
            result[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int[] r : result) {
            int i = r[0] - 2 < 0 ? 0 : sumNumber[r[0] - 2];
            int j = sumNumber[r[1] - 1];
            System.out.println(j - i);
        }
    }
}
