import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
class Conexample implements Consumer<Integer>{
    public void accept(Integer i) {
        System.out.println(i);
    }
}
class Preexample implements Predicate<Integer>{

    public boolean test(Integer i) {
        return i%2 == 0;
    }
}

public class Feature7 {
    //functional interface
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
       // list.forEach(); functional interface is default method , accept method is default method inside the consumer interface (functional interface allows to use lambda function
        Consumer<Integer> obj1 = new Conexample();
        Consumer<Integer> obj2 = i-> System.out.println(i);
        list.forEach(obj2);
        System.out.println("Above output for ");
        list.forEach(obj1);
        Stream s1 = list.stream();
        s1.forEach(System.out::println);
    }
}
