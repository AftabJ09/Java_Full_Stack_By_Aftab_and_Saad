import java.util.LinkedList;
import java.util.Queue;

public class QueueWithLinkedlist {
    public static void main(String[] args) {
        Queue<String> container = new LinkedList<String>();
        container.add("India");
        container.add("Russia");
        container.add("Afghanistan");
        container.add("USA");
        container.add("China");
        System.out.println(container.contains("India"));
        System.out.println(container.poll());
        System.out.println(container);
        System.out.println(container.peek());
        System.out.println(container.size());

    }
}
