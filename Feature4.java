interface Demo{
    void demo(String name);
}
public class Feature4 {
    public static void main(String[] args) {
        Demo de =(String name) -> System.out.println("Hello "+name);
        de.demo("Aftab J");
    }
}
