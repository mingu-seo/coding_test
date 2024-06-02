package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10773 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int v = Integer.parseInt(br.readLine());
            if (v == 0) {
                stack.pop();
            } else {
                stack.push(v);
            }
        }
        int sum = 0;
        for (Integer n : stack) {
            sum += n;
        }
        System.out.println(sum);
    }
}
