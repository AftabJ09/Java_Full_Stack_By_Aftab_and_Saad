import java.util.PriorityQueue;

public class PriorityQueueCollection {
    public static void main(String[] args) {
        PriorityQueue<String> QU = new PriorityQueue<String>();
        QU.add("Aftab");
        QU.add("Saad");
        System.out.println(QU.peek());
        QU.add("aftab");
        QU.add("saad");
        System.out.println(QU.peek());
        QU.add("1");
        QU.add("2");
        System.out.println(QU.peek());
        QU.remove();
        System.out.println(QU);
     }
}
