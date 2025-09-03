class Outer{
    private class Inner{
        void demo1(){
            System.out.println("Inner private class");
        }

    }
    public void createInner(String aftab, int i) {
        Inner obj = new Inner();
        obj.demo1();
    }

}
public class Nested_Class {
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        obj1.createInner("Aftab", 22);
    }
}
