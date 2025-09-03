class Parent_dynamic1{
    void mobile(){
        System.out.println("Nokia");
    }
}
class child1 extends Parent_dynamic1{

}

class Parent_dynamic2{
    void mobile1(){
        System.out.println("Nokia");
    }
}
class child2 extends Parent_dynamic2{
    void mobile1(){
        System.out.println("Iphone");
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        child1 ch1 = new child1();
        ch1.mobile();
        child2 ch2 = new child2();
        ch2.mobile1();
    }
}
