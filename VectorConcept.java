import java.util.Vector;

public class VectorConcept {
    public static void main(String[] args) {
        Vector<String> rollNo = new Vector<>();
        System.out.println("Capacity"+rollNo.capacity());
        rollNo.add("1");
        System.out.println("Capacity"+rollNo.capacity()+"Elements"+rollNo);
        rollNo.add("V");
        System.out.println("Capacity"+rollNo.capacity()+"Elements"+rollNo);
        rollNo.add("J");
        System.out.println("Capacity"+rollNo.capacity()+"Elements"+rollNo);
        rollNo.add("2");
        System.out.println("Capacity"+rollNo.capacity()+"Elements"+rollNo);
        rollNo.add("1");
        System.out.println("Capacity"+rollNo.capacity()+"Elements"+rollNo);
        rollNo.add("A");
        System.out.println("Capacity"+rollNo.capacity()+"Elements"+rollNo);
        rollNo.add("I");
        System.out.println("Capacity"+rollNo.capacity()+"Elements"+rollNo);
        rollNo.add("0");
        System.out.println("Capacity"+rollNo.capacity()+"Elements"+rollNo);
        rollNo.add("0");
        System.out.println("Capacity"+rollNo.capacity()+"Elements"+rollNo);
        rollNo.add("1");
        System.out.println("Capacity"+rollNo.capacity()+"Elements"+rollNo);
        System.out.println(rollNo);
        rollNo.addFirst("*");
        System.out.println("Capacity"+rollNo.capacity()+"Elements"+rollNo);
        rollNo.addLast("*");
        System.out.println(rollNo);
        System.out.println(rollNo.contains("0"));
        System.out.println(rollNo.capacity());
    }
}
