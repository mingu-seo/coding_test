package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P28278 {
    // 시간초과되는 부분 체크 필요
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String v = st.nextToken();
            if ("1".equals(v)) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if ("2".equals(v)) {
                if (stack.size() > 0) {
                    sb.append(stack.pop() + "\n");
                } else {
                    sb.append(-1 + "\n");
                }
            } else if ("3".equals(v)) {
                sb.append(stack.size() + "\n");
            } else if ("4".equals(v)) {
                if (stack.size() > 0) {
                    sb.append(0 + "\n");
                } else {
                    sb.append(1 + "\n");
                }
            } else if ("5".equals(v)) {
                if (stack.size() > 0) {
                    sb.append(stack.get(stack.size() - 1) + "\n");
                } else {
                    sb.append(-1 + "\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
