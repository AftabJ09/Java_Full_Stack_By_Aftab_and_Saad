class A{
    public String name = "Aftab J";
    void print1(){
        System.out.println("Parent class");
    }
}

class B extends A{
    void print1(){
        System.out.println("Child class");
    }
}
class BindAddition{
    void addtion1(int num1,int num2){
        System.out.println(num1+"+"+num2+"="+(num1+num2));

    }
    void addtion1(int num1,int num2,int num3){
        System.out.println(num1+"+"+num2+"+"+num3+"="+(num1+num2+num3));

    }

}
public class Static_Dynamic_Binding {
    public static void main(String[] args) {
        A obj = new B();
        obj.print1();
        System.out.println(obj.name);
        BindAddition ob = new BindAddition();
        ob.addtion1(3,4);
        ob.addtion1(3,4,5);
    }
}
