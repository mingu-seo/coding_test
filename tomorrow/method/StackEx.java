package tomorrow.method;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("one");
        stack.push("two");
        stack.push("three");

        System.out.println(stack.toString());

        System.out.println(stack.pop());
        System.out.println(stack.toString());
    }
}
