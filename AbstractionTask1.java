abstract class Addition1{
    abstract void add(float num1,float num2);
    abstract void add(float num1,float num2,float num3);
}
class adding extends Addition1{
    void add(float num1, float num2){
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
    }
    void add(float num1, float num2,float num3){
        System.out.println(num1+" + "+num2+" + "+num3+" = "+(num1+num2+num3));
    }
}
public class AbstractionTask1 {
    public static void main(String[] args) {
        adding AD = new adding();
        System.out.println("Abstraction method overloading output");
        AD.add(4.5F,5.6F);
        AD.add(7.8F,5.6F,2.3F);
    }
}
