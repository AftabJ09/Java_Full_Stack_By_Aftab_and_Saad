import java.util.Scanner;
class functions{
    public void addition(int a,int b){
        System.out.println("The addition of :"+a+" "+b+" "+": "+ (a+b));

    }
    public void subtract(int a,int b){
        System.out.println("The subtraction of :"+a+" "+b+" "+": "+(a-b));

    }
    public void division(int a,int b){
            if (b != 0){
                System.out.println("The division of :"+a+" "+b+" "+": "+ (a/b));

            }else{
                System.out.println("Denominator cannot be zero");
            }


    }
    public void multiplication(int a,int b){
        System.out.println("The multiplication of :"+a+" "+b+" "+": "+ (a*b));
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        functions obj1 = new functions();

        obj1.addition(a,b);
        obj1.subtract(a,b);
        obj1.division(a,b);
        obj1.multiplication(a,b);

    }
}
