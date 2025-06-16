import java.util.List;
import java.util.LinkedList;
public class LinkedListConcept {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.addFirst(100);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.contains(20));
        list.clear();
        System.out.println(list);
        list.add(200);
        System.out.println(list);

    }
}
