import java.util.List;
import java.util.ArrayList;
public class ArrayListFruit{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("WaterMelon");
        list.add("Musk Melon");
        list.add("Blue Berry");
        list.add("Grapes");
        list.add("Oranges");
        System.out.println(list);
        list.add(2,"Apple");
        System.out.println((list));
        list.addFirst("StrawBerry");
        list.addLast("Papaya");
        System.out.println(list);
        list.removeLast();
        list.removeFirst();
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.contains("Apple"));

    }
}
