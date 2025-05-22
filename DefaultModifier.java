class Print{
    void demo(){
        System.out.println("This is Default aceess modifier");
    }
}
public class DefaultModifier {
    public static void main(String[] args) {
        Print obj = new Print();
        obj.demo();
    }
}
