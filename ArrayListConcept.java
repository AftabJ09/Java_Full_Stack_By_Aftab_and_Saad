import java.util.ArrayList;
import java.util.Collection;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(22);
        list.add(24);
        System.out.println(list);
        list.remove(2);
        list.add(2,50);

        System.out.println(list);
    }
}
