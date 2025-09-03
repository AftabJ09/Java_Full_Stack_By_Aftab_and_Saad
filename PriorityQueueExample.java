import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> PQ = new PriorityQueue<>();
        PQ.offer("Ram");
        PQ.offer("Abhi");
        PQ.offer("Vijay");
        System.out.println(PQ);
        while(!PQ.isEmpty()){
            System.out.println(PQ.poll());
        }
        System.out.println(PQ);
    }
}
