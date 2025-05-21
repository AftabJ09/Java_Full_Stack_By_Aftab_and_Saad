import java.util.Scanner;
class calci{
    public int add(int a,int b){
        return a+b;
    }
        public void sub(int a,int b){
        System.out.println("Subtraction: "+(a-b));
    }
        public void mult(int a,int b){
        System.out.println("mulitlication :"+(a*b));
    }
        public void div(int a,int b){
        System.out.println(("Division :"+a/b));
    }
        public void modulo(int a,int b){
        System.out.println("Modulo: "+(a%b));
    }
}
public class calcmethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        calci calculator=new calci();
        System.out.println("Adddition :"+calculator.add(a, b));
        calculator.sub(a, b);
        calculator.mult(a, b);
        calculator.div(a, b);
        calculator.modulo(a, b);
    }
}
