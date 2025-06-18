import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        System.out.println(queue.peek());

        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }

        System.out.println(stack);
        System.out.println(stack.peek());
        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }

        System.out.println(stack);
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
