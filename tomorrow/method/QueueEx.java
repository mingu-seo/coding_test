package tomorrow.method;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.offer("one");
        queue.offer("two");
        queue.offer("three");

        System.out.println(queue.toString());

        System.out.println(queue.poll());
        System.out.println(queue.toString());

        System.out.println(queue.peek());
        System.out.println(queue.toString());
    }
}
