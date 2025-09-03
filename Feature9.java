import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;
public class Feature9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        /*
        * FOR FILTER
        * list.stream().filter(i  ->i%3 ==0).forEach(System.out::println);
        * FOR MAP
        * list.stream().map(i -> i%2==0).forEach(System.out::println);
        */

        Function<Integer,Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i%2;
            }
        };

        list1.stream()
                .map(f)
                .forEach(System.out::println);

        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer i, Integer j) {
                return i+j;
            }
        };
        /*
        *  Using lambda function
        * */
        Integer sum = list.stream()
                .filter(i -> i%2 ==0)
                .map(i->i*2)
                .reduce(0,b);
        System.out.println(sum);
    }
}
