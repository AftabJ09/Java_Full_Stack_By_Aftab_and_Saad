import java.util.LinkedList;
import java.util.List;

public class CollectionAssignment2 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("KA06N21");
        System.out.println("Registration number added "+list);
        list.add("red");
        System.out.println("Color added "+list);
        list.add("Bugatti");
        System.out.println(list);
        list.addLast("8500000");
        System.out.println(list);
        list.set(1,"Grey");
        System.out.println(list);
        System.out.println(list.contains("Grey"));
        list.addFirst("India");
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
