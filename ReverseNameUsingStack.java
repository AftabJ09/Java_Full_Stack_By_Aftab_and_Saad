import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseNameUsingStack {
    public static void main(String[] args) {
        Queue<String> name = new LinkedList<>();
        Stack<String> reverseName = new Stack<>();
        name.add("Aftab");
        for(int i = 0;i<name.peek().length();i++){
            reverseName.add(String.valueOf(name.peek().charAt(i)));

        }
        name.clear();
        while(!reverseName.isEmpty()){
            name.add(reverseName.pop());
        }
        System.out.println(name);
    }
}
