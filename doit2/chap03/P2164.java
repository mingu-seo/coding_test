package doit2.chap03;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P2164 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        List<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.add(i + 1);
        }
        int i = 0;
        while (true) {
            if (queue.size() == 1)
                break;
            if (i % 2 == 0) {
                queue.remove(0);
            } else {
                queue.add(queue.remove(0));
            }
            i += 1;
        }
        System.out.println(queue.get(0));
    }
}
