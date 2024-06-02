package doit2.chap04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class P2751 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int[] result = new int[size];

        for (int i = 0; i < result.length; i++) {
            int value = Integer.parseInt(br.readLine());
            result[i] = value;
        }
        Arrays.sort(result);
        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            sb.append(r).append("\n");
        }
        System.out.println(sb.toString());
    }
}
