package doit2.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10986 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] number = new long[N]; // 원본배열
        long[] sumNumber = new long[N]; // 합 배열

        long[] count = new long[M]; // M으로 나눈 나머지값의 개수를 저장할 배열(최대값 M:0~M-1까지)
        long result = 0; // 합이 M으로 나누어 떨어지는 구간의 개수

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < number.length; i++) {
            // 입력받음과 동시에 합계를 계산해서 배열에 각각 저장
            int n = Integer.parseInt(st.nextToken());
            number[i] = n;
            if (i == 0) {
                sumNumber[i] = n;
                long remain = n % M; // 나머지
                if (remain == 0) {
                    result++;
                }
                count[(int) remain]++; // 나머지가 n인 경우도 +1
            } else {
                // 저장할때 나머지로 계산해서 저장
                long remain = (sumNumber[i - 1] + n) % M; // 나머지
                sumNumber[i] = remain;
                // 나머지가 0인 개수 구하기 (처음부터 현재인덱스까지의 합이 M으로 나누어떨어지는 경우)
                if (remain == 0) {
                    result++;
                }
                count[(int) remain]++;
            }
        }
        // System.out.println(Arrays.toString(number));
        // System.out.println(Arrays.toString(sumNumber));
        // System.out.println(Arrays.toString(count));
        // System.out.println(result);
        // 이미 찾은 나머지가 0인 개수 외에
        // i+1부터 j까지의 합이 같은 경우
        // [1,2,3,1,2]
        // [1,0,0,1,0] -> (0,3) -> 0+1:2 ~ j:1 -> 2,3,1 -> 6 (M으로 나누어 떨어짐)
        // 따라서 현재 합배열에서 같은 값의 개수를 구해 조합 계산
        // 조합 계산식 : 3C2 = 3*(3-1) / 2
        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 2) { // 나머지가 같은 경우가 2개 이상인 경우
                // result += count[i] * (count[i] - 1) / 2; // 2개를 뽑는 조합의 개수 구하기
                result = result + count[i] * (count[i] - 1) / 2;
            }
        }
        System.out.println(result);
    }
}
