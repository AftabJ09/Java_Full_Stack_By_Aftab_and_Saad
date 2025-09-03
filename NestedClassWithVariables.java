class OuterClass{
    private int a = 178;
    class InnerClass{
        public int FetchData(){
            return a;
        }
    }
}
public class NestedClassWithVariables {
    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass();
        OuterClass.InnerClass obj2 = obj1.new InnerClass();
        System.out.println("The number is: "+obj2.FetchData());
    }
}
