package doit2.chap03;

/**
 * 와, 출력 그냥하면 안되고, StringBuilder 써야 시간초과 안뜸
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P18258 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    int value = Integer.parseInt(st.nextToken());
                    queue.add(value);
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        // result.add(-1);
                        sb.append(-1).append("\n");
                    } else {
                        // result.add(queue.poll());
                        sb.append(queue.poll()).append("\n");
                    }
                    break;
                case "size":
                    // result.add(queue.size());
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        // result.add(1);
                        sb.append(1).append("\n");
                    } else {
                        // result.add(0);
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        // result.add(-1);
                        sb.append(-1).append("\n");
                    } else {
                        // result.add(queue.peek());
                        sb.append(queue.peek()).append("\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        // result.add(-1);
                        sb.append(-1).append("\n");
                    } else {
                        // result.add(lastValue);
                        sb.append(queue.peekLast()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
