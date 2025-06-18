import java.util.ArrayList;
import java.util.List;
public class CollectionAssignment1{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addFirst("Aftab J");
        System.out.println(list);
        list.add("VVIT");
        System.out.println(list);
        list.add("AI&ML");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("AI&ML"));
        list.set(2,"AIML");
        System.out.println(list);
        list.remove("AIML");
        System.out.println(list);
        list.clear();
        System.out.println(list);
        list.add("Aftab J");
        list.removeFirst();
        System.out.println(list);
    }
}
