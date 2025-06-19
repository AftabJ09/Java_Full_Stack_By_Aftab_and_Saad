import java.util.Set;
import java.util.TreeSet;

public class SetConcept {
    public static void main(String[] args) {
        Set<Integer> phoneNumber = new TreeSet<Integer>();
        phoneNumber.add(8);
        phoneNumber.add(2);
        phoneNumber.add(1);
        phoneNumber.add(7);
        phoneNumber.add(2);
        phoneNumber.add(8);
        phoneNumber.add(4);
        phoneNumber.add(8);
        phoneNumber.add(3);
        phoneNumber.add(8);

        System.out.println(phoneNumber);
    }
}
