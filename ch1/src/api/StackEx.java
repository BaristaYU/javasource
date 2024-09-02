package api;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        // stack => push/pop
        stack.push("0");
        stack.push("1");
        stack.push("2");

        // queue => offer/poll
        queue.offer("0");
        queue.offer("1");
        queue.offer("2");

        System.out.println("== stack ==");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

        System.out.println("== queue ==");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
