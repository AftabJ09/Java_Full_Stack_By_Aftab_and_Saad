import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Feature3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        while(count < 10){
            list.add(count+1);
            count += 1;
        }
        System.out.println("Direct printing elements");
        System.out.println(list);
        System.out.println("Using for loop for printing elements");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) +" ");
        }
        System.out.println();
        System.out.println("using Enhance for-loop for printing");
        for(Integer L : list){
            System.out.print(L+" ");
        }
        System.out.println();
        System.out.println("Using foreach for printing");
        list.forEach(item -> System.out.print(item+" "));
    }
}
