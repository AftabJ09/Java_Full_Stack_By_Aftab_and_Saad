import java.util.HashSet;
import java.util.Set;
public class HashSetCollectionConcept {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println(set);
        set.remove("C");
        System.out.println(set);
    }
}
