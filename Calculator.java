class functions{
    public int addition(int a,int b){
        return (a+b);
    }
    public int subtract(int a,int b){
        return (a-b);
    }
    public float division(int a,int b){
        return ((float) a /b);
    }
    public int multiplication(int a,int b){
        return (a*b);
    }
}
public class Calculator {
    public static void main(String[] args) {
        int a = 100;
        int b = 2;
        functions obj1 = new functions();
        System.out.println("The addition of :"+a+" "+b+" "+": "+obj1.addition(a,b));
        System.out.println("The subtraction of :"+a+" "+b+" "+": "+obj1.subtract(a,b));
        System.out.println("The division of :"+a+" "+b+" "+": "+obj1.division(a,b));
        System.out.println("The multiplication of :"+a+" "+b+" "+": "+obj1.multiplication(a,b));

    }
}
