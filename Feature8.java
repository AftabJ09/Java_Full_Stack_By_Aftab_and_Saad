import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Feature8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println(list);
        Predicate<Integer> pred = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i%2 == 0;
            }
        };

        list.stream().filter(pred).forEach(System.out::println);

    }
}
