import java.util.LinkedList;
import java.util.Queue;

public class WithoutStackReverseQueue {
    public static void main(String[] args) {
        Queue<String> name = new LinkedList<>();
        String name1 = "AJAY";
        System.out.println(name1);
        for(int i=0;i<name1.length();i++){
            name.add(String.valueOf(name1.charAt(name1.length()-i-1)));
        }
        System.out.println(name);
           }
}
