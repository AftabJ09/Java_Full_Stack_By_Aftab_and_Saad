import java.util.ArrayDeque;

public class ArrayDequeueConcept {
    public static void main(String[] args) {
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        numbers.push(1);
        System.out.println(numbers);
        numbers.add(2);
        System.out.println(numbers);
        numbers.addLast(3);
        System.out.println(numbers.peek());
        System.out.println(numbers);
        numbers.addFirst(4);
        System.out.println(numbers);
        System.out.println(numbers.peek());
        System.out.println(numbers.removeLast());
        System.out.println(numbers.peek());
        System.out.println(numbers);
        numbers.addLast(5);
        System.out.println(numbers);
        numbers.addFirst(2);
        System.out.println(numbers);
        numbers.removeFirst();
        System.out.println(numbers);
        numbers.removeLast();
        System.out.println(numbers);
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());
        numbers.removeAll(numbers);
        System.out.println(numbers);
    }
}
