import java.util.LinkedList;
import java.util.List;

public class LinkedListMobileNumber {
    public static void main(String[] args) {
        List<Integer> mobileNumber = new LinkedList<>();
        mobileNumber.add(8);
        mobileNumber.add(2);
        mobileNumber.add(1);
        mobileNumber.add(7);
        mobileNumber.add(2);
        mobileNumber.add(8);
        mobileNumber.add(3);
        mobileNumber.add(8);
        mobileNumber.add(4);
        mobileNumber.add(8);
        System.out.println(mobileNumber);
        mobileNumber.addFirst(9);
        mobileNumber.add(1,1);
        System.out.println(mobileNumber);
        mobileNumber.addLast(0);
        mobileNumber.addLast(0);
        System.out.println(mobileNumber);
        mobileNumber.removeLast();
        mobileNumber.removeLast();
        mobileNumber.removeFirst();
        mobileNumber.removeFirst();
        System.out.println(mobileNumber);
        mobileNumber.clear();
        System.out.println(mobileNumber);
        mobileNumber.add(8);
        System.out.println(mobileNumber);
        mobileNumber.set(0,2);
        System.out.println(mobileNumber);
        System.out.println(mobileNumber.contains(2));

    }
}
